package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzw implements ajww, afzt {
    private final ajss a;
    private final afzu b;
    private boolean c;
    private boolean d;

    public afzw(ajss ajssVar, afzq afzqVar) {
        this.a = ajssVar;
        this.b = new afzu(ajssVar, afzqVar, this);
    }

    private final void f() {
        ajce W;
        if (this.c && (W = this.a.W(ajcd.INVALIDATION)) != null) {
            this.b.b(W);
        }
    }

    private final void g() {
        this.b.c();
    }

    @Override // defpackage.ajww
    public final void a() {
        this.c = true;
        f();
    }

    @Override // defpackage.ajww
    public final void b() {
    }

    @Override // defpackage.ajww
    public final void c(aamd aamdVar, boolean z) {
        f();
    }

    @Override // defpackage.ajww
    public final void d() {
        this.d = true;
        this.c = false;
        g();
    }

    @Override // defpackage.ajww
    public final void e() {
        this.c = false;
        g();
    }

    @Override // defpackage.afzt
    public final void h(ajce ajceVar) {
        if (this.d) {
            return;
        }
        this.a.lo();
    }
}
