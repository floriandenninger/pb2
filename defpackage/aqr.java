package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqr implements Runnable {
    final /* synthetic */ MediaSessionCompat$Token a;
    final /* synthetic */ aqu b;

    public aqr(aqu aquVar, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.b = aquVar;
        this.a = mediaSessionCompat$Token;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqu aquVar = this.b;
        MediaSessionCompat$Token mediaSessionCompat$Token = this.a;
        if (!aquVar.a.isEmpty()) {
            gv a = mediaSessionCompat$Token.a();
            if (a != null) {
                Iterator it = aquVar.a.iterator();
                while (it.hasNext()) {
                    ((Bundle) it.next()).putBinder("extra_session_binder", a.asBinder());
                }
            }
            aquVar.a.clear();
        }
        aquVar.b.setSessionToken((MediaSession.Token) mediaSessionCompat$Token.b);
    }
}
