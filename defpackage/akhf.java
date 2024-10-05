package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akhf extends ll {
    private final int a;

    public akhf(Context context) {
        this.a = context.getResources().getDimensionPixelSize(R.dimen.share_target_container_padding);
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        rect.top = this.a;
        if (recyclerView.c(view) == wsVar.a() - 1) {
            rect.bottom = this.a;
        }
    }
}
