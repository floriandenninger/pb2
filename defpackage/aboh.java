package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aboh extends ll {
    final /* synthetic */ View a;
    final /* synthetic */ aboi b;

    public aboh(aboi aboiVar, View view) {
        this.b = aboiVar;
        this.a = view;
    }

    @Override // defpackage.ll
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        abpf.h(1.0f, this.a);
        abpf.h(1.0f, this.b.b());
        abpf.h(1.0f, this.b.c());
    }
}
