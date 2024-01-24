package org.example.project17.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* getStudents())")
    public void getStudents() {}
}
