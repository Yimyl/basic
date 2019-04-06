package cn.edu.bjtu.Last;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Anno {
    public abstract String className();
    String methodName();
}
