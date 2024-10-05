package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aqt extends MediaBrowserService {
    final /* synthetic */ aqu a;

    public aqt(aqu aquVar, Context context) {
        this.a = aquVar;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        int i2;
        ypn ypnVar;
        hn.c(bundle);
        aqu aquVar = this.a;
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
            i2 = -1;
        } else {
            bundle3.remove("extra_client_version");
            aquVar.c = new Messenger(aquVar.d.d);
            bundle2 = new Bundle();
            bundle2.putInt("extra_service_version", 2);
            bundle2.putBinder("extra_messenger", aquVar.c.getBinder());
            MediaSessionCompat$Token mediaSessionCompat$Token = aquVar.d.e;
            if (mediaSessionCompat$Token != null) {
                gv a = mediaSessionCompat$Token.a();
                bundle2.putBinder("extra_session_binder", a == null ? null : a.asBinder());
            } else {
                aquVar.a.add(bundle2);
            }
            int i3 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            i2 = i3;
        }
        aqp aqpVar = new aqp(aquVar.d, str, i2, i, null);
        ypn e = aquVar.d.e(str);
        if (e == null) {
            ypnVar = null;
        } else {
            if (aquVar.c != null) {
                aquVar.d.b.add(aqpVar);
            }
            if (bundle2 == null) {
                bundle2 = e.b;
            } else {
                Bundle bundle4 = e.b;
                if (bundle4 != null) {
                    bundle2.putAll(bundle4);
                }
            }
            ypnVar = new ypn(bundle2);
        }
        if (ypnVar == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot(ypnVar.a, ypnVar.b);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        aqu aquVar = this.a;
        aquVar.d.b(new aqs(str, new arc(result)));
    }
}
