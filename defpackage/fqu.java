package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fqu {
    public final ajoc a;
    public ajng b;
    public ajng c;
    private ajng d;
    private Object e;
    private Object f;

    public fqu() {
        ajoc ajocVar = new ajoc();
        this.a = ajocVar;
        this.d = new ajpd();
        this.b = new ajpd();
        this.c = new ajpd();
        ajocVar.m(this.d);
        ajocVar.m(this.c);
        ajocVar.m(this.b);
    }

    public final int a(int i) {
        return i + ((you) this.d).size();
    }

    public final void b(ajng ajngVar) {
        if (this.c == ajngVar) {
            return;
        }
        if (ajngVar == null) {
            ajngVar = new ajpd();
        }
        this.a.r(this.c, ajngVar);
        this.c = ajngVar;
    }

    public final void c(Object obj) {
        if (obj == this.f) {
            return;
        }
        this.f = obj;
        ajpd ajpdVar = new ajpd();
        if (obj != null) {
            ajpdVar.add(0, obj);
        }
        this.a.r(this.b, ajpdVar);
        this.b = ajpdVar;
    }

    public final void d(Object obj) {
        if (obj == this.e) {
            return;
        }
        this.e = obj;
        ajpd ajpdVar = new ajpd();
        if (obj != null) {
            ajpdVar.add(0, obj);
        }
        this.a.r(this.d, ajpdVar);
        this.d = ajpdVar;
    }
}
