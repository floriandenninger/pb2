package defpackage;

import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nth {
    public final yqw a;
    public final aok b;
    public final nqy c;
    public final abal d;
    public final Executor e;
    public final zaw f;
    public final azrw g;
    public final aahd h;

    public nth(aok aokVar, nqy nqyVar, abal abalVar, Executor executor, zaw zawVar, azrw azrwVar, aahd aahdVar) {
        this.a = new yqw(aokVar.getLifecycle());
        this.b = aokVar;
        this.c = nqyVar;
        this.d = abalVar;
        this.e = executor;
        this.f = zawVar;
        this.g = azrwVar;
        this.h = aahdVar;
    }

    public static Optional a(apxf apxfVar) {
        if (!apxfVar.pY(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
            return Optional.empty();
        }
        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
        if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 4) == 0) {
            return Optional.empty();
        }
        return Optional.of(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint);
    }

    public static final void b(nqg nqgVar, boolean z) {
        if (nqgVar instanceof noq) {
            if (z) {
                ((noq) nqgVar).a().c();
            } else {
                ((noq) nqgVar).a().a();
            }
        }
    }
}
