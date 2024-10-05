package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeps extends Handler {
    final /* synthetic */ aepv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeps(aepv aepvVar, Looper looper) {
        super(looper);
        this.a = aepvVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        aepv aepvVar = this.a;
        if (aepvVar.g != 0) {
            int i = aepvVar.h;
            if (i == 3 || i == 4) {
                int i2 = message.what;
                if (i2 == 1) {
                    this.a.h = 3;
                    this.a.p();
                } else if (i2 == 2) {
                    this.a.g();
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    this.a.h = 3;
                    this.a.m(new pbo());
                }
            }
        }
    }
}
