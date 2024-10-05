package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adlx extends Handler {
    final /* synthetic */ adly a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlx(adly adlyVar) {
        super(Looper.getMainLooper());
        this.a = adlyVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.a.c();
        } else {
            if (i != 1) {
                return;
            }
            this.a.a(message.arg1);
        }
    }
}
