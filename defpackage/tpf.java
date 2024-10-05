package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tpf implements tow {
    public final tqi a;
    public final Executor b;
    private final tss c;
    private final trk d;
    private final tqi e;
    private final Uri f;
    private final Uri g;
    private final vcw h;
    private final tko i;
    private final akbd j;

    public tpf(tss tssVar, trk trkVar, tqi tqiVar, tqi tqiVar2, Uri uri, Uri uri2, akbd akbdVar, vcw vcwVar, Executor executor, tko tkoVar, byte[] bArr) {
        this.c = tssVar;
        this.d = trkVar;
        this.e = tqiVar2;
        this.a = tqiVar;
        this.f = uri;
        this.g = uri2;
        this.j = akbdVar;
        this.h = vcwVar;
        this.b = executor;
        this.i = tkoVar;
    }

    private static anhy q() {
        return anaf.N(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void r(Uri uri) {
        if (this.h.h(uri)) {
            this.h.f(uri);
        }
    }

    @Override // defpackage.tow
    public final anhy a(final tkv tkvVar) {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            return this.d.a(tkvVar);
        }
        if (ordinal == 2) {
            return anfq.i(n(this.d.a(tkvVar)), new anfz() { // from class: tpc
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    tpf tpfVar = tpf.this;
                    return anfq.i(tpfVar.n(tpfVar.a.a(tkvVar)), new tox(tpfVar, (ttj) obj, 0), tpfVar.b);
                }
            }, this.b);
        }
        if (ordinal == 3) {
            return this.e.a(tkvVar);
        }
        return q();
    }

    @Override // defpackage.tow
    public final anhy b() {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        int i = 1;
        if (ordinal == 1) {
            return this.d.b();
        }
        if (ordinal == 2) {
            return anfq.i(n(this.d.b()), new toz(this, i), this.b);
        }
        if (ordinal == 3) {
            return this.e.b();
        }
        return q();
    }

    @Override // defpackage.tow
    public final anhy c() {
        bea beaVar = bea.s;
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        int i = 1;
        if (ordinal == 1) {
            return this.d.c();
        }
        if (ordinal == 2) {
            return anfq.i(n(this.d.c()), new tpa(this, beaVar, i), this.b);
        }
        if (ordinal == 3) {
            return this.e.c();
        }
        return q();
    }

    @Override // defpackage.tow
    public final anhy d() {
        bea beaVar = bea.t;
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            return this.d.d();
        }
        if (ordinal == 2) {
            return anfq.i(n(this.d.d()), new tpa(this, beaVar, 0), this.b);
        }
        if (ordinal == 3) {
            return this.e.d();
        }
        return q();
    }

    @Override // defpackage.tow
    public final anhy e() {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            return this.d.e();
        }
        if (ordinal == 2) {
            return anfq.i(n(this.d.e()), new toz(this, 0), this.b);
        }
        if (ordinal == 3) {
            return this.e.e();
        }
        return q();
    }

    @Override // defpackage.tow
    public final anhy f() {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            try {
                try {
                    r(this.f);
                    r(this.g);
                    return anhv.a;
                } catch (Throwable th) {
                    r(this.g);
                    throw th;
                }
            } catch (IOException e) {
                return anaf.N(e);
            }
        }
        if (ordinal == 2) {
            try {
                r(this.g);
                return anhv.a;
            } catch (IOException e2) {
                return anaf.N(e2);
            }
        }
        if (ordinal == 3) {
            try {
                r(this.f);
                return anhv.a;
            } catch (IOException e3) {
                return anaf.N(e3);
            }
        }
        return q();
    }

    @Override // defpackage.tow
    public final anhy g(tld tldVar) {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        int i = 1;
        if (ordinal == 1) {
            return this.d.g(tldVar);
        }
        if (ordinal == 2) {
            return anfq.i(n(this.d.g(tldVar)), new tpd(this, tldVar, i), this.b);
        }
        if (ordinal == 3) {
            return this.e.g(tldVar);
        }
        return q();
    }

    @Override // defpackage.tow
    public final anhy h(tld tldVar) {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            return this.d.h(tldVar);
        }
        int i = 2;
        if (ordinal == 2) {
            return anfq.i(n(this.d.h(tldVar)), new tpd(this, tldVar, i), this.b);
        }
        if (ordinal == 3) {
            return this.e.h(tldVar);
        }
        return q();
    }

    @Override // defpackage.tow
    public final anhy i(tld tldVar) {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            return this.d.i(tldVar);
        }
        if (ordinal == 2) {
            return anfq.i(n(this.d.i(tldVar)), new tpd(this, tldVar, 0), this.b);
        }
        if (ordinal == 3) {
            return this.e.i(tldVar);
        }
        return q();
    }

    @Override // defpackage.tow
    public final anhy j(List list) {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        int i = 1;
        if (ordinal == 1) {
            return this.d.j(list);
        }
        if (ordinal == 2) {
            return anfq.i(n(this.d.j(list)), new tpb(this, list, i), this.b);
        }
        if (ordinal == 3) {
            return this.e.j(list);
        }
        return q();
    }

    @Override // defpackage.tow
    public final anhy k() {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            return this.d.k();
        }
        int i = 2;
        if (ordinal == 2) {
            return anfq.i(n(this.d.k()), new toz(this, i), this.b);
        }
        if (ordinal == 3) {
            return this.e.k();
        }
        return q();
    }

    @Override // defpackage.tow
    public final anhy l(final tld tldVar, final tkv tkvVar) {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            return this.d.l(tldVar, tkvVar);
        }
        if (ordinal == 2) {
            return anfq.i(n(this.d.l(tldVar, tkvVar)), new anfz() { // from class: tpe
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    tpf tpfVar = tpf.this;
                    return anfq.i(tpfVar.n(tpfVar.a.l(tldVar, tkvVar)), new tox(tpfVar, (ttj) obj, 1), tpfVar.b);
                }
            }, this.b);
        }
        if (ordinal == 3) {
            return this.e.l(tldVar, tkvVar);
        }
        return q();
    }

    @Override // defpackage.tow
    public final anhy m(List list) {
        tkr tkrVar = tkr.UNDEFINED;
        int ordinal = this.j.e().ordinal();
        if (ordinal == 1) {
            return this.d.m(list);
        }
        if (ordinal == 2) {
            return anfq.i(n(this.d.m(list)), new tpb(this, list, 0), this.b);
        }
        if (ordinal == 3) {
            return this.e.m(list);
        }
        return q();
    }

    public final anhy n(anhy anhyVar) {
        return aney.h(anfq.h(anhyVar, rtp.p, this.b), Exception.class, rtp.q, this.b);
    }

    public final anhy o(ttj ttjVar, ttj ttjVar2, int i) {
        this.i.A();
        if (tsx.a(10000L)) {
            if (ttjVar.equals(ttjVar2)) {
                this.c.l(1107);
            } else {
                this.c.l(i);
            }
        }
        if (ttjVar.a) {
            return anaf.O(ttjVar.c());
        }
        return anaf.N((Throwable) ttjVar.d());
    }

    public final anhy p(ttj ttjVar, ttj ttjVar2, Comparator comparator, int i) {
        this.i.A();
        if (tsx.a(10000L)) {
            if (ttj.g(ttjVar, ttjVar2, comparator)) {
                this.c.l(1106);
            } else {
                this.c.l(i);
            }
        }
        if (ttjVar.a) {
            List list = (List) ttjVar.c();
            list.getClass();
            return anaf.O(list);
        }
        Object d = ttjVar.d();
        d.getClass();
        return anaf.N((Throwable) d);
    }
}
