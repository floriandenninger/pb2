package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ahin extends ahjw {
    private static final float[] c = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    protected final ahky a;
    protected ahla b;
    private final ahkx d;
    private float e;

    public ahin(ahky ahkyVar, ahla ahlaVar) {
        ahkyVar.getClass();
        this.a = ahkyVar;
        this.b = ahlaVar;
        this.d = new ahkx(c, 3);
    }

    @Override // defpackage.ahjw
    public final void a(ahla ahlaVar) {
        this.b = ahlaVar;
    }

    @Override // defpackage.ahjw
    public final void b() {
    }

    protected abstract ahny g();

    @Override // defpackage.ahim
    public final void i() {
        this.d.b();
    }

    @Override // defpackage.ahjw, defpackage.ahim
    public final void q(ahjq ahjqVar) {
        if (this.b.a() && !this.b.b()) {
            this.e = (float) Math.random();
        }
        this.a.h();
    }

    @Override // defpackage.ahim
    public final void qC(ahko ahkoVar) {
        ahny g = g();
        if (g.c == 0) {
            zga.b("Error drawing! Program not created.");
            return;
        }
        this.a.f();
        g.j();
        g.d(this.a);
        float f = this.e;
        ahla ahlaVar = this.b;
        g.b.b(f, ahlaVar.a, ahlaVar.b);
        g.c();
        this.d.a(g.a);
        g.h();
        GLES20.glDrawArrays(5, 0, 4);
        Boolean bool = ahkt.a;
        GLES20.glDisableVertexAttribArray(g.a);
    }
}
