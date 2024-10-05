package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxr {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final bxp d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final adz l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public bxr() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = PrivateKeyType.INVALID;
        this.j = null;
        this.k = null;
        this.l = new adz();
        this.d = new bxp();
        this.m = new Path();
        this.n = new Path();
    }

    public final void a(bxp bxpVar, Matrix matrix, Canvas canvas, int i, int i2) {
        bxpVar.a.set(matrix);
        bxpVar.a.preConcat(bxpVar.j);
        canvas.save();
        for (int i3 = 0; i3 < bxpVar.b.size(); i3++) {
            lp lpVar = (lp) bxpVar.b.get(i3);
            if (lpVar instanceof bxp) {
                a((bxp) lpVar, bxpVar.a, canvas, i, i2);
            } else if (lpVar instanceof bxq) {
                bxq bxqVar = (bxq) lpVar;
                float f = i / this.g;
                float f2 = i2 / this.h;
                float min = Math.min(f, f2);
                Matrix matrix2 = bxpVar.a;
                this.o.set(matrix2);
                this.o.postScale(f, f2);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                double hypot = Math.hypot(fArr[0], fArr[1]);
                double hypot2 = Math.hypot(fArr[2], fArr[3]);
                float f3 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) hypot, (float) hypot2);
                float abs = max > 0.0f ? Math.abs(f3) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.m;
                    path.reset();
                    fp[] fpVarArr = bxqVar.m;
                    if (fpVarArr != null) {
                        fp.a(fpVarArr, path);
                    }
                    Path path2 = this.m;
                    this.n.reset();
                    if (bxqVar.i()) {
                        this.n.setFillType(bxqVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        this.n.addPath(path2, this.o);
                        canvas.clipPath(this.n);
                    } else {
                        bxo bxoVar = (bxo) bxqVar;
                        float f4 = bxoVar.g;
                        if (f4 != 0.0f || bxoVar.h != 1.0f) {
                            float f5 = bxoVar.i;
                            float f6 = (f4 + f5) % 1.0f;
                            float f7 = (bxoVar.h + f5) % 1.0f;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(this.m, false);
                            float length = this.p.getLength();
                            float f8 = f6 * length;
                            float f9 = f7 * length;
                            path2.reset();
                            if (f8 > f9) {
                                this.p.getSegment(f8, length, path2, true);
                                this.p.getSegment(0.0f, f9, path2, true);
                            } else {
                                this.p.getSegment(f8, f9, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        this.n.addPath(path2, this.o);
                        if (bxoVar.d.e()) {
                            ez ezVar = bxoVar.d;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (ezVar.b()) {
                                Shader shader = ezVar.a;
                                shader.setLocalMatrix(this.o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(bxoVar.f * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(PrivateKeyType.INVALID);
                                paint2.setColor(bxu.a(ezVar.b, bxoVar.f));
                            }
                            paint2.setColorFilter(null);
                            this.n.setFillType(bxoVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(this.n, paint2);
                        }
                        if (bxoVar.b.e()) {
                            ez ezVar2 = bxoVar.b;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = bxoVar.k;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = bxoVar.j;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(bxoVar.l);
                            if (ezVar2.b()) {
                                Shader shader2 = ezVar2.a;
                                shader2.setLocalMatrix(this.o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(bxoVar.e * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(PrivateKeyType.INVALID);
                                paint4.setColor(bxu.a(ezVar2.b, bxoVar.e));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(bxoVar.c * abs * min);
                            canvas.drawPath(this.n, paint4);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public bxr(bxr bxrVar) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = PrivateKeyType.INVALID;
        this.j = null;
        this.k = null;
        adz adzVar = new adz();
        this.l = adzVar;
        this.d = new bxp(bxrVar.d, adzVar);
        this.m = new Path(bxrVar.m);
        this.n = new Path(bxrVar.n);
        this.e = bxrVar.e;
        this.f = bxrVar.f;
        this.g = bxrVar.g;
        this.h = bxrVar.h;
        int i = bxrVar.q;
        this.q = 0;
        this.i = bxrVar.i;
        this.j = bxrVar.j;
        String str = bxrVar.j;
        if (str != null) {
            adzVar.put(str, this);
        }
        this.k = bxrVar.k;
    }
}
