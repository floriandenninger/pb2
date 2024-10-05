package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mjb implements DialogInterface.OnKeyListener {
    final /* synthetic */ mjc a;

    public mjb(mjc mjcVar) {
        this.a = mjcVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Bundle bundle = this.a.m;
        if (bundle == null || i != bundle.getInt("KeyPress") || keyEvent.getAction() != 1) {
            return false;
        }
        Dialog dialog = this.a.d;
        if (dialog != null) {
            dialog.dismiss();
        }
        return true;
    }
}
