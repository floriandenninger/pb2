package defpackage;

import android.media.MediaFormat;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vrx implements bgw {
    public final AtomicBoolean a;
    private final ptp b;

    public vrx(byte[] bArr) {
        this.a = new AtomicBoolean();
        this.b = new ptp();
    }

    @Override // defpackage.bgw
    public final void a(long j, long j2, pms pmsVar, MediaFormat mediaFormat) {
        d(j2, j);
    }

    public final void b(boolean z) {
        this.a.set(z);
    }

    public final synchronized Long c(long j) {
        return (Long) this.b.b(j);
    }

    public final synchronized void d(long j, long j2) {
        this.b.e(j, Long.valueOf(j2));
    }

    public vrx() {
        this.a = new AtomicBoolean();
    }
}
