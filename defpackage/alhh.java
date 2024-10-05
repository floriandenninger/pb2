package defpackage;

import android.graphics.Matrix;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alhh extends ales {
    final /* synthetic */ alhp a;

    public alhh(alhp alhpVar) {
        this.a = alhpVar;
    }

    @Override // defpackage.ales
    /* renamed from: a */
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        this.a.u = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // defpackage.ales, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}
