package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bs implements DialogInterface.OnDismissListener {
    final /* synthetic */ bv a;

    public bs(bv bvVar) {
        this.a = bvVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        bv bvVar = this.a;
        Dialog dialog = bvVar.d;
        if (dialog != null) {
            bvVar.onDismiss(dialog);
        }
    }
}
