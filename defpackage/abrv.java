package defpackage;

import android.graphics.Rect;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abrv implements abrp {
    public final abre a;
    public SurfaceHolder c;
    public int d;
    public int e;
    private final SurfaceView f;
    private EGLSurface g;
    public final Object b = new Object();
    private Set h = abrr.b;

    public abrv(SurfaceView surfaceView, abre abreVar) {
        this.f = surfaceView;
        this.a = abreVar;
        Rect surfaceFrame = surfaceView.getHolder().getSurfaceFrame();
        this.d = surfaceFrame == null ? 0 : surfaceFrame.width();
        this.e = surfaceFrame != null ? surfaceFrame.height() : 0;
    }

    private static boolean d(abqu abquVar) {
        return abquVar != null && abquVar.d;
    }

    public final void a(abqu abquVar) {
        EGLSurface eGLSurface;
        if (d(abquVar) && (eGLSurface = this.g) != null) {
            abquVar.f(eGLSurface);
            abquVar.d();
            this.g = null;
        }
        this.c = null;
    }

    public final void b(boolean z) {
        this.h = z ? EnumSet.of(abrq.a) : abrr.b;
    }

    @Override // defpackage.abrp
    public final void c(abqu abquVar) {
        synchronized (this.b) {
            a(abquVar);
        }
    }

    @Override // defpackage.abrp
    public final boolean e(boolean z, abrr abrrVar, abqu abquVar) {
        if (this.f.getVisibility() != 0) {
            return false;
        }
        synchronized (this.b) {
            if (!d(abquVar)) {
                return false;
            }
            SurfaceHolder surfaceHolder = this.c;
            if (surfaceHolder == null) {
                return false;
            }
            if (this.g == null) {
                this.g = abquVar.b(surfaceHolder.getSurface());
            }
            Surface surface = this.c.getSurface();
            if (surface != null && surface.isValid()) {
                abquVar.c(this.g);
                GLES20.glViewport(0, 0, this.d, this.e);
                abrrVar.qQ(z, this.d, this.e, this.h);
                if (!abquVar.g(this.g)) {
                    zga.l("WARNING: swapBuffers() failed");
                }
                return true;
            }
            c(abquVar);
            return false;
        }
    }
}
