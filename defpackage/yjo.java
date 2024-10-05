package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yjo implements DialogInterface.OnClickListener {
    final /* synthetic */ yjp a;

    public yjo(yjp yjpVar) {
        this.a = yjpVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
