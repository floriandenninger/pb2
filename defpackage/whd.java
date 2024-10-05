package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class whd implements View.OnClickListener {
    final /* synthetic */ wia a;
    final /* synthetic */ whg b;

    public whd(whg whgVar, wia wiaVar) {
        this.b = whgVar;
        this.a = wiaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aata aataVar = this.b.b;
        if (aataVar != null) {
            this.a.a(aataVar);
        }
    }
}
