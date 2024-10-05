package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.youtube.R;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oee {
    public final Drawable a;
    public final Drawable b;
    public final /* synthetic */ NextGenWatchLayout c;

    public oee(NextGenWatchLayout nextGenWatchLayout, Context context) {
        this.c = nextGenWatchLayout;
        Drawable a = aii.a(context, R.drawable.floaty_scrim);
        a.getClass();
        this.b = a;
        Drawable a2 = aii.a(context, R.drawable.floaty_bar_shadow);
        a2.getClass();
        this.a = a2;
    }

    public final void a(float f) {
        float exp = (float) (Math.exp(f * 25.0f) / Math.expm1(25.0d));
        this.b.setAlpha(exp <= 0.0f ? 0 : exp >= 1.0f ? PrivateKeyType.INVALID : (int) (exp * 255.0f));
    }
}
