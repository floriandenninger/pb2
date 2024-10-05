package defpackage;

import android.content.Context;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class quf {
    public final qum a;
    public final Handler b;

    public quf(Context context) {
        this.a = qum.c(context);
        this.b = new amcc(context.getMainLooper(), (byte[]) null);
    }

    public final void a(quh quhVar) {
        this.b.removeCallbacksAndMessages(quhVar);
    }
}
