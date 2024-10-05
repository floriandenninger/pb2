package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ihm {
    public final long a;
    public final boolean b;
    public final boolean c;
    public apxf d;
    public arsd e;
    public iin f;
    public long g = Long.MIN_VALUE;
    public final aomf h;

    public ihm(long j, apxf apxfVar, aomf aomfVar, boolean z, boolean z2) {
        amkq.N(apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        this.a = j;
        apxfVar.getClass();
        this.d = apxfVar;
        this.h = aomfVar;
        this.b = z;
        this.c = z2;
    }

    public final ReelWatchEndpointOuterClass$ReelWatchEndpoint a() {
        amkq.N(this.d.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        return (ReelWatchEndpointOuterClass$ReelWatchEndpoint) this.d.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
    }

    public final void b(arsd arsdVar) {
        this.e = arsdVar;
        if (etx.ac(arsdVar)) {
            aong aongVar = (aong) this.d.toBuilder();
            aonk aonkVar = ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
            aone builder = a().toBuilder();
            builder.copyOnWrite();
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) builder.instance;
            reelWatchEndpointOuterClass$ReelWatchEndpoint.h = null;
            reelWatchEndpointOuterClass$ReelWatchEndpoint.b &= -65;
            aongVar.e(aonkVar, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) builder.build());
            this.d = (apxf) aongVar.build();
        }
    }
}
