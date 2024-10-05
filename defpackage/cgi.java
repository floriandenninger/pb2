package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgi {
    public static final Executor a = Executors.newCachedThreadPool();
    public volatile cgf b;
    private final Set c;
    private final Set d;
    private final Handler e;

    public cgi(Callable callable) {
        this(callable, false);
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            cll.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cgb) arrayList.get(i)).a(th);
        }
    }

    public final synchronized void b(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cgb) arrayList.get(i)).a(obj);
        }
    }

    public final void c(cgf cgfVar) {
        if (this.b != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.b = cgfVar;
        this.e.post(new cgg(this));
    }

    public final synchronized void d(cgb cgbVar) {
        if (this.b != null && this.b.b != null) {
            cgbVar.a(this.b.b);
        }
        this.d.add(cgbVar);
    }

    public final synchronized void e(cgb cgbVar) {
        if (this.b != null && this.b.a != null) {
            cgbVar.a(this.b.a);
        }
        this.c.add(cgbVar);
    }

    public final synchronized void f(cgb cgbVar) {
        this.d.remove(cgbVar);
    }

    public final synchronized void g(cgb cgbVar) {
        this.c.remove(cgbVar);
    }

    public cgi(Callable callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.d = new LinkedHashSet(1);
        this.e = new Handler(Looper.getMainLooper());
        this.b = null;
        if (z) {
            try {
                c((cgf) callable.call());
                return;
            } catch (Throwable th) {
                c(new cgf(th));
                return;
            }
        }
        a.execute(new cgh(this, callable));
    }
}
