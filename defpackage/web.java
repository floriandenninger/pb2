package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class web extends wdq {
    public wdt ae;

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ae.g();
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        return new AlertDialog.Builder(C()).setMessage(R.string.camera_permission_description).setPositiveButton(R.string.camera_permission_positive_button, new wea(this)).create();
    }
}
