package defpackage;

import android.opengl.Matrix;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahkv {
    public float[] a;
    public float[] b;
    public float[] c;
    public float[] d;
    private float[] f;
    private float[] g;
    private ahkv h;
    private boolean j = true;
    private final List i = new LinkedList();
    private final float[] e = new float[16];

    private ahkv() {
    }

    public static ahkv b() {
        ahkv ahkvVar = new ahkv();
        ahkvVar.a = new float[16];
        ahkvVar.f = new float[16];
        float[] fArr = new float[16];
        ahkvVar.b = fArr;
        ahkvVar.c = new float[16];
        ahkvVar.d = new float[16];
        ahkvVar.g = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(ahkvVar.a, 0);
        Matrix.setIdentityM(ahkvVar.f, 0);
        Matrix.setIdentityM(ahkvVar.c, 0);
        Matrix.setIdentityM(ahkvVar.d, 0);
        Matrix.setIdentityM(ahkvVar.g, 0);
        return ahkvVar;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ahkv clone() {
        ahkv ahkvVar = new ahkv();
        ahkvVar.a = (float[]) this.a.clone();
        ahkvVar.f = (float[]) this.f.clone();
        ahkvVar.b = (float[]) this.b.clone();
        ahkvVar.c = (float[]) this.c.clone();
        ahkvVar.d = (float[]) this.d.clone();
        ahkvVar.g = (float[]) this.g.clone();
        ahkvVar.d(this.h);
        ahkvVar.j = this.j;
        return ahkvVar;
    }

    public final void c() {
        Matrix.setIdentityM(this.f, 0);
        g();
    }

    public final void d(ahkv ahkvVar) {
        if (ahkvVar == null) {
            return;
        }
        this.h = ahkvVar;
        ahkvVar.i.add(this);
        g();
    }

    public final void e(boolean z) {
        this.j = z;
        g();
    }

    public final void f(float f, float f2, float f3) {
        Matrix.translateM(this.b, 0, f, f2, f3);
        h();
        g();
    }

    public final void g() {
        Matrix.multiplyMM(this.e, 0, this.f, 0, this.g, 0);
        Matrix.multiplyMM(this.a, 0, this.e, 0, this.d, 0);
        ahkv ahkvVar = this.h;
        if (ahkvVar != null && this.j) {
            Matrix.multiplyMM(this.e, 0, ahkvVar.a, 0, this.a, 0);
            System.arraycopy(this.e, 0, this.a, 0, 16);
        }
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((ahkv) it.next()).g();
        }
    }

    public final void h() {
        Matrix.multiplyMM(this.g, 0, this.b, 0, this.c, 0);
        g();
    }

    public final void i(float f, float f2, float f3) {
        Matrix.rotateM(this.f, 0, f, f2, f3, 0.0f);
        g();
    }

    public final void j(float f) {
        Matrix.setIdentityM(this.f, 0);
        Matrix.rotateM(this.f, 0, f, 0.0f, 1.0f, 0.0f);
        g();
    }
}
