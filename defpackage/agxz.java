package defpackage;

import android.app.Activity;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agxz implements agzj {
    private final afsy a;
    public final Activity b;
    public final zaw c;
    public final ysy d;
    public final agsg e;
    public final agzk f;
    public final zbi g;
    public final agzl h;
    private final agro i;
    private final aftn j;
    private final agyq k;
    private final agel l;
    private final agzr m;
    private final agkd n;
    private final Executor o;
    private final agof p;

    public agxz(Activity activity, afsy afsyVar, agof agofVar, agro agroVar, aftn aftnVar, zaw zawVar, ysy ysyVar, agsg agsgVar, agzk agzkVar, agyq agyqVar, zbi zbiVar, agzl agzlVar, agel agelVar, agzr agzrVar, agkd agkdVar, Executor executor) {
        this.b = activity;
        agofVar.getClass();
        this.p = agofVar;
        agroVar.getClass();
        this.i = agroVar;
        aftnVar.getClass();
        this.j = aftnVar;
        afsyVar.getClass();
        this.a = afsyVar;
        zawVar.getClass();
        this.c = zawVar;
        ysyVar.getClass();
        this.d = ysyVar;
        agsgVar.getClass();
        this.e = agsgVar;
        agzkVar.getClass();
        this.f = agzkVar;
        agyqVar.getClass();
        this.k = agyqVar;
        this.g = zbiVar;
        this.h = agzlVar;
        this.l = agelVar;
        this.m = agzrVar;
        this.n = agkdVar;
        this.o = executor;
    }

    private final void A(String str, atsb atsbVar, agzi agziVar, acra acraVar, atom atomVar, int i) {
        zhq.m(str);
        agnv agnvVar = (agnv) k(str).f();
        if (this.d.o() || h(str, agnvVar)) {
            if (agnvVar != null && (!agnvVar.u() ? !agnvVar.e : agnvVar.y())) {
                if (agziVar != null) {
                    agziVar.a(str, 1);
                }
                w(1);
                return;
            }
            if (atsbVar == null) {
                if (agziVar != null) {
                    agziVar.a(str, 2);
                }
                w(2);
                return;
            }
            Object obj = null;
            if (!atsbVar.c) {
                atsa atsaVar = atsbVar.d;
                if (atsaVar == null) {
                    atsaVar = atsa.a;
                }
                if ((2 & atsaVar.b) != 0) {
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
                    }
                }
                g(str, obj, acraVar);
                return;
            }
            if (!this.a.t()) {
                this.j.c(this.b, null, new agxw(this, str, atsbVar, agziVar, acraVar, atomVar, i));
                return;
            } else {
                b(str, atsbVar, agziVar, acraVar, atomVar, i);
                return;
            }
        }
        this.g.b();
    }

    public static int r(int i, agsg agsgVar, ysy ysyVar, agel agelVar, agzr agzrVar) {
        if (ysyVar == null || agsgVar == null) {
            return 0;
        }
        if (i != 0) {
            return i != 1 ? R.string.add_video_to_offline_error : R.string.video_already_added_to_offline;
        }
        awwg w = agsgVar.w();
        return (w != awwg.UNMETERED_WIFI_OR_UNMETERED_MOBILE || ysyVar.r() || (agzrVar.c() && ysyVar.q())) ? (w != awwg.UNMETERED_WIFI || ysyVar.r()) ? R.string.add_to_offline_start : R.string.add_to_offline_waiting_for_wifi : (agzrVar.c() && agelVar.a()) ? R.string.add_to_offline_waiting_for_wifi_or_unmetered : R.string.add_to_offline_waiting_for_wifi;
    }

    private final String x(String str) {
        try {
            aqpb aqpbVar = (aqpb) this.n.a(str).get(30L, TimeUnit.SECONDS);
            if (aqpbVar != null) {
                return aqpbVar.c;
            }
            return null;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zga.d("[Offline] Unable to retrieve the DrmErrorInfo.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(final String str, final atsb atsbVar, final agzi agziVar, final acra acraVar, atom atomVar, final int i) {
        atol atolVar;
        final byte[] I = (atsbVar.b & 128) != 0 ? atsbVar.i.I() : aaef.b;
        if (this.e.m(atsbVar, atomVar)) {
            this.f.h(str, atsbVar, acraVar, new agzo() { // from class: agxu
                @Override // defpackage.agzo
                public final void a(atrx atrxVar, atol atolVar2) {
                    agxz agxzVar = agxz.this;
                    atsb atsbVar2 = atsbVar;
                    acra acraVar2 = acraVar;
                    String str2 = str;
                    byte[] bArr = I;
                    agzi agziVar2 = agziVar;
                    int i2 = i;
                    ahbj.k(atsbVar2, acraVar2, str2, null, atrxVar, false, agno.OFFLINE_IMMEDIATELY, atolVar2);
                    agxzVar.i(str2, atrxVar, null, agno.OFFLINE_IMMEDIATELY, bArr, agziVar2, i2);
                }
            });
            return;
        }
        atrx u = this.e.u();
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
        ahbj.k(atsbVar, acraVar, str, null, u, true, agnoVar, atolVar);
        i(str, u, atomVar != null ? atomVar.e : null, agno.OFFLINE_IMMEDIATELY, I, agziVar, i);
    }

    @Override // defpackage.agzj
    public void c(String str, boolean z) {
        y(str, z, a());
    }

    @Override // defpackage.agzj
    public void d(String str, boolean z) {
        y(aalt.g(str), z, aalt.a(str));
    }

    @Override // defpackage.agzj
    public void e(agnu agnuVar, boolean z) {
        if (z) {
            this.f.g(new agxy(this));
        } else {
            l();
        }
    }

    protected void f(int i) {
        whu.K(this.b, i, 1);
    }

    protected void g(String str, Object obj, acra acraVar) {
        q(str, obj, acraVar);
    }

    protected boolean h(String str, agnv agnvVar) {
        return agnvVar != null && agnvVar.s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(String str, atrx atrxVar, String str2, agno agnoVar, byte[] bArr, agzi agziVar, int i) {
        int b = this.h.b(str, atrxVar, str2, agnoVar, bArr, i);
        if (agziVar != null) {
            agziVar.a(str, b);
        }
        w(b);
    }

    public final agsn j() {
        return this.p.a();
    }

    public final ammv k(String str) {
        try {
            return (ammv) j().m().h(str).get(30L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zga.d("[Offline] Unable to retrieve the offlineVideoSnapshot.", e);
            return amlr.a;
        }
    }

    public final void l() {
        this.i.c(this.p.d());
    }

    @Override // defpackage.agzj
    public final void m(String str, String str2, agzi agziVar, boolean z) {
        z(str, str2, agziVar, z, a());
    }

    @Override // defpackage.agzj
    public final void n(String str, atsb atsbVar, agzi agziVar, acra acraVar, atom atomVar) {
        A(str, atsbVar, agziVar, acraVar, atomVar, a());
    }

    public final void o(String str, int i) {
        this.h.c(str, i);
    }

    public final void p(String str, String str2, agzi agziVar, int i) {
        int d;
        if (this.d.o()) {
            if (ammx.e(str) || str.equals("PPSV")) {
                ammv k = k(str2);
                agzl agzlVar = this.h;
                atrx u = this.e.u();
                if (k.h()) {
                }
                boolean z = false;
                if (k.h() && ((agnv) k.c()).z()) {
                    z = true;
                }
                d = agzlVar.d(str2, u, z, i);
            } else {
                d = j().i().b(str, str2);
            }
            if (agziVar != null) {
                agziVar.a(str2, d);
            }
            agno agnoVar = agno.OFFLINE_IMMEDIATELY;
            w(d);
            return;
        }
        this.g.b();
    }

    @Override // defpackage.agzj
    public final void q(final String str, Object obj, acra acraVar) {
        final int a = a();
        this.k.a(obj, acraVar, k(str).h() ? new Pair(this.b.getString(R.string.remove_offline_confirmed_button), new Runnable() { // from class: agxv
            @Override // java.lang.Runnable
            public final void run() {
                agxz.this.o(str, a);
            }
        }) : null, null);
    }

    @Override // defpackage.agzj
    public final void s() {
        this.f.m(new agzn() { // from class: agxr
            @Override // defpackage.agzn
            public final void a() {
                agxz agxzVar = agxz.this;
                int a = agxzVar.a();
                if (!agxzVar.d.o()) {
                    agxzVar.g.b();
                    return;
                }
                HashSet hashSet = new HashSet();
                for (agnp agnpVar : agxzVar.j().m().l()) {
                    if (hashSet.add(agnpVar.f())) {
                        ammv k = agxzVar.k(agnpVar.f());
                        if (!k.h()) {
                            return;
                        }
                        agnv agnvVar = (agnv) k.c();
                        if (agnvVar.t()) {
                            agxzVar.h.d(agnvVar.m(), agxzVar.e.u(), false, a);
                        }
                    }
                }
            }
        });
    }

    @Override // defpackage.agzj
    public final void t(final String str, final String str2) {
        zhq.m(str2);
        ammv k = k(str2);
        if (k.h() && ((agnv) k.c()).a()) {
            this.f.p(new agzn() { // from class: agxs
                @Override // defpackage.agzn
                public final void a() {
                    agxz agxzVar = agxz.this;
                    agxzVar.p(str, str2, null, agxzVar.a());
                }
            });
        }
    }

    @Override // defpackage.agzj
    public final void u(String str, String str2) {
        z(str, aalt.g(str2), null, true, aalt.a(str2));
    }

    @Override // defpackage.agzj
    public final void v(String str, atsb atsbVar, acra acraVar, atom atomVar) {
        A(aalt.g(str), atsbVar, null, acraVar, atomVar, aalt.a(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(int i) {
        int r = r(i, this.e, this.d, this.l, this.m);
        if (r != 0) {
            f(r);
        }
    }

    private final void z(final String str, final String str2, final agzi agziVar, boolean z, final int i) {
        if (!z) {
            p(str, str2, agziVar, i);
            return;
        }
        zhq.m(str2);
        agnv agnvVar = (agnv) k(str2).f();
        if (agnvVar == null || ((agnvVar.u() && agnvVar.y()) || agnvVar.z())) {
            agzn agznVar = new agzn() { // from class: agxt
                @Override // defpackage.agzn
                public final void a() {
                    agxz.this.p(str, str2, agziVar, i);
                }
            };
            String x = x(str2);
            if (!ammx.e(x)) {
                this.f.o(agznVar, x);
            } else {
                this.f.n(agznVar);
            }
        }
    }

    private final void y(String str, boolean z, int i) {
        if (!z) {
            zhq.m(str);
            if (k(str).h()) {
                o(str, i);
                return;
            }
            return;
        }
        zhq.m(str);
        ammv k = k(str);
        if (k.h()) {
            agnv agnvVar = (agnv) k.c();
            final agxx agxxVar = new agxx(this, str, i);
            if (agnvVar.l == agnf.ACTIVE || agnvVar.l == agnf.PAUSED) {
                this.f.r(agxxVar);
                return;
            }
            String x = x(str);
            if (!ammx.e(x)) {
                this.f.l(agxxVar, this.b.getResources().getString(R.string.offline_dialog_download_failed), x);
            } else {
                ynm.k(this.n.b(str), this.o, new ynk() { // from class: agxp
                    @Override // defpackage.zfi
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        agxz agxzVar = agxz.this;
                        agzm agzmVar = agxxVar;
                        zga.b("Failed to determine if the video is an expired rental.");
                        agxzVar.f.k(agzmVar);
                    }
                }, new ynl() { // from class: agxq
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        agxz agxzVar = agxz.this;
                        agzm agzmVar = agxxVar;
                        if (((Boolean) obj).booleanValue()) {
                            agxzVar.f.l(agzmVar, agxzVar.b.getResources().getString(R.string.rental_expired_dialog_title), agxzVar.b.getResources().getString(R.string.rental_expired_dialog_message));
                        } else {
                            agxzVar.f.k(agzmVar);
                        }
                    }
                });
            }
        }
    }
}
