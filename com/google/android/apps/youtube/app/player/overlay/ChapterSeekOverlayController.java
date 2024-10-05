package com.google.android.apps.youtube.app.player.overlay;

import android.widget.TextView;
import com.google.android.apps.youtube.app.player.overlay.ChapterSeekOverlayController;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import defpackage.aadw;
import defpackage.ahto;
import defpackage.ahtp;
import defpackage.ahyo;
import defpackage.aica;
import defpackage.aick;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.asvu;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.fhg;
import defpackage.kfe;
import defpackage.kig;
import defpackage.zcp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ChapterSeekOverlayController implements kig, any, ahto {
    public int a;
    private final aioc b;
    private final aica c;
    private final boolean d;
    private final ayqw e;
    private final ahtp f;
    private boolean g;

    public ChapterSeekOverlayController(ahtp ahtpVar, aioc aiocVar, aica aicaVar, aadw aadwVar) {
        this.f = ahtpVar;
        this.b = aiocVar;
        this.c = aicaVar;
        asvu asvuVar = aadwVar.b().e;
        this.d = (asvuVar == null ? asvu.a : asvuVar).bC;
        this.e = new ayqw();
    }

    @Override // defpackage.ahto
    public final /* synthetic */ void b(ahyo ahyoVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void m(fhg fhgVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.ahto
    public final /* synthetic */ void nr(ahyo ahyoVar, boolean z) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        if (this.d) {
            this.e.c();
            this.f.l(ahyo.CHAPTER, this);
        }
    }

    @Override // defpackage.ahto
    public final void nx(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, ahyo ahyoVar, int i) {
        if (ahyoVar != ahyo.CHAPTER || timelineMarker2 == null) {
            return;
        }
        long j = timelineMarker != null ? timelineMarker.a : 0L;
        if (this.g) {
            return;
        }
        int i2 = this.a;
        if (i2 == 9 || i2 == 10) {
            aica aicaVar = this.c;
            if (aicaVar.e) {
                return;
            }
            CharSequence charSequence = timelineMarker2.e;
            char c = timelineMarker2.a > j ? (char) 1 : (char) 2;
            final aick aickVar = aicaVar.i;
            if (aickVar == null) {
                return;
            }
            aickVar.a();
            ((TextView) aickVar.f.b).setText(charSequence);
            ((TextView) aickVar.f.b).setWidth(aickVar.c.getWidth() / 2);
            ((TextView) aickVar.f.b).setTranslationX(0.0f);
            aickVar.b.setTranslationX(0.0f);
            aickVar.b.setScaleX(c == 1 ? 1.0f : -1.0f);
            aickVar.d.J();
            aickVar.e.c(true);
            aickVar.a.c();
            aickVar.f.c(true);
            ((TextView) aickVar.f.b).postDelayed(new Runnable() { // from class: aich
                @Override // java.lang.Runnable
                public final void run() {
                    aick.this.b();
                }
            }, 650L);
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nz(boolean z) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (this.d) {
            this.e.d(this.b.G().i.G().E(ayqr.a()).Y(new ayrs() { // from class: khw
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    ChapterSeekOverlayController chapterSeekOverlayController = ChapterSeekOverlayController.this;
                    ahej ahejVar = (ahej) obj;
                    if (ahejVar.c()) {
                        return;
                    }
                    chapterSeekOverlayController.a = ahejVar.a();
                }
            }, kfe.e));
            this.f.i(ahyo.CHAPTER, this);
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final void r(boolean z) {
        this.g = z;
    }

    @Override // defpackage.kig
    public final /* synthetic */ void s(boolean z) {
    }
}
