package org.codejudge.sb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {


    public Response() {
    }

    public Response(Product data, String status, String reason) {
        this.data = data;
        this.status = status;
        this.reason = reason;
    }

//    public Response(String status, String reason) {
//        this.status = status;
//        this.reason = reason;
//    }

    private Product data;
    private String status;
    private String reason;

    public Product getData() {
        return data;
    }

    public void setData(Product data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
