package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ltt extends js {
    private final ltv a;
    private final ajox b;

    public ltt(ltv ltvVar, ajox ajoxVar) {
        this.a = ltvVar;
        this.b = ajoxVar;
        l();
    }

    private final void l() {
        if (this.b.b() > 0) {
            ltv ltvVar = this.a;
            ltvVar.d.setVisibility(0);
            ltvVar.m();
            if (ltvVar.a == null) {
                ltvVar.a = new ltu(ltvVar);
                ltvVar.c.K.aD(ltvVar.a);
                return;
            }
            return;
        }
        ltv ltvVar2 = this.a;
        ltvVar2.d.setVisibility(8);
        ltvVar2.f();
        ltu ltuVar = ltvVar2.a;
        if (ltuVar != null) {
            ltvVar2.c.K.aF(ltuVar);
            ltvVar2.a = null;
        }
    }

    @Override // defpackage.js
    public final void c() {
        l();
    }

    @Override // defpackage.js
    public final void d(int i, int i2) {
        l();
    }

    @Override // defpackage.js
    public final void f(int i, int i2) {
        l();
    }

    @Override // defpackage.js
    public final void g(int i, int i2) {
        l();
    }

    @Override // defpackage.js
    public final void h(int i, int i2) {
        l();
    }
}
