package org.example.app.generator;

import javassist.CannotCompileException;

public class MetaSpaceErrorGenerator implements ErrorGenerator {
    static javassist.ClassPool cp = javassist.ClassPool.getDefault();

    public void generate(int amount) {
        for (int i = 0; i <= amount * 10; i++) {
            try {
                Class c = cp.makeClass("org.example.heavy_object.HeavyObjectOne" + i).toClass();
            } catch (CannotCompileException e) {
                e.printStackTrace();
            }
        }
    }
}
