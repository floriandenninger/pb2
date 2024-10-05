package defpackage;

import android.app.Dialog;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xxm extends Dialog {
    final /* synthetic */ xxp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxm(xxp xxpVar, Context context, int i) {
        super(context, i);
        this.a = xxpVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.a.aL();
    }
}
