package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aevh implements pmv {
    protected final aetw a;
    public boolean e;
    protected final yss f;
    protected final afhs g;
    private bfg h;
    private int l;
    private final boolean m;
    private volatile long n;
    private long o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final afcu s;
    protected aesa b = aesa.a;
    protected aesb c = new aesb(this.b);
    protected aesb d = new aesb(this.b);
    private volatile long j = 2500000;
    private volatile long k = 5000000;
    private long t = -9223372036854775807L;
    private long u = 0;
    private long v = -9223372036854775807L;
    private long w = -9223372036854775807L;
    private volatile long i = SystemClock.elapsedRealtime();

    public aevh(aetw aetwVar, afhs afhsVar, yss yssVar, afcu afcuVar) {
        this.a = aetwVar;
        this.g = afhsVar;
        this.f = yssVar;
        this.m = afhsVar.o().o;
        this.s = afcuVar;
        afcuVar.f();
    }

    private static long n(PlayerConfigModel playerConfigModel) {
        if (playerConfigModel.R() == null || (playerConfigModel.R().b & 2) == 0) {
            return 60000L;
        }
        return playerConfigModel.R().c;
    }

    private final synchronized void o(boolean z) {
        this.i = SystemClock.elapsedRealtime();
        this.s.f();
        this.l = 0;
        if (z) {
            synchronized (this) {
                this.h = null;
            }
        }
        this.t = -9223372036854775807L;
        this.u = 0L;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.s.h(null);
    }

    private final synchronized boolean p(PlayerConfigModel playerConfigModel, long j) {
        if (this.t == -9223372036854775807L) {
            this.t = pts.r(n(playerConfigModel));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.w;
        if (j2 != -9223372036854775807L && elapsedRealtime > j2) {
            this.w = -9223372036854775807L;
            return true;
        }
        long j3 = this.v;
        if (j3 != -9223372036854775807L && elapsedRealtime < j3) {
            return false;
        }
        if (j > this.t) {
            return false;
        }
        long j4 = this.u;
        if (j4 > 0 && j >= j4) {
            if (playerConfigModel.aP()) {
                return this.f.b();
            }
            return this.p;
        }
        return true;
    }

    @Override // defpackage.pmv
    public final long a() {
        return this.o;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v12 boolean, still in use, count: 2, list:
          (r4v12 boolean) from 0x01d8: IF  (wrap:boolean:0x01d4: IGET (r17v0 'this' aevh A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] aevh.q boolean) != (r4v12 boolean)  -> B:22:0x01dd A[HIDDEN]
          (r4v12 boolean) from 0x01dd: PHI (r4v11 boolean) = (r4v12 boolean) binds: [B:21:0x01d8] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01c3  */
    @Override // defpackage.pmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r18, long r20, float r22) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aevh.b(long, long, float):boolean");
    }

    @Override // defpackage.pmv
    public final boolean c(long j, float f, boolean z, long j2) {
        long j3;
        if (z) {
            j3 = this.k;
        } else {
            j3 = this.j;
        }
        boolean z2 = true;
        if (j3 > 0 && j < j3) {
            z2 = false;
        }
        if (this.m) {
            aesb aesbVar = this.c;
            Boolean valueOf = Boolean.valueOf(z2);
            StringBuilder sb = new StringBuilder(57);
            sb.append("ssp.");
            sb.append(j);
            sb.append(".");
            sb.append(z);
            sb.append(".");
            sb.append(j3);
            sb.append(".");
            sb.append(z2);
            aesbVar.a(valueOf, sb.toString());
        }
        return z2;
    }

    @Override // defpackage.pmv
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized bfg j() {
        if (this.h == null) {
            aetw aetwVar = this.a;
            aeve aeveVar = aetwVar.a;
            this.h = new bfg(false, aetwVar.a().h() * 1024);
        }
        return this.h;
    }

    @Override // defpackage.pmv
    public final void e() {
        PlayerConfigModel a = this.a.a();
        this.j = a.t() * 1000;
        this.k = a.x() * 1000;
        this.o = this.g.p().I * 1000;
        o(false);
    }

    @Override // defpackage.pmv
    public final void f() {
        o(true);
    }

    @Override // defpackage.pmv
    public final void g() {
        o(true);
    }

    @Override // defpackage.pmv
    public final void h(poe[] poeVarArr, asj asjVar, bel[] belVarArr) {
        PlayerConfigModel a;
        if (belVarArr.length == 0) {
            a = this.a.a();
        } else {
            bel belVar = belVarArr[0];
            if (belVar == null) {
                a = this.a.a();
            } else {
                Object j = belVar.j();
                if (j instanceof aezh) {
                    a = ((aezh) j).a.a();
                } else {
                    a = this.a.a();
                }
            }
        }
        this.l = (a.D() + a.g()) * a.h() * 1024;
        j().c(this.l);
    }

    @Override // defpackage.pmv
    public final boolean i() {
        return this.o > 0;
    }

    public final void k(PlayerConfigModel playerConfigModel, aesa aesaVar, String str) {
        this.j = playerConfigModel.t() * 1000;
        this.k = playerConfigModel.x() * 1000;
        this.b = aesaVar;
        this.c = new aesb(aesaVar);
        this.d = new aesb(aesaVar);
        afcu afcuVar = this.s;
        afeo afeoVar = afcuVar.a;
        if (str != null) {
            synchronized (afeoVar.c) {
                if (afeoVar.b.c(str) == null) {
                    afeoVar.b.d(str, Long.valueOf(afeoVar.a.d()));
                }
            }
        }
        afcuVar.b = aesaVar;
        if (this.m) {
            this.n = SystemClock.elapsedRealtime();
        }
    }

    public final synchronized void l(atmw atmwVar) {
        this.t = pts.r((atmwVar.b & 2) != 0 ? atmwVar.c : n(this.a.a()));
        this.u = pts.r(atmwVar.f);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = atmwVar.b;
        long j = (i & 4) != 0 ? atmwVar.d + elapsedRealtime : -9223372036854775807L;
        this.w = j;
        long j2 = (i & 8) != 0 ? elapsedRealtime + atmwVar.e : -9223372036854775807L;
        this.v = j2;
        if (j != -9223372036854775807L && j2 > j) {
            this.v = j;
        }
        if ((i & 64) == 0) {
            this.s.h(null);
        } else {
            this.s.h(atmwVar.g);
        }
    }

    public final synchronized void m() {
        this.i = SystemClock.elapsedRealtime();
        this.s.f();
        this.v = -9223372036854775807L;
    }
}
