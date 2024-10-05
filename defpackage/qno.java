package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qno extends bv {
    public Dialog ae;
    public DialogInterface.OnCancelListener af;
    private Dialog ag;

    @Override // defpackage.bv, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.af;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog dialog = this.ae;
        if (dialog != null) {
            return dialog;
        }
        this.c = false;
        if (this.ag == null) {
            Context qR = qR();
            qip.an(qR);
            this.ag = new AlertDialog.Builder(qR).create();
        }
        return this.ag;
    }
}
