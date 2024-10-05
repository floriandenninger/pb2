package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aabe extends ll {
    final /* synthetic */ aabg a;

    public aabe(aabg aabgVar) {
        this.a = aabgVar;
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        if (recyclerView.c(view) > 0) {
            rect.top = this.a.b.getResources().getDimensionPixelSize(R.dimen.card_drawer_watch_next_spacing);
        }
    }
}
