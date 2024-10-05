package defpackage;

import android.text.TextPaint;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aahi extends zbr {
    private static aahh f;
    private static aahh g;
    private final aahd a;
    public final apxf c;
    private final Map d;
    private final boolean e;

    public aahi(aahd aahdVar, Map map, apxf apxfVar, boolean z) {
        this.a = aahdVar;
        this.d = map;
        this.c = apxfVar;
        this.e = z;
    }

    public static synchronized aahh a(boolean z) {
        synchronized (aahi.class) {
            if (z) {
                if (f == null) {
                    f = b(true);
                }
                return f;
            }
            if (g == null) {
                g = b(false);
            }
            return g;
        }
    }

    private static aahh b(boolean z) {
        return new aahh(z);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.a.c(this.c, this.d);
    }

    @Override // defpackage.zbr, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.e);
    }
}
