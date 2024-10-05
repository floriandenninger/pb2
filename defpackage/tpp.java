package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tpp implements trh {
    public final tss a;
    public final trm b;
    public final tqq c;
    public final Executor d;
    public final tko e;
    private final tqq f;
    private final Uri g;
    private final Uri h;
    private final vcw i;
    private final akbd j;

    public tpp(tss tssVar, trm trmVar, tqq tqqVar, tqq tqqVar2, Uri uri, Uri uri2, akbd akbdVar, vcw vcwVar, Executor executor, tko tkoVar, byte[] bArr) {
        this.a = tssVar;
        this.b = trmVar;
        this.c = tqqVar;
        this.f = tqqVar2;
        this.g = uri;
        this.h = uri2;
        this.j = akbdVar;
        this.i = vcwVar;
        this.d = executor;
        this.e = tkoVar;
    }

    private static anhy i() {
        return anaf.N(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void j(Uri uri) {
        if (this.i.h(uri)) {
            this.i.f(uri);
        }
    }

    @Override // defpackage.trh
    public final anhy a() {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        int i = 1;
        if (ordinal == 1) {
            return this.b.a();
        }
        if (ordinal == 2) {
            return anfq.i(b(this.b.a()), new tpm(this, i), this.d);
        }
        if (ordinal == 3) {
            return this.f.a();
        }
        return i();
    }

    public final anhy b(anhy anhyVar) {
        return aney.h(anfq.h(anhyVar, rtp.r, this.d), Exception.class, rtp.s, this.d);
    }

    @Override // defpackage.trh
    public final anhy c() {
        final bea beaVar = bea.u;
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            return this.b.c();
        }
        if (ordinal == 2) {
            return anfq.i(b(this.b.c()), new anfz() { // from class: tpk
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    final tpp tppVar = tpp.this;
                    final Comparator comparator = beaVar;
                    final ttj ttjVar = (ttj) obj;
                    return anfq.i(tppVar.b(tppVar.c.c()), new anfz() { // from class: tpi
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            tpp tppVar2 = tpp.this;
                            ttj ttjVar2 = ttjVar;
                            Comparator comparator2 = comparator;
                            ttj ttjVar3 = (ttj) obj2;
                            tppVar2.e.A();
                            if (tsx.a(10000L)) {
                                if (ttj.g(ttjVar2, ttjVar3, comparator2)) {
                                    tppVar2.a.l(1106);
                                } else {
                                    tppVar2.a.l(1103);
                                }
                            }
                            if (ttjVar2.a) {
                                List list = (List) ttjVar2.c();
                                list.getClass();
                                return anaf.O(list);
                            }
                            Object d = ttjVar2.d();
                            d.getClass();
                            return anaf.N((Throwable) d);
                        }
                    }, tppVar.d);
                }
            }, this.d);
        }
        if (ordinal == 3) {
            return this.f.c();
        }
        return i();
    }

    @Override // defpackage.trh
    public final anhy d() {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            try {
                try {
                    j(this.g);
                    return this.b.d();
                } finally {
                    j(this.h);
                }
            } catch (IOException e) {
                return anaf.N(e);
            }
        }
        if (ordinal == 2) {
            try {
                return anfq.i(this.b.d(), new tpm(this, 0), this.d);
            } catch (IOException e2) {
                return anaf.N(e2);
            }
        }
        if (ordinal == 3) {
            try {
                j(this.g);
                return this.f.d();
            } catch (IOException e3) {
                return anaf.N(e3);
            }
        }
        return i();
    }

    @Override // defpackage.trh
    public final anhy e(tlg tlgVar) {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        int i = 1;
        if (ordinal == 1) {
            return this.b.e(tlgVar);
        }
        if (ordinal == 2) {
            return anfq.i(b(this.b.e(tlgVar)), new tpn(this, tlgVar, i), this.d);
        }
        if (ordinal == 3) {
            return this.f.e(tlgVar);
        }
        return i();
    }

    @Override // defpackage.trh
    public final anhy f(tlg tlgVar) {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            return this.b.f(tlgVar);
        }
        if (ordinal == 2) {
            return anfq.i(b(this.b.f(tlgVar)), new tpn(this, tlgVar, 0), this.d);
        }
        if (ordinal == 3) {
            return this.f.f(tlgVar);
        }
        return i();
    }

    @Override // defpackage.trh
    public final anhy g(tlg tlgVar, tlh tlhVar) {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            return this.b.g(tlgVar, tlhVar);
        }
        if (ordinal == 2) {
            return anfq.i(b(this.b.g(tlgVar, tlhVar)), new tpo(this, tlgVar, tlhVar, 0), this.d);
        }
        if (ordinal == 3) {
            return this.f.g(tlgVar, tlhVar);
        }
        return i();
    }

    public final anhy h(ttj ttjVar, ttj ttjVar2, int i) {
        this.e.A();
        if (tsx.a(10000L)) {
            if (ttjVar.equals(ttjVar2)) {
                this.a.l(1106);
            } else {
                this.a.l(i);
            }
        }
        if (ttjVar.a) {
            return anaf.O(ttjVar.c());
        }
        return anaf.N((Throwable) ttjVar.d());
    }
}
