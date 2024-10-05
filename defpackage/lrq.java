package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lrq implements DialogInterface.OnDismissListener {
    final /* synthetic */ lrr a;

    public lrq(lrr lrrVar) {
        this.a = lrrVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.b = false;
    }
}
