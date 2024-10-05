package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import defpackage.aadw;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.acsc;
import defpackage.aigk;
import defpackage.ainy;
import defpackage.aioc;
import defpackage.aiuj;
import defpackage.any;
import defpackage.aok;
import defpackage.asvu;
import defpackage.aypr;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.evr;
import defpackage.fhg;
import defpackage.kfe;
import defpackage.kfn;
import defpackage.kfo;
import defpackage.kfq;
import defpackage.kig;
import defpackage.kih;
import defpackage.knw;
import defpackage.zcp;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SubtitleButtonController implements any, kig {
    public final kfn a;
    public final kfo b;
    public final ainy c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    public acqz h;
    public final acsc i;
    private final Context j;
    private final aioc k;
    private final boolean m;
    private TouchImageView o;
    public aigk g = aigk.NEW;
    private SubtitleTrack n = null;
    private final ayqw l = new ayqw();

    public SubtitleButtonController(Context context, aioc aiocVar, kfn kfnVar, kfo kfoVar, aadw aadwVar, kih kihVar, acqz acqzVar, acsc acscVar) {
        this.h = acqzVar;
        this.j = context;
        this.k = aiocVar;
        this.a = kfnVar;
        this.b = kfoVar;
        this.c = aiocVar.E();
        this.h = acqzVar;
        this.m = evr.aQ(aadwVar);
        this.d = evr.aR(aadwVar);
        asvu asvuVar = aadwVar.b().e;
        this.e = (asvuVar == null ? asvu.a : asvuVar).cm;
        this.i = acscVar;
        if (kihVar != null) {
            kihVar.a(this);
        }
    }

    private final aypr x() {
        return new aypr() { // from class: knt
            @Override // defpackage.aypr
            public final banv a(aypn aypnVar) {
                return SubtitleButtonController.this.e ? aypnVar.G().E(ayqr.a()) : aypnVar;
            }
        };
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
    public final void lh(aok aokVar) {
        this.l.qc();
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

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.l.c();
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        if (this.g.b(aigk.VIDEO_PLAYBACK_LOADED)) {
            this.h.mM().q(new acqx(this.i), null);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (this.m) {
            ayqw ayqwVar = this.l;
            aioc aiocVar = this.k;
            final int i = 2;
            ayqx Y = aiocVar.ae(kfq.j, kfq.l).h(x()).Y(new ayrs(this) { // from class: knu
                public final /* synthetic */ SubtitleButtonController a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i2 = i;
                    if (i2 == 0) {
                        SubtitleButtonController subtitleButtonController = this.a;
                        ahdy ahdyVar = (ahdy) obj;
                        if (subtitleButtonController.f) {
                            subtitleButtonController.w(ahdyVar.a());
                            return;
                        }
                        return;
                    }
                    if (i2 == 1) {
                        SubtitleButtonController subtitleButtonController2 = this.a;
                        ahdv ahdvVar = (ahdv) obj;
                        subtitleButtonController2.g = ahdvVar.c();
                        if (ahdvVar.c() == aigk.VIDEO_PLAYBACK_LOADED) {
                            subtitleButtonController2.h.mM().D(new acqx(subtitleButtonController2.i));
                            return;
                        }
                        return;
                    }
                    SubtitleButtonController subtitleButtonController3 = this.a;
                    if (((ahdz) obj).a()) {
                        subtitleButtonController3.f = true;
                    } else {
                        subtitleButtonController3.f = false;
                        subtitleButtonController3.w(null);
                    }
                }
            }, kfe.p);
            final int i2 = 0;
            ayqx Y2 = aiocVar.ae(kfq.j, kfq.k).h(x()).Y(new ayrs(this) { // from class: knu
                public final /* synthetic */ SubtitleButtonController a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i22 = i2;
                    if (i22 == 0) {
                        SubtitleButtonController subtitleButtonController = this.a;
                        ahdy ahdyVar = (ahdy) obj;
                        if (subtitleButtonController.f) {
                            subtitleButtonController.w(ahdyVar.a());
                            return;
                        }
                        return;
                    }
                    if (i22 == 1) {
                        SubtitleButtonController subtitleButtonController2 = this.a;
                        ahdv ahdvVar = (ahdv) obj;
                        subtitleButtonController2.g = ahdvVar.c();
                        if (ahdvVar.c() == aigk.VIDEO_PLAYBACK_LOADED) {
                            subtitleButtonController2.h.mM().D(new acqx(subtitleButtonController2.i));
                            return;
                        }
                        return;
                    }
                    SubtitleButtonController subtitleButtonController3 = this.a;
                    if (((ahdz) obj).a()) {
                        subtitleButtonController3.f = true;
                    } else {
                        subtitleButtonController3.f = false;
                        subtitleButtonController3.w(null);
                    }
                }
            }, kfe.p);
            final int i3 = 1;
            ayqwVar.g(Y, Y2, aiocVar.ao().h(x()).Y(new ayrs(this) { // from class: knu
                public final /* synthetic */ SubtitleButtonController a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i22 = i3;
                    if (i22 == 0) {
                        SubtitleButtonController subtitleButtonController = this.a;
                        ahdy ahdyVar = (ahdy) obj;
                        if (subtitleButtonController.f) {
                            subtitleButtonController.w(ahdyVar.a());
                            return;
                        }
                        return;
                    }
                    if (i22 == 1) {
                        SubtitleButtonController subtitleButtonController2 = this.a;
                        ahdv ahdvVar = (ahdv) obj;
                        subtitleButtonController2.g = ahdvVar.c();
                        if (ahdvVar.c() == aigk.VIDEO_PLAYBACK_LOADED) {
                            subtitleButtonController2.h.mM().D(new acqx(subtitleButtonController2.i));
                            return;
                        }
                        return;
                    }
                    SubtitleButtonController subtitleButtonController3 = this.a;
                    if (((ahdz) obj).a()) {
                        subtitleButtonController3.f = true;
                    } else {
                        subtitleButtonController3.f = false;
                        subtitleButtonController3.w(null);
                    }
                }
            }, kfe.p));
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        if (this.g.b(aigk.VIDEO_PLAYBACK_LOADED)) {
            this.h.mM().u(new acqx(this.i), null);
        }
    }

    public final void t(TouchImageView touchImageView) {
        this.o = touchImageView;
        w(this.c.m());
    }

    public final void u(Runnable runnable) {
        if (!this.m || this.o == null) {
            return;
        }
        this.o.setOnClickListener(new knw(this, runnable));
    }

    public final void v(List list) {
        if (!this.f || list.size() <= 1) {
            this.b.a();
            return;
        }
        if (this.c.m() == null || this.c.m().p() || this.c.m().l()) {
            SubtitleTrack subtitleTrack = this.n;
            if (subtitleTrack == null || !list.contains(subtitleTrack)) {
                aiuj aiujVar = this.c.g.n;
                subtitleTrack = aiujVar == null ? null : aiujVar.b();
                if (subtitleTrack == null) {
                    subtitleTrack = (SubtitleTrack) list.get(1);
                }
            }
            this.c.G(subtitleTrack);
            this.a.j(subtitleTrack);
            this.b.b(subtitleTrack);
            return;
        }
        this.n = this.c.m();
        this.c.G((SubtitleTrack) list.get(0));
        this.a.j((SubtitleTrack) list.get(0));
        this.b.b((SubtitleTrack) list.get(0));
    }

    public final void w(SubtitleTrack subtitleTrack) {
        TouchImageView touchImageView = this.o;
        if (touchImageView == null) {
            return;
        }
        if (!this.f) {
            touchImageView.setImageResource(R.drawable.quantum_ic_closed_caption_off_grey600_24);
            this.o.setSelected(false);
            this.o.setContentDescription(this.j.getResources().getString(R.string.accessibility_captions_unavailable));
            return;
        }
        touchImageView.setContentDescription(this.j.getResources().getString(R.string.accessibility_captions_button_name));
        if (subtitleTrack == null || subtitleTrack.p() || subtitleTrack.l()) {
            this.o.setImageResource(R.drawable.quantum_ic_closed_caption_off_white_24);
            this.o.setSelected(false);
        } else {
            this.o.setImageResource(R.drawable.quantum_ic_closed_caption_white_24);
            this.o.setSelected(true);
        }
    }
}
