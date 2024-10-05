package defpackage;

import android.os.Looper;
import androidx.lifecycle.LiveData$LifecycleBoundObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aot {
    static final Object a = new Object();
    final Object b;
    int c;
    volatile Object d;
    private aba e;
    private boolean f;
    private volatile Object g;
    private int h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public aot() {
        this.b = new Object();
        this.e = new aba();
        this.c = 0;
        Object obj = a;
        this.d = obj;
        this.k = new aoq(this);
        this.g = obj;
        this.h = -1;
    }

    static void c(String str) {
        if (aar.B().C()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void n(aos aosVar) {
        if (aosVar.d) {
            if (!aosVar.jG()) {
                aosVar.d(false);
                return;
            }
            int i = aosVar.e;
            int i2 = this.h;
            if (i >= i2) {
                return;
            }
            aosVar.e = i2;
            aosVar.c.a(this.g);
        }
    }

    public int a() {
        return this.h;
    }

    public Object b() {
        Object obj = this.g;
        if (obj != a) {
            return obj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:8:0x000e, B:17:0x0024, B:21:0x002a), top: B:7:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r5) {
        /*
            r4 = this;
            int r0 = r4.c
            int r5 = r5 + r0
            r4.c = r5
            boolean r5 = r4.f
            if (r5 == 0) goto La
            return
        La:
            r5 = 1
            r4.f = r5
        Ld:
            r1 = 0
            int r2 = r4.c     // Catch: java.lang.Throwable -> L32
            if (r0 == r2) goto L2f
            if (r0 != 0) goto L1a
            if (r2 <= 0) goto L19
            r0 = 0
            r3 = 1
            goto L1b
        L19:
            r0 = 0
        L1a:
            r3 = 0
        L1b:
            if (r0 <= 0) goto L21
            if (r2 != 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            if (r3 == 0) goto L28
            r4.h()     // Catch: java.lang.Throwable -> L32
            goto L2d
        L28:
            if (r0 == 0) goto L2d
            r4.i()     // Catch: java.lang.Throwable -> L32
        L2d:
            r0 = r2
            goto Ld
        L2f:
            r4.f = r1
            return
        L32:
            r5 = move-exception
            r4.f = r1
            goto L37
        L36:
            throw r5
        L37:
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aot.d(int):void");
    }

    public void e(aos aosVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (aosVar != null) {
                n(aosVar);
            } else {
                aax f = this.e.f();
                while (f.hasNext()) {
                    n((aos) ((aaw) f.next()).b);
                    if (this.j) {
                        break;
                    }
                }
            }
            if (!this.j) {
                this.i = false;
                return;
            }
            aosVar = null;
        }
    }

    public void f(aok aokVar, aox aoxVar) {
        c("observe");
        if (aokVar.getLifecycle().a() == aoe.DESTROYED) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, aokVar, aoxVar);
        aos aosVar = (aos) this.e.b(aoxVar, liveData$LifecycleBoundObserver);
        if (aosVar != null && !aosVar.c(aokVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (aosVar != null) {
            return;
        }
        aokVar.getLifecycle().b(liveData$LifecycleBoundObserver);
    }

    public void g(aox aoxVar) {
        c("observeForever");
        aor aorVar = new aor(this, aoxVar);
        aos aosVar = (aos) this.e.b(aoxVar, aorVar);
        if (aosVar instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (aosVar != null) {
            return;
        }
        aorVar.d(true);
    }

    protected void h() {
    }

    protected void i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.b) {
            obj2 = this.d;
            obj3 = a;
            this.d = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        aar B = aar.B();
        Runnable runnable = this.k;
        gm gmVar = B.b;
        aas aasVar = (aas) gmVar;
        if (aasVar.c == null) {
            synchronized (aasVar.a) {
                if (((aas) gmVar).c == null) {
                    ((aas) gmVar).c = aas.B(Looper.getMainLooper());
                }
            }
        }
        aasVar.c.post(runnable);
    }

    public void k(aox aoxVar) {
        c("removeObserver");
        aos aosVar = (aos) this.e.c(aoxVar);
        if (aosVar == null) {
            return;
        }
        aosVar.b();
        aosVar.d(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(Object obj) {
        c("setValue");
        this.h++;
        this.g = obj;
        e(null);
    }

    public boolean m() {
        return this.c > 0;
    }

    public aot(Object obj) {
        this.b = new Object();
        this.e = new aba();
        this.c = 0;
        this.d = a;
        this.k = new aoq(this);
        this.g = obj;
        this.h = 0;
    }
}
