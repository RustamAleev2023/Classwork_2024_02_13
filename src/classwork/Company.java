package classwork;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Company {
    String name() default "Name";
    String city() default "City";
}
