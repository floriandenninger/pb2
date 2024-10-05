package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acc implements DialogInterface.OnClickListener {
    private final WeakReference a;

    public acc(acd acdVar) {
        this.a = new WeakReference(acdVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a.get() != null) {
            ((acd) this.a.get()).o(true);
        }
    }
}
