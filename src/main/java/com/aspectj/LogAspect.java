package com.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by Evilina on 2016/8/30.
 */
@Aspect
@Component
public class LogAspect {
    public void sayBefore() {
        System.out.println("the before");

    }

    public void sayAfter() {
        System.out.println("the after");

    }

}
