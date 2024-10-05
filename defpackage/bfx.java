package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bfx implements Runnable {
    private final bfw a;

    public bfx(bfw bfwVar) {
        this.a = bfwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.v();
    }
}
