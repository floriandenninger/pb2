package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AuthorizedUrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ffk implements aahd {
    private final wzq a;
    private final Activity b;
    private final ypa c;
    private final ysy d;
    private final aagx e;
    private final azrw f;
    private final zbi g;
    private ffp h;

    public ffk(wzq wzqVar, Activity activity, ypa ypaVar, ysy ysyVar, azrw azrwVar, aagx aagxVar, zbi zbiVar) {
        this.a = wzqVar;
        this.b = activity;
        ypaVar.getClass();
        this.c = ypaVar;
        ysyVar.getClass();
        this.d = ysyVar;
        azrwVar.getClass();
        this.f = azrwVar;
        this.e = aagxVar;
        zbiVar.getClass();
        this.g = zbiVar;
    }

    private static final void f(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.url_resolver_failed, 1).show();
        }
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void a(apxf apxfVar) {
        aahc.a(this, apxfVar);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    public final void c(apxf apxfVar, Map map) {
        if (apxfVar != null) {
            try {
                try {
                    aaha aahaVar = null;
                    if (apxfVar.pY(UrlEndpointOuterClass.urlEndpoint)) {
                        if (this.h == null) {
                            this.h = new ffp(this.b, this.a, null, new ffo() { // from class: ffj
                                @Override // defpackage.ffo
                                public final Uri a(String str, Map map2) {
                                    return wbs.aj(str);
                                }
                            }, null, null, angq.a, null, null, null, null, null, null);
                        }
                        aahaVar = this.h;
                    } else if (!this.d.o()) {
                        this.g.b();
                    } else if (apxfVar.pY(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint)) {
                        aahaVar = (aaha) this.f.get();
                    } else if (apxfVar.pY(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint)) {
                        Uri aj = wbs.aj(((apgt) apxfVar.pX(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint)).b);
                        Activity activity = this.b;
                        Intent intent = new Intent("android.intent.action.VIEW", aj);
                        ajcq.q(activity, intent);
                        f(this.b, intent.setFlags(268435456));
                    } else {
                        throw new aahm("Unknown NavigationData encountered");
                    }
                    if (aahaVar != null) {
                        aahaVar.kE(apxfVar, map);
                        this.c.d(new fea());
                    }
                } catch (aahm unused) {
                    this.e.f(apxfVar).kE(apxfVar, map);
                }
            } catch (aahm e) {
                if (e.getMessage() != null) {
                    whu.L(this.b, e.getMessage(), 1);
                }
            }
        }
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void d(List list, Map map) {
        aahc.c(this, list, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void e(List list, Object obj) {
        aahc.d(this, list, obj);
    }
}
