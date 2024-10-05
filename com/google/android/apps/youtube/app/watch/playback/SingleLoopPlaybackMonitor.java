package com.google.android.apps.youtube.app.watch.playback;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.apps.youtube.app.watch.playback.SingleLoopPlaybackMonitor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import defpackage.aaea;
import defpackage.acra;
import defpackage.aili;
import defpackage.aioc;
import defpackage.akbz;
import defpackage.any;
import defpackage.aok;
import defpackage.aswb;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.egw;
import defpackage.flg;
import defpackage.fnz;
import defpackage.fof;
import defpackage.gcm;
import defpackage.gcq;
import defpackage.nua;
import defpackage.ojj;
import defpackage.ynm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SingleLoopPlaybackMonitor implements any, flg {
    public final acra a;
    public final aioc b;
    public boolean c;
    public PlaybackStartDescriptor d;
    public int e;
    private final aaea f;
    private final PlaybackLoopShuffleMonitor g;
    private final akbz h;
    private final String i;
    private final String j;
    private final ayqw k = new ayqw();
    private gcq l;
    private final aili m;

    public SingleLoopPlaybackMonitor(Context context, PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, aili ailiVar, akbz akbzVar, aioc aiocVar, acra acraVar, aaea aaeaVar, byte[] bArr, byte[] bArr2) {
        this.g = playbackLoopShuffleMonitor;
        this.m = ailiVar;
        this.h = akbzVar;
        this.b = aiocVar;
        this.a = acraVar;
        this.f = aaeaVar;
        this.i = context.getString(R.string.single_loop_snack_bar_text);
        this.j = context.getString(R.string.single_loop_snack_bar_button_text).toUpperCase(context.getResources().getConfiguration().locale);
    }

    @Override // defpackage.flg
    public final void g(int i, boolean z) {
        gcq gcqVar;
        this.e = i;
        if (!this.c || (gcqVar = this.l) == null || i == 2) {
            return;
        }
        this.h.n(gcqVar);
    }

    public final void h() {
        aswb aswbVar = this.f.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if (!aswbVar.bg || this.c) {
            return;
        }
        fof fofVar = (fof) this.m.a.c();
        int i = (fofVar.b & 32) != 0 ? fofVar.i : 1;
        if (i > 0) {
            if (this.l == null) {
                gcm d = gcq.d();
                d.f(true);
                d.k(this.i);
                d.m(this.j, new View.OnClickListener() { // from class: ojh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SingleLoopPlaybackMonitor singleLoopPlaybackMonitor = SingleLoopPlaybackMonitor.this;
                        singleLoopPlaybackMonitor.a.I(3, new acqx(acsb.c(123602)), null);
                        singleLoopPlaybackMonitor.b.D().h(0);
                    }
                });
                d.b = new ojj(this);
                this.l = d.b();
            }
            this.h.o(this.l);
            ynm.m(this.m.a.b(new fnz(i - 1, 0)), egw.n);
        }
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
        this.g.i(this);
        this.k.c();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.g.g(this);
        final int i = 0;
        this.k.d(this.b.ab().Y(new ayrs(this) { // from class: oji
            public final /* synthetic */ SingleLoopPlaybackMonitor a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                PlaybackStartDescriptor playbackStartDescriptor;
                PlaybackStartDescriptor playbackStartDescriptor2;
                if (i == 0) {
                    SingleLoopPlaybackMonitor singleLoopPlaybackMonitor = this.a;
                    PlaybackStartDescriptor playbackStartDescriptor3 = singleLoopPlaybackMonitor.d;
                    singleLoopPlaybackMonitor.d = ((ahel) obj).a().g();
                    if (playbackStartDescriptor3 == null || (playbackStartDescriptor = singleLoopPlaybackMonitor.d) == null || singleLoopPlaybackMonitor.e != 2) {
                        return;
                    }
                    if (!ammx.e(playbackStartDescriptor3.k()) && playbackStartDescriptor3.k().equals(playbackStartDescriptor.k()) && !amkq.b(playbackStartDescriptor3.l(), playbackStartDescriptor.l())) {
                        singleLoopPlaybackMonitor.b.D().h(0);
                    }
                    if (ammx.e(playbackStartDescriptor3.k()) && ammx.e(playbackStartDescriptor.k()) && amkq.b(playbackStartDescriptor3.l(), playbackStartDescriptor.l())) {
                        singleLoopPlaybackMonitor.h();
                        return;
                    }
                    return;
                }
                SingleLoopPlaybackMonitor singleLoopPlaybackMonitor2 = this.a;
                ahef ahefVar = (ahef) obj;
                if (singleLoopPlaybackMonitor2.e == 2 && ahefVar.c() == aign.ENDED && singleLoopPlaybackMonitor2.b.D().j(aims.c) && (playbackStartDescriptor2 = singleLoopPlaybackMonitor2.d) != null && ammx.e(playbackStartDescriptor2.k())) {
                    singleLoopPlaybackMonitor2.h();
                }
            }
        }, nua.t));
        final int i2 = 1;
        this.k.d(this.b.G().a.Y(new ayrs(this) { // from class: oji
            public final /* synthetic */ SingleLoopPlaybackMonitor a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                PlaybackStartDescriptor playbackStartDescriptor;
                PlaybackStartDescriptor playbackStartDescriptor2;
                if (i2 == 0) {
                    SingleLoopPlaybackMonitor singleLoopPlaybackMonitor = this.a;
                    PlaybackStartDescriptor playbackStartDescriptor3 = singleLoopPlaybackMonitor.d;
                    singleLoopPlaybackMonitor.d = ((ahel) obj).a().g();
                    if (playbackStartDescriptor3 == null || (playbackStartDescriptor = singleLoopPlaybackMonitor.d) == null || singleLoopPlaybackMonitor.e != 2) {
                        return;
                    }
                    if (!ammx.e(playbackStartDescriptor3.k()) && playbackStartDescriptor3.k().equals(playbackStartDescriptor.k()) && !amkq.b(playbackStartDescriptor3.l(), playbackStartDescriptor.l())) {
                        singleLoopPlaybackMonitor.b.D().h(0);
                    }
                    if (ammx.e(playbackStartDescriptor3.k()) && ammx.e(playbackStartDescriptor.k()) && amkq.b(playbackStartDescriptor3.l(), playbackStartDescriptor.l())) {
                        singleLoopPlaybackMonitor.h();
                        return;
                    }
                    return;
                }
                SingleLoopPlaybackMonitor singleLoopPlaybackMonitor2 = this.a;
                ahef ahefVar = (ahef) obj;
                if (singleLoopPlaybackMonitor2.e == 2 && ahefVar.c() == aign.ENDED && singleLoopPlaybackMonitor2.b.D().j(aims.c) && (playbackStartDescriptor2 = singleLoopPlaybackMonitor2.d) != null && ammx.e(playbackStartDescriptor2.k())) {
                    singleLoopPlaybackMonitor2.h();
                }
            }
        }, nua.t));
    }
}
