package com.google.android.apps.youtube.app.watch.navigation;

import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryPreviousNextController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import defpackage.aadw;
import defpackage.aahd;
import defpackage.aalx;
import defpackage.aama;
import defpackage.ahdv;
import defpackage.ahxg;
import defpackage.aigk;
import defpackage.aioc;
import defpackage.aivu;
import defpackage.any;
import defpackage.aok;
import defpackage.aphe;
import defpackage.aphh;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.azrw;
import defpackage.evr;
import defpackage.fks;
import defpackage.flg;
import defpackage.fln;
import defpackage.nua;
import defpackage.nyn;
import defpackage.nyr;
import defpackage.ypa;
import defpackage.ypd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchHistoryPreviousNextController extends fks implements flg, any, ypd {
    public final aahd a;
    public final nyn b;
    public final PlaybackLoopShuffleMonitor c;
    public final azrw d;
    public boolean e;
    private final boolean f;
    private final ahxg g;
    private final aivu h;
    private final ypa i;
    private final aioc j;
    private ayqx k;
    private WeakReference l;

    public WatchHistoryPreviousNextController(fln flnVar, aahd aahdVar, nyn nynVar, ahxg ahxgVar, PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, aadw aadwVar, aivu aivuVar, ypa ypaVar, aioc aiocVar, azrw azrwVar) {
        super(flnVar);
        this.a = aahdVar;
        this.b = nynVar;
        this.g = ahxgVar;
        this.c = playbackLoopShuffleMonitor;
        this.h = aivuVar;
        this.i = ypaVar;
        this.j = aiocVar;
        this.d = azrwVar;
        this.f = evr.au(aadwVar);
    }

    private final nyr i(aphe apheVar) {
        if (apheVar.b == 114177671) {
            return new nyr(this, (aphh) apheVar.c);
        }
        return null;
    }

    private final void j() {
        aalx aalxVar;
        nyr nyrVar;
        WeakReference weakReference = this.l;
        nyr nyrVar2 = null;
        if (weakReference == null || weakReference.get() == null) {
            aalxVar = null;
        } else {
            aama aamaVar = (aama) this.l.get();
            PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor = this.c;
            int i = playbackLoopShuffleMonitor.a;
            aalxVar = aamaVar.a(i == 1, i == 2, playbackLoopShuffleMonitor.b, false);
        }
        if (aalxVar != null) {
            aphe apheVar = aalxVar.a.i;
            if (apheVar == null) {
                apheVar = aphe.a;
            }
            nyrVar2 = i(apheVar);
            aphe apheVar2 = aalxVar.a.g;
            if (apheVar2 == null) {
                apheVar2 = aphe.a;
            }
            nyrVar = i(apheVar2);
        } else {
            nyrVar = null;
        }
        this.g.d(nyrVar2);
        this.g.c(nyrVar);
        this.h.c(nyrVar2);
        this.h.b(nyrVar);
    }

    @Override // defpackage.flg
    public final void g(int i, boolean z) {
        j();
    }

    public final void h(ahdv ahdvVar) {
        aama aamaVar;
        if (ahdvVar.c().b(aigk.VIDEO_WATCH_LOADED)) {
            WatchNextResponseModel a = ahdvVar.a();
            WeakReference weakReference = null;
            if (a != null && (aamaVar = a.h) != null) {
                weakReference = new WeakReference(aamaVar);
            }
            this.l = weakReference;
            j();
        }
    }

    @Override // defpackage.flm
    public final void kG() {
        this.e = false;
    }

    @Override // defpackage.flm
    public final void kH() {
        this.e = true;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdv.class};
        }
        if (i == 0) {
            h((ahdv) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        if (this.f) {
            this.k = this.j.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: nyp
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    WatchHistoryPreviousNextController.this.h((ahdv) obj);
                }
            }, nua.g);
        } else {
            this.i.g(this);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        Object obj;
        if (!this.f || (obj = this.k) == null) {
            this.i.m(this);
        } else {
            azqb.f((AtomicReference) obj);
            this.k = null;
        }
        this.g.d(null);
        this.g.c(null);
        this.h.c(null);
        this.h.b(null);
    }
}
