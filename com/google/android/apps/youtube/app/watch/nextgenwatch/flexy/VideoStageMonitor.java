package com.google.android.apps.youtube.app.watch.nextgenwatch.flexy;

import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.VideoStageMonitor;
import defpackage.ahyl;
import defpackage.ahym;
import defpackage.aign;
import defpackage.aioc;
import defpackage.amkq;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.nua;
import defpackage.nyv;
import defpackage.nzc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VideoStageMonitor implements any, ahyl {
    private static final nyv b = new nyv(2, 1.777f, 1.777f);
    private final aioc c;
    private final nzc d;
    private final ahym e;
    private boolean g;
    public aign a = aign.NEW;
    private final ayqw f = new ayqw();

    public VideoStageMonitor(aioc aiocVar, nzc nzcVar, ahym ahymVar) {
        this.c = aiocVar;
        this.d = nzcVar;
        this.e = ahymVar;
    }

    public final void g() {
        if (amkq.b(this.a, aign.ENDED)) {
            if (this.g) {
                return;
            }
            this.d.h(b);
        } else {
            if (!this.a.d() || this.d.f(2) == null) {
                return;
            }
            this.d.g(0, false);
        }
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j) {
        boolean z = this.g;
        boolean z2 = true;
        if (i != 1 && i != 2) {
            z2 = false;
        }
        this.g = z2;
        if (z != z2) {
            g();
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
        this.f.c();
        this.e.q(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.f.c();
        this.f.d(this.c.G().a.G().Y(new ayrs() { // from class: nzr
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                VideoStageMonitor videoStageMonitor = VideoStageMonitor.this;
                ahef ahefVar = (ahef) obj;
                if (amkq.b(videoStageMonitor.a, ahefVar.c())) {
                    return;
                }
                videoStageMonitor.a = ahefVar.c();
                videoStageMonitor.g();
            }
        }, nua.j));
        this.e.kR(this);
    }
}
