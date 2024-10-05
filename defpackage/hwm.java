package defpackage;

import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.google.protos.youtube.api.innertube.MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint;
import com.google.protos.youtube.api.innertube.StickerCatalogEndpointOuterClass$StickerCatalogEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hwm implements Runnable {
    public final /* synthetic */ hwq a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ hwm(hwq hwqVar, boolean z, int i) {
        this.c = i;
        this.a = hwqVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            hwq hwqVar = this.a;
            boolean z = this.b;
            if (etx.S(hwqVar.i)) {
                for (Map.Entry entry : hwqVar.b.a.e.entrySet()) {
                    apxf apxfVar = ((apmg) entry.getKey()).o;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    if (!apxfVar.pY(StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.stickerCatalogEndpoint)) {
                        apxf apxfVar2 = ((apmg) entry.getKey()).o;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        if (apxfVar2.pY(MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.multiPageStickerCatalogEndpoint)) {
                        }
                    }
                    hxc.a((View) entry.getValue(), z);
                }
                return;
            }
            return;
        }
        if (i != 1) {
            hwq hwqVar2 = this.a;
            boolean z2 = this.b;
            if (etx.S(hwqVar2.i)) {
                hxc.a(hwqVar2.b.k, z2);
                return;
            }
            return;
        }
        hwq hwqVar3 = this.a;
        boolean z3 = this.b;
        if (etx.S(hwqVar3.i)) {
            if (z3) {
                hwqVar3.f.performHapticFeedback(1);
            }
            if (hwqVar3.g.getAnimation() != null && hwqVar3.g.getAnimation().hasStarted() && !hwqVar3.g.getAnimation().hasEnded()) {
                hwqVar3.g.getAnimation().reset();
            }
            float f = true != z3 ? 1.0f : 1.1667f;
            hwqVar3.g.animate().scaleX(f).scaleY(f).setDuration(75L).start();
            TransitionDrawable transitionDrawable = (TransitionDrawable) hwqVar3.g.getBackground();
            if (z3) {
                transitionDrawable.startTransition(75);
                hwqVar3.p.I(3, new acqx(acsb.c(39104)), null);
            } else {
                transitionDrawable.reverseTransition(75);
            }
        }
    }
}
