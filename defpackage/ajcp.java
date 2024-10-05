package defpackage;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajcp extends CharacterStyle {
    public static final /* synthetic */ int a = 0;
    private static final int b = Color.argb(137, 0, 0, 0);
    private static final int c = Color.argb(179, PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID);

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int color = textPaint.getColor() | (-16777216);
        if (color == -16777216) {
            textPaint.setColor(b);
        } else if (color == -1) {
            textPaint.setColor(c);
        }
    }
}
