package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zla implements DialogInterface.OnClickListener {
    final /* synthetic */ Runnable a;
    private final /* synthetic */ int b;

    public zla(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b == 0) {
            this.a.run();
            dialogInterface.dismiss();
        } else {
            this.a.run();
            dialogInterface.dismiss();
        }
    }
}
