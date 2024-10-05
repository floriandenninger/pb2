package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgr extends gmk implements fua, gaa {
    private final InlinePlaybackController M;
    private final LinearLayoutManager N;
    private final ActiveStateScrollSelectionController O;
    private Parcelable P;
    private boolean Q;
    private final mgn R;
    public final gfr b;
    public aqeq c;
    public final ajoc d;
    public ajng e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r17v1, types: [ajos, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mgr(android.content.Context r28, defpackage.ajvq r29, defpackage.ypa r30, defpackage.zaw r31, defpackage.ajvb r32, com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController r33, defpackage.oiy r34, defpackage.fub r35, defpackage.ajoy r36, defpackage.aaea r37, defpackage.sqq r38, defpackage.syd r39, defpackage.ajgq r40, defpackage.azrw r41, defpackage.ajlx r42, defpackage.aypn r43, defpackage.ejq r44, defpackage.ajxe r45, defpackage.acra r46, android.support.v7.widget.RecyclerView r47, defpackage.aasm r48, defpackage.ajvd r49, defpackage.ajxa r50, defpackage.ajwk r51, int r52, defpackage.ajhb r53, defpackage.sxw r54, defpackage.ajhj r55, com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController r56, byte[] r57, byte[] r58) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgr.<init>(android.content.Context, ajvq, ypa, zaw, ajvb, com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController, oiy, fub, ajoy, aaea, sqq, syd, ajgq, azrw, ajlx, aypn, ejq, ajxe, acra, android.support.v7.widget.RecyclerView, aasm, ajvd, ajxa, ajwk, int, ajhb, sxw, ajhj, com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController, byte[], byte[]):void");
    }

    @Override // defpackage.fua
    public final void a(int i) {
        this.R.f(i);
    }

    @Override // defpackage.gaa
    public final void b(int i, boolean z) {
    }

    @Override // defpackage.ajss, defpackage.ajwx
    public final void c() {
        super.c();
        if (this.Q) {
            Parcelable parcelable = this.P;
            if (parcelable != null) {
                this.N.Y(parcelable);
                this.P = null;
            }
            this.M.r(this.b);
            ActiveStateScrollSelectionController activeStateScrollSelectionController = this.O;
            if (activeStateScrollSelectionController != null) {
                activeStateScrollSelectionController.h(this.b);
            }
            this.Q = false;
        }
    }

    @Override // defpackage.gaa
    public final void e(float f) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gmk, defpackage.ajss
    public final void f(auov auovVar) {
        aqeq aqeqVar;
        super.f(auovVar);
        if ((auovVar.c & 16) != 0) {
            auot auotVar = auovVar.j;
            if (auotVar == null) {
                auotVar = auot.a;
            }
            aqeqVar = auotVar.b;
            if (aqeqVar == null) {
                aqeqVar = aqeq.a;
            }
        } else {
            aqeqVar = null;
        }
        this.c = aqeqVar;
    }

    @Override // defpackage.gmk, defpackage.ajwi, defpackage.ajss
    public final void h() {
        super.h();
        this.c = null;
    }

    @Override // defpackage.gmk, defpackage.ajwi, defpackage.ajss, defpackage.ajtz, defpackage.zfk
    public final void j() {
        super.j();
        this.M.t(this.b);
        ActiveStateScrollSelectionController activeStateScrollSelectionController = this.O;
        if (activeStateScrollSelectionController != null) {
            if (activeStateScrollSelectionController.a == this.b) {
                activeStateScrollSelectionController.i(null);
            }
        }
    }

    @Override // defpackage.ajss
    public final void l() {
        super.l();
        this.Q = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajwi
    public final void m() {
        if (this.b.e()) {
            return;
        }
        super.m();
    }

    public final boolean n() {
        return this.b.e();
    }

    @Override // defpackage.gaa
    public final boolean oW(int i) {
        return false;
    }

    @Override // defpackage.gaa
    public final void ov(int i) {
        if (i == 0) {
            this.M.r(this.b);
            ActiveStateScrollSelectionController activeStateScrollSelectionController = this.O;
            if (activeStateScrollSelectionController != null) {
                activeStateScrollSelectionController.h(this.b);
            }
        }
    }

    @Override // defpackage.ajss, defpackage.ajtz, defpackage.ajvz
    public final ajxe ph() {
        return new mgo(super.ph(), this.N.P());
    }
}
