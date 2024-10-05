package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.images.WebImage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qju implements qjd {
    public final Context a;
    public final CastOptions b;
    public final qjm c;
    public final qjm d;
    public qjk e;
    public CastDevice f;
    public hn g;
    public hg h;
    public boolean i;
    public final qhk j;
    private final ComponentName k;
    private final Handler l;
    private final Runnable m;

    static {
        new qkw("MediaSessionManager");
    }

    public qju(Context context, CastOptions castOptions, qhk qhkVar) {
        this.a = context;
        this.b = castOptions;
        this.j = qhkVar;
        CastMediaOptions castMediaOptions = castOptions.e;
        if (castMediaOptions != null && !TextUtils.isEmpty(castMediaOptions.b)) {
            this.k = new ComponentName(context, castOptions.e.b);
        } else {
            this.k = null;
        }
        qjm qjmVar = new qjm(context);
        this.c = qjmVar;
        qjmVar.d = new qjs(this, 1);
        qjm qjmVar2 = new qjm(context);
        this.d = qjmVar2;
        qjmVar2.d = new qjs(this, 0);
        this.l = new amcc(Looper.getMainLooper(), (byte[]) null);
        this.m = new Runnable() { // from class: qjr
            @Override // java.lang.Runnable
            public final void run() {
                qju.this.i(false);
            }
        };
    }

    public static Bitmap g(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = width;
        int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
        float f2 = (i - height) / 2;
        RectF rectF = new RectF(0.0f, f2, f, height + f2);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, i, config);
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return createBitmap;
    }

    private final Uri n(MediaMetadata mediaMetadata) {
        WebImage webImage;
        if (this.b.e.a() != null) {
            this.b.e.a();
            webImage = qip.j(mediaMetadata);
        } else {
            webImage = mediaMetadata.c() ? (WebImage) mediaMetadata.a.get(0) : null;
        }
        if (webImage == null) {
            return null;
        }
        return webImage.b;
    }

    @Override // defpackage.qjd
    public final void a() {
        m();
    }

    @Override // defpackage.qjd
    public final void b() {
        m();
    }

    @Override // defpackage.qjd
    public final void c() {
        m();
    }

    @Override // defpackage.qjd
    public final void d() {
        m();
    }

    @Override // defpackage.qjd
    public final void e() {
    }

    @Override // defpackage.qjd
    public final void f() {
        m();
    }

    public final void h(Bitmap bitmap, int i) {
        hn hnVar = this.g;
        if (hnVar == null) {
            return;
        }
        if (i != 0) {
            if (i == 3) {
                anyx o = o();
                o.p("android.media.metadata.ALBUM_ART", bitmap);
                hnVar.h(o.o());
                return;
            }
            return;
        }
        if (bitmap != null) {
            anyx o2 = o();
            o2.p("android.media.metadata.DISPLAY_ICON", bitmap);
            hnVar.h(o2.o());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            hn hnVar2 = this.g;
            anyx o3 = o();
            o3.p("android.media.metadata.DISPLAY_ICON", createBitmap);
            hnVar2.h(o3.o());
        }
    }

    public final void i(boolean z) {
        if (this.b.f) {
            this.l.removeCallbacks(this.m);
            Intent intent = new Intent(this.a, (Class<?>) qgu.class);
            intent.setPackage(this.a.getPackageName());
            try {
                this.a.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.l.postDelayed(this.m, 1000L);
                }
            }
        }
    }

    public final void j() {
        if (this.b.e.c != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (qij.b != null) {
                    qij.b.run();
                }
            } else {
                Intent intent = new Intent(this.a, (Class<?>) qij.class);
                intent.setPackage(this.a.getPackageName());
                intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
                this.a.stopService(intent);
            }
        }
    }

    public final void k() {
        if (this.b.f) {
            this.l.removeCallbacks(this.m);
            Intent intent = new Intent(this.a, (Class<?>) qgu.class);
            intent.setPackage(this.a.getPackageName());
            this.a.stopService(intent);
        }
    }

    public final void l(int i, MediaInfo mediaInfo) {
        PendingIntent a;
        hn hnVar = this.g;
        if (hnVar == null) {
            return;
        }
        if (i == 0) {
            hq hqVar = new hq();
            hqVar.c(0, 0L, 1.0f);
            hnVar.i(hqVar.a());
            this.g.h(new anyx((byte[]) null).o());
            return;
        }
        long j = true != this.e.o() ? 768L : 512L;
        long c = this.e.o() ? 0L : this.e.c();
        hn hnVar2 = this.g;
        hq hqVar2 = new hq();
        hqVar2.c(i, c, 1.0f);
        hqVar2.b = j;
        hnVar2.i(hqVar2.a());
        hn hnVar3 = this.g;
        if (this.k == null) {
            a = null;
        } else {
            Intent intent = new Intent();
            intent.setComponent(this.k);
            a = rai.a(this.a, 0, intent, rai.a | 134217728);
        }
        hnVar3.j(a);
        if (this.g == null) {
            return;
        }
        MediaMetadata mediaMetadata = mediaInfo.d;
        long j2 = this.e.o() ? 0L : mediaInfo.e;
        anyx o = o();
        o.r("android.media.metadata.TITLE", mediaMetadata.a("com.google.android.gms.cast.metadata.TITLE"));
        o.r("android.media.metadata.DISPLAY_TITLE", mediaMetadata.a("com.google.android.gms.cast.metadata.TITLE"));
        o.r("android.media.metadata.DISPLAY_SUBTITLE", mediaMetadata.a("com.google.android.gms.cast.metadata.SUBTITLE"));
        o.q("android.media.metadata.DURATION", j2);
        this.g.h(o.o());
        Uri n = n(mediaMetadata);
        if (n != null) {
            this.c.b(n);
        } else {
            h(null, 0);
        }
        Uri n2 = n(mediaMetadata);
        if (n2 != null) {
            this.d.b(n2);
        } else {
            h(null, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00eb, code lost:
    
        if (r2.intValue() < (r4.q.size() - 1)) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qju.m():void");
    }

    private final anyx o() {
        hn hnVar = this.g;
        MediaMetadataCompat a = hnVar == null ? null : hnVar.c.a();
        if (a == null) {
            return new anyx((byte[]) null);
        }
        return new anyx(a);
    }
}
