package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ycb implements yca {
    private final Runnable a;
    private final /* synthetic */ int b;

    public ycb(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    @Override // defpackage.yca
    public final void a(apxf apxfVar) {
        if (this.b != 0) {
            if (apxfVar == null || !apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint)) {
                return;
            }
            this.a.run();
            return;
        }
        if (apxfVar == null || !apxfVar.pY(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)) {
            return;
        }
        this.a.run();
    }
}
