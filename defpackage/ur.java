package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ur implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new uo(0);
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private static final wv b(RecyclerView recyclerView, int i, long j) {
        int b2 = recyclerView.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            wv l = RecyclerView.l(recyclerView.g.e(i2));
            if (l.c == i && !l.t()) {
                return null;
            }
        }
        wk wkVar = recyclerView.d;
        try {
            recyclerView.R();
            wv n = wkVar.n(i, j);
            if (n != null) {
                if (!n.s() || n.t()) {
                    wkVar.d(n, false);
                } else {
                    wkVar.i(n.a);
                }
            }
            return n;
        } finally {
            recyclerView.T(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.r && this.d == 0) {
            this.d = System.nanoTime();
            recyclerView.post(this);
        }
        up upVar = recyclerView.L;
        upVar.a = i;
        upVar.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uq uqVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        uq uqVar2;
        long j = 0;
        try {
            if (this.c.isEmpty()) {
                this.d = 0L;
                return;
            }
            int size = this.c.size();
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView3 = (RecyclerView) this.c.get(i);
                if (recyclerView3.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView3.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.d = 0L;
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.e;
            int size2 = this.c.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                RecyclerView recyclerView4 = (RecyclerView) this.c.get(i3);
                if (recyclerView4.getWindowVisibility() == 0) {
                    recyclerView4.L.c(recyclerView4, false);
                    i2 += recyclerView4.L.d;
                }
            }
            this.f.ensureCapacity(i2);
            int i4 = 0;
            int i5 = 0;
            while (i4 < size2) {
                RecyclerView recyclerView5 = (RecyclerView) this.c.get(i4);
                if (recyclerView5.getWindowVisibility() == 0) {
                    up upVar = recyclerView5.L;
                    int abs = Math.abs(upVar.a) + Math.abs(upVar.b);
                    int i6 = 0;
                    while (true) {
                        int i7 = upVar.d;
                        if (i6 < i7 + i7) {
                            if (i5 >= this.f.size()) {
                                uqVar2 = new uq();
                                this.f.add(uqVar2);
                            } else {
                                uqVar2 = (uq) this.f.get(i5);
                            }
                            int[] iArr = upVar.c;
                            try {
                                int i8 = iArr[i6 + 1];
                                uqVar2.a = i8 <= abs;
                                uqVar2.b = abs;
                                uqVar2.c = i8;
                                uqVar2.d = recyclerView5;
                                uqVar2.e = iArr[i6];
                                i5++;
                                i6 += 2;
                            } catch (Throwable th) {
                                th = th;
                                j = 0;
                                this.d = j;
                                throw th;
                            }
                        }
                    }
                }
                i4++;
                j = 0;
            }
            Collections.sort(this.f, b);
            for (int i9 = 0; i9 < this.f.size() && (recyclerView = (uqVar = (uq) this.f.get(i9)).d) != null; i9++) {
                wv b2 = b(recyclerView, uqVar.e, true != uqVar.a ? nanos : Long.MAX_VALUE);
                if (b2 != null && b2.b != null && b2.s() && !b2.t() && (recyclerView2 = (RecyclerView) b2.b.get()) != null) {
                    if (recyclerView2.y && recyclerView2.g.b() != 0) {
                        recyclerView2.W();
                    }
                    up upVar2 = recyclerView2.L;
                    upVar2.c(recyclerView2, true);
                    if (upVar2.d != 0) {
                        ws wsVar = recyclerView2.M;
                        vw vwVar = recyclerView2.m;
                        wsVar.d = 1;
                        wsVar.e = vwVar.b();
                        wsVar.g = false;
                        wsVar.h = false;
                        wsVar.i = false;
                        int i10 = 0;
                        while (true) {
                            int i11 = upVar2.d;
                            if (i10 >= i11 + i11) {
                                break;
                            }
                            b(recyclerView2, upVar2.c[i10], nanos);
                            i10 += 2;
                        }
                    }
                }
                uqVar.a = false;
                uqVar.b = 0;
                uqVar.c = 0;
                uqVar.d = null;
                uqVar.e = 0;
            }
            this.d = 0L;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
