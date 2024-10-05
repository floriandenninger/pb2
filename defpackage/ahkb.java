package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahkb implements GLSurfaceView.Renderer {
    private static final float[] e = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    public ahkx a;
    public ahkn b;
    public volatile boolean c;
    public ahny d;
    private final Handler f;
    private final ahod g;

    public ahkb(ahod ahodVar, Handler handler) {
        this.f = handler;
        this.g = ahodVar;
    }

    private final void a(ahkr ahkrVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(ahkrVar.getMessage());
        sb.append("\n");
        for (StackTraceElement stackTraceElement : ahkrVar.getStackTrace()) {
            sb.append(stackTraceElement);
            sb.append("\n");
        }
        zga.b(sb.toString());
        this.f.obtainMessage(3, ahkrVar).sendToTarget();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16384);
        ahkn ahknVar = this.b;
        if (ahknVar != null) {
            ahknVar.f();
        }
        ahny ahnyVar = this.d;
        if (ahnyVar != null) {
            ahnyVar.d(this.b);
        }
        if (this.c) {
            GLES20.glDrawArrays(5, 0, 4);
        }
        try {
            ahkt.f();
        } catch (ahkr e2) {
            a(e2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            ahny ahnyVar = new ahny(this.g, true, false);
            this.d = ahnyVar;
            ahnyVar.j();
            this.d.c();
            ahkx ahkxVar = new ahkx(e, 3);
            this.a = ahkxVar;
            ahkxVar.a(this.d.a);
            this.b = new ahkn(this.f);
        } catch (ahkr e2) {
            a(e2);
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
