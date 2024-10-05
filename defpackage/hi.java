package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes3.dex */
class hi implements hh {
    final MediaSession a;
    final MediaSessionCompat$Token b;
    final Object c = new Object();
    boolean d = false;
    final RemoteCallbackList e = new RemoteCallbackList();
    PlaybackStateCompat f;
    MediaMetadataCompat g;
    int h;
    hg i;
    arn j;

    public hi(Context context, String str) {
        MediaSession s = s(context, str);
        this.a = s;
        this.b = new MediaSessionCompat$Token(s.getSessionToken(), new gu(this));
        q();
    }

    @Override // defpackage.hh
    public final hg a() {
        hg hgVar;
        synchronized (this.c) {
            hgVar = this.i;
        }
        return hgVar;
    }

    @Override // defpackage.hh
    public final MediaSessionCompat$Token b() {
        return this.b;
    }

    @Override // defpackage.hh
    public final PlaybackStateCompat c() {
        return this.f;
    }

    @Override // defpackage.hh
    public arn d() {
        arn arnVar;
        synchronized (this.c) {
            arnVar = this.j;
        }
        return arnVar;
    }

    @Override // defpackage.hh
    public final String e() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return (String) this.a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.a, new Object[0]);
        } catch (Exception e) {
            Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            return null;
        }
    }

    @Override // defpackage.hh
    public final void f() {
        this.d = true;
        this.e.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = this.a.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(this.a);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
            }
        }
        this.a.setCallback(null);
        this.a.release();
    }

    @Override // defpackage.hh
    public final void g(boolean z) {
        this.a.setActive(z);
    }

    @Override // defpackage.hh
    public final void h(hg hgVar, Handler handler) {
        synchronized (this.c) {
            this.i = hgVar;
            he heVar = null;
            this.a.setCallback(hgVar == null ? null : hgVar.b, handler);
            if (hgVar != null) {
                synchronized (hgVar.a) {
                    hgVar.c = new WeakReference(this);
                    he heVar2 = hgVar.d;
                    if (heVar2 != null) {
                        heVar2.removeCallbacksAndMessages(null);
                    }
                    if (handler != null) {
                        heVar = new he(hgVar, handler.getLooper());
                    }
                    hgVar.d = heVar;
                }
            }
        }
    }

    @Override // defpackage.hh
    public void i(arn arnVar) {
        synchronized (this.c) {
            this.j = arnVar;
        }
    }

    @Override // defpackage.hh
    public final void j(PendingIntent pendingIntent) {
        this.a.setMediaButtonReceiver(pendingIntent);
    }

    @Override // defpackage.hh
    public final void l(PlaybackStateCompat playbackStateCompat) {
        this.f = playbackStateCompat;
        synchronized (this.c) {
            int beginBroadcast = this.e.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                } else {
                    try {
                        ((gs) this.e.getBroadcastItem(beginBroadcast)).a(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
            }
            this.e.finishBroadcast();
        }
        MediaSession mediaSession = this.a;
        if (playbackStateCompat.l == null) {
            PlaybackState.Builder i = ho.i();
            ho.x(i, playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.h);
            ho.u(i, playbackStateCompat.c);
            ho.s(i, playbackStateCompat.e);
            ho.v(i, playbackStateCompat.g);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.i) {
                PlaybackState.CustomAction customAction2 = customAction.e;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder j = ho.j(customAction.a, customAction.b, customAction.c);
                    ho.w(j, customAction.d);
                    customAction2 = ho.k(j);
                }
                ho.r(i, customAction2);
            }
            ho.t(i, playbackStateCompat.j);
            if (Build.VERSION.SDK_INT >= 22) {
                hp.b(i, playbackStateCompat.k);
            }
            playbackStateCompat.l = ho.l(i);
        }
        mediaSession.setPlaybackState(playbackStateCompat.l);
    }

    @Override // defpackage.hh
    public final void m(int i) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        this.a.setPlaybackToLocal(builder.build());
    }

    @Override // defpackage.hh
    public final void n(ars arsVar) {
        this.a.setPlaybackToRemote((VolumeProvider) arsVar.a());
    }

    @Override // defpackage.hh
    public final void o(PendingIntent pendingIntent) {
        this.a.setSessionActivity(pendingIntent);
    }

    @Override // defpackage.hh
    public final boolean p() {
        return this.a.isActive();
    }

    @Override // defpackage.hh
    public final void q() {
        this.a.setFlags(3);
    }

    @Override // defpackage.hh
    public void r() {
        this.h = 2;
    }

    public MediaSession s(Context context, String str) {
        return new MediaSession(context, str);
    }

    @Override // defpackage.hh
    public final void k(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadata mediaMetadata;
        this.g = mediaMetadataCompat;
        MediaSession mediaSession = this.a;
        if (mediaMetadataCompat == null) {
            mediaMetadata = null;
        } else {
            if (mediaMetadataCompat.c == null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadataCompat.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat.c = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
            mediaMetadata = mediaMetadataCompat.c;
        }
        mediaSession.setMetadata(mediaMetadata);
    }
}
