package com.google.android.apps.youtube.app.player.controls;

import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.apps.youtube.app.player.controls.SingleLoopMenuItemController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import defpackage.acra;
import defpackage.aign;
import defpackage.aims;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.flg;
import defpackage.kem;
import defpackage.kfe;
import defpackage.wbs;
import defpackage.whu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SingleLoopMenuItemController implements any, flg {
    public final Context a;
    public final aioc b;
    public final acra c;
    public final int d;
    public kem e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ValueAnimator j;
    private final PlaybackLoopShuffleMonitor k;
    public aign i = aign.NEW;
    private final ayqw l = new ayqw();

    public SingleLoopMenuItemController(Context context, PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, aioc aiocVar, acra acraVar) {
        this.a = context;
        this.k = playbackLoopShuffleMonitor;
        this.b = aiocVar;
        this.c = acraVar;
        this.d = wbs.W(context, R.attr.ytSuggestedAction).orElse(0);
    }

    @Override // defpackage.flg
    public final void g(int i, boolean z) {
        boolean z2 = this.f;
        boolean z3 = i == 2;
        this.f = z3;
        if (z2 != z3) {
            h();
            if (this.i == aign.ENDED && this.f) {
                this.b.D().a(aims.c);
            }
        }
    }

    public final void h() {
        kem kemVar = this.e;
        if (kemVar == null) {
            return;
        }
        kemVar.d(this.a.getString(true != this.f ? R.string.single_loop_off : R.string.single_loop_on));
        this.e.e = whu.y(this.a, true != this.f ? R.drawable.yt_outline_arrow_repeat_1_black_24 : R.drawable.yt_fill_arrow_repeat_1_black_24, R.attr.ytTextPrimary);
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

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.k.i(this);
        this.l.c();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor = this.k;
        final int i = 1;
        final int i2 = 0;
        this.f = playbackLoopShuffleMonitor.a == 2;
        playbackLoopShuffleMonitor.g(this);
        this.l.d(this.b.ao().G().E(ayqr.a()).Y(new ayrs(this) { // from class: kfj
            public final /* synthetic */ SingleLoopMenuItemController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    this.a.i = ((ahef) obj).c();
                    return;
                }
                SingleLoopMenuItemController singleLoopMenuItemController = this.a;
                WatchNextResponseModel a = ((ahdv) obj).a();
                boolean z = false;
                if (a == null) {
                    singleLoopMenuItemController.g = false;
                } else {
                    aama aamaVar = a.h;
                    if (aamaVar != null && aamaVar.b()) {
                        z = true;
                    }
                    singleLoopMenuItemController.g = z;
                }
                kem kemVar = singleLoopMenuItemController.e;
                if (kemVar != null) {
                    kemVar.g(z);
                    if (singleLoopMenuItemController.e.g) {
                        singleLoopMenuItemController.c.D(new acqx(acsb.c(123601)));
                        if (singleLoopMenuItemController.h) {
                            singleLoopMenuItemController.c.u(new acqx(acsb.c(123601)), null);
                        }
                    }
                }
            }
        }, kfe.c));
        this.l.d(this.b.G().b.Y(new ayrs(this) { // from class: kfj
            public final /* synthetic */ SingleLoopMenuItemController a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    this.a.i = ((ahef) obj).c();
                    return;
                }
                SingleLoopMenuItemController singleLoopMenuItemController = this.a;
                WatchNextResponseModel a = ((ahdv) obj).a();
                boolean z = false;
                if (a == null) {
                    singleLoopMenuItemController.g = false;
                } else {
                    aama aamaVar = a.h;
                    if (aamaVar != null && aamaVar.b()) {
                        z = true;
                    }
                    singleLoopMenuItemController.g = z;
                }
                kem kemVar = singleLoopMenuItemController.e;
                if (kemVar != null) {
                    kemVar.g(z);
                    if (singleLoopMenuItemController.e.g) {
                        singleLoopMenuItemController.c.D(new acqx(acsb.c(123601)));
                        if (singleLoopMenuItemController.h) {
                            singleLoopMenuItemController.c.u(new acqx(acsb.c(123601)), null);
                        }
                    }
                }
            }
        }, kfe.c));
    }
}
