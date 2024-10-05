package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajwi extends ajss {

    /* renamed from: J, reason: collision with root package name */
    public static final ajwf f63J = new ajwd();
    public final RecyclerView K;
    public int L;
    private ajwh M;
    private int N;
    private int O;
    private final ajos a;
    private final ajwg b;
    private final ajwf c;
    private final boolean d;
    private ajwe e;

    public ajwi(ajxe ajxeVar, RecyclerView recyclerView, ajoy ajoyVar, ajvq ajvqVar, aasm aasmVar, ypa ypaVar, ajvd ajvdVar, zaw zawVar, acra acraVar, ajos ajosVar, ajxa ajxaVar, ajwk ajwkVar, aaea aaeaVar, aypn aypnVar) {
        this(ajxeVar, recyclerView, ajoyVar, ajvqVar, aasmVar, ypaVar, ajvdVar, zawVar, acraVar, ajosVar, ajxaVar, ajwkVar, f63J, aaeaVar, aypnVar, false, new ArrayDeque());
    }

    private final void n() {
        if (this.K.n == null || ((ajox) this.g).b() <= 0) {
            return;
        }
        this.K.aa(0);
    }

    @Override // defpackage.ajss
    public final void F(Configuration configuration) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((ajvc) it.next()).lE(configuration);
        }
        if (this.N != configuration.smallestScreenWidthDp) {
            this.N = configuration.smallestScreenWidthDp;
            RecyclerView recyclerView = this.K;
            wd wdVar = recyclerView.n;
            recyclerView.af(null);
            this.K.g().d();
            this.K.af(wdVar);
        }
        if (!this.d || this.e == null || configuration.orientation == this.O) {
            ((vw) this.g).mw();
        }
        m();
        ajwe ajweVar = this.e;
        if (ajweVar != null) {
            RecyclerView recyclerView2 = this.K;
            ajzy ajzyVar = (ajzy) ajweVar;
            if (configuration.orientation != ajzyVar.b) {
                ajzyVar.c = true;
                ajzyVar.b = configuration.orientation;
            }
            if (!ajzyVar.a) {
                ajzyVar.c(recyclerView2);
            }
        }
        this.O = configuration.orientation;
    }

    @Override // defpackage.ajss
    protected final void H(Bundle bundle) {
        if (bundle == null) {
            n();
            return;
        }
        int i = bundle.getInt("scroll_position", 0);
        if (i > 0) {
            this.K.post(new ajwb(this, i, 1));
        } else {
            n();
        }
    }

    @Override // defpackage.ajss
    protected final void R(final int i, final int i2) {
        this.K.post(new Runnable() { // from class: ajwc
            @Override // java.lang.Runnable
            public final void run() {
                ajwi ajwiVar = ajwi.this;
                int i3 = i;
                int i4 = i2;
                RecyclerView recyclerView = ajwiVar.K;
                Object obj = recyclerView.n;
                if (obj instanceof ajxc) {
                    ((ajxc) obj).c(recyclerView, i3, i4);
                } else {
                    recyclerView.ak(i3);
                }
            }
        });
    }

    @Override // defpackage.ajss
    public final void V(aamd aamdVar) {
        RecyclerView recyclerView;
        vw vwVar;
        if (T(aamdVar, null, null) && (recyclerView = this.K) != null && (vwVar = recyclerView.m) != null) {
            vwVar.mw();
        }
        this.b.f();
    }

    public final void al() {
        atmt atmtVar;
        RecyclerView recyclerView = this.K;
        if (recyclerView != null && ai(ajcd.NEXT) && (recyclerView.n instanceof LinearLayoutManager) && (atmtVar = (atmt) ahbj.p(W(ajcd.NEXT), atmt.class)) != null && atmtVar.h) {
            if (atmtVar.c != 8 || !((Boolean) atmtVar.d).booleanValue()) {
                if (atmtVar.c != 9 || recyclerView.n == null) {
                    return;
                }
                if (((LinearLayoutManager) recyclerView.n).K() >= (((ajox) this.g).b() - 1) - (atmtVar.c == 9 ? ((Integer) atmtVar.d).intValue() : 0)) {
                    D();
                    return;
                }
                return;
            }
            D();
        }
    }

    @Override // defpackage.ajss
    public void h() {
        super.C(false);
        this.b.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajss
    public void i() {
        ajos ajosVar = this.a;
        if (ajosVar instanceof ajov) {
            this.K.ag(((ajov) ajosVar).g());
        }
        ajwe a = this.c.a(this.K, (ajox) this.g);
        this.e = a;
        if (a != null) {
            a.a(this.K);
        } else {
            this.K.ac((vw) this.g);
            ((vw) this.g).mw();
        }
        if (this.M == null) {
            this.M = new ajwh(this);
        }
        this.K.aD(this.M);
    }

    @Override // defpackage.ajss, defpackage.ajtz, defpackage.zfk
    public void j() {
        super.j();
        ajwe ajweVar = this.e;
        if (ajweVar != null) {
            ajweVar.b(this.K);
            this.e = null;
        }
        ajwh ajwhVar = this.M;
        if (ajwhVar != null) {
            this.K.aF(ajwhVar);
        }
        this.K.ac(null);
        this.K.ag(null);
    }

    @Override // defpackage.ajtz
    protected final /* bridge */ /* synthetic */ void lB(Object obj, ajcd ajcdVar) {
        G((aamd) obj, ajcdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m() {
        this.K.post(new ajwb(this, this.L, 0));
    }

    @Override // defpackage.ajss
    public final Bundle p() {
        Bundle bundle = new Bundle();
        int K = ((LinearLayoutManager) this.K.n).K();
        if (this.b.a < K) {
            K = -1;
        }
        bundle.putInt("scroll_position", K);
        return bundle;
    }

    @Override // defpackage.ajss
    public final /* synthetic */ View q() {
        return this.K;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if ((r1 == null ? defpackage.asiu.a : r1).i != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ajwi(defpackage.ajxe r17, android.support.v7.widget.RecyclerView r18, defpackage.ajoy r19, defpackage.ajvq r20, defpackage.aasm r21, defpackage.ypa r22, defpackage.ajvd r23, defpackage.zaw r24, defpackage.acra r25, defpackage.ajos r26, defpackage.ajxa r27, defpackage.ajwk r28, defpackage.ajwf r29, defpackage.aaea r30, defpackage.aypn r31, boolean r32, java.util.Queue r33) {
        /*
            r16 = this;
            r14 = r16
            r15 = r18
            r13 = r25
            r12 = r26
            r11 = r30
            r26.getClass()
            r0 = r19
            ajox r2 = r0.a(r12)
            r0 = r16
            r1 = r17
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r27
            r10 = r28
            r12 = r31
            r13 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r18.getClass()
            r14.K = r15
            r0 = r26
            r14.a = r0
            r0 = r29
            r14.c = r0
            android.content.res.Resources r0 = r18.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.smallestScreenWidthDp
            r14.N = r0
            android.content.res.Resources r0 = r18.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r14.O = r0
            r0 = r32
            r14.d = r0
            ajwg r0 = new ajwg
            ajoc r1 = r14.f
            r0.<init>(r1)
            r14.b = r0
            ajoc r1 = r14.f
            r1.lX(r0)
            r0 = r30
            if (r0 == 0) goto Laa
            arfd r1 = r30.a()
            if (r1 != 0) goto L70
            goto Laa
        L70:
            arfd r1 = r30.a()
            asuj r1 = r1.m
            if (r1 != 0) goto L7a
            asuj r1 = defpackage.asuj.a
        L7a:
            asiu r1 = r1.c
            if (r1 != 0) goto L80
            asiu r1 = defpackage.asiu.a
        L80:
            boolean r1 = r1.h
            if (r1 != 0) goto L98
            arfd r1 = r30.a()
            asuj r1 = r1.m
            if (r1 != 0) goto L8e
            asuj r1 = defpackage.asuj.a
        L8e:
            asiu r1 = r1.c
            if (r1 != 0) goto L94
            asiu r1 = defpackage.asiu.a
        L94:
            boolean r1 = r1.i
            if (r1 == 0) goto Laa
        L98:
            acrp r1 = new acrp
            r2 = r25
            r1.<init>(r2)
            akgg r2 = defpackage.akgg.b
            ajtj r3 = new ajtj
            r3.<init>(r1, r2)
            r15.setOnHierarchyChangeListener(r3)
            goto Lb4
        Laa:
            r2 = r25
            acrp r1 = new acrp
            r1.<init>(r2)
            r15.setOnHierarchyChangeListener(r1)
        Lb4:
            ajoo r1 = r14.g
            ajox r1 = (defpackage.ajox) r1
            r1.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwi.<init>(ajxe, android.support.v7.widget.RecyclerView, ajoy, ajvq, aasm, ypa, ajvd, zaw, acra, ajos, ajxa, ajwk, ajwf, aaea, aypn, boolean, java.util.Queue):void");
    }
}
