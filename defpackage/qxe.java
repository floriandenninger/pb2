package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qxe {
    public static volatile dvh a = dvh.UNKNOWN;
    private final Context b;
    private final Executor c;
    private final rpt d;
    private final boolean e;

    public qxe(Context context, Executor executor, rpt rptVar, boolean z) {
        this.b = context;
        this.c = executor;
        this.d = rptVar;
        this.e = z;
    }

    public static qxe a(final Context context, Executor executor, final boolean z) {
        return new qxe(context, executor, rqr.a(executor, new Callable() { // from class: qxd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new qxz(context, true != z ? "" : "GLAS");
            }
        }), z);
    }

    private final void g(final int i, long j, Exception exc, String str, String str2) {
        if (!this.e) {
            this.d.b(this.c, qxc.a);
            return;
        }
        final dvf a2 = dvi.a();
        String packageName = this.b.getPackageName();
        a2.copyOnWrite();
        dvi.i((dvi) a2.instance, packageName);
        a2.copyOnWrite();
        dvi.c((dvi) a2.instance, j);
        dvh dvhVar = a;
        a2.copyOnWrite();
        dvi.h((dvi) a2.instance, dvhVar);
        if (exc != null) {
            String b = amnz.b(exc);
            a2.copyOnWrite();
            dvi.d((dvi) a2.instance, b);
            String name = exc.getClass().getName();
            a2.copyOnWrite();
            dvi.e((dvi) a2.instance, name);
        }
        if (str2 != null) {
            a2.copyOnWrite();
            dvi.f((dvi) a2.instance, str2);
        }
        if (str != null) {
            a2.copyOnWrite();
            dvi.g((dvi) a2.instance, str);
        }
        this.d.b(this.c, new rox() { // from class: qxb
            @Override // defpackage.rox
            public final Object a(rpt rptVar) {
                dvf dvfVar = dvf.this;
                int i2 = i;
                dvh dvhVar2 = qxe.a;
                if (rptVar.k()) {
                    qxy a3 = ((qxz) rptVar.g()).a(((dvi) dvfVar.build()).toByteArray());
                    a3.b = i2;
                    a3.a();
                    return true;
                }
                return false;
            }
        });
    }

    public final void b(int i, String str) {
        g(i, 0L, null, null, str);
    }

    public final void c(int i, long j, Exception exc) {
        g(i, j, exc, null, null);
    }

    public final void d(int i, long j) {
        g(i, j, null, null, null);
    }

    public final void e(int i, long j, String str) {
        g(i, j, null, null, str);
    }

    public final void f(int i, long j, String str) {
        g(i, j, null, str, null);
    }
}
