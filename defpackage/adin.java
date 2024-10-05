package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adin extends Handler {
    final /* synthetic */ adit a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adin(adit aditVar, Looper looper) {
        super(looper);
        this.a = aditVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1 && this.a.g.a() != 2) {
            this.a.x(0);
            this.a.f.sendMessageDelayed(Message.obtain(this, 1), 1000L);
        }
    }
}
