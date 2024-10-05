package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.mediarouter.media.MediaTransferReceiver;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcq {
    private final Context a;
    private final acun b;
    private final Executor c;
    private boolean d = false;
    private boolean e = false;

    static {
        zga.a("MDX.MediaTransferEnabler");
    }

    public adcq(Context context, acun acunVar, Executor executor) {
        this.a = context;
        this.b = acunVar;
        this.c = executor;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        boolean z = this.a.getPackageManager().getComponentEnabledSetting(new ComponentName(this.a, (Class<?>) MediaTransferReceiver.class)) == 1;
        boolean z2 = this.b.D;
        this.e = z || z2;
        Context context = this.a;
        Executor executor = this.c;
        int i = true != z2 ? 2 : 1;
        executor.getClass();
        executor.execute(new zgv(context.getApplicationContext(), MediaTransferReceiver.class, i));
        this.d = true;
    }

    public final boolean b() {
        if (!this.d) {
            a();
        }
        return this.e;
    }
}
