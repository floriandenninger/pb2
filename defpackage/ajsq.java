package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajsq implements ajon, ypd {
    public final ajvq a;
    public ajvo b;
    public final /* synthetic */ ajss c;

    public ajsq(ajss ajssVar, ajvq ajvqVar) {
        this.c = ajssVar;
        this.a = ajvqVar;
    }

    public final ajvo a(ajtx ajtxVar) {
        ajvn a = ajvo.a();
        a.a = ajtxVar;
        ajss ajssVar = this.c;
        a.b = ajssVar.G;
        a.c = ajssVar;
        a.d = ajssVar;
        return a.a();
    }

    public final void b(ajce ajceVar) {
        if (this.a == null) {
            return;
        }
        atfr atfrVar = this.c.j.a().f;
        if (atfrVar == null) {
            atfrVar = atfr.a;
        }
        boolean z = !atfrVar.i ? !(this.b != null || this.c.ai(ajcd.NEXT) || (this.c.h.isEmpty() && this.c.ai(ajcd.RELOAD))) : !(this.b != null || (ajceVar != null ? ((ajch) ajceVar).b == ajcd.NEXT : this.c.ai(ajcd.NEXT)) || (this.c.h.isEmpty() && (ajceVar != null ? ((ajch) ajceVar).b == ajcd.RELOAD : this.c.ai(ajcd.RELOAD))));
        if (z != (this.c.f.i(this.a) != -1)) {
            if (z) {
                ajss ajssVar = this.c;
                ajssVar.f.n(ajssVar.o(), this.a);
                if (this.c.ai(ajcd.NEXT)) {
                    if (this.b == null) {
                        this.b = a(ajtw.a());
                    }
                    c(this.b.a);
                    return;
                }
                return;
            }
            this.c.f.q(this.a);
        }
    }

    public final void c(ajtx ajtxVar) {
        if (this.a == null) {
            return;
        }
        ajvo ajvoVar = this.b;
        if (ajvoVar == null) {
            this.b = a(ajtxVar);
        } else if (ajvoVar.a != ajtxVar) {
            this.b = ajvoVar.b(ajtxVar);
        }
        if (ajtxVar instanceof ajtr) {
            if (this.c.ai(ajcd.NEXT)) {
                ajvo b = this.b.b(ajtw.a());
                this.b = b;
                this.a.q(b);
                return;
            }
            this.a.q(null);
            return;
        }
        this.a.q(this.b);
    }

    public final void d(Object obj, Object obj2) {
        e();
        if (obj != null) {
            this.c.i.i(this, obj);
            if (obj2 == null || obj2 == obj) {
                return;
            }
            this.c.i.i(this, obj2);
            return;
        }
        this.c.i.g(this);
    }

    public final void e() {
        this.c.i.m(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ajtr.class, ajtv.class, ajtw.class};
        }
        if (i == 0) {
            this.c.S();
            c((ajtr) obj);
            return null;
        }
        if (i == 1) {
            this.c.S();
            c((ajtv) obj);
            return null;
        }
        if (i == 2) {
            ajtw ajtwVar = (ajtw) obj;
            if (!this.c.k(ajtwVar)) {
                return null;
            }
            c(ajtwVar);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajon
    public final void o(ajom ajomVar, Object obj) {
        if (obj == this.b) {
            this.c.D();
        }
    }
}
