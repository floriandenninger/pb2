package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class muc extends ll {
    final /* synthetic */ int a;
    final /* synthetic */ mud b;

    public muc(mud mudVar, int i) {
        this.b = mudVar;
        this.a = i;
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        super.d(rect, view, recyclerView, wsVar);
        if (jw.e(this.b.a) == 1) {
            rect.right = this.a;
        } else {
            rect.left = this.a;
        }
    }
}
