package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aqu implements aqq {
    final List a = new ArrayList();
    MediaBrowserService b;
    Messenger c;
    final /* synthetic */ arm d;

    public aqu(arm armVar) {
        this.d = armVar;
    }

    @Override // defpackage.aqq
    public final IBinder a(Intent intent) {
        return this.b.onBind(intent);
    }

    @Override // defpackage.aqq
    public void b() {
        aqt aqtVar = new aqt(this, this.d);
        this.b = aqtVar;
        aqtVar.onCreate();
    }

    @Override // defpackage.aqq
    public final void c(MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.d.d.a(new aqr(this, mediaSessionCompat$Token));
    }
}
