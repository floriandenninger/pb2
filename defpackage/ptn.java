package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ptn {
    public Message a;

    public final void a() {
        this.a = null;
        synchronized (pto.a) {
            if (pto.a.size() < 50) {
                pto.a.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.a;
        pse.c(message);
        message.sendToTarget();
        a();
    }
}
