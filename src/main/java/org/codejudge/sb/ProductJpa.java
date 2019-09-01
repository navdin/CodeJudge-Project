package org.codejudge.sb;

import org.codejudge.sb.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpa extends JpaRepository<Product, Long> {
}
