package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tse {
    private azrw A;
    private azrw B;
    private azrw C;
    private azrw D;
    private azrw E;
    private azrw F;
    private azrw G;
    private azrw H;
    private azrw I;

    /* renamed from: J, reason: collision with root package name */
    private azrw f276J;
    public final trp a;
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
    private azrw m;
    private azrw n;
    private azrw o;
    private azrw p;
    private azrw q;
    private azrw r;
    private azrw s;
    private azrw t;
    private azrw u;
    private azrw v;
    private azrw w;
    private azrw x;
    private azrw y;
    private azrw z;

    public tse(trp trpVar, trs trsVar, tru truVar, trx trxVar, tsb tsbVar) {
        this.a = trpVar;
        this.b = axqq.b(new tsa(trxVar, 0));
        this.c = axqq.b(new tsa(trxVar, 7));
        this.m = new trq(trpVar);
        this.d = axqq.b(new tsa(trxVar, 3));
        azrw b = axqq.b(new tsa(trxVar, 2));
        this.e = b;
        this.n = new trn(this.m, this.c, this.d, b);
        this.o = axqq.b(new oux(this.m, this.d, 12));
        this.f = axqq.b(new tsa(trxVar, 6));
        tqk tqkVar = new tqk(this.e);
        this.p = tqkVar;
        this.q = axqq.b(new tsc(tsbVar, this.m, this.o, this.f, this.b, tqkVar, 3));
        azrw b2 = axqq.b(new trv(truVar));
        this.g = b2;
        this.r = axqq.b(new snd(this.m, this.c, this.q, b2, this.e, 4, (int[]) null));
        azrw b3 = axqq.b(new oux(this.m, this.d, 11));
        this.s = b3;
        azrw b4 = axqq.b(new tsc(tsbVar, this.m, b3, this.f, this.b, this.p, 0));
        this.t = b4;
        azrw b5 = axqq.b(new snd(this.m, this.c, b4, this.g, this.e, 2, (char[]) null));
        this.u = b5;
        tpq tpqVar = new tpq(this.m, this.b, this.n, this.r, b5, this.o, this.s, this.p, this.f, this.g, this.e);
        this.v = tpqVar;
        this.h = axqq.b(new ote(tpqVar, 13));
        this.w = axqq.b(new trt(trsVar, 0));
        this.x = axqq.b(new tsa(trxVar, 4));
        this.y = axqq.b(new tsa(trxVar, 1));
        this.z = axqq.b(new trt(trsVar, 1));
        azrw b6 = axqq.b(trz.a);
        this.i = b6;
        this.A = new trl(this.m, b6, this.c, this.d, this.g);
        azrw b7 = axqq.b(new oux(this.m, this.d, 10));
        this.B = b7;
        azrw b8 = axqq.b(new tsc(tsbVar, this.m, b7, this.f, this.b, this.p, 2));
        this.C = b8;
        this.D = axqq.b(new snd(this.m, this.i, this.c, b8, this.g, 3, (short[]) null));
        azrw b9 = axqq.b(new oux(this.m, this.d, 9));
        this.E = b9;
        azrw b10 = axqq.b(new tsc(tsbVar, this.m, b9, this.f, this.b, this.p, 1));
        this.F = b10;
        azrw b11 = axqq.b(new svf(this.m, this.i, this.c, b10, this.g, this.e, 2, (char[]) null));
        this.G = b11;
        tpg tpgVar = new tpg(this.b, this.A, this.D, b11, this.B, this.E, this.p, this.f, this.g, this.e);
        this.H = tpgVar;
        this.j = axqq.b(new ote(tpgVar, 12));
        this.I = axqq.b(new Ctry(trxVar, this.m));
        this.k = axqq.b(new tsa(trxVar, 5));
        azrw b12 = axqq.b(new tsd(tsbVar, this.m, this.d));
        this.f276J = b12;
        this.l = axqq.b(new oux(b12, this.i, 8, (int[]) null));
    }

    public final tov a() {
        Context b = trq.b(this.a);
        tss tssVar = (tss) this.b.get();
        tme tmeVar = (tme) this.c.get();
        tow towVar = (tow) this.j.get();
        trf b2 = b();
        shf shfVar = (shf) this.i.get();
        return new tov(b, tssVar, tmeVar, towVar, b2, shfVar, (Executor) this.g.get(), (ammv) this.d.get(), (vcw) this.f.get(), (ammv) this.k.get(), (tko) this.e.get());
    }

    public final trf b() {
        return new trf(trq.b(this.a), (tme) this.c.get(), (trh) this.h.get(), (vcw) this.f.get(), new tsq(trq.b(this.a), (amnv) this.w.get(), (vcw) this.f.get(), (ttw) this.x.get(), (ammv) this.y.get(), (Executor) this.g.get(), (tko) this.e.get()), (ammv) this.z.get(), (ammv) this.y.get(), (tss) this.b.get(), (tow) this.j.get(), (ammv) this.d.get(), (Executor) this.g.get());
    }

    public tse() {
    }
}
