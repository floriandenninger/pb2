package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class allp implements Handler.Callback {
    final /* synthetic */ allr a;

    public allp(allr allrVar) {
        this.a = allrVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        allr allrVar = this.a;
        allq allqVar = (allq) message.obj;
        synchronized (allrVar.a) {
            if (allrVar.c == allqVar || allrVar.d == allqVar) {
                allrVar.d(allqVar, 2);
            }
        }
        return true;
    }
}
