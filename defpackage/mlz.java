package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.DisplayMetrics;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mlz extends mly {
    public mlz(Context context, LinearLayoutManager linearLayoutManager) {
        super(context, linearLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wr
    public final float a(DisplayMetrics displayMetrics) {
        return 50.0f / displayMetrics.densityDpi;
    }
}
