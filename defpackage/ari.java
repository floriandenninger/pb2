package defpackage;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ari implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ ResultReceiver c;
    final /* synthetic */ arj d;
    final /* synthetic */ ark e;

    public ari(arj arjVar, ark arkVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.d = arjVar;
        this.e = arkVar;
        this.a = str;
        this.b = bundle;
        this.c = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((aqp) this.d.a.c.get(this.e.a())) == null) {
            Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.a + ", extras=" + this.b);
            return;
        }
        String str = this.a;
        Bundle bundle = this.b;
        ResultReceiver resultReceiver = this.c;
        arb arbVar = new arb(str);
        if (arbVar.f || arbVar.g) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + arbVar.e);
        }
        arbVar.g = true;
        resultReceiver.b(-1, null);
        if (arbVar.c()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }
}
