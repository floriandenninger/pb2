package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kjc extends zdb {
    public final Rect a;
    private final kjb b;
    private final int c;
    private final int d;
    private final boolean e;
    private final int g;
    private final Rect h;
    private boolean i;
    private boolean j;
    private boolean k;
    private float l;
    private float m;

    public kjc(Context context, aadw aadwVar, kiz kizVar, aypn aypnVar) {
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        asvu asvuVar = aadwVar.b().e;
        this.d = yjk.K(displayMetrics, (asvuVar == null ? asvu.a : asvuVar).cu);
        asvu asvuVar2 = aadwVar.b().e;
        this.e = (asvuVar2 == null ? asvu.a : asvuVar2).bq;
        this.b = kizVar;
        this.j = true;
        asvu asvuVar3 = aadwVar.b().e;
        this.g = (asvuVar3 == null ? asvu.a : asvuVar3).bJ;
        this.a = new Rect();
        this.h = new Rect();
        aypnVar.X(new ayrs() { // from class: kja
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kjc.this.a.set(((zck) obj).a.a);
            }
        });
    }

    private final void e(View view, boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        if (view == null || view.getParent() == null) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(this.i);
    }

    private final void f(View view) {
        ammv j;
        if (this.i) {
            kiz kizVar = (kiz) this.b;
            if (!kizVar.x()) {
                acra acraVar = kizVar.k;
                acqx acqxVar = new acqx(acsb.c(124587));
                long j2 = kizVar.t;
                long c = kizVar.a.c();
                if (evr.aW(kizVar.v)) {
                    aone createBuilder = asid.a.createBuilder();
                    aupb aupbVar = aupb.SEEK_SOURCE_SLIDE_ON_PLAYER;
                    createBuilder.copyOnWrite();
                    asid asidVar = (asid) createBuilder.instance;
                    asidVar.c = aupbVar.n;
                    asidVar.b |= 1;
                    createBuilder.copyOnWrite();
                    asid asidVar2 = (asid) createBuilder.instance;
                    asidVar2.b |= 2;
                    asidVar2.d = (int) j2;
                    createBuilder.copyOnWrite();
                    asid asidVar3 = (asid) createBuilder.instance;
                    asidVar3.b |= 4;
                    asidVar3.e = (int) c;
                    asid asidVar4 = (asid) createBuilder.build();
                    aone createBuilder2 = asht.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    asht ashtVar = (asht) createBuilder2.instance;
                    asidVar4.getClass();
                    ashtVar.G = asidVar4;
                    ashtVar.c |= 67108864;
                    j = ammv.j((asht) createBuilder2.build());
                } else {
                    j = amlr.a;
                }
                acraVar.I(3, acqxVar, (asht) j.f());
                kizVar.n.a = aupb.SEEK_SOURCE_SLIDE_ON_PLAYER;
                kizVar.a.l();
                kizVar.y();
            }
        }
        e(view, false);
        this.j = true;
        this.k = false;
    }

    @Override // defpackage.zdg
    public final void c() {
        e(null, false);
        this.j = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        if (r5 < (r6 - r11.a.bottom)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (r2 != 3) goto L101;
     */
    @Override // defpackage.zdg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjc.d(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // defpackage.zdb, defpackage.zdg
    public final boolean nq() {
        return this.e && this.f;
    }
}
