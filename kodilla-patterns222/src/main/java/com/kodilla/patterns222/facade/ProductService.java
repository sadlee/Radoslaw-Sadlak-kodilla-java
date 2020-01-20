package com.kodilla.patterns222.facade;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProductService {
    public BigDecimal getPrice(Long productId) {
        Random generator = new Random();
        return new BigDecimal(generator.nextInt(100000)/100);
    }
}