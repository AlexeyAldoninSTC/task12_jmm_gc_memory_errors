package org.example.app.generator;

import javassist.CannotCompileException;
import javassist.Loader;

import java.util.ArrayList;
import java.util.List;

public class MetaSpaceErrorGenerator implements ErrorGenerator {
    static javassist.ClassPool cp = javassist.ClassPool.getDefault();

    public void generate(int amount) {
        List<Class<?>> classList = new ArrayList<>();
        //List<ClassLoader> loaderList = new ArrayList<>();
        for (int i = 0; i <= amount * 10; i++) {
            try {
                Class<?> c = cp.makeClass("org.example.heavy_object.A" + i).toClass();
                //Class c = cp.makeClass("com.sun.corba.se.impl.logging.ORBUtilSystemException" + i).toClass();
                classList.add(c);
                //loaderList.add(new Loader());
            } catch (CannotCompileException e) {
                e.printStackTrace();
            }
        }
    }
}
