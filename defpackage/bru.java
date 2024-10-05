package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bru implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ brv a;

    public bru(brv brvVar) {
        this.a = brvVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        brv brvVar = this.a;
        if (z) {
            brvVar.af = brvVar.ae.add(brvVar.ah[i].toString()) | brvVar.af;
        } else {
            brvVar.af = brvVar.ae.remove(brvVar.ah[i].toString()) | brvVar.af;
        }
    }
}
