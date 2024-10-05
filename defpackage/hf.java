package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hf extends MediaSession.Callback {
    final /* synthetic */ hg a;

    public hf(hg hgVar) {
        this.a = hgVar;
    }

    private final hi a() {
        hi hiVar;
        synchronized (this.a.a) {
            hiVar = (hi) this.a.c.get();
        }
        if (hiVar == null || this.a != hiVar.a()) {
            return null;
        }
        return hiVar;
    }

    private static final void b(hh hhVar) {
        hhVar.i(null);
    }

    private static final void c(hh hhVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        String e = hhVar.e();
        if (true == TextUtils.isEmpty(e)) {
            e = "android.media.session.MediaController";
        }
        hhVar.i(new arn(e, -1, -1));
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        bxy bxyVar;
        hi a = a();
        if (a == null) {
            return;
        }
        hn.c(bundle);
        c(a);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = a.b;
                gv a2 = mediaSessionCompat$Token.a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a2 == null ? null : a2.asBinder());
                synchronized (mediaSessionCompat$Token.a) {
                    bxyVar = mediaSessionCompat$Token.d;
                }
                if (bxyVar == null) {
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", null);
                } else {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(bxyVar));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            } else {
                str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        hi a = a();
        if (a == null) {
            return;
        }
        hn.c(bundle);
        c(a);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                hn.c(bundle2);
                this.a.e(uri, bundle2);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                this.a.f();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                hn.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                this.a.p();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                hn.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                this.a.q();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                hn.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                this.a.r();
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                hn.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        hi a = a();
        if (a == null) {
            return;
        }
        c(a);
        this.a.b();
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        hi a = a();
        if (a == null) {
            return false;
        }
        c(a);
        boolean m = this.a.m(intent);
        b(a);
        return m || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        hi a = a();
        if (a == null) {
            return;
        }
        c(a);
        this.a.c();
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        hi a = a();
        if (a == null) {
            return;
        }
        c(a);
        this.a.d();
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        hi a = a();
        if (a == null) {
            return;
        }
        hn.c(bundle);
        c(a);
        this.a.n();
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        hi a = a();
        if (a == null) {
            return;
        }
        hn.c(bundle);
        c(a);
        this.a.o();
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        hi a = a();
        if (a == null) {
            return;
        }
        hn.c(bundle);
        c(a);
        this.a.e(uri, bundle);
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        hi a = a();
        if (a == null) {
            return;
        }
        c(a);
        this.a.f();
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        hi a = a();
        if (a == null) {
            return;
        }
        hn.c(bundle);
        c(a);
        this.a.p();
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        hi a = a();
        if (a == null) {
            return;
        }
        hn.c(bundle);
        c(a);
        this.a.q();
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        hi a = a();
        if (a == null) {
            return;
        }
        hn.c(bundle);
        c(a);
        this.a.r();
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        hi a = a();
        if (a == null) {
            return;
        }
        c(a);
        this.a.g();
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        hi a = a();
        if (a == null) {
            return;
        }
        c(a);
        this.a.h(j);
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        hi a = a();
        if (a == null) {
            return;
        }
        c(a);
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f;
        hi a = a();
        if (a == null) {
            return;
        }
        c(a);
        hg hgVar = this.a;
        RatingCompat ratingCompat = null;
        if (rating != null) {
            int c = gp.c(rating);
            if (!gp.e(rating)) {
                switch (c) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(c, -1.0f);
                        break;
                }
            } else {
                switch (c) {
                    case 1:
                        ratingCompat = new RatingCompat(1, true != gp.d(rating) ? 0.0f : 1.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, true != gp.f(rating) ? 0.0f : 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float b = gp.b(rating);
                        if (c == 3) {
                            f = 3.0f;
                        } else if (c == 4) {
                            f = 4.0f;
                        } else if (c != 5) {
                            Log.e("Rating", "Invalid rating style (" + c + ") for a star rating");
                            break;
                        } else {
                            f = 5.0f;
                        }
                        if (b < 0.0f || b > f) {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        } else {
                            ratingCompat = new RatingCompat(c, b);
                            break;
                        }
                        break;
                    case 6:
                        float a2 = gp.a(rating);
                        if (a2 < 0.0f || a2 > 100.0f) {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        } else {
                            ratingCompat = new RatingCompat(6, a2);
                            break;
                        }
                        break;
                }
            }
            ratingCompat.c = rating;
        }
        hgVar.i(ratingCompat);
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        hi a = a();
        if (a == null) {
            return;
        }
        c(a);
        this.a.j();
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        hi a = a();
        if (a == null) {
            return;
        }
        c(a);
        this.a.k();
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        hi a = a();
        if (a == null) {
            return;
        }
        c(a);
        b(a);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        hi a = a();
        if (a == null) {
            return;
        }
        c(a);
        this.a.l();
        b(a);
    }
}
