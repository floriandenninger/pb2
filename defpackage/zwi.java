package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class zwi extends ll {
    protected int a;

    public zwi(Context context) {
        this.a = context.getResources().getDimensionPixelSize(R.dimen.gallery_thumb_margin);
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        int i;
        ut utVar = (ut) view.getLayoutParams();
        wv wvVar = utVar.c;
        int i2 = wvVar.g;
        if (i2 == -1) {
            i2 = wvVar.c;
        }
        if (i2 != -1) {
            int i3 = ((GridLayoutManager) recyclerView.n).b;
            int i4 = utVar.a;
            int i5 = i3 - 1;
            int i6 = this.a;
            int i7 = (i5 * i6) / i3;
            if (i3 < 2) {
                i = 0;
            } else {
                if (i4 != 0) {
                    if (i4 == i5) {
                        i = 0;
                    } else {
                        i7 /= 2;
                        i = i7;
                    }
                    rect.set(i7, 0, i, i6);
                    return;
                }
                i = i7;
            }
            i7 = 0;
            rect.set(i7, 0, i, i6);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
