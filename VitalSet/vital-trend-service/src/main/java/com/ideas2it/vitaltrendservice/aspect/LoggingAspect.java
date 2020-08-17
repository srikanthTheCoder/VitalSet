package com.ideas2it.vitaltrendservice.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ideas2it.vitaltrendservice.model.PayloadRequest;
import com.ideas2it.vitaltrendservice.service.VitalSetService;

@Aspect
@Component
public class LoggingAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private VitalSetService vitalSetService;
	
    public void setVitalSetService(VitalSetService vitalSetService) {
		this.vitalSetService = vitalSetService;
	}

	@Around("@annotation(com.ideas2it.vitaltrendservice.custom.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;

        logger.info("%s executed in %sms %s",
            joinPoint.getSignature(), executionTime);
        
        PayloadRequest schedulerEventPayloadRequest 
        = new PayloadRequest(executionTime,
        		joinPoint.getSignature().toString(),
        		proceed.toString());
        
        vitalSetService.sendMessage(schedulerEventPayloadRequest);
        return proceed;
    }
}