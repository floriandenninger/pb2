package defpackage;

import android.app.ActivityManager;
import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.google.vr.ndk.base.GvrApi;
import com.google.vr.ndk.base.GvrSurfaceView;
import java.lang.reflect.InvocationTargetException;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axgm implements GLSurfaceView.Renderer {
    public GvrSurfaceView a;
    private final GvrApi b;

    public axgm(GvrApi gvrApi) {
        if (gvrApi == null) {
            throw new IllegalArgumentException("GvrApi must be supplied for proper scanline rendering");
        }
        this.b = gvrApi;
    }

    public final void a() {
        this.b.onPauseReprojectionThread();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Point renderReprojectionThread = this.b.renderReprojectionThread();
        if (renderReprojectionThread != null) {
            axgo.a(new axgl(this, renderReprojectionThread.x, renderReprojectionThread.y));
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.b.onSurfaceChangedReprojectionThread();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Thread.currentThread().setPriority(10);
        int myTid = Process.myTid();
        if (axfo.a()) {
            try {
                try {
                    ActivityManager.class.getMethod("setVrThread", Integer.TYPE).invoke(null, Integer.valueOf(myTid));
                } catch (IllegalAccessException | RuntimeException | InvocationTargetException e) {
                    String str = axfo.a;
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                    sb.append("Failed to invoke setVrThread: ");
                    sb.append(valueOf);
                    Log.e(str, sb.toString());
                }
            } catch (NoSuchMethodException | RuntimeException e2) {
                if ("NMR1".equals(Build.VERSION.CODENAME) || Build.VERSION.SDK_INT >= 25) {
                    String str2 = axfo.a;
                    String valueOf2 = String.valueOf(e2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                    sb2.append("Failed to acquire setVrThread method: ");
                    sb2.append(valueOf2);
                    Log.e(str2, sb2.toString());
                } else {
                    String str3 = axfo.a;
                    String valueOf3 = String.valueOf(e2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 38);
                    sb3.append("Failed to acquire setVrThread method: ");
                    sb3.append(valueOf3);
                    Log.w(str3, sb3.toString());
                }
            }
        }
        this.b.onSurfaceCreatedReprojectionThread();
    }
}
