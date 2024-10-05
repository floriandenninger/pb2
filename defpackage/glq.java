package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class glq {
    public final Activity a;
    public final abav b;
    public final zaw c;
    public final ypa d;
    public final aahd e;
    public final aaea f;
    public final aaxn g;

    public glq(Activity activity, abav abavVar, zaw zawVar, ypa ypaVar, aahd aahdVar, aaxn aaxnVar, aaea aaeaVar, byte[] bArr, byte[] bArr2) {
        this.a = activity;
        abavVar.getClass();
        this.b = abavVar;
        zawVar.getClass();
        this.c = zawVar;
        ypaVar.getClass();
        this.d = ypaVar;
        aahdVar.getClass();
        this.e = aahdVar;
        aaxnVar.getClass();
        this.g = aaxnVar;
        this.f = aaeaVar;
    }

    public final AlertDialog a(final String str) {
        return new AlertDialog.Builder(this.a).setMessage(this.a.getString(R.string.delete_generic_playlist_confirmation)).setPositiveButton(R.string.delete_playlist_positive_button_text, new DialogInterface.OnClickListener() { // from class: glk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                glq glqVar = glq.this;
                String str2 = str;
                abav abavVar = glqVar.b;
                abaq abaqVar = new abaq(abavVar.f, abavVar.a.c(), null, null, null);
                abaqVar.a = abaq.i(str2);
                abaqVar.k();
                abav abavVar2 = glqVar.b;
                abavVar2.b.e(abaqVar, new glo(glqVar, str2));
            }
        }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }

    public final void b(Button button, boolean z) {
        button.setEnabled(z);
        if (z) {
            button.setTextColor(wbs.W(this.a, R.attr.ytCallToAction).orElse(0));
        } else {
            button.setTextColor(wbs.W(this.a, R.attr.ytIconDisabled).orElse(0));
        }
    }
}
