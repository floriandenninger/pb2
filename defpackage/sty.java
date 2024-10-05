package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class sty implements ayrv {
    public final /* synthetic */ sww a;
    public final /* synthetic */ swu b;
    private final /* synthetic */ int c;

    public /* synthetic */ sty(sww swwVar, swu swuVar, int i) {
        this.c = i;
        this.a = swwVar;
        this.b = swuVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            return this.a.d((awnw) obj, this.b, 1);
        }
        if (i == 1) {
            return this.a.d((awnw) obj, this.b, 1).J();
        }
        return this.a.d((awnw) obj, this.b, 1);
    }
}
