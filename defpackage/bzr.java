package defpackage;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzr implements bzo, ccd {
    public static final String a = ajbh.S("Processor");
    public final Context c;
    private final bym h;
    private final WorkDatabase i;
    private final List j;
    private final cfa l;
    public final Map e = new HashMap();
    public final Map d = new HashMap();
    public final Set f = new HashSet();
    private final List k = new ArrayList();
    public PowerManager.WakeLock b = null;
    public final Object g = new Object();

    public bzr(Context context, bym bymVar, cfa cfaVar, WorkDatabase workDatabase, List list) {
        this.c = context;
        this.h = bymVar;
        this.l = cfaVar;
        this.i = workDatabase;
        this.j = list;
    }

    public static boolean e(String str, can canVar) {
        boolean z;
        if (canVar != null) {
            canVar.f = true;
            canVar.c();
            anhy anhyVar = canVar.e;
            if (anhyVar != null) {
                z = anhyVar.isDone();
                canVar.e.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = canVar.d;
            if (listenableWorker == null || z) {
                String.format("WorkSpec %s is already done. Not interrupting.", canVar.c);
                ajbh.X().T(new Throwable[0]);
            } else {
                listenableWorker.g();
            }
            ajbh X = ajbh.X();
            String.format("WorkerWrapper interrupted for %s", str);
            X.T(new Throwable[0]);
            return true;
        }
        ajbh X2 = ajbh.X();
        String.format("WorkerWrapper could not be found for %s", str);
        X2.T(new Throwable[0]);
        return false;
    }

    @Override // defpackage.bzo
    public final void a(String str, boolean z) {
        synchronized (this.g) {
            this.e.remove(str);
            ajbh X = ajbh.X();
            String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z));
            X.T(new Throwable[0]);
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((bzo) it.next()).a(str, z);
            }
        }
    }

    public final void b(bzo bzoVar) {
        synchronized (this.g) {
            this.k.add(bzoVar);
        }
    }

    public final void c(bzo bzoVar) {
        synchronized (this.g) {
            this.k.remove(bzoVar);
        }
    }

    public final void d() {
        synchronized (this.g) {
            if (this.d.isEmpty()) {
                try {
                    this.c.startService(ccg.d(this.c));
                } catch (Throwable th) {
                    ajbh.X();
                    ajbh.U(a, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.b;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.b = null;
                }
            }
        }
    }

    public final boolean f(String str) {
        boolean z;
        synchronized (this.g) {
            z = true;
            if (!this.e.containsKey(str) && !this.d.containsKey(str)) {
                z = false;
            }
        }
        return z;
    }

    public final boolean g(String str) {
        synchronized (this.g) {
            if (f(str)) {
                ajbh X = ajbh.X();
                String.format("Work %s is already enqueued for processing", str);
                X.T(new Throwable[0]);
                return false;
            }
            cam camVar = new cam(this.c, this.h, this.l, this, this.i, str);
            camVar.f = this.j;
            can canVar = new can(camVar);
            cex cexVar = canVar.h;
            cexVar.d(new bzq(this, str, cexVar), this.l.c);
            this.e.put(str, canVar);
            this.l.a.execute(canVar);
            ajbh X2 = ajbh.X();
            String.format("%s: processing %s", getClass().getSimpleName(), str);
            X2.T(new Throwable[0]);
            return true;
        }
    }
}
