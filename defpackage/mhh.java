package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mhh extends Handler {
    final /* synthetic */ mhi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhh(mhi mhiVar, Looper looper) {
        super(looper);
        this.a = mhiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 0) {
            gfq gfqVar = this.a.d;
            if (mhi.b(gfqVar.b())) {
                return;
            }
            mhi.a(gfqVar.a(), 0);
        }
    }
}
