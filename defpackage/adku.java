package defpackage;

import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adku extends bv {
    public static adku aF(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("status_code", i);
        bundle.putString("device_name", str);
        adku adkuVar = new adku();
        adkuVar.af(bundle);
        return adkuVar;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog == null) {
            return;
        }
        Button button = (Button) dialog.findViewById(R.id.button1);
        button.setTextColor(wbs.W(C(), com.google.android.youtube.R.attr.ytCallToAction).orElse(button.getTextColors().getDefaultColor()));
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        String str;
        int i;
        String O;
        String P;
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            i = bundle2.getInt("status_code");
            str = bundle2.getString("device_name");
        } else {
            str = "";
            i = 0;
        }
        amsx amsxVar = acxe.a;
        Integer valueOf = Integer.valueOf(i);
        if (amsxVar.contains(valueOf)) {
            O = O(com.google.android.youtube.R.string.cast_auth_error_message_title);
            P = P(com.google.android.youtube.R.string.cast_auth_error_message_desc, str);
        } else if (i == 401) {
            O = O(com.google.android.youtube.R.string.dial_connect_error_header_needs_permission);
            P = O(com.google.android.youtube.R.string.dial_connect_error_message_needs_permission);
        } else if (i == 404) {
            O = O(com.google.android.youtube.R.string.dial_connect_error_header_ytb_not_installed);
            P = O(com.google.android.youtube.R.string.dial_connect_error_message_ytb_not_installed);
        } else {
            O = O(com.google.android.youtube.R.string.dial_connect_error_header_generic);
            P = P(com.google.android.youtube.R.string.dial_connect_error_message_generic, valueOf);
        }
        return new AlertDialog.Builder(C()).setTitle(O).setMessage(P).setPositiveButton(com.google.android.youtube.R.string.dial_connect_error_dialog_close, hgs.i).setCancelable(false).create();
    }
}
