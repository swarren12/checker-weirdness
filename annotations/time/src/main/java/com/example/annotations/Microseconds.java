package com.example.annotations;

import org.checkerframework.checker.units.qual.Prefix;
import org.checkerframework.checker.units.qual.Time;
import org.checkerframework.checker.units.qual.UnitsMultiple;
import org.checkerframework.checker.units.qual.s;
import org.checkerframework.framework.qual.SubtypeOf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({Time.class})
@UnitsMultiple(quantity = s.class, prefix = Prefix.micro)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Microseconds {
}
