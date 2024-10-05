package defpackage;

import com.google.protos.youtube.api.innertube.MuteAdEndpointOuterClass$MuteAdEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eya implements aaha {
    private final ypa a;
    private final aahd b;

    public eya(ypa ypaVar, aahd aahdVar) {
        ypaVar.getClass();
        this.a = ypaVar;
        aahdVar.getClass();
        this.b = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        MuteAdEndpointOuterClass$MuteAdEndpoint muteAdEndpointOuterClass$MuteAdEndpoint = (MuteAdEndpointOuterClass$MuteAdEndpoint) apxfVar.pX(MuteAdEndpointOuterClass$MuteAdEndpoint.muteAdEndpoint);
        this.a.d(new xiw(muteAdEndpointOuterClass$MuteAdEndpoint, s));
        this.b.e(muteAdEndpointOuterClass$MuteAdEndpoint.c, s);
    }
}
