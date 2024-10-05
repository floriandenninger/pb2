package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aynh implements Runnable {
    final /* synthetic */ ayni a;
    private final /* synthetic */ int b;

    public aynh(ayni ayniVar, int i) {
        this.b = i;
        this.a = ayniVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            aynl aynlVar = this.a.b;
            if (aynlVar.y) {
                return;
            }
            aynlVar.u.e();
            return;
        }
        this.a.b.f.execute(new aynd(this, null));
    }
}
