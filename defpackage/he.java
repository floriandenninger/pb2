package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class he extends Handler {
    final /* synthetic */ hg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(hg hgVar, Looper looper) {
        super(looper);
        this.a = hgVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        hh hhVar;
        he heVar;
        if (message.what == 1) {
            synchronized (this.a.a) {
                hhVar = (hh) this.a.c.get();
                heVar = this.a.d;
            }
            if (hhVar == null || this.a != hhVar.a() || heVar == null) {
                return;
            }
            hhVar.i((arn) message.obj);
            this.a.a(hhVar, heVar);
            hhVar.i(null);
        }
    }
}
