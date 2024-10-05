package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajxf extends MetricAffectingSpan {
    private final float a;
    private final int b;

    public ajxf(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift = this.b;
        float f = this.a;
        if (f > 0.0f) {
            textPaint.setTextSize(f);
        }
    }
}
