package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahxg implements ahxd, aioa, ypd {
    private final ainy a;
    private final ainl b;
    private final ahxe c;
    private boolean d;
    private boolean e;
    private aivx f;
    private aivw g;

    public ahxg(ainy ainyVar, ainl ainlVar, ahxe ahxeVar) {
        ainyVar.getClass();
        this.a = ainyVar;
        ainlVar.getClass();
        this.b = ainlVar;
        ahxeVar.getClass();
        this.c = ahxeVar;
        ahxeVar.pu(this);
    }

    private final void h() {
        aivw aivwVar = this.g;
        boolean c = aivwVar != null ? aivwVar.c() : this.b.j(aims.a);
        if (this.e != c) {
            this.e = c;
            this.c.ne(c);
        }
    }

    private final void i() {
        aivx aivxVar = this.f;
        boolean d = aivxVar != null ? aivxVar.d() : this.b.j(aims.b);
        if (this.d != d) {
            this.d = d;
            this.c.b(d);
        }
    }

    @Override // defpackage.ahxd
    public void a() {
        aivw aivwVar = this.g;
        if (aivwVar != null) {
            aivwVar.a();
        } else {
            this.b.a(aims.a);
        }
    }

    @Override // defpackage.ahxd
    public void b() {
        aivx aivxVar = this.f;
        if (aivxVar == null) {
            if (!this.b.j(aims.b)) {
                this.a.U(0L);
                return;
            } else {
                this.b.a(aims.b);
                return;
            }
        }
        aivxVar.b();
    }

    public final void c(aivw aivwVar) {
        this.g = aivwVar;
        h();
    }

    public final void d(aivx aivxVar) {
        this.f = aivxVar;
        i();
    }

    public final void g() {
        if (this.f == null) {
            i();
        }
        if (this.g == null) {
            h();
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.am().h(ahbw.g(aiocVar.aC(), 262144L)).h(ahbw.e(1)).Y(new ayrs() { // from class: ahxf
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahxg.this.g();
            }
        }, ahwx.d)};
    }

    @Override // defpackage.ypd
    public Class[] kz(Class cls, Object obj, int i) {
        return ahbl.c(this, obj, i);
    }
}
