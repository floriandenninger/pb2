package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lep implements View.OnClickListener {
    final /* synthetic */ leu a;

    public lep(leu leuVar) {
        this.a = leuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = false;
        if (this.a.d.pY(awbr.c) && ((Boolean) this.a.d.pX(awbr.c)).booleanValue()) {
            z = true;
        }
        leu leuVar = this.a;
        aong aongVar = (aong) leuVar.d.toBuilder();
        aongVar.e(awbr.c, Boolean.valueOf(!z));
        leuVar.d = (awcd) aongVar.build();
        this.a.b(true);
        this.a.c();
    }
}
