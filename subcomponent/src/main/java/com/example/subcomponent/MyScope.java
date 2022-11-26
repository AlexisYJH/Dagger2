package com.example.subcomponent;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

/**
 * @author AlexisYin
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface MyScope {}
