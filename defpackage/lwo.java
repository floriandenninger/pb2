package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lwo implements DialogInterface.OnClickListener {
    final /* synthetic */ lwp a;
    private final /* synthetic */ int b;

    public lwo(lwp lwpVar, int i) {
        this.b = i;
        this.a = lwpVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b == 0) {
            this.a.c(false);
            this.a.e(1);
            dialogInterface.dismiss();
        } else {
            this.a.e.setChecked(true);
            dialogInterface.dismiss();
        }
    }
}
