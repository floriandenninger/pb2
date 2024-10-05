package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azml implements Runnable {
    final /* synthetic */ azmn a;
    private final Throwable b;

    public azml(azmn azmnVar, Throwable th) {
        this.a = azmnVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.b(this.b);
    }
}
