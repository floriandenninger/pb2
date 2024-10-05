package com.google.vr.vrcore.library.api;

import android.os.IBinder;
import defpackage.axig;
import defpackage.axih;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ObjectWrapper extends axig {
    private final Object wrappedObject;

    private ObjectWrapper(Object obj) {
        this.wrappedObject = obj;
    }

    public static axih a(Object obj) {
        return new ObjectWrapper(obj);
    }

    public static Object b(axih axihVar, Class cls) {
        if (axihVar == null) {
            return null;
        }
        if (axihVar instanceof ObjectWrapper) {
            return ((ObjectWrapper) axihVar).wrappedObject;
        }
        IBinder asBinder = axihVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        Field field = null;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field2 = declaredFields[i];
            if (!field2.isSynthetic()) {
                if (field != null) {
                    field = null;
                    break;
                }
                field = field2;
            }
            i++;
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    Object obj = field.get(asBinder);
                    if (obj == null) {
                        return null;
                    }
                    if (!cls.isInstance(obj)) {
                        throw new IllegalArgumentException("remoteBinder is the wrong class.");
                    }
                    return cls.cast(obj);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                } catch (NullPointerException e3) {
                    throw new IllegalArgumentException("Binder object is null.", e3);
                }
            }
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
