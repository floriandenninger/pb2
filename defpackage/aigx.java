package defpackage;

import android.os.ConditionVariable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aigx extends afww {
    private final ConditionVariable a = new ConditionVariable();
    private final long b;

    public aigx(long j) {
        this.b = j;
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.a.open();
        return super.cancel(z);
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final Object get() {
        this.a.open();
        return super.get();
    }

    @Override // defpackage.afww, defpackage.afwx
    public final void lK() {
        this.a.block(this.b);
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        this.a.open();
        return super.get(j, timeUnit);
    }
}
