package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxk implements TypeEvaluator {
    private fp[] a;

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        fp[] fpVarArr = (fp[]) obj;
        fp[] fpVarArr2 = (fp[]) obj2;
        if (!gl.l(fpVarArr, fpVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!gl.l(this.a, fpVarArr)) {
            this.a = gl.n(fpVarArr);
        }
        for (int i = 0; i < fpVarArr.length; i++) {
            fp fpVar = this.a[i];
            fp fpVar2 = fpVarArr[i];
            fp fpVar3 = fpVarArr2[i];
            fpVar.a = fpVar2.a;
            int i2 = 0;
            while (true) {
                float[] fArr = fpVar2.b;
                if (i2 < fArr.length) {
                    fpVar.b[i2] = (fArr[i2] * (1.0f - f)) + (fpVar3.b[i2] * f);
                    i2++;
                }
            }
        }
        return this.a;
    }
}
