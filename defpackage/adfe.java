package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfe extends bv {
    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        return new AlertDialog.Builder(C()).setMessage(R.string.mdx_sideloaded_dialog_error_message).setPositiveButton(R.string.mdx_sideloaded_dialog_confirm_button, new DialogInterface.OnClickListener() { // from class: adfd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                adfe.this.kv();
            }
        }).create();
    }
}
