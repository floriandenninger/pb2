package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abru {
    public EGLContext a;
    private abqw b;
    private Surface c;
    private boolean d;

    private final void i() {
        abqw abqwVar = this.b;
        if (abqwVar != null) {
            abqwVar.b();
            this.b = null;
        }
    }

    public final synchronized int a() {
        abqw abqwVar = this.b;
        if (abqwVar == null) {
            return 0;
        }
        EGLSurface eGLSurface = abqwVar.a;
        if (eGLSurface == null) {
            return 0;
        }
        return abqwVar.b.a(eGLSurface, 12374);
    }

    public final synchronized int b() {
        abqw abqwVar = this.b;
        if (abqwVar == null) {
            return 0;
        }
        EGLSurface eGLSurface = abqwVar.a;
        if (eGLSurface == null) {
            return 0;
        }
        return abqwVar.b.a(eGLSurface, 12375);
    }

    public final synchronized abqw c() {
        return this.b;
    }

    public final synchronized void d(long j) {
        abqw abqwVar = this.b;
        if (abqwVar == null || abqwVar.c == null) {
            return;
        }
        abqu abquVar = abqwVar.b;
        EGLExt.eglPresentationTimeANDROID(abquVar.a, abqwVar.a, j);
        abqwVar.b.g(abqwVar.a);
    }

    public final synchronized void e() {
        i();
        this.c = null;
        this.a = null;
    }

    public final synchronized void f(boolean z) {
        this.d = z;
    }

    public final synchronized void g(Surface surface) {
        if (this.c != surface) {
            i();
            if (surface != null) {
                this.b = new abqw(surface);
            }
            this.c = surface;
        }
    }

    public final synchronized boolean h() {
        boolean z;
        Surface surface;
        abqw abqwVar = this.b;
        if (abqwVar != null && (surface = abqwVar.c) != null && surface.isValid()) {
            z = this.d;
        }
        return z;
    }
}
