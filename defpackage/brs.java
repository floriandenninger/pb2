package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class brs implements DialogInterface.OnClickListener {
    final /* synthetic */ brt a;

    public brs(brt brtVar) {
        this.a = brtVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        brt brtVar = this.a;
        brtVar.ae = i;
        ((bsd) brtVar).ai = -1;
        dialogInterface.dismiss();
    }
}
