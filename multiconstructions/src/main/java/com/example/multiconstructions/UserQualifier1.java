package com.example.multiconstructions;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

/**
 * @author AlexisYin
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface  UserQualifier1 {
}
