package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ffb implements DialogInterface.OnKeyListener {
    final /* synthetic */ ffc a;

    public ffb(ffc ffcVar) {
        this.a = ffcVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4 && keyEvent.getAction() == 1 && this.a.ag != null;
    }
}
