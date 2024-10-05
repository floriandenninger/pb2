package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rio implements Runnable {
    final /* synthetic */ rip a;
    private final /* synthetic */ int b;

    public rio(rip ripVar, int i) {
        this.b = i;
        this.a = ripVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.i = null;
        } else {
            rip ripVar = this.a;
            ripVar.d = ripVar.i;
        }
    }
}
