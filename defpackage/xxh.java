package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xxh implements DialogInterface.OnClickListener {
    final /* synthetic */ Dialog a;
    final /* synthetic */ xxp b;

    public xxh(xxp xxpVar, Dialog dialog) {
        this.b = xxpVar;
        this.a = dialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.ak.I(3, new acqx(acsb.c(47866)), null);
        dialogInterface.dismiss();
        this.a.cancel();
    }
}
