package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aivq {
    private static final SparseIntArray r;
    public boolean c;
    public boolean d;
    public boolean f;
    public long g;
    public long h;
    public int i;
    public int j;
    public Bitmap o;
    public Bitmap p;
    private int t;
    private final AtomicBoolean s = new AtomicBoolean();
    public final Set a = new CopyOnWriteArraySet();
    public int b = 0;
    public boolean e = true;
    public CharSequence l = "";
    public CharSequence m = "";
    public CharSequence n = "";
    public float k = 1.0f;
    private aami u = new aami();
    public owg q = owg.AUDIO_ROUTE_UNSPECIFIED;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        r = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 1);
        sparseIntArray.put(3, 1);
        sparseIntArray.put(4, 6);
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 1);
        sparseIntArray.put(7, 1);
        sparseIntArray.put(8, 5);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        sparseIntArray.put(11, 1);
        sparseIntArray.put(12, 4);
        sparseIntArray.put(13, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (!this.s.compareAndSet(true, false)) {
            throw new IllegalStateException();
        }
        b(0);
    }

    public final void b(int i) {
        this.t = i | this.t;
        if (this.s.get()) {
            return;
        }
        if (this.t != 0) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((aivp) it.next()).d(this.t);
            }
        }
        this.t = 0;
    }

    public final void c(aivp aivpVar) {
        this.a.add(aivpVar);
    }

    public final void d() {
        n();
        i(0);
        h(false, false);
        f(false);
        g(0L);
        j(0L);
        m(null, null);
        CharSequence d = zhq.d(null);
        if (!TextUtils.equals(this.n, d)) {
            this.n = d;
            b(512);
        }
        l(new aami());
        k(null, null);
        a();
    }

    public final void e(boolean z) {
        if (this.e != z) {
            this.e = z;
            b(256);
        }
    }

    public final void f(boolean z) {
        if (this.f != z) {
            this.f = z;
            b(4);
        }
    }

    public final void g(long j) {
        if (this.g != j) {
            this.g = j;
            b(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(boolean z, boolean z2) {
        if (this.c == z && this.d == z2) {
            return;
        }
        this.c = z;
        this.d = z2;
        b(2);
    }

    public final void i(int i) {
        if (this.b != i) {
            this.b = i;
            b(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(long j) {
        if (this.h != j) {
            this.h = j;
            b(16);
        }
    }

    public final void k(Bitmap bitmap, Bitmap bitmap2) {
        this.o = bitmap;
        this.p = bitmap2;
        b(128);
    }

    public final void l(aami aamiVar) {
        if (amkq.b(this.u.e(), aamiVar.e())) {
            return;
        }
        this.u = aamiVar;
        b(64);
    }

    public final void m(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence d = zhq.d(charSequence);
        CharSequence d2 = zhq.d(charSequence2);
        if (TextUtils.equals(this.l, d) && TextUtils.equals(this.m, d2)) {
            return;
        }
        this.l = d;
        this.m = d2;
        b(32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n() {
        if (!this.s.compareAndSet(false, true)) {
            throw new IllegalStateException();
        }
    }
}
