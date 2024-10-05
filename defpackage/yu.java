package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yu implements Runnable {
    final /* synthetic */ yv a;
    private final /* synthetic */ int b;

    public yu(yv yvVar, int i) {
        this.b = i;
        this.a = yvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.c(false);
        } else {
            this.a.a();
        }
    }
}
