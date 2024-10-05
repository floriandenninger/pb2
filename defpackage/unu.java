package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class unu extends ThreadLocal {
    final /* synthetic */ unx a;

    public unu(unx unxVar) {
        this.a = unxVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        uny unyVar = new uny();
        Thread currentThread = Thread.currentThread();
        synchronized (this.a.a) {
            this.a.a.put(currentThread, unyVar);
        }
        return unyVar;
    }
}
