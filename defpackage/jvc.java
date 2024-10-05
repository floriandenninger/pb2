package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jvc implements ypd {
    public final fjs a;
    public final azrw b;
    public final aahv c;
    public final aais d;
    public final ynb e = new ynb();

    public jvc(fjs fjsVar, azrw azrwVar, aahv aahvVar, aais aaisVar) {
        this.a = fjsVar;
        this.b = azrwVar;
        this.c = aahvVar;
        this.d = aaisVar;
        b();
    }

    public final ammv a() {
        return !c() ? amlr.a : ammv.i((awiu) this.c.c().f(fhe.i()).g(awiu.class).X());
    }

    public final void b() {
        ayph C = this.c.c().h(fhe.p(), true).L(iub.p).at().e().q(izw.n).C();
        final ynb ynbVar = this.e;
        C.R(new ayrm() { // from class: jva
            @Override // defpackage.ayrm
            public final void a() {
                ynb.this.release();
            }
        });
    }

    public final boolean c() {
        try {
            this.e.acquire();
            this.e.release();
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            b();
            return null;
        }
        if (i == 1) {
            this.e.a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
