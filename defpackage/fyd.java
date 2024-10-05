package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fyd extends ll {
    private final int a;

    public fyd(int i) {
        this.a = i;
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        int c = recyclerView.c(view);
        int e = jw.e(recyclerView);
        if (c != 0) {
            if (e != 1) {
                rect.left += this.a;
            } else {
                rect.right += this.a;
            }
        }
        Object tag = view.getTag(R.id.offset_adjuster_tag);
        if (tag instanceof fyc) {
            ((fyc) tag).a(rect);
        }
    }
}
