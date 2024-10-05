package com.google.android.libraries.youtube.player.features.mediacontroller;

import android.app.Activity;
import com.google.android.libraries.youtube.player.features.mediacontroller.VolumeControlsManager;
import defpackage.aiwg;
import defpackage.any;
import defpackage.aok;
import defpackage.axpg;
import defpackage.aypn;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VolumeControlsManager implements any {
    public final axpg a;
    public final Activity b;
    private final aypn c;
    private ayqx d;

    public VolumeControlsManager(axpg axpgVar, aiwg aiwgVar, Activity activity) {
        this.a = axpgVar;
        this.c = aiwgVar.a;
        this.b = activity;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.d = this.c.X(new ayrs() { // from class: ahue
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                VolumeControlsManager volumeControlsManager = VolumeControlsManager.this;
                aiwf aiwfVar = aiwf.STARTED;
                int ordinal = ((aiwf) obj).ordinal();
                if (ordinal == 0) {
                    hd.d(volumeControlsManager.b, ((hn) volumeControlsManager.a.get()).c);
                } else {
                    if (ordinal != 1) {
                        return;
                    }
                    hd.d(volumeControlsManager.b, null);
                }
            }
        });
        this.b.setVolumeControlStream(3);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        Object obj = this.d;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.d = null;
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
