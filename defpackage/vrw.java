package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vrw {
    public final AtomicInteger a = new AtomicInteger();
    public int b = 1;

    public final void a() {
        int decrementAndGet = this.a.decrementAndGet();
        if (decrementAndGet < 0) {
            this.a.addAndGet(-decrementAndGet);
            StringBuilder sb = new StringBuilder(75);
            sb.append("AudioBufferManager: Invalid decrementBuffersInUse to new value: ");
            sb.append(decrementAndGet);
            vtv.b(sb.toString());
        }
    }
}
