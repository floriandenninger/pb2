package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class inl implements aial {
    private final afkk a;

    public inl(afkk afkkVar) {
        this.a = afkkVar;
    }

    @Override // defpackage.aial
    public final ammv a(atxo atxoVar) {
        return ammv.j(this.a.b());
    }

    @Override // defpackage.aial
    public final atxo b(apxf apxfVar) {
        if (apxfVar != null && apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            awdq awdqVar = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).t;
            if (awdqVar == null) {
                awdqVar = awdq.a;
            }
            if ((awdqVar.b & 1) != 0) {
                atxo atxoVar = awdqVar.c;
                return atxoVar == null ? atxo.a : atxoVar;
            }
        }
        return null;
    }

    @Override // defpackage.aial
    public final atxp c(apxf apxfVar) {
        if (apxfVar != null && apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            awdq awdqVar = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).t;
            if (awdqVar == null) {
                awdqVar = awdq.a;
            }
            if ((awdqVar.b & 8) != 0) {
                atxp atxpVar = awdqVar.e;
                return atxpVar == null ? atxp.a : atxpVar;
            }
        }
        return null;
    }
}
