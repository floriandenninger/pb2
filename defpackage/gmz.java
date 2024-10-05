package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gmz extends wr {
    public int a;

    public gmz(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wr
    public final float a(DisplayMetrics displayMetrics) {
        return 250.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.wr
    public final int i(View view, int i) {
        return super.i(view, i) + this.a;
    }

    @Override // defpackage.wr
    protected final int l() {
        return -1;
    }
}
