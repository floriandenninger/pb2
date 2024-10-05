package defpackage;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zym implements DialogInterface.OnClickListener {
    final /* synthetic */ CheckBox a;
    final /* synthetic */ zyp b;
    final /* synthetic */ irv c;

    public zym(zyp zypVar, CheckBox checkBox, irv irvVar) {
        this.b = zypVar;
        this.a = checkBox;
        this.c = irvVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -2) {
            if (i == -1) {
                zyp zypVar = this.b;
                zypVar.a(zypVar.c);
            }
        } else if (this.a.isChecked()) {
            this.b.b.edit().putBoolean("cellular_upload_dialog_do_not_show_again", true).apply();
        }
        this.c.a();
    }
}
