package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qve extends ecq implements qvf {
    private final Object a;

    public qve() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static qvf a(Object obj) {
        return new qve(obj);
    }

    public static Object b(qvf qvfVar) {
        if (qvfVar instanceof qve) {
            return ((qve) qvfVar).a;
        }
        IBinder asBinder = qvfVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            qip.an(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        int length = declaredFields.length;
        StringBuilder sb = new StringBuilder(64);
        sb.append("Unexpected number of IObjectWrapper declared fields: ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }

    private qve(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.a = obj;
    }
}
