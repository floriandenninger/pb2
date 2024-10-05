package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class gy implements IBinder.DeathRecipient {
    public final MediaController.Callback a = new gw(this);
    gx b;
    public gs c;

    public void a(MediaMetadataCompat mediaMetadataCompat) {
        throw null;
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        d(8, null, null);
    }

    public void c() {
        throw null;
    }

    public final void d(int i, Object obj, Bundle bundle) {
        gx gxVar = this.b;
        if (gxVar != null) {
            Message obtainMessage = gxVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void e(Handler handler) {
        if (handler == null) {
            gx gxVar = this.b;
            if (gxVar != null) {
                gxVar.a = false;
                gxVar.removeCallbacksAndMessages(null);
                this.b = null;
                return;
            }
            return;
        }
        gx gxVar2 = new gx(this, handler.getLooper());
        this.b = gxVar2;
        gxVar2.a = true;
    }
}
