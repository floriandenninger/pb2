package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ikk extends aahi {
    public ikk(aahd aahdVar, apxf apxfVar, boolean z) {
        super(aahdVar, null, apxfVar, z);
    }

    @Override // defpackage.aahi, defpackage.zbr, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
    }
}
