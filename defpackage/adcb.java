package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcb extends bv {
    public adct ae;

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        final int i = 1;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(C()).setTitle(R.string.mdx_audio_cast_partly_castable_dialog_title).setMessage(R.string.mdx_audio_cast_partly_castable_dialog_message).setNegativeButton(R.string.mdx_audio_cast_partly_castable_dialog_negative_button, new DialogInterface.OnClickListener(this) { // from class: adca
            public final /* synthetic */ adcb a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (i != 0) {
                    this.a.kv();
                    return;
                }
                adcb adcbVar = this.a;
                adcbVar.ae.a();
                adcbVar.dismiss();
            }
        });
        final int i2 = 0;
        return negativeButton.setPositiveButton(R.string.mdx_audio_cast_partly_castable_dialog_positive_button, new DialogInterface.OnClickListener(this) { // from class: adca
            public final /* synthetic */ adcb a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i22) {
                if (i2 != 0) {
                    this.a.kv();
                    return;
                }
                adcb adcbVar = this.a;
                adcbVar.ae.a();
                adcbVar.dismiss();
            }
        }).create();
    }
}
