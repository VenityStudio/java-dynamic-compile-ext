package org.venity.jphp.java.compiler.classes;

import net.openhft.compiler.CompilerUtils;
import org.venity.javareflection.classes.ReflectionClass;
import org.venity.jphp.java.compiler.JavaDynamicCompileExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("JavaCompiler")
@Reflection.Namespace(JavaDynamicCompileExtension.NS)
public class JavaCompiler extends BaseObject {
    public JavaCompiler(Environment env) {
        super(env);
    }

    protected JavaCompiler(ClassEntity entity) {
        super(entity);
    }

    public JavaCompiler(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {
        throw new RuntimeException("Can`t create JavaCompiler class. Use static methods to get profit <3");
    }

    @Reflection.Signature
    public static ReflectionClass loadFromJava(Environment env, String className, String code) throws ClassNotFoundException {
        return new ReflectionClass(env, CompilerUtils.CACHED_COMPILER.loadFromJava(className, code));
    }
}
