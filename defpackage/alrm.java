package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alrm implements alqo {
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    public final Context b;
    public final Executor c;
    public final alqe d;
    public final Set e;
    public final Set f;
    public final AtomicBoolean g;
    public final aoae h;
    public final aoae i;
    private final Handler j;
    private final alqm k;
    private final axpg l;
    private final File m;
    private final AtomicReference n;
    private final alqr o;

    public alrm(Context context, File file, alqm alqmVar, axpg axpgVar) {
        if (alkd.b == null) {
            alkd.b = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new pkr(6));
            alkd.b.allowCoreThreadTimeOut(true);
        }
        ThreadPoolExecutor threadPoolExecutor = alkd.b;
        alqr alqrVar = new alqr(context);
        this.j = new Handler(Looper.getMainLooper());
        this.n = new AtomicReference();
        this.e = Collections.synchronizedSet(new HashSet());
        this.f = Collections.synchronizedSet(new HashSet());
        this.g = new AtomicBoolean(false);
        this.b = context;
        this.m = file;
        this.k = alqmVar;
        this.l = axpgVar;
        this.c = threadPoolExecutor;
        this.o = alqrVar;
        this.i = new aoae((char[]) null);
        this.h = new aoae((char[]) null);
        this.d = alqh.a;
    }

    public static String d(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    private final synchronized alqz f(alrl alrlVar) {
        alqz c = c();
        alqz a2 = alrlVar.a(c);
        if (this.n.compareAndSet(c, a2)) {
            return a2;
        }
        return null;
    }

    private final alsc g(final int i) {
        f(new alrl() { // from class: alrf
            @Override // defpackage.alrl
            public final alqz a(alqz alqzVar) {
                int i2 = i;
                long j = alrm.a;
                if (alqzVar == null) {
                    return null;
                }
                return alqz.a(alqzVar.a, 6, i2, alqzVar.c, alqzVar.d, alqzVar.d(), alqzVar.c());
            }
        });
        return alta.r(new alql(i));
    }

    private final amsj h() {
        amsj c = this.k.c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x015c, code lost:
    
        if (r6.contains(r5) == false) goto L50;
     */
    @Override // defpackage.alqo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.alsc a(final defpackage.alqv r21) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alrm.a(alqv):alsc");
    }

    @Override // defpackage.alqo
    public final Set b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.k.a());
        hashSet.addAll(this.e);
        return hashSet;
    }

    public final alqz c() {
        return (alqz) this.n.get();
    }

    public final void e(final int i, final int i2, final Long l, final Long l2, final List list, final Integer num, final List list2) {
        final alqz f = f(new alrl() { // from class: alrh
            @Override // defpackage.alrl
            public final alqz a(alqz alqzVar) {
                long longValue;
                long longValue2;
                Integer num2 = num;
                int i3 = i;
                int i4 = i2;
                Long l3 = l;
                Long l4 = l2;
                List list3 = list;
                List list4 = list2;
                long j = alrm.a;
                alqz a2 = alqzVar == null ? alqz.a(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : alqzVar;
                int intValue = num2 == null ? a2.a : num2.intValue();
                if (l3 == null) {
                    longValue = a2.c;
                } else {
                    longValue = l3.longValue();
                }
                if (l4 == null) {
                    longValue2 = a2.d;
                } else {
                    longValue2 = l4.longValue();
                }
                return alqz.a(intValue, i3, i4, longValue, longValue2, list3 == null ? a2.d() : list3, list4 == null ? a2.c() : list4);
            }
        });
        if (f != null) {
            this.j.post(new Runnable() { // from class: alrj
                @Override // java.lang.Runnable
                public final void run() {
                    alrm alrmVar = alrm.this;
                    alqz alqzVar = f;
                    alrmVar.h.b(alqzVar);
                    alrmVar.i.b(alqzVar);
                }
            });
        }
    }
}
