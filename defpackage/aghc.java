package defpackage;

import android.database.Cursor;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghc implements agsw {
    public static final /* synthetic */ int r = 0;
    private static final long s = TimeUnit.DAYS.toSeconds(30);
    public final shf a;
    public final String b;
    public final azrw c;
    public final azrw d;
    public final azrw e;
    public final agvh f;
    public final azrw g;
    public final agft h;
    public final Executor i;
    public final azrw j;
    public final azrw k;
    public final azrw l;
    public final azrw m;
    public final azrw n;
    public final azrw o;
    public final aypy p;
    final aghb q = new aghb(this);
    private final Executor t;
    private final azrw u;
    private final agzz v;

    public aghc(shf shfVar, String str, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, agvh agvhVar, azrw azrwVar4, agft agftVar, Executor executor, Executor executor2, azrw azrwVar5, agjv agjvVar, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, agzz agzzVar, azrw azrwVar10, azrw azrwVar11, aypy aypyVar) {
        this.a = shfVar;
        this.b = str;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
        this.f = agvhVar;
        this.g = azrwVar4;
        this.h = agftVar;
        this.i = executor;
        this.t = executor2;
        this.j = azrwVar5;
        this.k = azrwVar6;
        this.l = azrwVar7;
        this.m = azrwVar8;
        this.u = azrwVar9;
        this.v = agzzVar;
        this.n = azrwVar10;
        this.o = azrwVar11;
        this.p = aypyVar;
        agjvVar.e(new aggw(this));
    }

    private final void H(String str) {
        aghk aghkVar = (aghk) this.n.get();
        aghkVar.f(k().size());
        aghl b = aghkVar.b();
        b.c(str);
        n(b.b());
    }

    private final void I(String str) {
        agsy agsyVar = (agsy) this.o.get();
        agsyVar.f(j().size());
        agsz b = agsyVar.b();
        b.c(str);
        v(b.b());
    }

    public final void A(String str, String str2, agno agnoVar) {
        int i;
        yjk.e();
        agil agilVar = (agil) this.k.get();
        atrx e = agilVar.e(str);
        zhq.m(str);
        Cursor query = agilVar.d.a.a().query("videosV2", new String[]{"offline_audio_quality"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                int bZ = anaf.bZ(query.getInt(0));
                int i2 = bZ != 0 ? bZ : 1;
                query.close();
                i = i2;
            } else {
                query.close();
                i = 1;
            }
            ((aghj) this.l.get()).h(str, str2, null, e, null, i, agnoVar, 0, false, false, false);
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(String str, String str2, agno agnoVar, agnf agnfVar) {
        int i;
        yjk.e();
        agil agilVar = (agil) this.k.get();
        if (agilVar.c(str) == null) {
            return;
        }
        agnv p = agilVar.p(str);
        if ((p != null && !p.a()) || (p != null && p.l == agnf.STREAM_CORRUPT)) {
            agfx agfxVar = (agfx) this.u.get();
            if (((agft) ((axqs) agfxVar.b).a).z()) {
                ((agil) agfxVar.a.get()).M(str, false);
            }
            agilVar.x(str);
        }
        if (p == null) {
            atrx e = agilVar.e(str);
            zhq.m(str);
            Cursor query = agilVar.d.a.a().query("videosV2", new String[]{"offline_source_ve_type"}, "id = ?", new String[]{str}, null, null, null, null);
            try {
                if (query.moveToNext()) {
                    int i2 = query.getInt(0);
                    query.close();
                    i = i2;
                } else {
                    query.close();
                    i = -1;
                }
                agilVar.R(str, agnfVar, e, null, i, agilVar.i(str));
                p = agilVar.p(str);
                if (p == null) {
                    return;
                } else {
                    q(str);
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } else {
            agilVar.V(str, agnfVar);
        }
        agno agnoVar2 = p.m;
        if (agnoVar != agnoVar2) {
            agilVar.Z(str, agnoVar);
            agnoVar2 = agnoVar;
        }
        t(str);
        if (agnfVar == agnf.ACTIVE) {
            if (str2 == null) {
                H(str);
            }
            I(str);
            A(str, str2, agnoVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(agnv agnvVar) {
        agnu agnuVar = agnvVar.j;
        if (agnuVar == null) {
            return;
        }
        long min = Math.min(Math.max(TimeUnit.MILLISECONDS.toSeconds(agnuVar.b() - this.a.c()), 0L), s);
        String str = agnuVar.a;
        agft agftVar = this.h;
        agfp agfpVar = (agfp) agftVar;
        agfpVar.i.schedule(new agfh(agfpVar, new aggq(this, str, 5), 0), min + 1, TimeUnit.SECONDS);
    }

    @Override // defpackage.agsw
    public final void D(String str, long j) {
        str.getClass();
        this.i.execute(new aggr(this, str, j, 1));
    }

    @Override // defpackage.agsw
    public final void E(String str, long j) {
        this.i.execute(new aggr(this, str, j, 0));
    }

    @Override // defpackage.agsw
    public final void F(String str) {
        this.h.s(new aggq(this, str, 6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(String str, int i) {
        yjk.e();
        agil agilVar = (agil) this.k.get();
        if (!agilVar.D(str, i)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46);
            sb.append("[Offline] Failed removing video ");
            sb.append(str);
            sb.append(" from database");
            zga.b(sb.toString());
            return;
        }
        s(str);
        agilVar.v(str);
    }

    @Override // defpackage.agsw
    public final int a(final String str, final atrx atrxVar, final agno agnoVar, final byte[] bArr, final int i) {
        if (!this.h.z()) {
            return 2;
        }
        final agnf agnfVar = agnf.ACTIVE;
        zhq.m(str);
        int i2 = 1;
        this.v.b(true);
        agnv e = e(str);
        if (e == null || e.s()) {
            this.h.s(new Runnable() { // from class: aggt
                @Override // java.lang.Runnable
                public final void run() {
                    agnf agnfVar2;
                    agno agnoVar2;
                    aghc aghcVar = aghc.this;
                    String str2 = str;
                    atrx atrxVar2 = atrxVar;
                    agno agnoVar3 = agnoVar;
                    byte[] bArr2 = bArr;
                    int i3 = i;
                    agnf agnfVar3 = agnfVar;
                    yjk.e();
                    if (!((ageh) aghcVar.j.get()).i()) {
                        aghcVar.p(str2, 0);
                        return;
                    }
                    agnv e2 = aghcVar.e(str2);
                    if (e2 == null || e2.s()) {
                        int U = ((agsg) aghcVar.d.get()).U(atrxVar2);
                        agil agilVar = (agil) aghcVar.k.get();
                        if (agilVar.c(str2) == null) {
                            try {
                                agnp a = ((agrq) aghcVar.g.get()).a(str2);
                                agnfVar2 = agnfVar3;
                                agnoVar2 = agnoVar3;
                                if (!agilVar.ac(a, atrxVar2, null, U, agnoVar2, i3, bArr2, agnfVar2)) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45);
                                    sb.append("[Offline] Failed inserting video ");
                                    sb.append(str2);
                                    sb.append(" to database");
                                    zga.b(sb.toString());
                                    aghcVar.p(str2, 2);
                                    return;
                                }
                                ((ajoy) aghcVar.m.get()).i(a);
                            } catch (ExecutionException e3) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 46);
                                sb2.append("[Offline] Failed requesting video ");
                                sb2.append(str2);
                                sb2.append(" for offline");
                                zga.d(sb2.toString(), e3);
                                aghcVar.p(str2, 1);
                                return;
                            }
                        } else {
                            agilVar.R(str2, agnfVar3, atrxVar2, null, i3, bArr2);
                            agilVar.E(str2);
                            agnfVar2 = agnfVar3;
                            agnoVar2 = agnoVar3;
                        }
                        aghcVar.w(str2, agnfVar2 == agnf.ACTIVE);
                        if (agnfVar2 != agnf.ACTIVE) {
                            return;
                        }
                        ((aghj) aghcVar.l.get()).h(str2, null, null, atrxVar2, null, U, agnoVar2, 0, false, false, false);
                        return;
                    }
                    aghcVar.q(str2);
                }
            });
        } else {
            if (!e.u() || (e.a() && !e.y() && !e.t() && !e.r())) {
                if (e.e) {
                    return 1;
                }
                this.h.s(new aggq(this, str, i2));
                return 0;
            }
            this.h.s(new Runnable() { // from class: aggs
                @Override // java.lang.Runnable
                public final void run() {
                    aghc.this.B(str, null, agnoVar, agnfVar);
                }
            });
        }
        return 0;
    }

    @Override // defpackage.agsw
    public final int b(String str) {
        byte[] bArr;
        zhq.m(str);
        if (!this.h.z()) {
            return 2;
        }
        agnv e = e(str);
        if (e == null || !e.z()) {
            atrx u = ((agsg) this.d.get()).u();
            agno agnoVar = agno.OFFLINE_IMMEDIATELY;
            if (e == null) {
                bArr = aaef.b;
            } else {
                bArr = e.d;
            }
            return a(str, u, agnoVar, bArr, e == null ? -1 : e.c);
        }
        this.h.s(new aggq(this, str, 4));
        return 0;
    }

    @Override // defpackage.agsw
    public final agnk c() {
        if (this.h.z()) {
            return ((aghk) this.n.get()).b().b();
        }
        return null;
    }

    @Override // defpackage.agsw
    public final agnp d(String str) {
        return ((agil) this.k.get()).c(str);
    }

    @Override // defpackage.agsw
    public final agnv e(String str) {
        if (this.h.z()) {
            return ((agil) this.k.get()).p(str);
        }
        return null;
    }

    @Override // defpackage.agsw
    public final agnw f() {
        if (this.h.z()) {
            return ((agsy) this.o.get()).b().b();
        }
        return null;
    }

    @Override // defpackage.agsw
    public final anhy g() {
        return aney.h(anfq.h(anht.q(this.h.o()), new aggp(this, 1), this.t), aglv.class, afyf.h, angq.a);
    }

    @Override // defpackage.agsw
    public final anhy h(final String str) {
        return aney.h(anfq.h(anht.q(this.h.o()), new amml() { // from class: aggv
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                aghc aghcVar = aghc.this;
                return ammv.i(((agil) aghcVar.k.get()).p(str));
            }
        }, this.t), aglv.class, afyf.i, angq.a);
    }

    @Override // defpackage.agsw
    public final anhy i() {
        return aney.h(anfq.h(anht.q(this.h.o()), new aggp(this, 0), this.t), aglv.class, afyf.j, angq.a);
    }

    @Override // defpackage.agsw
    public final Collection j() {
        if (!this.h.z()) {
            return amru.q();
        }
        return ((agil) this.k.get()).s();
    }

    @Override // defpackage.agsw
    public final List k() {
        if (!this.h.z()) {
            return amru.q();
        }
        return ((agil) this.k.get()).r();
    }

    @Override // defpackage.agsw
    public final List l() {
        return ((agil) this.k.get()).e.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set m(List list) {
        agnv e;
        yjk.e();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agnp agnpVar = (agnp) it.next();
            agil agilVar = (agil) this.k.get();
            String f = agnpVar.f();
            zhq.m(f);
            if (yoj.a(agilVar.d.a.a(), "videosV2", "id = ? AND media_status = ?", new String[]{f, Integer.toString(agnf.DELETED.q)}) <= 0 && ((e = e(agnpVar.f())) == null || e.s() || ((e.u() && e.y()) || e.E()))) {
                hashSet.add(agnpVar.f());
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(agnk agnkVar) {
        int i = agnkVar.a;
        int i2 = agnkVar.b;
        int i3 = agnkVar.c;
        this.h.v(new agkv(agnkVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        this.h.v(new agkw());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(String str, int i) {
        String.valueOf(str).length();
        this.h.v(new agky(str, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(String str) {
        agnv e = e(str);
        if (e == null) {
            String.valueOf(str).length();
            return;
        }
        String valueOf = String.valueOf(e.l);
        String.valueOf(str).length();
        String.valueOf(valueOf).length();
        C(e);
        this.h.v(new agku(e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(String str) {
        agnv e = e(str);
        if (e == null) {
            return;
        }
        String valueOf = String.valueOf(e.l);
        str.length();
        String.valueOf(valueOf).length();
        this.h.v(new agla(e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(String str) {
        String.valueOf(str).length();
        this.h.v(new aglb(str));
        ((aghk) this.n.get()).f(k().size());
        ((agsy) this.o.get()).f(j().size());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(String str) {
        u(str, atqs.UNKNOWN_FAILURE_REASON);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(String str, atqs atqsVar) {
        agnv e = e(str);
        if (e == null) {
            return;
        }
        String valueOf = String.valueOf(e.l);
        long e2 = e.e();
        long d = e.d();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 73 + String.valueOf(valueOf).length());
        sb.append("[Offline] pudl event ");
        sb.append(str);
        sb.append(" status: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(e2);
        sb.append("/");
        sb.append(d);
        String sb2 = sb.toString();
        if (atqsVar != atqs.UNKNOWN_FAILURE_REASON) {
            String valueOf2 = String.valueOf(sb2);
            int i = atqsVar.H;
            String.valueOf(valueOf2).length();
        }
        this.h.v(new agli(e, atqsVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(agnw agnwVar) {
        int i = agnwVar.a;
        int i2 = agnwVar.b;
        int i3 = agnwVar.c;
        this.h.v(new aglk(agnwVar));
    }

    @Override // defpackage.agsw
    public final void w(String str, boolean z) {
        q(str);
        o();
        if (z) {
            H(str);
            I(str);
        }
    }

    @Override // defpackage.agsw
    public final void x(String str) {
        this.h.s(new aggq(this, str, 0));
    }

    @Override // defpackage.agsw
    public final void y(String str) {
        this.h.s(new aggq(this, str, 2));
    }

    @Override // defpackage.agsw
    public final void z(String str) {
        this.h.s(new aggq(this, str, 3));
    }
}
