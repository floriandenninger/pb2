package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.FullscreenExitController;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.fgq;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FullscreenExitController implements any {
    public boolean a = false;
    public boolean b = false;
    private final fgq c;
    private ayqx d;

    public FullscreenExitController(fgq fgqVar) {
        this.c = fgqVar;
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
        this.a = false;
        Object obj = this.d;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.d = null;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.d = this.c.h().aF().ax(new ayrs() { // from class: odj
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                FullscreenExitController fullscreenExitController = FullscreenExitController.this;
                List list = (List) obj;
                boolean z = false;
                fhg fhgVar = (fhg) list.get(0);
                if (((fhg) list.get(1)) == fhg.WATCH_WHILE_FULLSCREEN && (fhgVar == fhg.WATCH_WHILE_MAXIMIZED || fhgVar == fhg.WATCH_WHILE_SLIDING_MAXIMIZED_FULLSCREEN)) {
                    z = true;
                }
                fullscreenExitController.a = z;
            }
        });
    }
}
