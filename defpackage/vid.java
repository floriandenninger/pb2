package defpackage;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class vid implements ComponentCallbacks2 {
    public static final amxj a = amxj.l("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper");
    public final Context b;
    public final ScheduledExecutorService c;
    public final ammv d;
    public final List e;
    public final List f;
    public final Executor i;
    public anhy j;
    public boolean m;
    public final afxg o;
    public final aoae p;
    private final anfy q;
    private ScheduledFuture t;
    public final Set g = new HashSet();
    public final Object h = new Object();
    public final vhx n = new vhx(this);
    private final anhh r = new vhy(this, 1);
    public int k = 0;
    private boolean s = false;
    public boolean l = false;

    @Deprecated
    public vid(Context context, ScheduledExecutorService scheduledExecutorService, aoae aoaeVar, anfy anfyVar, vik vikVar, byte[] bArr, byte[] bArr2) {
        this.q = anfyVar;
        this.c = scheduledExecutorService;
        this.p = aoaeVar;
        this.i = anaf.E(scheduledExecutorService);
        this.b = context;
        this.d = vikVar.a;
        this.e = vikVar.b;
        this.f = vikVar.c;
        this.o = vikVar.d;
    }

    public static angk a(final anhy anhyVar, Closeable... closeableArr) {
        anhyVar.getClass();
        return new angk(new vht(closeableArr), angq.a).c(new angg() { // from class: vhs
            @Override // defpackage.angg
            public final angk a(angi angiVar, Object obj) {
                return angk.b(anhy.this);
            }
        }, angq.a);
    }

    public static SQLiteDatabase e(Context context, File file, afxg afxgVar, ammv ammvVar, List list, List list2) {
        SQLiteDatabase h = h(context, afxgVar, file);
        try {
            if (i(h, afxgVar, list, list2)) {
                h.close();
                h = h(context, afxgVar, file);
                try {
                    amil l = amjw.l("Configuring reopened database.");
                    try {
                        amkq.O(!i(h, afxgVar, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                        l.close();
                    } catch (Throwable th) {
                        try {
                            l.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    h.close();
                    throw new vhz("Failed to open database.", e);
                } catch (IllegalStateException e2) {
                    e = e2;
                    h.close();
                    throw new vhz("Failed to open database.", e);
                } catch (Throwable th2) {
                    h.close();
                    throw th2;
                }
            }
            return h;
        } catch (SQLiteException e3) {
            h.close();
            throw new vhz("Failed to open database.", e3);
        } catch (Throwable th3) {
            h.close();
            throw th3;
        }
    }

    public static boolean f(Context context, afxg afxgVar) {
        int i = afxgVar.b;
        return !((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean g(SQLiteDatabase sQLiteDatabase, List list, List list2) {
        int version = sQLiteDatabase.getVersion();
        ((amxh) ((amxh) a.c()).i("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "upgradeDatabase", 736, "AsyncSQLiteOpenHelper.java")).r("Database version is %d", version);
        int i = ((amvj) list).c;
        amkq.R(version <= i, "Can't downgrade from version %s to version %s", version, i);
        viq viqVar = new viq(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            try {
                try {
                    if (version != ((amvj) list).c) {
                        amil l = amjw.l("Applying upgrade steps");
                        try {
                            Iterator it = ((amru) list).subList(version, ((amvj) list).c).iterator();
                            while (it.hasNext()) {
                                ((vij) it.next()).a(viqVar);
                            }
                            l.close();
                            sQLiteDatabase.setVersion(((amvj) list).c);
                        } catch (Throwable th) {
                            try {
                                l.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                    amxe it2 = ((amru) list2).iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    return version != sQLiteDatabase.getVersion();
                } catch (SQLiteDiskIOException e) {
                    e = e;
                    throw new vic("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (Throwable th2) {
                    throw new vib(th2);
                }
            } catch (SQLiteDatabaseLockedException e2) {
                e = e2;
                throw new vic("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (SQLiteFullException e3) {
                e = e3;
                throw new vic("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (SQLiteOutOfMemoryException e4) {
                e = e4;
                throw new vic("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (SQLiteTableLockedException e5) {
                e = e5;
                throw new vic("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (InterruptedException e6) {
                throw new vic("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e6);
            }
        } catch (Throwable th3) {
            sQLiteDatabase.endTransaction();
            throw th3;
        }
    }

    private static SQLiteDatabase h(Context context, afxg afxgVar, File file) {
        boolean f = f(context, afxgVar);
        int i = f ? 805306368 : 268435456;
        file.getParentFile().mkdirs();
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, i, null);
            if (f) {
                openDatabase.enableWriteAheadLogging();
            }
            return openDatabase;
        } catch (Throwable th) {
            throw new vhz("Failed to open database.", th);
        }
    }

    private static boolean i(SQLiteDatabase sQLiteDatabase, afxg afxgVar, List list, List list2) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        Iterator it = afxgVar.a.iterator();
        while (it.hasNext()) {
            String valueOf = String.valueOf((String) it.next());
            sQLiteDatabase.execSQL(valueOf.length() != 0 ? "PRAGMA ".concat(valueOf) : new String("PRAGMA "));
        }
        return g(sQLiteDatabase, list, list2);
    }

    public final angk b() {
        anhy anhyVar;
        anhy N;
        WeakHashMap weakHashMap = amjw.a;
        amil amilVar = null;
        try {
            synchronized (this.h) {
                int i = this.k + 1;
                this.k = i;
                if (this.j == null) {
                    amkq.O(i == 1, "DB was null with nonzero refcount");
                    amilVar = amjw.l("Opening database");
                    try {
                        anhy T = anaf.T(this.q, this.i);
                        anaf.Y(T, this.r, this.c);
                        N = anfq.h(T, amjk.a(new amml() { // from class: vhq
                            @Override // defpackage.amml
                            public final Object apply(Object obj) {
                                via viaVar;
                                SQLiteDatabase e;
                                vid vidVar = vid.this;
                                File databasePath = vidVar.b.getDatabasePath((String) obj);
                                if (!vidVar.l) {
                                    aoae aoaeVar = vidVar.p;
                                    String path = databasePath.getPath();
                                    if (aoaeVar.b.add(path)) {
                                        vidVar.l = true;
                                        boolean f = vid.f(vidVar.b, vidVar.o);
                                        vidVar.m = f;
                                        if (f) {
                                            try {
                                                vidVar.m = databasePath.getCanonicalPath().startsWith(vidVar.b.getCacheDir().getCanonicalPath());
                                            } catch (IOException unused) {
                                            }
                                        }
                                    } else {
                                        StringBuilder sb = new StringBuilder(String.valueOf(path).length() + 89);
                                        sb.append("DB ");
                                        sb.append(path);
                                        sb.append(" opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?");
                                        throw new IllegalStateException(sb.toString());
                                    }
                                }
                                Set set = vidVar.g;
                                if (!set.isEmpty()) {
                                    Iterator it = set.iterator();
                                    while (it.hasNext()) {
                                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((WeakReference) it.next()).get();
                                        if (sQLiteDatabase != null) {
                                            if (sQLiteDatabase.isOpen()) {
                                                String path2 = sQLiteDatabase.getPath();
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(path2).length() + 103);
                                                sb2.append("Open database reference to ");
                                                sb2.append(path2);
                                                sb2.append(" already exists. Follow instructions in source to file a bug against TikTok.");
                                                throw new IllegalStateException(sb2.toString());
                                            }
                                        } else {
                                            it.remove();
                                        }
                                    }
                                }
                                try {
                                    try {
                                        e = vid.e(vidVar.b, databasePath, vidVar.o, vidVar.d, vidVar.e, vidVar.f);
                                    } catch (vhz | vib | vic unused2) {
                                        e = vid.e(vidVar.b, databasePath, vidVar.o, vidVar.d, vidVar.e, vidVar.f);
                                    }
                                    vidVar.g.add(new WeakReference(e));
                                    vidVar.b.registerComponentCallbacks(vidVar);
                                    return e;
                                } catch (vib e2) {
                                    ((amxh) ((amxh) ((amxh) vid.a.f()).h(e2)).i("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "lambda$innerOpenDatabase$4", (char) 437, "AsyncSQLiteOpenHelper.java")).q("Fatal Exception when trying to upgrade database. Proceeding to delete.");
                                    try {
                                        File file = new File(String.valueOf(databasePath.getPath()).concat("-wal"));
                                        File file2 = new File(String.valueOf(databasePath.getPath()).concat("-journal"));
                                        File file3 = new File(String.valueOf(databasePath.getPath()).concat("-shm"));
                                        try {
                                            if ((!file.exists() || file.delete()) && ((!file2.exists() || file2.delete()) && ((!file3.exists() || file3.delete()) && databasePath.delete()))) {
                                                throw new vhz("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", e2);
                                            }
                                            throw new via(String.format("Unable to clean up database %s", databasePath.getAbsolutePath()));
                                        } finally {
                                        }
                                    } catch (Throwable th) {
                                        throw new vhz("Recovery by deletion failed.", th);
                                    }
                                } catch (vic e3) {
                                    throw new vhz("Probably-recoverable database upgrade failure.", e3);
                                }
                            }
                        }), this.i);
                    } catch (Exception e) {
                        N = anaf.N(e);
                    }
                    this.j = N;
                }
                anhyVar = this.j;
                ScheduledFuture scheduledFuture = this.t;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
            }
            anhy P = anaf.P(anhyVar);
            if (amilVar != null) {
                amilVar.a(P);
            }
            return a(P, new Closeable() { // from class: vhv
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    vid vidVar = vid.this;
                    synchronized (vidVar.h) {
                        int i2 = vidVar.k;
                        amkq.P(i2 > 0, "Refcount went negative!", i2);
                        vidVar.k--;
                        vidVar.c();
                    }
                }
            }).c(amjk.d(new angg() { // from class: vhr
                @Override // defpackage.angg
                public final angk a(angi angiVar, Object obj) {
                    final vhp vhpVar;
                    vid vidVar = vid.this;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                    Executor executor = vidVar.i;
                    if (!sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                        vhpVar = new vhp(sQLiteDatabase, executor, executor, vidVar.n);
                    } else {
                        vhpVar = new vhp(sQLiteDatabase, vidVar.c, executor, vidVar.n);
                    }
                    return vid.a(anaf.O(vhpVar), new Closeable() { // from class: vhu
                        @Override // java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                            vhp.this.d = true;
                        }
                    });
                }
            }), angq.a);
        } finally {
            if (amilVar != null) {
                amilVar.close();
            }
        }
    }

    public final void c() {
        if (this.k != 0 || this.j == null) {
            return;
        }
        if (this.s) {
            d();
            return;
        }
        this.t = this.c.schedule(new vhw(this, 1), 60L, TimeUnit.SECONDS);
        if (this.m) {
            return;
        }
        anaf.Y(this.j, new vhy(this, 0), this.i);
    }

    public final void d() {
        this.i.execute(new vhw(this, 0));
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        synchronized (this.h) {
            this.s = i >= 40;
            c();
        }
    }
}
