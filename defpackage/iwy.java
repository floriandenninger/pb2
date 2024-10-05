package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class iwy implements DialogInterface.OnClickListener {
    final /* synthetic */ ixc a;

    public iwy(ixc ixcVar) {
        this.a = ixcVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.aF(new iwx(this));
        dialogInterface.dismiss();
    }
}
