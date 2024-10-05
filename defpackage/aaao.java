package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaao extends ll {
    final /* synthetic */ Context a;

    public aaao(Context context) {
        this.a = context;
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        if (recyclerView.c(view) > 0) {
            rect.top = this.a.getResources().getDimensionPixelSize(R.dimen.card_drawer_fs_spacing);
        }
    }
}
