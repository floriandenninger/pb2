package defpackage;

import android.support.v4.widget.NestedScrollView;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lx implements ln {
    final /* synthetic */ View a;
    final /* synthetic */ View b;

    public lx(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // defpackage.ln
    public final void a(NestedScrollView nestedScrollView, int i, int i2) {
        mg.a(nestedScrollView, this.a, this.b);
    }
}
