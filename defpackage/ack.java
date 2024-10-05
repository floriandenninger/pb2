package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ack implements DialogInterface.OnClickListener {
    final /* synthetic */ acn a;

    public ack(acn acnVar) {
        this.a = acnVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.ag.o(true);
    }
}
