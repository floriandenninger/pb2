package defpackage;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayqp implements ayqx {
    private final AtomicBoolean a = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a();

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.a.get();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a();
            } else {
                ayqr.a().f(new ayqo(this));
            }
        }
    }
}
