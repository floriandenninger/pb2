package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class frm extends ajqh {
    private final axpg b;

    public frm(axpg axpgVar) {
        this.b = axpgVar;
    }

    @Override // defpackage.ajph
    public final void a() {
        ((ajpy) this.b.get()).a();
    }

    @Override // defpackage.ajph
    public final void b() {
        ((ajpy) this.b.get()).b();
    }

    @Override // defpackage.ajqh
    protected final boolean c() {
        ajpx ajpxVar = ((ajqh) this).a;
        g(ajpxVar.b);
        ajpy ajpyVar = (ajpy) this.b.get();
        ajpw a = ajpx.a();
        a.g(ajpxVar.a);
        a.b(ajpxVar.b);
        a.f(ajpxVar.c);
        a.e(ajpxVar.d);
        a.c(ajpxVar.e);
        a.d(ajpxVar.f);
        a.h(ajpxVar.g);
        a.i(ajpxVar.h);
        return ajpyVar.e(a.a());
    }

    @Override // defpackage.ajqh
    protected final boolean d(ajpv ajpvVar) {
        return true;
    }
}
