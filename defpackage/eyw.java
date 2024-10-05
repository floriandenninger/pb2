package defpackage;

import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyw implements aaha {
    private final ysy a;
    private final afsy b;
    private final agsg c;
    private final agof d;
    private final /* synthetic */ int e;

    public eyw(ysy ysyVar, agof agofVar, afsy afsyVar, agsg agsgVar, int i) {
        this.e = i;
        this.a = ysyVar;
        this.d = agofVar;
        this.b = afsyVar;
        this.c = agsgVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.e == 0) {
            if (this.a.o() && this.b.t()) {
                agsw m = this.d.a().m();
                OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) apxfVar.pX(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
                m.a(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c == 1 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : "", this.c.u(), agno.OFFLINE_IMMEDIATELY, (byte[]) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", byte[].class), 0);
                return;
            }
            return;
        }
        if (this.a.o() && this.b.t()) {
            this.d.a().i().C(((OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) apxfVar.pX(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)).c, this.c.u(), agno.OFFLINE_IMMEDIATELY, (byte[]) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", byte[].class), 0, 4);
        }
    }
}
