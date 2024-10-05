package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class axax implements Runnable {
    public final /* synthetic */ axaz a;
    private final /* synthetic */ int b;

    public /* synthetic */ axax(axaz axazVar, int i) {
        this.b = i;
        this.a = axazVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.c.cancel();
        } else {
            this.a.c.start();
        }
    }
}
