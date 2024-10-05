package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahsj implements aioa, ypd {
    final /* synthetic */ ahsl a;

    public ahsj(ahsl ahslVar) {
        this.a = ahslVar;
    }

    public final void a(ahcx ahcxVar) {
        this.a.j = ahcxVar.c();
        if (this.a.j()) {
            return;
        }
        ahsl ahslVar = this.a;
        if (ahslVar.q != ahslVar.k()) {
            if (this.a.k()) {
                ahsl ahslVar2 = this.a;
                ahslVar2.n(false, ahslVar2.o.e);
            } else {
                this.a.m();
            }
        }
        this.a.i();
    }

    public final void b(ahef ahefVar) {
        ahefVar.c().h();
        aigf aigfVar = aigf.DEFAULT;
        int ordinal = ahefVar.c().ordinal();
        if (ordinal == 0) {
            this.a.h();
            this.a.g();
            return;
        }
        if (ordinal == 4) {
            if (ahefVar.a() != null) {
                this.a.f(ahsl.e(ahefVar.a()), ahefVar.k());
            }
        } else if (ordinal == 7) {
            this.a.f(ahsl.e(ahefVar.b()), ahefVar.e());
        } else {
            if (ordinal != 8) {
                return;
            }
            ahsl ahslVar = this.a;
            if (ahslVar.i) {
                return;
            }
            ahslVar.f(ahsl.e(ahefVar.b()), ahefVar.e());
        }
    }

    public final void c(aheg ahegVar) {
        int e = (int) ahegVar.e();
        ahsl ahslVar = this.a;
        if (e == ahslVar.s) {
            return;
        }
        ahslVar.s = e;
        if (ahslVar.l != null) {
            ahslVar.i();
            if (ahslVar.l.d.size() != 0) {
                int i = -1;
                avgg avggVar = null;
                apez apezVar = null;
                for (int i2 = 0; i2 < ahslVar.p.size(); i2++) {
                    apez apezVar2 = (apez) ahslVar.p.get(i2);
                    long j = apezVar2.c;
                    long j2 = e;
                    if (j <= j2 && apezVar2.d > j2 && (apezVar == null || j > apezVar.c)) {
                        i = i2;
                        apezVar = apezVar2;
                    }
                }
                if (i != ahslVar.n) {
                    ahslVar.n = i;
                    ahslVar.o = apezVar;
                    apez apezVar3 = ahslVar.o;
                    if (apezVar3 != null) {
                        if ((apezVar3.b & 128) != 0 && (avggVar = apezVar3.f) == null) {
                            avggVar = avgg.a;
                        }
                        ahslVar.k = ahslVar.d(ahsl.l(avggVar), new ahse());
                        ahslVar.g.a(ahslVar.o.h);
                    }
                }
                if (ahslVar.o == null) {
                    ahslVar.m();
                    return;
                }
                if (ahslVar.j()) {
                    ahslVar.m();
                } else {
                    if (!ahslVar.k() || ahslVar.q) {
                        return;
                    }
                    ahslVar.n(true, ahslVar.m[ahslVar.n] ? 0 : ahslVar.o.e);
                }
            }
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        final int i3 = 2;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 2048L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahsi
            public final /* synthetic */ ahsj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i2;
                if (i4 == 0) {
                    this.a.b((ahef) obj);
                } else if (i4 != 1) {
                    this.a.c((aheg) obj);
                } else {
                    this.a.a((ahcx) obj);
                }
            }
        }, ahfo.j), aiocVar.G().d.h(ahbw.g(aiocVar.aC(), 2048L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahsi
            public final /* synthetic */ ahsj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    this.a.b((ahef) obj);
                } else if (i4 != 1) {
                    this.a.c((aheg) obj);
                } else {
                    this.a.a((ahcx) obj);
                }
            }
        }, ahfo.j), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 2048L)).h(ahbw.e(0)).Y(new ayrs(this) { // from class: ahsi
            public final /* synthetic */ ahsj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i;
                if (i4 == 0) {
                    this.a.b((ahef) obj);
                } else if (i4 != 1) {
                    this.a.c((aheg) obj);
                } else {
                    this.a.a((ahcx) obj);
                }
            }
        }, ahfo.j)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class, ahef.class, aheg.class};
        }
        if (i == 0) {
            a((ahcx) obj);
            return null;
        }
        if (i == 1) {
            b((ahef) obj);
            return null;
        }
        if (i == 2) {
            c((aheg) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
