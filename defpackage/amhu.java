package defpackage;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amhu {
    public static final amhu a;
    private final UUID b;
    private final AtomicLong c;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            a = new amhu(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public amhu(UUID uuid, long j) {
        this.b = uuid;
        this.c = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    final long a() {
        long j;
        long j2;
        do {
            j = this.c.get();
            j2 = (((int) (r4 >>> 16)) << 32) + ((int) (r2 >>> 16));
        } while (!this.c.compareAndSet(j, ((25214903917L * (((j * 25214903917L) + 11) & 281474976710655L)) + 11) & 281474976710655L));
        return j2;
    }

    public final UUID b() {
        long a2 = a();
        return new UUID((a2 & (-61441)) ^ this.b.getMostSignificantBits(), (a() >>> 2) ^ this.b.getLeastSignificantBits());
    }
}
