package defpackage;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acky implements abrt {
    final /* synthetic */ acle a;

    public acky(acle acleVar) {
        this.a = acleVar;
    }

    @Override // defpackage.abrt
    public final void a(long j) {
        abru abruVar = this.a.g;
        EGLContext eGLContext = abruVar == null ? null : abruVar.a;
        if (eGLContext == null || !abruVar.h()) {
            String valueOf = String.valueOf(eGLContext);
            this.a.g.h();
            String.valueOf(valueOf).length();
            return;
        }
        this.a.g.c().a(eGLContext);
        acle acleVar = this.a;
        abqv abqvVar = acleVar.h;
        int i = abqvVar != null ? abqvVar.b : 0;
        if (i == 0) {
            return;
        }
        int b = acleVar.g.b();
        int a = this.a.g.a();
        GLES20.glViewport(0, 0, b, a);
        this.a.j.b(i, b, a, b, a);
        this.a.g.d(j);
    }

    @Override // defpackage.abrt
    public final void b(boolean z) {
        abru abruVar = this.a.g;
        if (abruVar != null) {
            abruVar.f(z);
        }
    }

    @Override // defpackage.abrt
    public final void c(boolean z) {
        abse abseVar = this.a.m;
        if (abseVar != null) {
            abseVar.h(z);
        }
    }

    @Override // defpackage.abrt
    public final void d(Runnable runnable, Handler handler) {
        this.a.d.h(runnable, handler);
    }

    @Override // defpackage.abrt
    public final void e(Surface surface) {
        this.a.g.g(surface);
    }
}
