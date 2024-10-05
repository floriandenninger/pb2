package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kzb extends ll {
    final /* synthetic */ kzg a;
    private final int b;

    public kzb(kzg kzgVar, int i) {
        this.a = kzgVar;
        this.b = i;
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        int c = recyclerView.c(view);
        rect.setEmpty();
        if (c == 0) {
            rect.right = this.b;
            rect.bottom = this.a.w() ? this.b : 0;
            return;
        }
        if (c == 1) {
            if (this.a.w()) {
                rect.top = this.b;
                rect.right = this.b;
                return;
            } else {
                rect.left = this.b;
                rect.bottom = this.b;
                return;
            }
        }
        if (c != 2) {
            if (c != 3) {
                return;
            }
            rect.left = this.b;
            rect.top = this.b;
            return;
        }
        if (this.a.w()) {
            rect.bottom = this.b;
        } else {
            rect.top = this.b;
        }
        rect.left = this.b;
    }
}
