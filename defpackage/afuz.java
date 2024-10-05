package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afuz implements afvq {
    public final ylz a;
    private final afvq b;
    private final shf c;

    public afuz(ylz ylzVar, afvq afvqVar, shf shfVar) {
        this.a = ylzVar;
        this.b = afvqVar;
        this.c = shfVar;
    }

    protected void a(ylz ylzVar) {
    }

    @Override // defpackage.afvq
    public final void c(Object obj, ykl yklVar) {
        afpz afpzVar = (afpz) this.a.a(obj);
        long c = this.c.c();
        if (afpzVar == null || c > afpzVar.b) {
            this.b.c(obj, new afuy(this, yklVar));
        } else {
            yklVar.b(obj, afpzVar.a);
            a(this.a);
        }
    }
}
