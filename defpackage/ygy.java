package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ygy {
    public final zaw a;
    private final Activity b;
    private AlertDialog c;

    public ygy(Activity activity, zaw zawVar) {
        activity.getClass();
        this.b = activity;
        zawVar.getClass();
        this.a = zawVar;
    }

    public final void a(CharSequence charSequence) {
        if (this.c == null) {
            this.c = new AlertDialog.Builder(this.b, R.style.Theme_YouTube_YpcDialog).setPositiveButton(R.string.commerce_dialog_ok, (DialogInterface.OnClickListener) null).create();
        }
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.b.getString(R.string.commerce_error_generic);
        }
        this.c.setMessage(charSequence);
        this.c.show();
    }
}
