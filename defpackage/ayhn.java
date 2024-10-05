package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayhn implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ayhx b;
    private final /* synthetic */ int c;

    public ayhn(ayhx ayhxVar, int i, int i2) {
        this.c = i2;
        this.b = ayhxVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.b.e.k(this.a);
        } else if (i != 1) {
            this.b.e.l(this.a);
        } else {
            this.b.e.g(this.a);
        }
    }
}
