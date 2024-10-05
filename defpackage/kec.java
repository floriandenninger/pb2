package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kec extends ahez implements fgp, ksf, ahyl, fyt, ypd {
    public aryi a;
    private final flz i;
    private final aaea j;
    private final eoa k;
    private final nys l;
    private final ajae m;
    private final fla n;
    private final ayrs o;
    private final fyx p;
    private fhg q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private WatchNextResponseModel w;
    private ayqx x;

    public kec(ahfg ahfgVar, keg kegVar, fma fmaVar, aahd aahdVar, acra acraVar, ainl ainlVar, zbw zbwVar, ysy ysyVar, eoa eoaVar, ypa ypaVar, aaea aaeaVar, nys nysVar, fyx fyxVar, ajae ajaeVar, fla flaVar, azrw azrwVar) {
        super(ahfgVar, kegVar, fmaVar, aahdVar, acraVar, ainlVar, zbwVar, ysyVar, ypaVar, azrwVar);
        this.q = fhg.NONE;
        this.j = aaeaVar;
        this.i = new flz(fmaVar);
        this.k = eoaVar;
        this.l = nysVar;
        this.p = fyxVar;
        this.m = ajaeVar;
        this.n = flaVar;
        this.o = new keb(this, 2);
    }

    private final boolean A() {
        return this.s && this.t;
    }

    private final boolean B() {
        return this.n.b == fkw.WATCH_WHILE;
    }

    @Override // defpackage.fyt
    public final void a(atzm atzmVar) {
        x(atzmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahez
    public final int b() {
        int i;
        return (!this.q.e() || (i = this.r) < 0) ? super.b() : i;
    }

    @Override // defpackage.ahez
    public final void c(ahef ahefVar) {
        super.c(ahefVar);
        aign aignVar = aign.NEW;
        int ordinal = ahefVar.c().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            ayqx ayqxVar = this.x;
            if (ayqxVar != null && !ayqxVar.e()) {
                azqb.f((AtomicReference) this.x);
            }
            this.x = null;
            this.a = null;
            return;
        }
        if (ordinal == 2 && this.m != null) {
            ayqx ayqxVar2 = this.x;
            if (ayqxVar2 == null || ayqxVar2.e()) {
                this.x = this.m.d.n().X(this.o);
            }
        }
    }

    public final void d(ahej ahejVar) {
        this.u = ahejVar.a() == 9;
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    @Override // defpackage.ksf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r4.A()
            boolean r1 = r4.s
            r2 = 1
            r3 = 2
            if (r5 == r3) goto Lf
            if (r5 != r2) goto Ld
            goto Lf
        Ld:
            r5 = 0
            goto L10
        Lf:
            r5 = 1
        L10:
            r4.s = r5
            if (r5 != r1) goto L1b
            boolean r5 = r4.t
            if (r5 != 0) goto L1d
            if (r6 == 0) goto L1d
            r6 = 1
        L1b:
            r4.t = r6
        L1d:
            boolean r5 = r4.A()
            if (r0 != r5) goto L24
            return
        L24:
            r4.y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kec.g(int, boolean):void");
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j) {
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        this.v = z;
    }

    @Override // defpackage.ahez
    protected final void i(WatchNextResponseModel watchNextResponseModel) {
        this.w = watchNextResponseModel;
        if (TextUtils.isEmpty(watchNextResponseModel.b)) {
            return;
        }
        fys a = this.p.a(watchNextResponseModel.b);
        WeakReference weakReference = new WeakReference(this);
        a.f.add(weakReference);
        List list = a.h;
        if (list != null) {
            fys.d(list, amru.q(), amru.q(), amru.q(), amru.r(weakReference), a.b);
        }
    }

    @Override // defpackage.ahez
    protected final void j() {
        aama aamaVar;
        aalx a;
        apxf a2;
        WatchNextResponseModel watchNextResponseModel = this.w;
        if (watchNextResponseModel == null || (aamaVar = watchNextResponseModel.h) == null || (a = aamaVar.a(false, false, false, false)) == null || (a2 = a.a()) == null) {
            return;
        }
        aifz d = PlaybackStartDescriptor.d();
        d.a = a2;
        d.e = true;
        d.f = true;
        this.l.f(d.a(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ahez
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void k() {
        /*
            r5 = this;
            aryi r0 = r5.a
            r1 = 0
            if (r0 == 0) goto L29
            aryc r0 = r0.n
            if (r0 != 0) goto Lb
            aryc r0 = defpackage.aryc.a
        Lb:
            asti r0 = r0.c
            if (r0 != 0) goto L11
            asti r0 = defpackage.asti.a
        L11:
            int r2 = r0.b
            r3 = 4
            r2 = r2 & r3
            if (r2 == 0) goto L29
            int r2 = r0.e
            int r2 = defpackage.amkq.de(r2)
            if (r2 != 0) goto L20
            goto L29
        L20:
            if (r2 != r3) goto L29
            apxf r0 = r0.c
            if (r0 != 0) goto L2a
            apxf r0 = defpackage.apxf.a
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2d
            goto L4f
        L2d:
            atzm r2 = r5.g
            aonk r3 = com.google.protos.youtube.api.innertube.WatchEndpointOuterClass.watchEndpoint
            java.lang.Object r3 = r0.pX(r3)
            awdp r3 = (defpackage.awdp) r3
            java.lang.String r3 = r3.d
            if (r2 == 0) goto L4e
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L49
            java.lang.String r4 = r2.p
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4e
        L49:
            boolean r2 = r2.o
            if (r2 != 0) goto L4e
            goto L4f
        L4e:
            r1 = r0
        L4f:
            if (r1 == 0) goto L54
            r5.w(r1)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kec.k():void");
    }

    @Override // defpackage.ahez, defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        ayqx[] kI = super.kI(aiocVar);
        ayqx[] ayqxVarArr = {aiocVar.G().i.X(new keb(this, 0)), this.k.b().ai(ayqr.a()).ax(new keb(this, 1))};
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, ayqxVarArr);
        Collections.addAll(arrayList, kI);
        return (ayqx[]) arrayList.toArray(new ayqx[0]);
    }

    @Override // defpackage.ahez, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls != kec.class) {
            return ahbl.a(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{ahej.class};
        }
        if (i == 0) {
            d((ahej) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ahez
    protected final boolean l() {
        return (this.u || this.q.d() || A() || !B() || this.v || this.k.g()) ? false : true;
    }

    @Override // defpackage.ahez
    protected final boolean m() {
        return B();
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (this.q != fhgVar) {
            this.q = fhgVar;
            if (fhgVar.m()) {
                this.i.a();
            } else {
                this.i.b();
            }
            if (this.q.e()) {
                this.r = evr.u(this.j);
            }
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }
}
