package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xxy implements DialogInterface.OnClickListener {
    final /* synthetic */ Dialog a;

    public xxy(Dialog dialog) {
        this.a = dialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.a.cancel();
    }
}
