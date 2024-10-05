package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amgk {
    public static final amxj a = amxj.l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore");
    public final anib c;
    public final shf d;
    private final Context g;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public long f = -1;

    public amgk(Context context, anib anibVar, shf shfVar) {
        this.d = shfVar;
        this.g = context;
        this.c = anibVar;
    }

    public final amhd a() {
        FileInputStream fileInputStream;
        File file = new File(this.g.getFilesDir(), "103795117");
        this.b.readLock().lock();
        try {
            amhd amhdVar = null;
            FileInputStream fileInputStream2 = null;
            if (file.exists()) {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    amhdVar = (amhd) amhd.parseDelimitedFrom(amhd.a, fileInputStream);
                    uqq.q(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    uqq.q(fileInputStream2);
                    throw th;
                }
            }
            return amhdVar == null ? amhd.a : amhdVar;
        } finally {
            this.b.readLock().unlock();
        }
    }

    public final anhy b() {
        return anfq.h(c(), amjk.a(new amml() { // from class: amge
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                amgk amgkVar = amgk.this;
                Long l = (Long) obj;
                adz adzVar = new adz();
                amhd amhdVar = amhd.a;
                try {
                    for (amhc amhcVar : amgkVar.a().d) {
                        long j = amhcVar.e;
                        amhf amhfVar = amhcVar.c;
                        if (amhfVar == null) {
                            amhfVar = amhf.a;
                        }
                        amgr a2 = amgr.a(amhfVar);
                        if (j <= 0) {
                            j = l.longValue();
                        }
                        adzVar.put(a2, Long.valueOf(j));
                    }
                } catch (IOException e) {
                    amgkVar.f(e);
                }
                return adzVar;
            }
        }), this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy c() {
        if (this.e.get()) {
            return anaf.O(Long.valueOf(this.f));
        }
        return this.c.submit(amjk.g(new amgh(this, 0)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy d(final amgr amgrVar, final long j, final boolean z) {
        return this.c.submit(new Runnable() { // from class: amgf
            @Override // java.lang.Runnable
            public final void run() {
                ReentrantReadWriteLock reentrantReadWriteLock;
                amgk amgkVar = amgk.this;
                amgr amgrVar2 = amgrVar;
                long j2 = j;
                boolean z2 = z;
                amgkVar.b.writeLock().lock();
                try {
                    amhd amhdVar = amhd.a;
                    try {
                        amhdVar = amgkVar.a();
                    } catch (IOException e) {
                        if (!amgkVar.f(e)) {
                            ((amxh) ((amxh) ((amxh) amgk.a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$updateLastSyncTime$4", (char) 285, "SyncManagerDataStore.java")).q("Unable to read or clear store, will not update sync time. Sync may run too frequently.");
                        }
                    }
                    aone createBuilder = amhd.a.createBuilder();
                    createBuilder.mergeFrom((aonm) amhdVar);
                    createBuilder.copyOnWrite();
                    ((amhd) createBuilder.instance).d = amhd.emptyProtobufList();
                    amhc amhcVar = null;
                    for (amhc amhcVar2 : amhdVar.d) {
                        amhf amhfVar = amhcVar2.c;
                        if (amhfVar == null) {
                            amhfVar = amhf.a;
                        }
                        if (amgrVar2.equals(amgr.a(amhfVar))) {
                            amhcVar = amhcVar2;
                        } else {
                            createBuilder.H(amhcVar2);
                        }
                    }
                    if (amhcVar != null) {
                        if (amhdVar.c < 0) {
                            long j3 = amgkVar.f;
                            if (j3 < 0) {
                                j3 = amgkVar.d.c();
                                amgkVar.f = j3;
                            }
                            createBuilder.copyOnWrite();
                            amhd amhdVar2 = (amhd) createBuilder.instance;
                            amhdVar2.b |= 1;
                            amhdVar2.c = j3;
                        }
                        aone createBuilder2 = amhc.a.createBuilder();
                        amhf amhfVar2 = amgrVar2.a;
                        createBuilder2.copyOnWrite();
                        amhc amhcVar3 = (amhc) createBuilder2.instance;
                        amhfVar2.getClass();
                        amhcVar3.c = amhfVar2;
                        amhcVar3.b |= 1;
                        createBuilder2.copyOnWrite();
                        amhc amhcVar4 = (amhc) createBuilder2.instance;
                        amhcVar4.b |= 4;
                        amhcVar4.e = j2;
                        if (z2) {
                            createBuilder2.copyOnWrite();
                            amhc amhcVar5 = (amhc) createBuilder2.instance;
                            amhcVar5.b |= 2;
                            amhcVar5.d = j2;
                            createBuilder2.copyOnWrite();
                            amhc amhcVar6 = (amhc) createBuilder2.instance;
                            amhcVar6.b |= 8;
                            amhcVar6.f = 0;
                        } else {
                            long j4 = amhcVar.d;
                            createBuilder2.copyOnWrite();
                            amhc amhcVar7 = (amhc) createBuilder2.instance;
                            amhcVar7.b |= 2;
                            amhcVar7.d = j4;
                            int i = amhcVar.f + 1;
                            createBuilder2.copyOnWrite();
                            amhc amhcVar8 = (amhc) createBuilder2.instance;
                            amhcVar8.b |= 8;
                            amhcVar8.f = i;
                        }
                        createBuilder.H((amhc) createBuilder2.build());
                        try {
                            amgkVar.e((amhd) createBuilder.build());
                        } catch (IOException e2) {
                            ((amxh) ((amxh) ((amxh) amgk.a.f()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$updateLastSyncTime$4", (char) 345, "SyncManagerDataStore.java")).q("Error writing sync data file after sync. Sync may run too frequently.");
                        }
                        reentrantReadWriteLock = amgkVar.b;
                    } else {
                        reentrantReadWriteLock = amgkVar.b;
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    amgkVar.b.writeLock().unlock();
                    throw th;
                }
            }
        });
    }

    public final void e(amhd amhdVar) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(new File(this.g.getFilesDir(), "103795117"));
            try {
                amhdVar.writeDelimitedTo(fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public final boolean f(Throwable th) {
        ((amxh) ((amxh) ((amxh) a.g()).h(th)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 515, "SyncManagerDataStore.java")).q("Could not read sync datastore. There was probably a write error. Wiping store.");
        this.b.writeLock().lock();
        try {
            boolean z = false;
            this.e.set(false);
            long j = this.f;
            if (j <= 0) {
                j = this.d.c();
            }
            aone createBuilder = amhd.a.createBuilder();
            createBuilder.copyOnWrite();
            amhd amhdVar = (amhd) createBuilder.instance;
            amhdVar.b |= 1;
            amhdVar.c = j;
            try {
                try {
                    e((amhd) createBuilder.build());
                    z = true;
                } catch (IOException e) {
                    ((amxh) ((amxh) ((amxh) a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 535, "SyncManagerDataStore.java")).q("Could not write to datastore to clear store.");
                    this.e.set(false);
                }
                return z;
            } finally {
                this.e.set(true);
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }
}
