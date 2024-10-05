package defpackage;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aems {
    public final AtomicInteger a = new AtomicInteger();
    public boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.decrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.b && Looper.myLooper() != Looper.getMainLooper()) {
            afsi.b(2, 6, "Medialib event happened off main thread");
        }
        this.a.incrementAndGet();
    }
}
