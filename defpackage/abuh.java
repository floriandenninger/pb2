package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abuh implements Runnable {
    public final acaf a;
    public final acac b;
    public final Handler c;
    public final ScheduledExecutorService d;
    public ScheduledFuture e;
    public int f;
    private final shf h;
    private final int i;
    private final int j;
    public int g = Integer.MAX_VALUE;
    private long l = -1;
    private long m = -1;
    private final ArrayDeque k = new ArrayDeque();

    public abuh(acaf acafVar, acac acacVar, Handler handler, ScheduledExecutorService scheduledExecutorService, shf shfVar, int i, int i2, int i3) {
        this.h = shfVar;
        this.a = acafVar;
        this.b = acacVar;
        this.c = handler;
        this.d = scheduledExecutorService;
        this.f = i;
        this.i = i2;
        this.j = i3;
    }

    public static int a(int i) {
        return ((i + 144000) * 4) / 8;
    }

    private final void b(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = abui.a;
            if (i2 >= 3) {
                return;
            }
            if (this.f >= abui.a[i2]) {
                int i3 = abui.b[i2];
                int min = Math.min(Math.max(((this.f / i3) + i) * i3, this.i), this.j);
                if (min != this.f) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Video bitrate: ");
                    sb.append(min);
                    zga.g(sb.toString());
                    int a = a(min);
                    this.g = a;
                    StringBuilder sb2 = new StringBuilder(25);
                    sb2.append("Buffer limit: ");
                    sb2.append(a);
                    zga.g(sb2.toString());
                    this.f = min;
                    this.c.post(new abug(this, i));
                    return;
                }
                return;
            }
            i2++;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int b = this.a.b();
        if (b < 0) {
            return;
        }
        int intValue = this.k.size() == 3 ? ((Integer) this.k.remove()).intValue() : 0;
        this.k.add(Integer.valueOf(b));
        Iterator it = this.k.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (intValue2 >= intValue) {
                if (intValue2 != 0) {
                    i = intValue2;
                } else if (intValue != 0) {
                    i = 0;
                }
                if (i > intValue) {
                    i2++;
                }
                intValue = intValue2;
            }
            i2--;
            intValue = intValue2;
        }
        double d = b;
        double d2 = this.g;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        long d4 = this.h.d();
        if (i2 >= 3 || d3 >= 0.25d) {
            this.l = this.h.d();
            b(-1);
            return;
        }
        if (i2 > 0 || d3 >= 0.15d) {
            return;
        }
        long j = this.l;
        boolean z = j < 0 || d4 - j > 16000;
        long j2 = this.m;
        boolean z2 = j2 < 0 || d4 - j2 > 6000;
        if (j < 0 || (z && z2)) {
            this.m = this.h.d();
            b(1);
        }
    }
}
