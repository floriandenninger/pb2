package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ggo implements DialogInterface.OnClickListener {
    final /* synthetic */ ggp a;

    public ggo(ggp ggpVar) {
        this.a = ggpVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a.d.isChecked()) {
            this.a.c.d(2);
            this.a.h.I(3, new acqx(acrb.INLINE_DIALOG_SETTINGS_ON), null);
        } else if (this.a.e.isChecked()) {
            this.a.c.d(1);
            this.a.h.I(3, new acqx(acrb.INLINE_DIALOG_SETTINGS_ONLY_WIFI), null);
        } else if (this.a.f.isChecked()) {
            this.a.c.d(0);
            this.a.h.I(3, new acqx(acrb.INLINE_DIALOG_SETTINGS_OFF), null);
        }
    }
}
