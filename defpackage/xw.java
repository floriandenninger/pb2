package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xw extends wr {
    final /* synthetic */ wg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(wg wgVar, Context context) {
        super(context);
        this.a = wgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wr
    public final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.wr
    protected final void c(View view, wp wpVar) {
        wg wgVar = this.a;
        RecyclerView recyclerView = wgVar.a;
        if (recyclerView == null) {
            return;
        }
        int[] c = wgVar.c(recyclerView.n, view);
        int i = c[0];
        int i2 = c[1];
        int j = j(Math.max(Math.abs(i), Math.abs(i2)));
        if (j > 0) {
            wpVar.b(i, i2, j, this.j);
        }
    }
}
