package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpf extends ll {
    final /* synthetic */ mpg a;

    public mpf(mpg mpgVar) {
        this.a = mpgVar;
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        if (view == this.a.a) {
            rect.set(0, 0, 0, -1);
        }
    }
}
