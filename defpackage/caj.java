package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class caj extends bzh {
    public static final Object a;
    private static caj k;
    private static caj l;
    public final Context b;
    public final bym c;
    public final WorkDatabase d;
    public final List e;
    public final bzr f;
    public boolean g;
    public BroadcastReceiver.PendingResult h;
    public final cfa i;
    public final cdv j;

    static {
        ajbh.S("WorkManagerImpl");
        k = null;
        l = null;
        a = new Object();
    }

    public caj(Context context, bym bymVar, cfa cfaVar) {
        WorkDatabase q = WorkDatabase.q(context.getApplicationContext(), cfaVar.a, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        Context applicationContext = context.getApplicationContext();
        ajbh.Y(new ajbh(bymVar.f));
        List asList = Arrays.asList(bzt.a(applicationContext, this), new caq(applicationContext, bymVar, cfaVar, this));
        bzr bzrVar = new bzr(context, bymVar, cfaVar, q, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.b = applicationContext2;
        this.c = bymVar;
        this.i = cfaVar;
        this.d = q;
        this.e = asList;
        this.f = bzrVar;
        this.j = new cdv(q);
        this.g = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext2.isDeviceProtectedStorage()) {
            cfaVar.a(new cdu(applicationContext2, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        r2 = r6.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (defpackage.caj.l != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        defpackage.caj.l = new defpackage.caj(r2, r1, new defpackage.cfa(r1.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        defpackage.caj.k = defpackage.caj.l;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.caj h(android.content.Context r6) {
        /*
            java.lang.Object r0 = defpackage.caj.a
            monitor-enter(r0)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L62
            caj r1 = defpackage.caj.k     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            goto Ld
        La:
            caj r1 = defpackage.caj.l     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
        Ld:
            if (r1 != 0) goto L5d
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L62
            boolean r1 = r6 instanceof defpackage.byl     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L55
            r1 = r6
            byl r1 = (defpackage.byl) r1     // Catch: java.lang.Throwable -> L62
            bym r1 = r1.a()     // Catch: java.lang.Throwable -> L62
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L62
            caj r2 = defpackage.caj.k     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L30
            caj r3 = defpackage.caj.l     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L28
            goto L30
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L52
            throw r6     // Catch: java.lang.Throwable -> L52
        L30:
            if (r2 != 0) goto L4c
            android.content.Context r2 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L52
            caj r3 = defpackage.caj.l     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L48
            caj r3 = new caj     // Catch: java.lang.Throwable -> L52
            cfa r4 = new cfa     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.Executor r5 = r1.b     // Catch: java.lang.Throwable -> L52
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L52
            r3.<init>(r2, r1, r4)     // Catch: java.lang.Throwable -> L52
            defpackage.caj.l = r3     // Catch: java.lang.Throwable -> L52
        L48:
            caj r1 = defpackage.caj.l     // Catch: java.lang.Throwable -> L52
            defpackage.caj.k = r1     // Catch: java.lang.Throwable -> L52
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            caj r1 = h(r6)     // Catch: java.lang.Throwable -> L62
            goto L5d
        L52:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r6     // Catch: java.lang.Throwable -> L62
        L55:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L62
            throw r6     // Catch: java.lang.Throwable -> L62
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return r1
        L5f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r6     // Catch: java.lang.Throwable -> L62
        L62:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caj.h(android.content.Context):caj");
    }

    @Override // defpackage.bzh
    public final bzd b(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new bzu(this, null, 2, list, null).d();
    }

    @Override // defpackage.bzh
    public final bzd c(String str, int i, List list) {
        return new bzu(this, str, i, list).d();
    }

    @Override // defpackage.bzh
    public final void d(String str) {
        this.i.a(new cdq(this, str));
    }

    @Override // defpackage.bzh
    public final void e(String str) {
        this.i.a(cds.b(str, this, true));
    }

    @Override // defpackage.bzh
    public final bzd f(String str, int i, bzj bzjVar) {
        return new bzu(this, str, i != 2 ? 1 : 2, Collections.singletonList(bzjVar)).d();
    }

    public final void i() {
        synchronized (a) {
            this.g = true;
            BroadcastReceiver.PendingResult pendingResult = this.h;
            if (pendingResult != null) {
                pendingResult.finish();
                this.h = null;
            }
        }
    }

    public final void j() {
        if (Build.VERSION.SDK_INT >= 23) {
            cbe.a(this.b);
        }
        cdb r = this.d.r();
        cdl cdlVar = (cdl) r;
        cdlVar.a.g();
        buu d = cdlVar.e.d();
        cdlVar.a.h();
        try {
            d.b();
            ((cdl) r).a.j();
            cdlVar.a.i();
            cdlVar.e.e(d);
            bzt.b(this.d, this.e);
        } catch (Throwable th) {
            cdlVar.a.i();
            cdlVar.e.e(d);
            throw th;
        }
    }

    public final void k(String str) {
        m(str, null);
    }

    public final void l(String str) {
        this.i.a(new cec(this, str, false));
    }

    public final void m(String str, abm abmVar) {
        this.i.a(new cea(this, str, abmVar, null));
    }
}
