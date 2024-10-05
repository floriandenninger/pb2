package com.google.android.apps.youtube.app.watch.bottomsheet;

import android.os.Bundle;
import com.google.android.apps.youtube.app.watch.bottomsheet.PlayerOverflowBottomSheetController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import defpackage.aahd;
import defpackage.ainy;
import defpackage.aioc;
import defpackage.amkq;
import defpackage.any;
import defpackage.aoe;
import defpackage.aok;
import defpackage.atdc;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.azrw;
import defpackage.ci;
import defpackage.nng;
import defpackage.nnz;
import defpackage.nob;
import defpackage.nua;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayerOverflowBottomSheetController implements nng, any {
    public final aahd a;
    public atdc b;
    private final ci c;
    private final azrw d;
    private final aioc e;
    private ayqx f;

    public PlayerOverflowBottomSheetController(ci ciVar, azrw azrwVar, aahd aahdVar, aioc aiocVar) {
        this.c = ciVar;
        this.d = azrwVar;
        this.a = aahdVar;
        this.e = aiocVar;
    }

    @Override // defpackage.nng
    public final /* synthetic */ void g() {
        h(null);
    }

    @Override // defpackage.nng
    public final void h(Set set) {
        if (this.c.getLifecycle().a().a(aoe.RESUMED)) {
            String i = i();
            atdc atdcVar = this.b;
            nnz nnzVar = new nnz();
            Bundle bundle = new Bundle();
            bundle.putString("VIDEO_ID_KEY", i);
            if (atdcVar != null) {
                amkq.cn(bundle, "FEED_MENU_ITEMS_KEY", atdcVar);
            }
            nnzVar.af(bundle);
            nnzVar.aA = new nob(this);
            nnzVar.aw = set;
            nnzVar.qh(this.c.getSupportFragmentManager(), null);
        }
    }

    public final String i() {
        return ((ainy) this.d.get()).q();
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
        Object obj = this.f;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.f = null;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.f = this.e.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: noc
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                atzr atzrVar;
                PlayerOverflowBottomSheetController playerOverflowBottomSheetController = PlayerOverflowBottomSheetController.this;
                WatchNextResponseModel a = ((ahdv) obj).a();
                atdc atdcVar = null;
                if (a != null && (atzrVar = a.i) != null && (atzrVar.b & 1) != 0) {
                    atzq atzqVar = atzrVar.d;
                    if (atzqVar == null) {
                        atzqVar = atzq.a;
                    }
                    if ((atzqVar.b & 1) != 0) {
                        atzq atzqVar2 = atzrVar.d;
                        if (atzqVar2 == null) {
                            atzqVar2 = atzq.a;
                        }
                        atdcVar = atzqVar2.c;
                        if (atdcVar == null) {
                            atdcVar = atdc.a;
                        }
                    }
                }
                playerOverflowBottomSheetController.b = atdcVar;
            }
        }, nua.b);
    }
}
