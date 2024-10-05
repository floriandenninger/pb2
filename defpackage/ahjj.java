package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahjj implements Runnable {
    final /* synthetic */ ahjo a;
    private final /* synthetic */ int b;

    public ahjj(ahjo ahjoVar, int i) {
        this.b = i;
        this.a = ahjoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.j.invalidate();
        } else {
            ahjo ahjoVar = this.a;
            ahjoVar.i.removeView(ahjoVar.j);
        }
    }
}
