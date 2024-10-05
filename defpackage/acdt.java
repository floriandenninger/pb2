package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acdt extends wr {
    public acdt(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wr
    public final float a(DisplayMetrics displayMetrics) {
        return 200.0f / displayMetrics.densityDpi;
    }
}
