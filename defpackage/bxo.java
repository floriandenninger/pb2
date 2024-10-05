package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bxo extends bxq {
    public int[] a;
    ez b;
    float c;
    ez d;
    float e;
    float f;
    float g;
    float h;
    float i;
    Paint.Cap j;
    Paint.Join k;
    float l;

    public bxo() {
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
    }

    @Override // defpackage.lp
    public final boolean f() {
        return this.d.c() || this.b.c();
    }

    @Override // defpackage.lp
    public final boolean g(int[] iArr) {
        return this.b.d(iArr) | this.d.d(iArr);
    }

    float getFillAlpha() {
        return this.f;
    }

    int getFillColor() {
        return this.d.b;
    }

    float getStrokeAlpha() {
        return this.e;
    }

    int getStrokeColor() {
        return this.b.b;
    }

    float getStrokeWidth() {
        return this.c;
    }

    float getTrimPathEnd() {
        return this.h;
    }

    float getTrimPathOffset() {
        return this.i;
    }

    float getTrimPathStart() {
        return this.g;
    }

    void setFillAlpha(float f) {
        this.f = f;
    }

    void setFillColor(int i) {
        this.d.b = i;
    }

    void setStrokeAlpha(float f) {
        this.e = f;
    }

    void setStrokeColor(int i) {
        this.b.b = i;
    }

    void setStrokeWidth(float f) {
        this.c = f;
    }

    void setTrimPathEnd(float f) {
        this.h = f;
    }

    void setTrimPathOffset(float f) {
        this.i = f;
    }

    void setTrimPathStart(float f) {
        this.g = f;
    }

    public bxo(bxo bxoVar) {
        super(bxoVar);
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
        int[] iArr = bxoVar.a;
        this.a = null;
        this.b = bxoVar.b;
        this.c = bxoVar.c;
        this.e = bxoVar.e;
        this.d = bxoVar.d;
        this.o = bxoVar.o;
        this.f = bxoVar.f;
        this.g = bxoVar.g;
        this.h = bxoVar.h;
        this.i = bxoVar.i;
        this.j = bxoVar.j;
        this.k = bxoVar.k;
        this.l = bxoVar.l;
    }
}
