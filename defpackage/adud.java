package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adud extends adlz {
    final /* synthetic */ adul a;

    public adud(adul adulVar) {
        this.a = adulVar;
    }

    @Override // defpackage.adlz, defpackage.adlq
    public final void g(int i) {
        adty a = this.a.i.k.a();
        if (i != 2) {
            ykn yknVar = this.a.d;
            if (yknVar != null) {
                yknVar.d();
                this.a.d = null;
            }
            a.a = null;
        }
        adul adulVar = this.a;
        adua b = adulVar.i.b();
        a.b(i);
        b.e = a.a();
        adulVar.m(b);
        this.a.b(7);
    }

    @Override // defpackage.adlz, defpackage.adlq
    public final void i() {
        this.a.f(4);
    }

    @Override // defpackage.adlz, defpackage.adlq
    public final void rc() {
        this.a.f(0);
    }

    @Override // defpackage.adlz, defpackage.adlq
    public final void rd(String str) {
        if (ammx.e(str)) {
            adul adulVar = this.a;
            adua b = adulVar.i.b();
            adty a = this.a.i.k.a();
            a.a = null;
            b.e = a.a();
            adulVar.m(b);
            this.a.b(7);
            return;
        }
        adul adulVar2 = this.a;
        ykn yknVar = adulVar2.d;
        if (yknVar != null) {
            yknVar.d();
        }
        adulVar2.d = ykn.c(new aduc(adulVar2));
        adulVar2.h.h(str, aaef.b, "", -1, adulVar2.d);
    }
}
