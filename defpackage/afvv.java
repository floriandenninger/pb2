package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afvv implements afvq {
    public final ylz a;
    public final shf b;
    private final afvq c;
    private final long d;

    /* JADX INFO: Access modifiers changed from: protected */
    public afvv(ylz ylzVar, afvq afvqVar, shf shfVar, long j) {
        this.a = ylzVar;
        this.c = afvqVar;
        this.b = shfVar;
        this.d = j;
    }

    public static afvv a(ylz ylzVar, afvq afvqVar, shf shfVar, long j) {
        ylzVar.getClass();
        shfVar.getClass();
        boolean z = false;
        if (j >= 0 && j <= 2592000000L) {
            z = true;
        }
        amkq.F(z, "time to live must be >=0 and <= 2592000000");
        return new afvv(ylzVar, afvqVar, shfVar, j);
    }

    protected void b(ylz ylzVar) {
    }

    @Override // defpackage.afvq
    public final void c(Object obj, ykl yklVar) {
        if (this.d > 0) {
            afpz afpzVar = (afpz) this.a.a(obj);
            long c = this.b.c();
            if (afpzVar != null) {
                long j = afpzVar.b;
                if (c >= j && j + this.d >= c) {
                    yklVar.b(obj, afpzVar.a);
                    b(this.a);
                    return;
                }
            }
        }
        this.c.c(obj, new afvu(this, yklVar));
    }
}
