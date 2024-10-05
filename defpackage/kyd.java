package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kyd extends Handler {
    final /* synthetic */ kyh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyd(kyh kyhVar, Looper looper) {
        super(looper);
        this.a = kyhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        removeMessages(i);
        sendEmptyMessageDelayed(i, i2);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1 || i == 2) {
            this.a.d();
        }
    }
}
