package defpackage;

import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kya implements kyj {
    private final abaz a;
    private final Map b = new HashMap();

    public kya(abaz abazVar) {
        this.a = abazVar;
    }

    private final kyh d(String str) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, new kyh(this.a, str));
        }
        return (kyh) this.b.get(str);
    }

    @Override // defpackage.kyj
    public final void a(String str, String str2, String str3, afwx afwxVar) {
        kyh d = d(str);
        d.a(new kyc(d, str2, str3, afwxVar));
    }

    @Override // defpackage.kyj
    public final void b(String str) {
        d(str).d();
    }

    @Override // defpackage.kyj
    public final boolean c(apxf apxfVar, afwx afwxVar) {
        int bC;
        kye kybVar;
        int bC2;
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apxfVar.pX(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.size() == 0) {
            return false;
        }
        int bC3 = anaf.bC(((auau) playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.get(0)).c);
        if ((bC3 == 0 || bC3 != 3) && ((bC = anaf.bC(((auau) playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.get(0)).c)) == 0 || bC != 11)) {
            return false;
        }
        kyh d = d(playlistEditEndpointOuterClass$PlaylistEditEndpoint.b);
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint2 = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apxfVar.pX(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint2.c.size() != 1 || (bC2 = anaf.bC(((auau) playlistEditEndpointOuterClass$PlaylistEditEndpoint2.c.get(0)).c)) == 0 || bC2 != 11) {
            kybVar = new kyb(d, playlistEditEndpointOuterClass$PlaylistEditEndpoint2.c, playlistEditEndpointOuterClass$PlaylistEditEndpoint2.e, apxfVar.c, afwxVar);
        } else {
            kybVar = new kyg(d, playlistEditEndpointOuterClass$PlaylistEditEndpoint2.c, playlistEditEndpointOuterClass$PlaylistEditEndpoint2.e, apxfVar.c, afwxVar);
        }
        d.a(kybVar);
        return true;
    }
}
