package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bhe implements Runnable {
    public final /* synthetic */ bhm a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ bhe(bhm bhmVar, int i, long j, int i2) {
        this.d = i2;
        this.a = bhmVar;
        this.c = i;
        this.b = j;
    }

    public /* synthetic */ bhe(bhm bhmVar, long j, int i, int i2) {
        this.d = i2;
        this.a = bhmVar;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            bhm bhmVar = this.a;
            int i = this.c;
            long j = this.b;
            bhn bhnVar = bhmVar.b;
            int i2 = pts.a;
            bhnVar.m(i, j);
            return;
        }
        bhm bhmVar2 = this.a;
        long j2 = this.b;
        int i3 = this.c;
        bhn bhnVar2 = bhmVar2.b;
        int i4 = pts.a;
        bhnVar2.D(j2, i3);
    }
}
