package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agxo implements agyr {
    public final zaw a;
    public final ysy b;
    public final zbi c;
    public final agsm d;
    public final agya e;
    private final Activity f;
    private final afsy g;
    private final aftn h;
    private final agsg i;
    private final agzk j;
    private final agys k;
    private final agyq l;
    private final agel m;
    private final agzr n;
    private final agof o;

    public agxo(Activity activity, afsy afsyVar, agof agofVar, aftn aftnVar, zaw zawVar, ysy ysyVar, agsg agsgVar, agzk agzkVar, agys agysVar, agyq agyqVar, zbi zbiVar, agsm agsmVar, agel agelVar, agzr agzrVar, agya agyaVar) {
        this.f = activity;
        this.g = afsyVar;
        this.o = agofVar;
        this.h = aftnVar;
        this.a = zawVar;
        this.b = ysyVar;
        this.i = agsgVar;
        this.j = agzkVar;
        this.k = agysVar;
        this.l = agyqVar;
        this.c = zbiVar;
        this.d = agsmVar;
        this.m = agelVar;
        this.n = agzrVar;
        this.e = agyaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(final String str, final atsb atsbVar, final acra acraVar, atom atomVar) {
        atol atolVar;
        final byte[] I = (atsbVar.b & 128) != 0 ? atsbVar.i.I() : aaef.b;
        if (this.i.m(atsbVar, atomVar)) {
            this.k.e(atsbVar, acraVar, new agzo() { // from class: agxj
                @Override // defpackage.agzo
                public final void a(atrx atrxVar, atol atolVar2) {
                    agxo agxoVar = agxo.this;
                    atsb atsbVar2 = atsbVar;
                    acra acraVar2 = acraVar;
                    String str2 = str;
                    byte[] bArr = I;
                    ahbj.k(atsbVar2, acraVar2, null, str2, atrxVar, false, agno.OFFLINE_IMMEDIATELY, atolVar2);
                    agxoVar.k(str2, atrxVar, agno.OFFLINE_IMMEDIATELY, bArr);
                }
            }, str);
            return;
        }
        atrx u = this.i.u();
        agno agnoVar = agno.OFFLINE_IMMEDIATELY;
        if (atomVar == null || (atomVar.b & 2) == 0) {
            atolVar = null;
        } else {
            atol b = atol.b(atomVar.d);
            if (b == null) {
                b = atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN;
            }
            atolVar = b;
        }
        ahbj.k(atsbVar, acraVar, null, str, u, true, agnoVar, atolVar);
        k(str, u, agno.OFFLINE_IMMEDIATELY, I);
    }

    public void c(int i) {
        whu.K(this.f, i, 1);
    }

    public final agsl d() {
        return e().i();
    }

    public final agsn e() {
        return this.o.a();
    }

    @Override // defpackage.agyr
    public final void g(String str) {
        this.k.u(new agxm(this, str));
    }

    public final void h(String str) {
        agya agyaVar = this.e;
        agyaVar.a.m();
        agyaVar.b.a().i().w(str);
    }

    @Override // defpackage.agyr
    public final void i(final String str, final String str2) {
        zhq.m(str2);
        zhq.m(str);
        agnv e = e().m().e(str2);
        if (e == null || (e.u() && e.y())) {
            this.j.n(new agzn() { // from class: agxi
                @Override // defpackage.agzn
                public final void a() {
                    agxo agxoVar = agxo.this;
                    String str3 = str;
                    String str4 = str2;
                    if (!agxoVar.b.o()) {
                        agxoVar.c.b();
                        return;
                    }
                    int b = agxoVar.e().i().b(str3, str4);
                    agno agnoVar = agno.OFFLINE_IMMEDIATELY;
                    agxoVar.l(b);
                }
            });
        }
    }

    @Override // defpackage.agyr
    public final void j(String str, atsb atsbVar, acra acraVar, atom atomVar) {
        Object obj;
        zhq.m(str);
        if (!this.b.o()) {
            this.c.b();
            return;
        }
        if (d().d(str) != null) {
            l(1);
            return;
        }
        if (atsbVar == null) {
            l(2);
            return;
        }
        if (!atsbVar.c) {
            atsa atsaVar = atsbVar.d;
            if (atsaVar == null) {
                atsaVar = atsa.a;
            }
            if ((atsaVar.b & 2) != 0) {
                atsa atsaVar2 = atsbVar.d;
                if (atsaVar2 == null) {
                    atsaVar2 = atsa.a;
                }
                obj = atsaVar2.d;
                if (obj == null) {
                    obj = avul.a;
                }
            } else {
                atsa atsaVar3 = atsbVar.d;
                if (atsaVar3 == null) {
                    atsaVar3 = atsa.a;
                }
                if ((atsaVar3.b & 1) != 0) {
                    atsa atsaVar4 = atsbVar.d;
                    if (atsaVar4 == null) {
                        atsaVar4 = atsa.a;
                    }
                    obj = atsaVar4.c;
                    if (obj == null) {
                        obj = aqkv.a;
                    }
                } else {
                    obj = null;
                }
            }
            this.l.a(obj, acraVar, null, null);
            return;
        }
        if (!this.g.t()) {
            this.h.c(this.f, null, new agxk(this, str, atsbVar, acraVar, atomVar));
        } else {
            b(str, atsbVar, acraVar, atomVar);
        }
    }

    public final void k(String str, atrx atrxVar, agno agnoVar, byte[] bArr) {
        this.k.i(new agxl(this, str, atrxVar, agnoVar, bArr));
    }

    @Override // defpackage.agyr
    public void a(String str, agyg agygVar) {
        if (!agygVar.a) {
            zhq.m(str);
            if (d().d(str) != null) {
                h(str);
                return;
            }
            return;
        }
        zhq.m(str);
        agnh d = d().d(str);
        if (d != null) {
            agxn agxnVar = new agxn(this, str);
            if (d.e()) {
                this.k.j(agxnVar, agygVar);
            } else {
                this.k.q(agxnVar, agygVar);
            }
        }
    }

    @Override // defpackage.agyr
    public final void f(String str, agyg agygVar) {
        if (!agygVar.a) {
            zhq.m(str);
            d().o(str);
            c(R.string.sync_playlist_start);
        } else {
            zhq.m(str);
            this.k.s(new agxm(this, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r3.b.r() == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r4) {
        /*
            r3 = this;
            r0 = 2132017434(0x7f14011a, float:1.9673146E38)
            r1 = 2132017438(0x7f14011e, float:1.9673154E38)
            if (r4 == 0) goto L13
            r0 = 1
            if (r4 == r0) goto Lf
            r0 = 2132017433(0x7f140119, float:1.9673144E38)
            goto L58
        Lf:
            r0 = 2132018998(0x7f140736, float:1.9676318E38)
            goto L58
        L13:
            agsg r4 = r3.i
            awwg r4 = r4.w()
            awwg r2 = defpackage.awwg.UNMETERED_WIFI_OR_UNMETERED_MOBILE
            if (r4 != r2) goto L49
            ysy r2 = r3.b
            boolean r2 = r2.r()
            if (r2 != 0) goto L49
            agzr r2 = r3.n
            boolean r2 = r2.c()
            if (r2 == 0) goto L35
            ysy r2 = r3.b
            boolean r2 = r2.q()
            if (r2 != 0) goto L49
        L35:
            agzr r4 = r3.n
            boolean r4 = r4.c()
            if (r4 == 0) goto L55
            agel r4 = r3.m
            boolean r4 = r4.a()
            if (r4 == 0) goto L55
            r0 = 2132017439(0x7f14011f, float:1.9673156E38)
            goto L58
        L49:
            awwg r2 = defpackage.awwg.UNMETERED_WIFI
            if (r4 != r2) goto L58
            ysy r4 = r3.b
            boolean r4 = r4.r()
            if (r4 != 0) goto L58
        L55:
            r0 = 2132017438(0x7f14011e, float:1.9673154E38)
        L58:
            r3.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agxo.l(int):void");
    }
}
