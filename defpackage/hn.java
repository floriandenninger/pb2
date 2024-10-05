package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hn {
    static int a;
    public final hh b;
    public final hd c;
    private final ArrayList d = new ArrayList();

    public hn(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (pendingIntent == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, true != aij.f() ? 0 : 33554432);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new hl(context, str);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.b = new hk(context, str);
        } else if (Build.VERSION.SDK_INT >= 22) {
            this.b = new hj(context, str);
        } else {
            this.b = new hi(context, str);
        }
        g(new hg(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.b.j(pendingIntent);
        this.c = new hd(context, this);
        if (a == 0) {
            a = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static Bundle a(Bundle bundle) {
        c(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void c(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(hn.class.getClassLoader());
        }
    }

    public final MediaSessionCompat$Token b() {
        return this.b.b();
    }

    public final void d() {
        this.b.f();
    }

    public final void e(boolean z) {
        this.b.g(z);
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    public final void f(hg hgVar) {
        g(hgVar, null);
    }

    public final void g(hg hgVar, Handler handler) {
        if (hgVar == null) {
            this.b.h(null, null);
            return;
        }
        hh hhVar = this.b;
        if (handler == null) {
            handler = new Handler();
        }
        hhVar.h(hgVar, handler);
    }

    public final void h(MediaMetadataCompat mediaMetadataCompat) {
        this.b.k(mediaMetadataCompat);
    }

    public final void i(PlaybackStateCompat playbackStateCompat) {
        this.b.l(playbackStateCompat);
    }

    public final void j(PendingIntent pendingIntent) {
        this.b.o(pendingIntent);
    }

    public final boolean k() {
        return this.b.p();
    }

    public final void l() {
        this.b.r();
    }
}
