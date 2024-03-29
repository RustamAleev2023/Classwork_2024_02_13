package classwork;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Inherited
@Target({ElementType.TYPE})
public @interface CodeAuthor {
    String name();
    int version() default 1;
    String edited() default "01/01/1970";
    String[] asisstants();
}
