package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ark {
    final Messenger a;

    public ark(Messenger messenger) {
        this.a = messenger;
    }

    public final IBinder a() {
        return this.a.getBinder();
    }

    public final void b(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        this.a.send(obtain);
    }
}
