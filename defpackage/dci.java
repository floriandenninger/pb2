package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dci implements Handler.Callback {
    private final /* synthetic */ int a;

    public dci(int i) {
        this.a = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.a != 0) {
            if (message.what != 1) {
                return false;
            }
            ((ctd) message.obj).e();
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        dcj dcjVar = (dcj) message.obj;
        dcjVar.a.j(dcjVar);
        return true;
    }
}
