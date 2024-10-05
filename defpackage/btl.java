package defpackage;

import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class btl {
    public Executor a;
    public buk b;
    public boolean c;

    @Deprecated
    public List d;
    protected final Map e;
    public final Map f;

    @Deprecated
    public volatile buo g;
    public jp h;
    private final btj i;
    private final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
    private final ThreadLocal k = new ThreadLocal();

    public btl() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.i = a();
        this.f = new HashMap();
        this.e = new HashMap();
    }

    public static final Object p(Class cls, buk bukVar) {
        if (cls.isInstance(bukVar)) {
            return bukVar;
        }
        return null;
    }

    protected abstract btj a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract buk b(bte bteVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public Map c() {
        return Collections.emptyMap();
    }

    public Set d() {
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Lock e() {
        return this.j.readLock();
    }

    public final void f() {
        if (!this.c && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void g() {
        if (!k() && this.k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public final void h() {
        f();
        f();
        buo a = this.b.a();
        this.i.a(a);
        if (!a.a.isWriteAheadLoggingEnabled()) {
            a.d();
        } else {
            a.e();
        }
    }

    public final void i() {
        this.b.a().f();
        if (k()) {
            return;
        }
        btj btjVar = this.i;
        if (btjVar.d.compareAndSet(false, true)) {
            jp jpVar = btjVar.j;
            btjVar.c.a.execute(btjVar.h);
        }
    }

    @Deprecated
    public final void j() {
        this.b.a().h();
    }

    public final boolean k() {
        return this.b.a().i();
    }

    public final buu l(String str) {
        f();
        g();
        return this.b.a().k(str);
    }

    public List m() {
        return Collections.emptyList();
    }

    public final Cursor n(bum bumVar) {
        f();
        g();
        return this.b.a().a(bumVar);
    }

    public final void o(buo buoVar) {
        btj btjVar = this.i;
        synchronized (btjVar) {
            if (btjVar.e) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            buoVar.g("PRAGMA temp_store = MEMORY;");
            buoVar.g("PRAGMA recursive_triggers='ON';");
            buoVar.g("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            btjVar.a(buoVar);
            btjVar.i = buoVar.k("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            btjVar.e = true;
        }
    }
}
