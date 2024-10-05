package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahnv implements azrw {
    public final /* synthetic */ ahnw a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ ahnv(ahnw ahnwVar, int i, int i2) {
        this.c = i2;
        this.a = ahnwVar;
        this.b = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        int i = this.c;
        if (i == 0) {
            ahnw ahnwVar = this.a;
            return this.b == 2 ? ahnwVar.j : ahnwVar.i;
        }
        if (i != 1) {
            ahnw ahnwVar2 = this.a;
            return this.b == 2 ? ahnwVar2.e : ahnwVar2.d;
        }
        ahnw ahnwVar3 = this.a;
        return this.b == 2 ? ahnwVar3.h : ahnwVar3.g;
    }
}
