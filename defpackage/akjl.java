package defpackage;

import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akjl implements afwx {
    final /* synthetic */ SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint a;
    final /* synthetic */ Map b;
    final /* synthetic */ akjm c;

    public akjl(akjm akjmVar, SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint, Map map) {
        this.c = akjmVar;
        this.a = sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
        this.b = map;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        whu.K(this.c.a, R.string.error_publishing_private_video, 0);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aahd aahdVar = this.c.b;
        apxf apxfVar = this.a.c;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, this.b);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
