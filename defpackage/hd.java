package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.google.android.youtube.R;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hd {
    public final gz a;
    public final MediaSessionCompat$Token b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public hd(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.b = mediaSessionCompat$Token;
        this.a = new hb(context, mediaSessionCompat$Token);
    }

    public static void d(Activity activity, hd hdVar) {
        activity.getWindow().getDecorView().setTag(R.id.media_controller_compat_view_tag, hdVar);
        activity.setMediaController(hdVar != null ? new MediaController(activity, (MediaSession.Token) hdVar.b.b) : null);
    }

    public final MediaMetadataCompat a() {
        MediaMetadata metadata = ((hb) this.a).a.getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.c(metadata);
        }
        return null;
    }

    public final hc b() {
        MediaController.TransportControls transportControls = ((hb) this.a).a.getTransportControls();
        if (Build.VERSION.SDK_INT >= 29) {
            return new hc(transportControls);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return new hc(transportControls);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return new hc(transportControls);
        }
        return new hc(transportControls);
    }

    public final PlaybackStateCompat c() {
        gz gzVar = this.a;
        hb hbVar = (hb) gzVar;
        if (hbVar.e.a() != null) {
            try {
                return ((hb) gzVar).e.a().a();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = hbVar.a.getPlaybackState();
        if (playbackState == null) {
            return null;
        }
        return PlaybackStateCompat.a(playbackState);
    }

    public final void e(gy gyVar) {
        if (gyVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.c.remove(gyVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            gz gzVar = this.a;
            ((hb) gzVar).a.unregisterCallback(gyVar.a);
            synchronized (((hb) gzVar).b) {
                if (((hb) gzVar).e.a() != null) {
                    try {
                        ha haVar = (ha) ((hb) gzVar).d.remove(gyVar);
                        if (haVar != null) {
                            gyVar.c = null;
                            ((hb) gzVar).e.a().c(haVar);
                        }
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                    }
                } else {
                    ((hb) gzVar).c.remove(gyVar);
                }
            }
        } finally {
            gyVar.e(null);
        }
    }

    public hd(Context context, hn hnVar) {
        MediaSessionCompat$Token b = hnVar.b();
        this.b = b;
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new hb(context, b);
        } else {
            this.a = new hb(context, b);
        }
    }
}
