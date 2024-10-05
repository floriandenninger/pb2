package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class br implements DialogInterface.OnCancelListener {
    final /* synthetic */ bv a;

    public br(bv bvVar) {
        this.a = bvVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        bv bvVar = this.a;
        Dialog dialog = bvVar.d;
        if (dialog != null) {
            bvVar.onCancel(dialog);
        }
    }
}
