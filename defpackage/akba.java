package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akba {
    public int a;
    public Drawable b;
    private final Context c;
    private int d;

    private akba(Context context) {
        this.c = context;
    }

    public static akba a(Context context) {
        akba akbaVar = new akba(context);
        akbaVar.a = TouchFeedbackDrawable.a(context.getResources(), context.getTheme());
        akbaVar.c(0);
        return akbaVar;
    }

    public final TouchFeedbackDrawable b() {
        return new TouchFeedbackDrawable(this.a, yjk.K(this.c.getResources().getDisplayMetrics(), 1), this.d, this.b, null);
    }

    public final void c(int i) {
        if (i != -1 && i != -2) {
            i = yjk.K(this.c.getResources().getDisplayMetrics(), i);
        }
        this.d = i;
    }
}
