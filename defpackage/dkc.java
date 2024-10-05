package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dkc extends ThreadPoolExecutor {
    public dkc(int i, int i2, int i3) {
        super(i, i2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new dka(i3));
    }
}
