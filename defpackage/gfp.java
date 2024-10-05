package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class gfp implements ggf {
    public int a;
    protected gfq b;
    public gga c;

    @Override // defpackage.ggf
    public void g(gfq gfqVar) {
        gfq gfqVar2 = this.b;
        if (gfqVar2 == null || gfqVar2.b != gfqVar.b) {
            return;
        }
        h();
    }

    public final void h() {
        gga ggaVar = this.c;
        if (ggaVar != null) {
            ggaVar.a();
            this.c = null;
            this.b = null;
        }
    }

    protected abstract boolean i(gfq gfqVar, int i);

    @Override // defpackage.ggf
    public final boolean j(gfq gfqVar, int i, gga ggaVar) {
        if (i(gfqVar, i)) {
            return true;
        }
        this.c = ggaVar;
        this.a = i;
        this.b = gfqVar;
        return false;
    }
}
