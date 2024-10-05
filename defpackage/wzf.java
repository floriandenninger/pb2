package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wzf extends wzc {
    protected final shf g;
    wze h;
    final long i;
    private final Object j;
    private final Object k;
    private final afsy l;

    public wzf(Context context, String str, apck apckVar, String str2, String str3, wyx wyxVar, shf shfVar, long j, afsy afsyVar, boolean z, boolean z2, int i) {
        super(context, str, apckVar, str2, str3, wyxVar, z, z2, i);
        this.g = shfVar;
        amkq.N(j >= 0);
        this.i = j;
        afsyVar.getClass();
        this.l = afsyVar;
        this.j = new Object();
        this.k = new Object();
    }

    @Override // defpackage.wzc, defpackage.wza
    public final String b() {
        yjk.e();
        synchronized (this.j) {
            wze wzeVar = this.h;
            if (j(wzeVar)) {
                return wzeVar.a;
            }
            synchronized (this.k) {
                synchronized (this.j) {
                    if (j(this.h)) {
                        return this.h.a;
                    }
                    String i = i();
                    String b = super.b();
                    synchronized (this.j) {
                        long c = this.g.c();
                        if (!TextUtils.isEmpty(b) && c > 0) {
                            this.h = new wze(b, c, i);
                        } else {
                            this.h = null;
                        }
                    }
                    return b;
                }
            }
        }
    }

    @Override // defpackage.wzc, defpackage.wza
    public final void e(Executor executor) {
        executor.execute(new wzd(this));
    }

    @Override // defpackage.wzc, defpackage.wza
    public final void f() {
        yjk.e();
        b();
    }

    protected final String i() {
        return this.l.c().d();
    }

    protected final boolean j(wze wzeVar) {
        String str;
        long j = this.i;
        if (wzeVar == null || TextUtils.isEmpty(wzeVar.a) || (str = wzeVar.a) == null || str.length() <= 8) {
            return false;
        }
        long min = Math.min(this.i, j);
        long j2 = wzeVar.b;
        long c = this.g.c();
        return c >= j2 && c < j2 + min && TextUtils.equals(wzeVar.c, i());
    }
}
