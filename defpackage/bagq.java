package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bagq implements Runnable {
    final /* synthetic */ bain a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    public bagq(bain bainVar, int i, long j, int i2) {
        this.a = bainVar;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onRttObservation(this.b, this.c, this.d);
    }
}
