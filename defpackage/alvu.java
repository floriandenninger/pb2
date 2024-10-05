package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alvu extends ecq implements alvv {
    private final Object a;

    public alvu() {
        super("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
    }

    public static alvv a(Object obj) {
        return new alvu(obj);
    }

    public static Object b(alvv alvvVar) {
        if (alvvVar instanceof alvu) {
            return ((alvu) alvvVar).a;
        }
        IBinder asBinder = alvvVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
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

    private alvu(Object obj) {
        super("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        this.a = obj;
    }
}
