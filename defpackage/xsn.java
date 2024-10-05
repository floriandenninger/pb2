package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xsn extends ll {
    private final int a;

    public xsn(Context context) {
        this.a = context.getResources().getDimensionPixelSize(R.dimen.image_gallery_thumbnail_margin);
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        if (recyclerView.c(view) != -1) {
            int i = ((GridLayoutManager) recyclerView.n).b;
            int i2 = ((ut) view.getLayoutParams()).a;
            int i3 = this.a;
            int i4 = i3 / 2;
            int i5 = i2 == 0 ? 0 : i4;
            int i6 = i2 == i + (-1) ? 0 : i4;
            if (i5 != 0) {
                if (i6 == 0) {
                    i6 = 0;
                }
                ((xue) view).e = i4;
                rect.set(i5, 0, i6, i3);
            }
            i4 = 0;
            ((xue) view).e = i4;
            rect.set(i5, 0, i6, i3);
        }
    }
}
