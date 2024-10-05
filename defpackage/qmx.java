package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qmx extends amcc {
    final /* synthetic */ qmy a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmx(qmy qmyVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), (byte[]) null);
        this.a = qmyVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            int g = this.a.g(this.b);
            if (qnm.g(g)) {
                this.a.d(this.b, g);
                return;
            }
            return;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(50);
        sb.append("Don't know how to handle this message: ");
        sb.append(i);
        Log.w("GoogleApiAvailability", sb.toString());
    }
}
