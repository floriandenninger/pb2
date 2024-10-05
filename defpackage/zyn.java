package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zyn implements DialogInterface.OnCancelListener {
    final /* synthetic */ irv a;

    public zyn(irv irvVar) {
        this.a = irvVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.a();
    }
}
