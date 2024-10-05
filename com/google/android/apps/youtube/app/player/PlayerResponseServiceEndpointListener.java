package com.google.android.apps.youtube.app.player;

import com.google.android.apps.youtube.app.player.PlayerResponseServiceEndpointListener;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import defpackage.aahd;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayerResponseServiceEndpointListener implements any {
    public final aahd a;
    private final aioc b;
    private ayqx c;

    public PlayerResponseServiceEndpointListener(aioc aiocVar, aahd aahdVar) {
        this.b = aiocVar;
        this.a = aahdVar;
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
        Object obj = this.c;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
        }
        this.c = null;
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        Object obj = this.c;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
        }
        this.c = this.b.G().a.X(new ayrs() { // from class: kdb
            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                PlayerResponseServiceEndpointListener playerResponseServiceEndpointListener = PlayerResponseServiceEndpointListener.this;
                ahef ahefVar = (ahef) obj2;
                PlayerResponseModel b = ahefVar.b();
                if (b == null || ahefVar.c() != aign.PLAYBACK_LOADED) {
                    return;
                }
                aony aonyVar = b.a.z;
                for (apxf apxfVar : (apxf[]) aonyVar.toArray(new apxf[0])) {
                    playerResponseServiceEndpointListener.a.c(apxfVar, null);
                }
            }
        });
    }
}
