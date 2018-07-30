package com.xl.framework.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ObjectUtil {

    public static <T> T propertyUpdate(T srcObj, T dstObj) {

        Field[] fields = dstObj.getClass().getDeclaredFields();
        for(Field field : fields) {
            if(!Modifier.isFinal(field.getModifiers())) {
                field.setAccessible(true);
                Object value = null;
                try {
                    value = field.get(srcObj);
                    field.set(dstObj, value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return dstObj;
    }
}
