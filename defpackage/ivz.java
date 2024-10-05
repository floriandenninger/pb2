package defpackage;

import com.google.android.apps.youtube.app.offline.OfflineModeChangedMealbarController;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ivz implements gaa {
    final /* synthetic */ iwa a;

    public ivz(iwa iwaVar) {
        this.a = iwaVar;
    }

    @Override // defpackage.gaa
    public final void b(int i, boolean z) {
        aveh g = this.a.e.g();
        if (!z && g != null) {
            iwa iwaVar = this.a;
            if (iwaVar.bQ) {
                iwaVar.cw = g.c;
            }
        }
        OfflineModeChangedMealbarController offlineModeChangedMealbarController = (OfflineModeChangedMealbarController) this.a.cv.get();
        if (g == null || !"FElibrary".equals(g.c)) {
            return;
        }
        offlineModeChangedMealbarController.h();
    }

    @Override // defpackage.gaa
    public final void e(float f) {
    }

    @Override // defpackage.gaa
    public final boolean oW(int i) {
        return true;
    }

    @Override // defpackage.gaa
    public final void ov(int i) {
    }
}
