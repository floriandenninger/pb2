package defpackage;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acmn implements abrt {
    final /* synthetic */ acmq a;

    public acmn(acmq acmqVar) {
        this.a = acmqVar;
    }

    @Override // defpackage.abrt
    public final void a(long j) {
        abru abruVar = this.a.c;
        EGLContext eGLContext = abruVar.a;
        if (eGLContext == null || !abruVar.h()) {
            String valueOf = String.valueOf(eGLContext);
            this.a.c.h();
            String.valueOf(valueOf).length();
            return;
        }
        this.a.c.c().a(eGLContext);
        acmq acmqVar = this.a;
        int i = acmqVar.d.b;
        if (i == 0) {
            return;
        }
        int b = acmqVar.c.b();
        int a = this.a.c.a();
        GLES20.glViewport(0, 0, b, a);
        this.a.f.b(i, b, a, b, a);
        this.a.c.d(j);
    }

    @Override // defpackage.abrt
    public final void b(boolean z) {
        abru abruVar = this.a.c;
        if (abruVar != null) {
            abruVar.f(z);
        }
    }

    @Override // defpackage.abrt
    public final void c(boolean z) {
        absp abspVar = this.a.p;
        if (abspVar != null) {
            abspVar.a(z);
        }
    }

    @Override // defpackage.abrt
    public final void d(Runnable runnable, Handler handler) {
        this.a.e.h(runnable, handler);
    }

    @Override // defpackage.abrt
    public final void e(Surface surface) {
        abru abruVar = this.a.c;
        if (abruVar != null) {
            abruVar.g(surface);
        }
    }
}
