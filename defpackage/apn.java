package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apn extends apq {
    public static apn a;
    private final Application c;

    public apn(Application application) {
        this.c = application;
    }

    @Override // defpackage.apq, defpackage.apo
    public final apm a(Class cls) {
        if (anu.class.isAssignableFrom(cls)) {
            try {
                apm apmVar = (apm) cls.getConstructor(Application.class).newInstance(this.c);
                apmVar.getClass();
                return apmVar;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(azul.a("Cannot create an instance of ", cls), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(azul.a("Cannot create an instance of ", cls), e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(azul.a("Cannot create an instance of ", cls), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(azul.a("Cannot create an instance of ", cls), e4);
            }
        }
        return super.a(cls);
    }
}
