package defpackage;

import android.net.Uri;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.youtube.R;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
import java.util.HashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class onj implements afwx {
    final /* synthetic */ Uri a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ onk c;

    public onj(onk onkVar, Uri uri, SettableFuture settableFuture) {
        this.c = onkVar;
        this.a = uri;
        this.b = settableFuture;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (cnqVar.getCause() == null || !(cnqVar.getCause() instanceof CancellationException)) {
            whu.K(this.c.a, R.string.url_resolver_failed, 1);
        }
        PaneDescriptor r = this.c.c.r();
        if (r == null || this.c.k.m(r)) {
            this.c.c.d(this.c.c.k());
        }
        this.b.o(Boolean.FALSE);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arwa arwaVar = (arwa) obj;
        apxf apxfVar = arwaVar.d;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if ((arwaVar.b & 2) == 0) {
            fav.F(this.c.a, this.a);
        } else if (apxfVar.pY(UrlEndpointOuterClass.urlEndpoint)) {
            fav.F(this.c.a, Uri.parse(((avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint)).c));
        } else {
            if (!apxfVar.pY(WatchEndpointOuterClass.watchEndpoint) && !apxfVar.pY(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint)) {
                this.c.e();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.apps.youtube.app.endpoint.flags", 1);
            hashMap.put(acrc.a, 1);
            this.c.b.c(apxfVar, hashMap);
        }
        this.b.o(Boolean.TRUE);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
