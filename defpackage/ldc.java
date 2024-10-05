package defpackage;

import android.text.TextPaint;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldc extends acrl {
    final /* synthetic */ ldd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldc(ldd lddVar, aahd aahdVar, apxf apxfVar, String str) {
        super(aahdVar, apxfVar, str);
        this.a = lddVar;
    }

    @Override // defpackage.aahi, defpackage.zbr, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(wbs.Q(this.a.a, R.attr.ytCallToAction));
    }
}
