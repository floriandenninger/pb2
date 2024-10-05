package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alhj implements TypeEvaluator {
    final FloatEvaluator a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.a.evaluate(f, (Number) obj, (Number) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
