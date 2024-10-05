package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import android.content.Context;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.UpForFullController;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import defpackage.aaea;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.aswb;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.nua;
import defpackage.yjk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UpForFullController implements any {
    public final aaea a;
    public boolean b;
    public boolean c;
    private final Context d;
    private final aioc e;
    private final ayqw f = new ayqw();

    public UpForFullController(Context context, aaea aaeaVar, aioc aiocVar) {
        this.d = context;
        this.a = aaeaVar;
        this.e = aiocVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        aswb aswbVar = this.a.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if (aswbVar.aB) {
            return yjk.Y(this.d) ? this.b : this.c;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(int i) {
        return i < 0 && Math.abs(yjk.P(this.d.getResources().getDisplayMetrics(), i)) >= 64;
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
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.f.g(this.e.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: oes
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                UpForFullController upForFullController = UpForFullController.this;
                ahdv ahdvVar = (ahdv) obj;
                PlayerResponseModel b = ahdvVar.b();
                if (!ahdvVar.c().b(aigk.VIDEO_PLAYBACK_LOADED) || b == null) {
                    return;
                }
                upForFullController.b = b.c().ay();
                upForFullController.c = b.c().az();
            }
        }, nua.o));
    }
}
