package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agfp implements agsn, agft, ypd {
    public final azrw A;
    public final azrw B;
    public final azrw C;
    public final azrw D;
    public final azrw E;
    public final azrs F;
    public final String G;
    public boolean H;
    public final ambx I;

    /* renamed from: J, reason: collision with root package name */
    public final agil f48J;
    public final axzg K;
    private final agtv L;
    public final Handler a;
    public final ypa b;
    public final SharedPreferences c;
    public final azrw d;
    public final agro e;
    public final agtq f;
    public final agdu g;
    public final agon h;
    public final ScheduledExecutorService i;
    public final ScheduledExecutorService j;
    public final Executor k;
    public final agvh l;
    public final azrw m;
    public final agek n;
    public final aghe o;
    public final agjf p;
    public final agjs q;
    public final agik r;
    public final azrw s;
    public final ageh t;
    public final azrw u;
    public final azrw v;
    public final azrw w;
    public final azrw x;
    public final azrw y;
    public final azrw z;

    /* JADX WARN: Multi-variable type inference failed */
    public agfp(Context context, afsx afsxVar) {
        Boolean bool;
        String d = afsxVar.d();
        zhq.m(d);
        this.G = d;
        eef jC = ((agfq) yjj.p(context, agfq.class)).jC();
        jC.b = d;
        jC.c = afsxVar;
        jC.d = this;
        ayaw.j(jC.b, String.class);
        ayaw.j(jC.c, afsx.class);
        ayaw.j(jC.d, agft.class);
        eeh eehVar = new eeh(jC.a, jC.b, jC.c, jC.d);
        this.a = (Handler) eehVar.d.an.get();
        this.b = (ypa) eehVar.d.B.get();
        this.c = (SharedPreferences) eehVar.d.z.get();
        efz efzVar = eehVar.d;
        this.d = efzVar.gU;
        this.e = (agro) efzVar.kQ.get();
        this.f = (agtq) eehVar.d.mt.get();
        this.g = (agdu) eehVar.d.mu.get();
        agon agonVar = (agon) eehVar.d.lf.get();
        this.h = agonVar;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) eehVar.d.f.get();
        this.i = scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) eehVar.d.Q.get();
        this.j = scheduledExecutorService2;
        this.k = (Executor) eehVar.d.lj.get();
        this.l = (agvh) eehVar.d.kF.get();
        efz efzVar2 = eehVar.d;
        this.m = efzVar2.mx;
        this.n = (agek) eehVar.d.we.get();
        this.o = (aghe) eehVar.g.get();
        agil agilVar = (agil) eehVar.y.get();
        this.f48J = agilVar;
        agjf agjfVar = (agjf) eehVar.k.get();
        this.p = agjfVar;
        agjs agjsVar = (agjs) eehVar.x.get();
        this.q = agjsVar;
        agik agikVar = (agik) eehVar.i.get();
        this.r = agikVar;
        this.s = eehVar.e;
        this.t = (ageh) eehVar.f.get();
        this.u = eehVar.G;
        this.v = eehVar.E;
        this.w = eehVar.K;
        this.x = eehVar.M;
        this.y = eehVar.N;
        this.z = eehVar.O;
        this.A = eehVar.D;
        this.B = eehVar.P;
        this.C = eehVar.Q;
        this.D = eehVar.S;
        this.E = eehVar.A;
        this.F = (azrs) eehVar.w.get();
        axzg axzgVar = (axzg) eehVar.d.gO.get();
        this.K = axzgVar;
        agonVar.q(new agfo(this));
        agilVar.k.add(new agfo(this));
        agjfVar.b(new agfn(this));
        agjsVar.g.add(new agfo(this));
        agikVar.a = new agfo(this);
        this.L = new agfm(this);
        anfy anfyVar = new anfy() { // from class: agfk
            @Override // defpackage.anfy
            public final anhy a() {
                agfp.this.w();
                return anaf.O(null);
            }
        };
        aqvj aqvjVar = axzgVar.b.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45353396L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45353396L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45353396L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        this.I = new ambx(anfyVar, bool.booleanValue() ? scheduledExecutorService2 : scheduledExecutorService);
    }

    public static String p(String str) {
        return TextUtils.join(".", new String[]{"offline", str, "db"});
    }

    @Override // defpackage.agsn
    public final agil A() {
        if (z()) {
            return this.f48J;
        }
        return null;
    }

    @Override // defpackage.agsn
    public final aeph a() {
        return (aeph) this.D.get();
    }

    @Override // defpackage.agsn
    public final agej b() {
        return this.t;
    }

    public final aghj c() {
        return (aghj) this.E.get();
    }

    @Override // defpackage.agsn
    public final agjd d() {
        return (agjd) this.A.get();
    }

    @Override // defpackage.agsn
    public final agmm e() {
        return (agmm) this.s.get();
    }

    @Override // defpackage.agsn
    public final agsh g() {
        return (agsh) this.x.get();
    }

    @Override // defpackage.agsn
    public final agsj h() {
        return (agsj) this.B.get();
    }

    @Override // defpackage.agsn
    public final agsl i() {
        return (agsl) this.y.get();
    }

    @Override // defpackage.agsn
    public final agso j() {
        return (agso) this.C.get();
    }

    @Override // defpackage.agsn
    public final agss k() {
        return (agss) this.z.get();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        int i2 = 2;
        if (i == -1) {
            return new Class[]{yxl.class, agli.class};
        }
        if (i == 0) {
            this.k.execute(new agfl(this, i2));
            return null;
        }
        if (i == 1) {
            agli agliVar = (agli) obj;
            if (!atqs.NOT_PLAYABLE.equals(agliVar.b)) {
                return null;
            }
            ((agff) this.y.get()).y(agliVar.a.m(), null);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.agsn
    public final agst l() {
        return (agst) this.w.get();
    }

    @Override // defpackage.agsn
    public final agsw m() {
        return (agsw) this.v.get();
    }

    @Override // defpackage.agsn
    public final agtv n() {
        return this.L;
    }

    @Override // defpackage.agft
    public final anhy o() {
        if (this.H) {
            return aney.i(this.I.c(), Throwable.class, ufj.k, angq.a);
        }
        return anaf.N(new aglv());
    }

    @Override // defpackage.agsn
    public final String q() {
        return this.G;
    }

    @Override // defpackage.agsn
    public final void r() {
        s(new agfl(this, 0));
    }

    @Override // defpackage.agft
    public final void s(Runnable runnable) {
        this.k.execute(new agfh(this, runnable, 1));
    }

    @Override // defpackage.agsn
    public final void t(final String str, final ykl yklVar) {
        zhq.m(str);
        this.k.execute(new Runnable() { // from class: agfi
            @Override // java.lang.Runnable
            public final void run() {
                agfp agfpVar = agfp.this;
                String str2 = str;
                ykl yklVar2 = yklVar;
                if (agfpVar.z()) {
                    yklVar2.b(null, agfpVar.f48J.g(str2));
                }
            }
        });
    }

    public final synchronized void u() {
        this.H = true;
        ynm.j(this.I.c(), angq.a, afka.l);
    }

    @Override // defpackage.agft
    public final synchronized void v(Object obj) {
        if (this.H) {
            this.b.f(obj);
        }
    }

    public final synchronized void w() {
        this.c.edit().putString("current_offline_store_tag", this.G).apply();
        ageh agehVar = this.t;
        agehVar.a.e = agehVar;
        agehVar.b.z(agehVar);
        agehVar.h();
        this.q.j();
        this.f48J.y();
        this.e.b(this.G);
        this.f.b(this.G);
        this.g.b(this.G);
        ((aggn) this.w.get()).j();
        i().z();
        ynm.i(((aghc) this.v.get()).i(), new ynl() { // from class: agfj
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                ((agsy) agfp.this.u.get()).f(((Collection) obj).size());
            }
        });
        if (agtw.ah(this.c, this.G)) {
            this.a.post(new agfl(this, 4));
        }
        v(new agkx());
    }

    public final synchronized void x() {
        this.H = false;
        this.F.sh();
        ageh agehVar = this.t;
        agehVar.b.R(agehVar);
        this.e.g();
        this.f.d();
        this.g.d();
        this.h.r();
        if (agtw.ah(this.c, this.G)) {
            this.k.execute(new agfl(this, 1));
        }
        this.n.b();
        this.c.edit().remove("current_offline_store_tag").apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean y() {
        return this.H;
    }

    @Override // defpackage.agft
    public final boolean z() {
        try {
            o().get();
            return true;
        } catch (IllegalStateException | InterruptedException | ExecutionException e) {
            zga.d("[Offline] Offline store initialization error", e);
            return false;
        }
    }
}
