package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bagr implements Runnable {
    final /* synthetic */ baio a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    public bagr(baio baioVar, int i, long j, int i2) {
        this.a = baioVar;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onThroughputObservation(this.b, this.c, this.d);
    }
}
