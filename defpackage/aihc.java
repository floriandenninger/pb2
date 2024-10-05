package defpackage;

import android.util.LruCache;
import android.util.Pair;
import j$.util.function.Supplier;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aihc {
    static final long a = TimeUnit.SECONDS.toMillis(10);
    public final LruCache b = new LruCache(5);
    public final shf c;

    public aihc(shf shfVar) {
        this.c = shfVar;
    }

    private final boolean c(Pair pair) {
        return (pair == null || pair.first == null || this.c.d() >= ((Long) pair.second).longValue()) ? false : true;
    }

    public final Object a(String str, Supplier supplier) {
        synchronized (this.b) {
            Pair pair = (Pair) this.b.remove(str);
            if (pair == null || !c(pair)) {
                return supplier.get();
            }
            return pair.first;
        }
    }

    public final void b(final String str, final Supplier supplier, Executor executor) {
        if (c((Pair) this.b.get(str))) {
            return;
        }
        executor.execute(new Runnable() { // from class: aihb
            @Override // java.lang.Runnable
            public final void run() {
                aihc aihcVar = aihc.this;
                String str2 = str;
                Supplier supplier2 = supplier;
                synchronized (aihcVar.b) {
                    aihcVar.b.put(str2, Pair.create(supplier2.get(), Long.valueOf(aihcVar.c.d() + aihc.a)));
                }
            }
        });
    }
}
