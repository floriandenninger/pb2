package defpackage;

import android.util.SparseArray;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ambb {
    public static final amxj a = amxj.l("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter");
    public static final SettableFuture b;
    public final AtomicLong c = new AtomicLong(0);
    public final Object d = new Object();
    public final ConcurrentHashMap e = new ConcurrentHashMap(10, 0.75f, 4);
    public final SparseArray f = new SparseArray();
    public final SparseArray g = new SparseArray();
    public final UUID h = UUID.randomUUID();

    static {
        SettableFuture f = SettableFuture.f();
        b = f;
        f.o(new Object());
    }

    public static int a(long j) {
        return (int) (j & 4294967295L);
    }
}
