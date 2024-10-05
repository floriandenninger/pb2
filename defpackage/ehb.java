package defpackage;

import android.content.Context;
import android.os.FileObserver;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ehb implements egn, ypd {
    axpg A;
    azrw B;
    azrw C;
    azrw D;
    azrw E;
    azrw F;
    azrw G;
    azrw H;
    axpg I;

    /* renamed from: J, reason: collision with root package name */
    axpg f210J;
    axpg K;
    azrw L;
    azrw M;
    azrw N;
    azrw O;
    azrw P;
    axpg Q;
    advs R;
    adwl S;
    egd T;
    acoy U;
    akmx V;
    azrw W;
    axpg X;
    azrw Y;
    azrw Z;
    ymp a;
    azrw aA;
    azrw aB;
    azrw aC;
    azrw aD;
    azrw aE;
    azrw aF;
    azrw aG;
    azrw aH;
    azrw aI;
    azrw aJ;
    azrw aK;
    axpg aL;
    azrw aM;
    azrw aN;
    azrw aO;
    azrw aP;
    azrw aQ;
    azrw aR;
    azrw aS;
    azrw aT;
    azrw aU;
    azrw aV;
    azrw aW;
    azrw aX;
    azrw aY;
    aacy aZ;
    azrw aa;
    azrw ab;
    azrw ac;
    azrw ad;
    azrw ae;
    azrw af;
    azrw ag;
    azrw ah;
    azrw ai;
    azrw aj;
    azrw ak;
    axpg al;
    azrw am;
    ayqi an;
    azrw ao;
    azrw ap;
    azrw aq;
    azrw ar;
    azrw as;
    azrw at;
    azrw au;
    azrw av;
    azrw aw;
    azrw ax;
    azrw ay;
    azrw az;
    public FileObserver b;
    azrw ba;
    azrw bb;
    azrw bc;
    public final Context bd;
    public final yxx be;
    private final ajjt bf;
    private final azrw bg;
    private final azrw bh;
    azrw c;
    azrw d;
    azrw e;
    anhy f;
    azrw g;
    azrw h;
    azrw i;
    axpg j;
    axpg k;
    azrw l;
    azrw m;
    azrw n;
    azrw o;
    axpg p;
    axpg q;
    azrw r;
    azrw s;
    azrw t;
    azrw u;
    azrw v;
    azrw w;
    azrw x;
    azrw y;
    axpg z;

    public ehb(Context context, ajjt ajjtVar, azrw azrwVar, azrw azrwVar2, yxx yxxVar) {
        this.bd = context;
        this.bf = ajjtVar;
        this.bg = azrwVar;
        this.bh = azrwVar2;
        this.be = yxxVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, edx] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.Context, edx] */
    private final void g() {
        boolean z;
        yjk.f();
        try {
            z = ((Boolean) this.f.get(500L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            z = false;
        }
        ((fay) this.ag.get()).b(this.bd.c(), this.bd.b(), z, ((Boolean) this.g.get()).booleanValue());
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04b0  */
    @Override // defpackage.egn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehb.a():void");
    }

    public final void b(Executor executor) {
        executor.execute(new egz(this, 11));
    }

    public final void c() {
        this.a.a();
    }

    public final void d(boolean z) {
        if (z) {
            ((Executor) this.aU.get()).execute(new ytv(this.bg, 1));
        } else {
            this.bg.get();
        }
    }

    public final void e(boolean z) {
        ((akpv) this.W.get()).c(z, this.aG);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            ((cnd) this.al.get()).b();
            ((agcf) this.m.get()).b(agce.USER_CHANGED);
            ((akdz) this.n.get()).a();
            ((akec) this.o.get()).a();
            ((ScheduledExecutorService) this.am.get()).execute(new egz(this, 7));
            return null;
        }
        if (i == 1) {
            ((cnd) this.al.get()).b();
            ((agcf) this.m.get()).b(agce.USER_CHANGED);
            ((akdz) this.n.get()).a();
            ((akec) this.o.get()).a();
            aear.U(this.bd);
            ((ScheduledExecutorService) this.am.get()).execute(new egz(this, 9));
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
