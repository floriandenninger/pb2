package defpackage;

import android.app.Service;
import android.content.Context;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ehx implements axqj {
    public azrw A;
    public azrw B;
    public azrw C;
    public azrw D;
    public azrw E;
    public azrw F;
    public azrw G;
    public azrw H;
    public azrw I;

    /* renamed from: J, reason: collision with root package name */
    public azrw f213J;
    private final Service K;
    private azrw L;
    private azrw M;
    private azrw N;
    private azrw O;
    private azrw P;
    private final ehx Q;
    public final efz a;
    public azrw b;
    public azrw c;
    public azrw d;
    public azrw e;
    public azrw f;
    public azrw g;
    public azrw h;
    public azrw i;
    public azrw j;
    public azrw k;
    public azrw l;
    public azrw m;
    public azrw n;
    public azrw o;
    public azrw p;
    public azrw q;
    public azrw r;
    public azrw s;
    public azrw t;
    public azrw u;
    public azrw v;
    public azrw w;
    public azrw x;
    public azrw y;
    public azrw z;

    public ehx(efz efzVar, Service service) {
        this.Q = this;
        this.a = efzVar;
        this.K = service;
        this.b = axqx.a(new efb(this, 1));
        this.c = new efb(this, 0);
        this.d = axqq.b(new efb(this, 3));
        this.e = axqq.b(new efb(this, 4));
        this.f = new efb(this, 5);
        this.g = new efb(this, 6);
        this.h = axqq.b(new efb(this, 7));
        this.i = new axqp();
        this.j = new axqp();
        this.k = new efb(this, 13);
        axqp.a(this.j, new efb(this, 12));
        this.L = new efb(this, 11);
        this.l = axqx.a(new efb(this, 14));
        this.m = new efb(this, 15);
        this.n = new efb(this, 16);
        efb efbVar = new efb(this, 10);
        this.M = efbVar;
        axqp.a(this.i, axqx.a(efbVar));
        efb efbVar2 = new efb(this, 9);
        this.N = efbVar2;
        this.o = axqx.a(efbVar2);
        this.O = axqx.a(new efb(this, 17));
        this.p = new efb(this, 20);
        this.q = new efb(this, 19);
        this.r = new efb(this, 18);
        this.s = new efb(this, 21);
        this.t = axqx.a(new efb(this, 23));
        this.u = axqx.a(new efb(this, 22));
        efb efbVar3 = new efb(this, 8);
        this.P = efbVar3;
        this.v = axqx.a(efbVar3);
        this.w = new efb(this, 24);
        this.x = new efb(this, 25);
        this.y = new efb(this, 2);
        this.z = new efb(this, 26);
        this.A = new efb(this, 27);
        this.B = new efb(this, 28);
        this.C = new efb(this, 29);
        this.D = axqq.b(new efb(this, 31));
        this.E = axqq.b(new efb(this, 30));
        this.F = new efb(this, 32);
        this.G = new efb(this, 33);
        this.H = new efb(this, 35);
        this.I = new efb(this, 36);
        this.f213J = new efb(this, 34);
    }

    public static Map n() {
        return ssv.l(ammv.j(amvo.b));
    }

    public final stk a() {
        return ssv.i(k());
    }

    public final stv b() {
        return new stv(e(), this.a.yl, axqq.a(this.i));
    }

    public final sxh c() {
        return spp.f(ammv.j((sxh) this.O.get()));
    }

    public final syd d() {
        return szr.c(amlr.a, ammv.j((Boolean) this.a.dQ.get()), axqq.a(this.L));
    }

    public final JSEnvironment e() {
        return szr.b(ammv.j((JSEnvironment) this.a.ek.get()));
    }

    public final szl f() {
        return szr.f(amlr.a, d());
    }

    public final szz g() {
        return new szz(d());
    }

    public final abiy h() {
        return new abiy((aaea) this.a.K.get());
    }

    public final ScreencastHostService i() {
        ScreencastHostService screencastHostService = (ScreencastHostService) this.K;
        ayaw.k(screencastHostService);
        return screencastHostService;
    }

    public final acqz j() {
        return new knb(this.a.cO(), 4);
    }

    public final ayqi k() {
        return szr.e(ammv.j((ayqi) this.a.aq.get()));
    }

    public final String l() {
        return yjv.d(ammv.j(this.a.id()));
    }

    public final Map m() {
        amrw i = amrz.i(7);
        i.g(axof.class, spp.r());
        i.g(axou.class, ssv.a());
        i.g(axon.class, ssv.b((sww) this.i.get(), g(), ammv.j(Boolean.valueOf(this.a.jy()))));
        i.g(axoy.class, ssv.d(ammv.j(Boolean.valueOf(this.a.jo()))));
        i.g(axpc.class, ssv.g(amrz.k(axoi.class, ssv.u()), amvo.b, ammv.j(Boolean.valueOf(this.a.jx())), d()));
        i.g(axox.class, ssv.c(amrz.l(axom.class, spp.u((sww) this.i.get(), g()), axor.class, spp.n((sww) this.i.get(), g())), amvo.b, d()));
        i.g(axpf.class, ssv.h(d()));
        return i.c();
    }

    public final void o() {
        Context context = this.a.b.a;
    }

    public final axze p() {
        return new axze((aaea) this.a.K.get(), null, null);
    }

    public ehx() {
    }
}
