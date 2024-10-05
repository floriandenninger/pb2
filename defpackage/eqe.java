package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eqe implements DialogInterface.OnClickListener {
    final /* synthetic */ eqf a;

    public eqe(eqf eqfVar) {
        this.a = eqfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        eqf eqfVar = this.a;
        aptf aptfVar = eqfVar.e;
        if ((aptfVar.b & 64) != 0) {
            aahd aahdVar = eqfVar.c;
            apxf apxfVar = aptfVar.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }
}
