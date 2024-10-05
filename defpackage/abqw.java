package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abqw {
    public EGLSurface a;
    public abqu b;
    public Surface c;
    private EGLContext d;

    public abqw(Surface surface) {
        this.c = surface;
    }

    public final void a(EGLContext eGLContext) {
        amkq.E(this.b == null || this.d.equals(eGLContext));
        try {
            if (this.b == null) {
                this.d = eGLContext;
                abqu abquVar = new abqu(eGLContext, 1);
                this.b = abquVar;
                this.a = abquVar.b(this.c);
            }
            this.b.c(this.a);
        } catch (abqz e) {
            zga.b("EncoderInputSurface: makeCurrent failed: releasing EGLContext");
            b();
            throw e;
        }
    }

    public final void b() {
        abqu abquVar = this.b;
        if (abquVar != null) {
            abquVar.f(this.a);
            this.b.e();
            this.b = null;
        }
        this.a = null;
        this.c = null;
    }
}
