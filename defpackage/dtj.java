package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dtj extends wr {
    final /* synthetic */ dtk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtj(dtk dtkVar, Context context) {
        super(context);
        this.a = dtkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wr
    public final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wr
    public final int b(int i) {
        return Math.min(100, super.b(i));
    }

    @Override // defpackage.wr
    protected final void c(View view, wp wpVar) {
        dtk dtkVar = this.a;
        int[] c = dtkVar.c(dtkVar.b.n, view);
        int i = c[0];
        int i2 = c[1];
        int j = j(Math.max(Math.abs(i), Math.abs(i2)));
        if (j > 0) {
            wpVar.b(i, i2, j, this.j);
        }
    }
}
