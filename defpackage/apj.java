package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apj extends app {
    private static final Class[] a = {Application.class, aph.class};
    private static final Class[] b = {aph.class};
    private final Application c;
    private final apo d;
    private final Bundle e;
    private final aof f;
    private final buc g;

    public apj(Application application, bue bueVar, Bundle bundle) {
        apo G;
        this.g = bueVar.getSavedStateRegistry();
        this.f = bueVar.getLifecycle();
        this.e = bundle;
        this.c = application;
        if (application == null) {
            G = ho.G();
        } else {
            if (apn.a == null) {
                apn.a = new apn(application);
            }
            G = apn.a;
            G.getClass();
        }
        this.d = G;
    }

    private static Constructor d(Class cls, Class[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // defpackage.app, defpackage.apo
    public final apm a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b(canonicalName, cls);
    }

    @Override // defpackage.app
    public final apm b(String str, Class cls) {
        Constructor d;
        apm apmVar;
        boolean isAssignableFrom = anu.class.isAssignableFrom(cls);
        if (!isAssignableFrom || this.c == null) {
            d = d(cls, b);
        } else {
            d = d(cls, a);
        }
        if (d == null) {
            return this.d.a(cls);
        }
        SavedStateHandleController b2 = SavedStateHandleController.b(this.g, this.f, str, this.e);
        if (isAssignableFrom) {
            try {
                Application application = this.c;
                if (application != null) {
                    apmVar = (apm) d.newInstance(application, b2.a);
                    apmVar.t(b2);
                    return apmVar;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
            }
        }
        apmVar = (apm) d.newInstance(b2.a);
        apmVar.t(b2);
        return apmVar;
    }

    @Override // defpackage.apr
    public final void c(apm apmVar) {
        SavedStateHandleController.c(apmVar, this.g, this.f);
    }
}
