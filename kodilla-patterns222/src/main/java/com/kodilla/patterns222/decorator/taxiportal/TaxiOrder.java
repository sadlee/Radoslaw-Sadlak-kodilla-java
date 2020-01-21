package com.kodilla.patterns222.decorator.taxiportal;

import java.math.BigDecimal;

public interface TaxiOrder {
    BigDecimal getCost();
    String getDescription();
}
