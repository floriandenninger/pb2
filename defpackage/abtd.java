package defpackage;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abtd implements abrt {
    final /* synthetic */ abtk a;

    public abtd(abtk abtkVar) {
        this.a = abtkVar;
    }

    @Override // defpackage.abrt
    public final void a(long j) {
        abru abruVar = this.a.u;
        EGLContext eGLContext = abruVar.a;
        if (eGLContext == null || !abruVar.h()) {
            String valueOf = String.valueOf(eGLContext);
            this.a.u.h();
            String.valueOf(valueOf).length();
            return;
        }
        this.a.u.c().a(eGLContext);
        abtk abtkVar = this.a;
        int i = abtkVar.v.b;
        if (i == 0) {
            return;
        }
        int b = abtkVar.u.b();
        int a = this.a.u.a();
        GLES20.glViewport(0, 0, b, a);
        this.a.t.b(i, b, a, b, a);
        this.a.u.d(j);
    }

    @Override // defpackage.abrt
    public final void b(boolean z) {
        abru abruVar = this.a.u;
        if (abruVar != null) {
            abruVar.f(z);
        }
    }

    @Override // defpackage.abrt
    public final void c(boolean z) {
        absp abspVar = this.a.g;
        if (abspVar != null) {
            abspVar.a(z);
        }
    }

    @Override // defpackage.abrt
    public final void d(Runnable runnable, Handler handler) {
        this.a.f.h(runnable, handler);
    }

    @Override // defpackage.abrt
    public final void e(Surface surface) {
        abru abruVar = this.a.u;
        if (abruVar != null) {
            abruVar.g(surface);
        }
    }
}
