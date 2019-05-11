package org.venity.jphp.java.compiler;

import org.venity.jphp.java.compiler.classes.JavaCompiler;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class JavaDynamicCompileExtension extends Extension {
    public static final String NS = "java\\compile";
    
    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }

    @Override
    public String getName() {
        return "JDCE - Java Dynamic Compile Extension";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public void onRegister(CompileScope scope) {
        System.out.println("REG");
        registerClass(scope, JavaCompiler.class);
    }
}