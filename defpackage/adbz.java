package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbz extends bv {
    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        return new AlertDialog.Builder(C()).setTitle(R.string.mdx_audio_cast_not_castable_dialog_title).setMessage(R.string.mdx_audio_cast_not_castable_dialog_message).setNegativeButton(R.string.mdx_audio_cast_not_castable_dialog_negative_button, new DialogInterface.OnClickListener() { // from class: adby
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                adbz.this.kv();
            }
        }).setPositiveButton(R.string.mdx_audio_cast_not_castable_dialog_positive_button, new hgs(13)).create();
    }
}
