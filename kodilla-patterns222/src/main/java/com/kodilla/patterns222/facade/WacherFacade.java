package com.kodilla.patterns222.facade;

import com.kodilla.patterns222.facade.api.OrderDto;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WacherFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(WacherFacade.class);

    @Before("execution(* com.kodilla.patterns222.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + ", Args: " + order + " " + userId);
    }
}