package com.example;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class BeanUtils {
    public static Object getProperty(Object bean, String property) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(bean.getClass());
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            if (pd.getName().equals(property.toLowerCase())) {
                Method getter = pd.getReadMethod();
                return getter.invoke(bean);
            }
        }
        throw new NoSuchFieldException(property);
    }

    public static void setProperty(Object bean, String property, Object value) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(bean.getClass());
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            if (pd.getName().equals(property.toLowerCase())) {
                Method setter = pd.getWriteMethod();
                setter.invoke(bean, value);
                return;
            }
        }
        throw new NoSuchFieldException(property);
    }
}
