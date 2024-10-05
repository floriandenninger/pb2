package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class osq implements ypd {
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public long g;
    private final ypa h;
    private final Handler i;
    private final Runnable j = new Runnable() { // from class: osp
        @Override // java.lang.Runnable
        public final void run() {
            osq.this.b();
        }
    };
    public final azrl a = azrl.e();

    public osq(ypa ypaVar, Handler handler) {
        this.h = ypaVar;
        this.i = handler;
    }

    public final void a() {
        this.h.g(this);
    }

    public final void b() {
        this.e = 0L;
        this.c = true;
        this.i.removeCallbacks(this.j);
    }

    public final void c(int i, TimeUnit timeUnit) {
        this.g = timeUnit.toMillis(i);
    }

    public final void d() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c = true;
        this.i.removeCallbacks(this.j);
    }

    public final void e() {
        if (this.b) {
            this.b = false;
            this.i.postDelayed(this.j, this.f);
        }
    }

    public final void g() {
        this.h.m(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aheg.class};
        }
        if (i == 0) {
            aheg ahegVar = (aheg) obj;
            if (!this.b) {
                return null;
            }
            long c = ahegVar.c();
            if (this.c) {
                this.d = c;
                this.c = false;
                return null;
            }
            long j = this.e + (c - this.d);
            this.e = j;
            this.d = c;
            if (j < this.g) {
                return null;
            }
            this.a.c(zjf.a);
            e();
            b();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
