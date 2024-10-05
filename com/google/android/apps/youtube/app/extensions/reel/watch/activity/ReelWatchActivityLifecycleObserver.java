package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import defpackage.aahd;
import defpackage.amxe;
import defpackage.any;
import defpackage.aok;
import defpackage.apxf;
import defpackage.hbb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelWatchActivityLifecycleObserver implements any {
    private final hbb a;
    private final aahd b;

    public ReelWatchActivityLifecycleObserver(hbb hbbVar, aahd aahdVar) {
        this.a = hbbVar;
        this.b = aahdVar;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        for (Runnable runnable : this.a.b.values()) {
            if (runnable != null) {
                runnable.run();
            }
        }
        hbb hbbVar = this.a;
        aahd aahdVar = this.b;
        synchronized (hbbVar.f) {
            if (hbbVar.f.isEmpty()) {
                return;
            }
            amxe it = hbbVar.d.iterator();
            while (it.hasNext()) {
                ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) it.next();
                int i = reelWatchEndpointOuterClass$ReelWatchEndpoint.b;
                if ((i & 8) != 0 && (i & 131072) != 0 && hbbVar.f.contains(reelWatchEndpointOuterClass$ReelWatchEndpoint.e)) {
                    apxf apxfVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.r;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.a(apxfVar);
                }
            }
            hbbVar.f.clear();
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
}
