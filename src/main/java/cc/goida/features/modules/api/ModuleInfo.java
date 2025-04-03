package cc.goida.features.modules.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ModuleInfo {
    String name();
    String desc();
    int key() default -1;
    Category category();
    BindType bindType() default BindType.Toggle;
    Type type() default Type.On;
}
