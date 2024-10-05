package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ikj {
    final /* synthetic */ ikn a;

    public ikj(ikn iknVar) {
        this.a = iknVar;
    }

    public final void a(asno asnoVar) {
        ijo ijoVar = (ijo) ((ily) this.a.a).p;
        ihl ihlVar = ijoVar.ae;
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = null;
        if (ihlVar != null && ihlVar.g().isPresent()) {
            reelWatchEndpointOuterClass$ReelWatchEndpoint = ((ihm) ijoVar.ae.g().get()).a();
        }
        if (etx.ai(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            aujs aujsVar = ijoVar.aS.a().u;
            if (aujsVar == null) {
                aujsVar = aujs.a;
            }
            if (aujsVar.f && asnoVar == asno.DISLIKE) {
                ijoVar.bh(ihk.a(5), true);
            }
        }
    }
}
