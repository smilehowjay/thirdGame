package com.demo.constanins.annotation;

import com.demo.constanins.ActionType;
import com.demo.constanins.ThirdGameFirm;
import org.springframework.stereotype.Component;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
@Documented
public @interface ThirdGameHandler {
    ThirdGameFirm gameFirm();
    ActionType actionType();
}
