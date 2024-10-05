package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahhz extends ahjw {
    private final ahky a;
    private final ahku b;
    private final ahku c;
    private final azrw d;
    private final ahkv e;
    private final float[] f;
    private final int g;
    private float h;
    private ahla i;
    private float j;

    public ahhz(ahku ahkuVar, ahku ahkuVar2, ahky ahkyVar, int i, ahkv ahkvVar, azrw azrwVar, ahla ahlaVar) {
        this.b = ahkuVar;
        this.c = ahkuVar2;
        ahkyVar.getClass();
        this.a = ahkyVar;
        this.d = azrwVar;
        this.g = i;
        this.e = ahkvVar;
        this.f = new float[16];
        this.h = 1.0f;
        this.i = ahlaVar;
    }

    @Override // defpackage.ahjw
    public final void a(ahla ahlaVar) {
        this.i = ahlaVar;
    }

    @Override // defpackage.ahjw
    public final void b() {
    }

    @Override // defpackage.ahjw
    public final void c(float f) {
        this.h = 1.0f - f;
    }

    @Override // defpackage.ahim
    public final void i() {
        this.b.b();
        ahku ahkuVar = this.c;
        if (ahkuVar != this.b) {
            ahkuVar.b();
        }
    }

    @Override // defpackage.ahjw, defpackage.ahim
    public final void l(float f, float f2, float f3) {
        this.e.f(f, f2, f3);
    }

    @Override // defpackage.ahjw, defpackage.ahim
    public final void q(ahjq ahjqVar) {
        if (this.i.a() && !this.i.b()) {
            this.j = (float) Math.random();
        }
        this.a.h();
    }

    @Override // defpackage.ahim
    public final void qC(ahko ahkoVar) {
        Object obj = this.d.get();
        ahnt ahntVar = (ahnt) obj;
        ahntVar.j();
        int i = this.g;
        if (i != 1) {
            if (i != 2) {
                ahoa ahoaVar = (ahoa) obj;
                GLES20.glUniform2f(ahoaVar.e, 1.0f, 1.0f);
                GLES20.glUniform2f(ahoaVar.f, 0.0f, 0.0f);
            } else if (ahkoVar.a() != 0 && ahkoVar.a() != 1) {
                ahoa ahoaVar2 = (ahoa) obj;
                GLES20.glUniform2f(ahoaVar2.e, 0.5f, 1.0f);
                GLES20.glUniform2f(ahoaVar2.f, 0.5f, 0.0f);
            } else {
                ahoa ahoaVar3 = (ahoa) obj;
                GLES20.glUniform2f(ahoaVar3.e, 0.5f, 1.0f);
                GLES20.glUniform2f(ahoaVar3.f, 0.0f, 0.0f);
            }
        } else if (ahkoVar.a() != 0 && ahkoVar.a() != 1) {
            ahoa ahoaVar4 = (ahoa) obj;
            GLES20.glUniform2f(ahoaVar4.e, 1.0f, 0.5f);
            GLES20.glUniform2f(ahoaVar4.f, 0.0f, 0.0f);
        } else {
            ahoa ahoaVar5 = (ahoa) obj;
            GLES20.glUniform2f(ahoaVar5.e, 1.0f, 0.5f);
            GLES20.glUniform2f(ahoaVar5.f, 0.0f, 0.5f);
        }
        ahno ahnoVar = (ahno) obj;
        ahnoVar.d();
        ahoa ahoaVar6 = (ahoa) obj;
        GLES20.glUniformMatrix4fv(ahoaVar6.g, 1, false, this.a.i(), 0);
        this.a.f();
        ahoaVar6.b.e(this.a);
        float f = this.j;
        ahla ahlaVar = this.i;
        ahoaVar6.d.b(f, ahlaVar.a, ahlaVar.b);
        Matrix.multiplyMM(this.f, 0, ahkoVar.c, 0, this.e.a, 0);
        GLES20.glUniform1f(((ahob) obj).i, this.h);
        GLES20.glUniform1f(ahnoVar.a, 1.0f);
        ahnoVar.l(this.f);
        ahntVar.h();
        if (ahkoVar.a() == 2) {
            ahnoVar.c(this.c);
        } else {
            ahnoVar.c(this.b);
        }
        ahnoVar.k();
        Boolean bool = ahkt.a;
    }

    @Override // defpackage.ahjw, defpackage.ahim
    public final void qD(boolean z, ahjq ahjqVar) {
    }

    @Override // defpackage.ahjw, defpackage.ahim
    public final boolean r(ahjq ahjqVar) {
        return false;
    }
}
