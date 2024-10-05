package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axhb implements DialogInterface.OnCancelListener {
    final /* synthetic */ Runnable a;

    public axhb(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.run();
    }
}
