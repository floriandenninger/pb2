package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbi {
    private static final AtomicLong d = new AtomicLong();
    public final long a;
    public final ath b;
    public final long c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bbi(long j, ath athVar) {
        this(j, athVar, 0L);
        Uri uri = athVar.a;
        Collections.emptyMap();
    }

    public bbi(long j, ath athVar, long j2) {
        this.a = j;
        this.b = athVar;
        this.c = j2;
    }

    public static long a() {
        return d.getAndIncrement();
    }
}
