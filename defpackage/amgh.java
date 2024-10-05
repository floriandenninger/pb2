package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amgh implements Callable {
    public final /* synthetic */ amgk a;
    private final /* synthetic */ int b;

    public /* synthetic */ amgh(amgk amgkVar, int i) {
        this.b = i;
        this.a = amgkVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        long c;
        aone createBuilder;
        ReentrantReadWriteLock reentrantReadWriteLock;
        Long l;
        if (this.b != 0) {
            amgk amgkVar = this.a;
            amsv i = amsx.i();
            try {
                Iterator it = amgkVar.a().f.iterator();
                while (it.hasNext()) {
                    i.c(AccountId.b(((Integer) it.next()).intValue()));
                }
                return i.g();
            } catch (IOException e) {
                amgkVar.f(e);
                return i.g();
            }
        }
        amgk amgkVar2 = this.a;
        amgkVar2.b.writeLock().lock();
        try {
            if (!amgkVar2.e.get()) {
                try {
                    amhd a = amgkVar2.a();
                    c = a.c;
                    createBuilder = amhd.a.createBuilder();
                    createBuilder.mergeFrom((aonm) a);
                } catch (IOException e2) {
                    amgkVar2.f(e2);
                    c = amgkVar2.d.c();
                    createBuilder = amhd.a.createBuilder();
                }
                boolean z = 1;
                if (c > 0) {
                    amgkVar2.f = c;
                    amgkVar2.e.set(true);
                    Long valueOf = Long.valueOf(amgkVar2.f);
                    reentrantReadWriteLock = amgkVar2.b;
                    l = valueOf;
                } else {
                    long c2 = amgkVar2.d.c();
                    amgkVar2.f = c2;
                    createBuilder.copyOnWrite();
                    amhd amhdVar = (amhd) createBuilder.instance;
                    amhdVar.b |= 1;
                    amhdVar.c = c2;
                    try {
                        try {
                            amgkVar2.e((amhd) createBuilder.build());
                            amgkVar2.e.set(true);
                        } catch (Throwable th) {
                            amgkVar2.e.set(z);
                            throw th;
                        }
                    } catch (IOException e3) {
                        ((amxh) ((amxh) ((amxh) amgk.a.g()).h(e3)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$getSyncEpoch$0", 'n', "SyncManagerDataStore.java")).q("Could not write sync epoch. Using current time but future runs may be delayed.");
                        amgkVar2.e.set(false);
                    }
                    z = Long.valueOf(amgkVar2.f);
                    reentrantReadWriteLock = amgkVar2.b;
                    l = z;
                }
            } else {
                Long valueOf2 = Long.valueOf(amgkVar2.f);
                reentrantReadWriteLock = amgkVar2.b;
                l = valueOf2;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return l;
        } catch (Throwable th2) {
            amgkVar2.b.writeLock().unlock();
            throw th2;
        }
    }
}
