package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class me extends Handler {
    private final WeakReference a;

    public me(DialogInterface dialogInterface) {
        this.a = new WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.a.get(), message.what);
        } else {
            if (i != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
