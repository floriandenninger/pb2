package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import defpackage.bgp;
import defpackage.pse;
import defpackage.psl;
import defpackage.pts;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DummySurface extends Surface {
    private static int b;
    private static boolean c;
    public final boolean a;
    private final bgp d;
    private boolean e;

    public DummySurface(bgp bgpVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = bgpVar;
        this.a = z;
    }

    public static DummySurface a(Context context, boolean z) {
        boolean z2 = false;
        pse.g(!z || b(context));
        bgp bgpVar = new bgp();
        int i = z ? b : 0;
        bgpVar.start();
        bgpVar.b = new Handler(bgpVar.getLooper(), bgpVar);
        bgpVar.a = new psl(bgpVar.b);
        synchronized (bgpVar) {
            bgpVar.b.obtainMessage(1, i, 0).sendToTarget();
            while (bgpVar.e == null && bgpVar.d == null && bgpVar.c == null) {
                try {
                    bgpVar.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = bgpVar.d;
        if (runtimeException == null) {
            Error error = bgpVar.c;
            if (error == null) {
                DummySurface dummySurface = bgpVar.e;
                pse.c(dummySurface);
                return dummySurface;
            }
            throw error;
        }
        throw runtimeException;
    }

    public static synchronized boolean b(Context context) {
        int i;
        String eglQueryString;
        synchronized (DummySurface.class) {
            if (!c) {
                int i2 = 2;
                if (pts.a >= 24 && ((pts.a >= 26 || (!"samsung".equals(pts.c) && !"XT1650".equals(pts.d))) && ((pts.a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i2 = 1;
                    }
                    b = i2;
                    c = true;
                }
                i2 = 0;
                b = i2;
                c = true;
            }
            i = b;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.d) {
            if (!this.e) {
                bgp bgpVar = this.d;
                pse.c(bgpVar.b);
                bgpVar.b.sendEmptyMessage(2);
                this.e = true;
            }
        }
    }
}
