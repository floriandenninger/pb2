package defpackage;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahii implements Runnable {
    final /* synthetic */ ahij a;

    public ahii(ahij ahijVar) {
        this.a = ahijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        if (this.a.c != null && !egl10.eglGetCurrentContext().equals(EGL10.EGL_NO_CONTEXT)) {
            try {
                this.a.c.updateTexImage();
                ahij ahijVar = this.a;
                ahijVar.c.getTransformMatrix(ahijVar.b);
                ahij ahijVar2 = this.a;
                ahijVar2.e = ahijVar2.c.getTimestamp() / 1000;
                return;
            } catch (RuntimeException e) {
                zga.b(e.getMessage());
                return;
            }
        }
        this.a.d = true;
    }
}
