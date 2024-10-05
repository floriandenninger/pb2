package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rv extends rc {
    final /* synthetic */ sb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(sb sbVar, Context context, rm rmVar, View view) {
        super(context, rmVar, view, false);
        this.d = sbVar;
        if (!rmVar.k.o()) {
            View view2 = sbVar.g;
            this.a = view2 == null ? (View) sbVar.f : view2;
        }
        e(sbVar.n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rc
    public final void c() {
        this.d.l = null;
        super.c();
    }
}
