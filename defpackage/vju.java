package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vju extends ll {
    private final int a;
    private final int b;
    private final boolean c;

    public vju(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        int c = recyclerView.c(view);
        rect.set(0, 0, 0, 0);
        if (this.c) {
            if (c == 0) {
                return;
            } else {
                c--;
            }
        }
        float f = this.b;
        int round = Math.round((((-1.0f) + f) * this.a) / f);
        int round2 = Math.round(((c % r0) * this.a) / this.b);
        int i = round - round2;
        if (jw.e(recyclerView) == 1) {
            rect.right = round2;
            rect.left = i;
        } else {
            rect.left = round2;
            rect.right = i;
        }
        if (c >= this.b) {
            rect.top = this.a;
        }
    }
}
