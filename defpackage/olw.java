package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.app.extensions.livecreation.MainLiveCreationActivity;
import com.google.android.libraries.youtube.comment.image.ImageGalleryActivity;
import com.google.protos.youtube.api.innertube.SharePlaylistEndpointOuterClass$SharePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.ShareVideoEndpointOuterClass$ShareVideoEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class olw implements olx {
    public final /* synthetic */ ci a;
    private final /* synthetic */ int b;

    public /* synthetic */ olw(ci ciVar, int i) {
        this.b = i;
        this.a = ciVar;
    }

    @Override // defpackage.olx
    public final Intent a(apxf apxfVar) {
        int i = this.b;
        if (i == 0) {
            return ImageGalleryActivity.b(this.a, apxfVar).addFlags(536870912);
        }
        if (i == 1) {
            Intent intent = new Intent(this.a, (Class<?>) MainLiveCreationActivity.class);
            intent.putExtra("navigation_endpoint", apxfVar.toByteArray());
            return intent;
        }
        if (i == 2) {
            return ImageGalleryActivity.b(this.a, apxfVar).addFlags(536870912);
        }
        if (i == 3) {
            ci ciVar = this.a;
            SharePlaylistEndpointOuterClass$SharePlaylistEndpoint sharePlaylistEndpointOuterClass$SharePlaylistEndpoint = (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint) apxfVar.pX(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint);
            return wbs.aD(ciVar, sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.d, Uri.parse(sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.c));
        }
        return wbs.aE(this.a, ((ShareVideoEndpointOuterClass$ShareVideoEndpoint) apxfVar.pX(ShareVideoEndpointOuterClass$ShareVideoEndpoint.shareVideoEndpoint)).c, Uri.parse(((ShareVideoEndpointOuterClass$ShareVideoEndpoint) apxfVar.pX(ShareVideoEndpointOuterClass$ShareVideoEndpoint.shareVideoEndpoint)).b));
    }
}
