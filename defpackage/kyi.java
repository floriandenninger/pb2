package defpackage;

import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kyi implements kyj {
    private final abaz a;

    public kyi(abaz abazVar) {
        this.a = abazVar;
    }

    @Override // defpackage.kyj
    public final void a(String str, String str2, String str3, afwx afwxVar) {
        abaw a = this.a.a();
        a.a = str;
        a.e(str2, str3);
        a.k();
        this.a.b(a, afwxVar);
    }

    @Override // defpackage.kyj
    public final void b(String str) {
    }

    @Override // defpackage.kyj
    public final boolean c(apxf apxfVar, afwx afwxVar) {
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apxfVar.pX(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        abaw a = this.a.a();
        a.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.b;
        a.c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.e;
        if ((apxfVar.b & 1) == 0) {
            a.k();
        } else {
            a.l(apxfVar.c);
        }
        a.d(playlistEditEndpointOuterClass$PlaylistEditEndpoint.c);
        this.a.b(a, afwxVar);
        return true;
    }
}
