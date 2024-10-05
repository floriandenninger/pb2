package defpackage;

import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abzy implements acac, acao {
    public final acas a;
    public final acap b;
    public final int c;
    public final int d;
    public acab e;
    private final Surface g;
    private final String h;
    private final abzz i;
    private final Handler j;
    private final long k;
    private long l;
    private long m;
    private boolean o;
    private final Runnable f = new abzx(this);
    private long n = Long.MIN_VALUE;
    private boolean p = true;

    public abzy(acap acapVar, acas acasVar, int i, int i2, abzz abzzVar, Handler handler) {
        amkq.E(i2 > 0 && i >= i2);
        acapVar.getClass();
        this.b = acapVar;
        acasVar.getClass();
        this.a = acasVar;
        abzzVar.getClass();
        this.i = abzzVar;
        handler.getClass();
        this.j = handler;
        this.c = i2;
        this.d = i;
        int i3 = i < i2 ? i2 : i;
        i = i3 <= i ? i3 : i;
        long nanos = TimeUnit.SECONDS.toNanos(1L) / i;
        this.l = nanos;
        this.m = (nanos * 10) / 100;
        acasVar.f(i);
        this.k = TimeUnit.SECONDS.toMillis(1L) / i2;
        String str = acasVar.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
        sb.append("FRC[");
        sb.append(str);
        sb.append("]");
        String sb2 = sb.toString();
        this.h = sb2;
        String.valueOf(sb2).length();
        Surface surface = acasVar.j;
        surface.getClass();
        this.g = surface;
        acapVar.d(surface);
        acapVar.c(this, handler);
    }

    private final void h() {
        this.o = false;
    }

    @Override // defpackage.acac
    public final void a(int i) {
        acas acasVar = this.a;
        boolean isEmpty = acasVar.o.isEmpty();
        int intValue = isEmpty ? acasVar.c : ((Integer) acasVar.o.peekLast()).intValue();
        if (i == intValue) {
            return;
        }
        if (acasVar.q && i < intValue) {
            acasVar.o.add(Integer.valueOf(Math.max(0, i - (acasVar.s * 1000))));
        }
        acasVar.o.add(Integer.valueOf(i));
        if (isEmpty) {
            long j = acasVar.p;
            long j2 = acasVar.r + j;
            long j3 = 0;
            if (j > 0) {
                abzz abzzVar = acasVar.f;
                j3 = Math.max(j2 - System.currentTimeMillis(), 0L);
            }
            acasVar.g.postDelayed(acasVar.i, j3);
        }
    }

    public final int b() {
        return this.a.c;
    }

    @Override // defpackage.acac
    public final boolean c() {
        this.b.c(null, null);
        return this.a.c();
    }

    @Override // defpackage.acac
    public final boolean d() {
        if (!this.a.d()) {
            return false;
        }
        this.o = true;
        this.n = Long.MIN_VALUE;
        this.j.postDelayed(this.f, this.k);
        return true;
    }

    @Override // defpackage.acac
    public final boolean e() {
        h();
        return this.a.e();
    }

    @Override // defpackage.acao
    public final void f(acap acapVar) {
        long j;
        this.j.removeCallbacks(this.f);
        if (this.o) {
            if (acapVar != this.b) {
                Log.e("VideoCaptureFRC", "Unexpected video source");
            }
            long h = this.i.h();
            long j2 = this.n;
            if (j2 < 0) {
                this.n = h;
                j2 = h;
            }
            try {
                if (h >= j2 - this.m) {
                    if (this.p) {
                        acapVar.a(this.g, j2);
                    }
                    do {
                        j = this.n + this.l;
                        this.n = j;
                    } while (j <= h);
                }
            } catch (Exception e) {
                Log.e("VideoCaptureFRC", "Error copying frame to encoder", e);
                acab acabVar = this.e;
                if (acabVar != null) {
                    acabVar.a(this, 7);
                }
            }
            this.j.postDelayed(this.f, this.k);
        }
    }

    @Override // defpackage.acac
    public final String g() {
        return this.h;
    }

    @Override // defpackage.acac
    public final boolean j() {
        return this.o && this.a.j();
    }

    @Override // defpackage.acac
    public final boolean k() {
        if (!this.a.k()) {
            return false;
        }
        this.p = true;
        return true;
    }

    @Override // defpackage.acac
    public final boolean l(acaa acaaVar) {
        h();
        return this.a.l(acaaVar);
    }

    @Override // defpackage.acac
    public final boolean m() {
        throw null;
    }
}
