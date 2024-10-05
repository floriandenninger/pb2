package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azoq implements Runnable {
    final /* synthetic */ azor a;
    private final aysd b;
    private final Runnable c;

    public azoq(azor azorVar, aysd aysdVar, Runnable runnable) {
        this.a = azorVar;
        this.b = aysdVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayrz.i(this.b, this.a.a(this.c));
    }
}
