package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxp extends lp {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public bxp() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }

    @Override // defpackage.lp
    public final boolean f() {
        for (int i = 0; i < this.b.size(); i++) {
            if (((lp) this.b.get(i)).f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lp
    public final boolean g(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.b.size(); i++) {
            z |= ((lp) this.b.get(i)).g(iArr);
        }
        return z;
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public final void i() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            i();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            i();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            i();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            i();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            i();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            i();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            i();
        }
    }

    public bxp(bxp bxpVar, adz adzVar) {
        bxq bxnVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = bxpVar.c;
        this.d = bxpVar.d;
        this.e = bxpVar.e;
        this.f = bxpVar.f;
        this.g = bxpVar.g;
        this.h = bxpVar.h;
        this.i = bxpVar.i;
        int[] iArr = bxpVar.l;
        this.l = null;
        String str = bxpVar.m;
        this.m = str;
        int i = bxpVar.k;
        this.k = 0;
        if (str != null) {
            adzVar.put(str, this);
        }
        matrix.set(bxpVar.j);
        ArrayList arrayList = bxpVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof bxp) {
                this.b.add(new bxp((bxp) obj, adzVar));
            } else {
                if (obj instanceof bxo) {
                    bxnVar = new bxo((bxo) obj);
                } else if (obj instanceof bxn) {
                    bxnVar = new bxn((bxn) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(bxnVar);
                Object obj2 = bxnVar.n;
                if (obj2 != null) {
                    adzVar.put(obj2, bxnVar);
                }
            }
        }
    }
}
