package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vp extends wr {
    final /* synthetic */ vq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(vq vqVar, Context context) {
        super(context);
        this.a = vqVar;
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
        vq vqVar = this.a;
        int[] c = vqVar.c(vqVar.a.n, view);
        int i = c[0];
        int i2 = c[1];
        int j = j(Math.max(Math.abs(i), Math.abs(i2)));
        if (j > 0) {
            wpVar.b(i, i2, j, this.j);
        }
    }
}
