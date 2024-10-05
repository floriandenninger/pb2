package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcg extends bv {
    public adct ae;

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        final int i = 1;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(C()).setTitle(R.string.mdx_logged_out_watch_history_dialog_title).setMessage(R.string.mdx_logged_out_watch_history_dialog_message).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener(this) { // from class: adcf
            public final /* synthetic */ adcg a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (i != 0) {
                    this.a.kv();
                    return;
                }
                adcg adcgVar = this.a;
                adcgVar.ae.a();
                adcgVar.dismiss();
            }
        });
        final int i2 = 0;
        return negativeButton.setPositiveButton(R.string.mdx_logged_out_watch_history_dialog_confirm_button, new DialogInterface.OnClickListener(this) { // from class: adcf
            public final /* synthetic */ adcg a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i22) {
                if (i2 != 0) {
                    this.a.kv();
                    return;
                }
                adcg adcgVar = this.a;
                adcgVar.ae.a();
                adcgVar.dismiss();
            }
        }).create();
    }
}
