package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lne extends ClickableSpan {
    final /* synthetic */ lnf a;

    public lne(lnf lnfVar) {
        this.a = lnfVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.a();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
