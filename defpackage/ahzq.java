package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahzq {
    public final azrw a;
    public final aild b;

    public ahzq(azrw azrwVar, aild aildVar) {
        azrwVar.getClass();
        this.a = azrwVar;
        aildVar.getClass();
        this.b = aildVar;
    }

    public static final boolean a(apxf apxfVar) {
        if (apxfVar != null && apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
            awdq awdqVar = ((awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint)).m;
            if (awdqVar == null) {
                awdqVar = awdq.a;
            }
            atxn atxnVar = awdqVar.d;
            if (atxnVar == null) {
                atxnVar = atxn.a;
            }
            if ((atxnVar.b & 1) != 0) {
                return true;
            }
        }
        return false;
    }
}
