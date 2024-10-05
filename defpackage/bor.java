package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bor extends MediaRouter2.TransferCallback {
    final /* synthetic */ bos a;

    public bor(bos bosVar) {
        this.a = bosVar;
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onStop(MediaRouter2.RoutingController routingController) {
        bpc bpcVar = (bpc) this.a.b.remove(routingController);
        if (bpcVar != null) {
            bpk bpkVar = this.a.d;
            if (bpcVar == bpkVar.a.t) {
                bpkVar.b(2);
                return;
            }
            return;
        }
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        bpv bpvVar;
        this.a.b.remove(routingController);
        if (routingController2 == this.a.a.getSystemController()) {
            this.a.d.b(3);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        String id = selectedRoutes.get(0).getId();
        this.a.b.put(routingController2, new boo(routingController2, id));
        bpk bpkVar = this.a.d;
        Iterator it = bpkVar.a.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                bpvVar = null;
                break;
            }
            bpvVar = (bpv) it.next();
            if (bpvVar.c() == bpkVar.a.f && TextUtils.equals(id, bpvVar.b)) {
                break;
            }
        }
        if (bpvVar == null) {
            Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
        } else {
            bpkVar.a.k(bpvVar, 3);
        }
        this.a.f(routingController2);
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
