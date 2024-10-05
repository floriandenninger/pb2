package defpackage;

import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akjk implements ajde {
    final /* synthetic */ apxf a;
    final /* synthetic */ Map b;
    final /* synthetic */ akjm c;

    public akjk(akjm akjmVar, apxf apxfVar, Map map) {
        this.c = akjmVar;
        this.a = apxfVar;
        this.b = map;
    }

    @Override // defpackage.ajde
    public final void a() {
    }

    @Override // defpackage.ajde
    public final void b() {
        akjm akjmVar = this.c;
        apxf apxfVar = this.a;
        Map map = this.b;
        whu.K(akjmVar.a, R.string.publishing_private_video_progress, 0);
        SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint = (SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint) apxfVar.pX(SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.sharePrivateVideoEndpoint);
        aone createBuilder = arvt.a.createBuilder();
        String str = sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.b;
        createBuilder.copyOnWrite();
        arvt arvtVar = (arvt) createBuilder.instance;
        str.getClass();
        arvtVar.b |= 2;
        arvtVar.e = str;
        aone createBuilder2 = arvj.a.createBuilder();
        createBuilder2.copyOnWrite();
        arvj arvjVar = (arvj) createBuilder2.instance;
        arvjVar.c = 2;
        arvjVar.b |= 1;
        createBuilder.copyOnWrite();
        arvt arvtVar2 = (arvt) createBuilder.instance;
        arvj arvjVar2 = (arvj) createBuilder2.build();
        arvjVar2.getClass();
        arvtVar2.h = arvjVar2;
        arvtVar2.b |= 32;
        akjmVar.c.b(createBuilder, new akjl(akjmVar, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint, map), apxfVar.c.I());
    }

    @Override // defpackage.ajde
    public final void c(boolean z) {
    }
}
