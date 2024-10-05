package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azth {
    public static Object a(azss azssVar, Object obj, azty aztyVar) {
        return aztyVar.invoke(obj, azssVar);
    }

    public static azss b(azss azssVar, azst azstVar) {
        azstVar.getClass();
        if (!azul.c(azssVar.getKey(), azstVar)) {
            return null;
        }
        if (azssVar != null) {
            return azssVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type E");
    }

    public static azsv c(azss azssVar, azst azstVar) {
        azstVar.getClass();
        return azul.c(azssVar.getKey(), azstVar) ? azsw.a : azssVar;
    }

    public static azsv d(azss azssVar, azsv azsvVar) {
        azsvVar.getClass();
        return e(azssVar, azsvVar);
    }

    public static azsv e(azsv azsvVar, azsv azsvVar2) {
        return azsvVar2 == azsw.a ? azsvVar : (azsv) azsvVar2.fold(azsvVar, azsu.a);
    }

    public static int f(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i / 0.75f) + 1.0f);
    }

    public static final String g(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String h(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String i(azsq azsqVar) {
        Object l;
        if (azsqVar instanceof azzm) {
            return azsqVar.toString();
        }
        try {
            l = azsqVar + '@' + h(azsqVar);
        } catch (Throwable th) {
            l = aype.l(th);
        }
        if (azsb.a(l) != null) {
            l = ((Object) azsqVar.getClass().getName()) + '@' + h(azsqVar);
        }
        return (String) l;
    }

    public static final Throwable j(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        aynu.g(runtimeException, th);
        return runtimeException;
    }

    public static final void k(azsv azsvVar, Throwable th) {
        azsvVar.getClass();
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) azsvVar.get(CoroutineExceptionHandler.a);
            if (coroutineExceptionHandler == null) {
                azwl.a(azsvVar, th);
            } else {
                coroutineExceptionHandler.handleException(azsvVar, th);
            }
        } catch (Throwable th2) {
            azwl.a(azsvVar, j(th, th2));
        }
    }

    public static final Object l(Object obj) {
        Throwable a = azsb.a(obj);
        return a == null ? obj : new azwc(a);
    }

    public static final azvj m(boolean z) {
        return new azvj(z);
    }

    public static final azvl n(long j) {
        return new azvl(j);
    }

    public static final azvm o(Object obj) {
        return new azvm(obj);
    }

    public static final azvk p() {
        return new azvk();
    }
}
