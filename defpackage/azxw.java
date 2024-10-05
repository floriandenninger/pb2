package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azxw {
    public static final azxw a = new azxw();
    public static final ThreadLocal b = new ThreadLocal();

    private azxw() {
    }

    public final azwy a() {
        ThreadLocal threadLocal = b;
        azwy azwyVar = (azwy) threadLocal.get();
        if (azwyVar != null) {
            return azwyVar;
        }
        azvq azvqVar = new azvq(Thread.currentThread());
        threadLocal.set(azvqVar);
        return azvqVar;
    }
}
