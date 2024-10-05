package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eym implements aaha {
    public final azrw a;
    public final zaw b;
    public final jvr c;
    private final abaz d;
    private final Activity e;
    private final afsy f;
    private final aftn g;
    private final kyj h;

    public eym(abaz abazVar, azrw azrwVar, zaw zawVar, Activity activity, afsy afsyVar, aftn aftnVar, jvr jvrVar, kyj kyjVar) {
        abazVar.getClass();
        this.d = abazVar;
        azrwVar.getClass();
        this.a = azrwVar;
        zawVar.getClass();
        this.b = zawVar;
        this.e = activity;
        this.f = afsyVar;
        this.g = aftnVar;
        this.c = jvrVar;
        this.h = kyjVar;
    }

    public final void b(apxf apxfVar, Object obj) {
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apxfVar.pX(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        eyl eylVar = new eyl(this, playlistEditEndpointOuterClass$PlaylistEditEndpoint.b, playlistEditEndpointOuterClass$PlaylistEditEndpoint.c, obj);
        kyj kyjVar = this.h;
        if (kyjVar == null || !kyjVar.c(apxfVar, eylVar)) {
            abaw a = this.d.a();
            a.l(apxfVar.c);
            a.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.b;
            a.d(playlistEditEndpointOuterClass$PlaylistEditEndpoint.c);
            a.c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.e;
            this.d.b(a, eylVar);
        }
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint.d.size() != 0) {
            ((aahd) this.a.get()).e(playlistEditEndpointOuterClass$PlaylistEditEndpoint.d, obj);
        }
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        afsy afsyVar;
        Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (this.e == null || this.g == null || (afsyVar = this.f) == null || afsyVar.t()) {
            b(apxfVar, s);
        } else {
            this.g.c(this.e, null, new eyk(this, apxfVar, s));
        }
    }
}
