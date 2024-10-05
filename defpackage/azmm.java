package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azmm implements Runnable {
    final /* synthetic */ azmn a;
    private final Object b;

    public azmm(azmn azmnVar, Object obj) {
        this.a = azmnVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.sc(this.b);
    }
}
