package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiaq implements aial {
    private final afkk a;

    public aiaq(afkk afkkVar) {
        this.a = afkkVar;
    }

    public static boolean d(atxo atxoVar) {
        atxoVar.getClass();
        return atxoVar.d < 0 || atxoVar.e < 0;
    }

    @Override // defpackage.aial
    public final ammv a(atxo atxoVar) {
        return d(atxoVar) ? amlr.a : ammv.j(this.a.get());
    }

    @Override // defpackage.aial
    public final atxo b(apxf apxfVar) {
        if (apxfVar != null && apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
            awdp awdpVar = (awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint);
            awdq awdqVar = awdpVar.m;
            if (awdqVar == null) {
                awdqVar = awdq.a;
            }
            if ((awdqVar.b & 1) != 0) {
                awdq awdqVar2 = awdpVar.m;
                if (awdqVar2 == null) {
                    awdqVar2 = awdq.a;
                }
                atxo atxoVar = awdqVar2.c;
                return atxoVar == null ? atxo.a : atxoVar;
            }
        }
        return null;
    }

    @Override // defpackage.aial
    public final atxp c(apxf apxfVar) {
        if (apxfVar != null && apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
            awdp awdpVar = (awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint);
            awdq awdqVar = awdpVar.m;
            if (awdqVar == null) {
                awdqVar = awdq.a;
            }
            if ((awdqVar.b & 8) != 0) {
                awdq awdqVar2 = awdpVar.m;
                if (awdqVar2 == null) {
                    awdqVar2 = awdq.a;
                }
                atxp atxpVar = awdqVar2.e;
                return atxpVar == null ? atxp.a : atxpVar;
            }
        }
        return null;
    }
}
