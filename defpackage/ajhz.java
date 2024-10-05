package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajhz implements Runnable {
    public final /* synthetic */ ajjz a;
    public final /* synthetic */ avgf b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    private final /* synthetic */ int e;

    public /* synthetic */ ajhz(ajjz ajjzVar, avgf avgfVar, int i, int i2, int i3) {
        this.e = i3;
        this.a = ajjzVar;
        this.b = avgfVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e == 0) {
            ajjz ajjzVar = this.a;
            avgf avgfVar = this.b;
            int i = this.c;
            int i2 = this.d;
            aong aongVar = (aong) avgg.a.createBuilder();
            aongVar.ct(avgfVar);
            ajjzVar.n((avgg) aongVar.build(), i, i2);
            return;
        }
        ajjz ajjzVar2 = this.a;
        avgf avgfVar2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        aong aongVar2 = (aong) avgg.a.createBuilder();
        aongVar2.ct(avgfVar2);
        ajjzVar2.n((avgg) aongVar2.build(), i3, i4);
    }
}
