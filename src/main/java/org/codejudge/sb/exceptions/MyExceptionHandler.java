package org.codejudge.sb.exceptions;

//public class ExceptionHandler {
//
//    package com.howtodoinjava.demo.exception;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.codejudge.sb.models.Response;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;

//@SuppressWarnings({"unchecked","rawtypes"})
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
    public class MyExceptionHandler //extends ResponseEntityExceptionHandler
    {

        @ExceptionHandler(value={ Exception.class} )
        public ResponseEntity<Object> handleAll(Exception ex, WebRequest request) {

            System.out.println("my exception");
            Response error = new Response(null,"failure", "explaination");
            return new ResponseEntity<>(error, new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }



        @ExceptionHandler(ResourceNotFoundException.class)
        protected ResponseEntity<String> handleResourceNotFoun(ResourceNotFoundException ex){

            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Requested resource does not found");
        }
//MethodArgumentTypeMismatchException
//        @ExceptionHandler(HttpMessageNotReadableException.class)
//        protected ResponseEntity<String> handleInvalidInput(HttpMessageNotReadableException ex){
//
//            return ResponseEntity
//                    .badRequest()
//                    .body("Invalid Input");
//        }

//        @ExceptionHandler(InvalidFormatException.class)
//        protected ResponseEntity<String> handleInvalidInput(InvalidFormatException ex){
//
//            return ResponseEntity
//                    .badRequest()
//                    .body("Invalid Input");
//        }


//        @ExceptionHandler(value = Exception.class)
//        public ModelAndView
//        defaultErrorHandle(HttpServletRequest req, Exception e) throws Exception {
//            // If the exception is annotated with @ResponseStatus rethrow it and let
//            // the framework handle it - like the OrderNotFoundException example
//            // at the start of this post.
//            // AnnotationUtils is a Spring Framework utility class.
//            System.out.println("my exception");
//            if (AnnotationUtils.findAnnotation
//                    (e.getClass(), ResponseStatus.class) != null)
//                throw e;
//
//            // Otherwise setup and send the user to a default error-view.
//            ModelAndView mav = new ModelAndView();
//            mav.addObject("exception", e);
//            mav.addObject("url", req.getRequestURL());
//            mav.setViewName("error");
//            return mav;
//        }




//            @Override
//        protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
////            List<String> details = new ArrayList<>();
////            for(ObjectError error : ex.getBindingResult().getAllErrors()) {
////                details.add(error.getDefaultMessage());
////            }
//            System.out.println("my exception");
//            Response error = new Response(null,"failure", "explaination");
//            return new ResponseEntity(error,new HttpHeaders(), HttpStatus.BAD_REQUEST);
//        }
    }

//}
