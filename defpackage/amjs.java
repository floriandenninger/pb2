package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amjs extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        amjv amjvVar = new amjv(uqq.n());
        Thread currentThread = Thread.currentThread();
        synchronized (amjw.a) {
            amjw.a.put(currentThread, amjvVar);
        }
        return amjvVar;
    }
}
