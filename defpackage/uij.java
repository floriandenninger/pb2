package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uij {
    public Context a;
    public Class b;
    public uje c;
    private uin d;
    private ufn e;
    private ExecutorService f;
    private ued g;
    private tip h;
    private ujx i;
    private ugz j;

    public final uik a() {
        ufn ufnVar;
        ExecutorService executorService;
        ued uedVar;
        Class cls;
        uje ujeVar;
        tip tipVar;
        ujx ujxVar;
        ugz ugzVar;
        if (!c().h()) {
            e(Executors.newCachedThreadPool(tyo.T()));
        }
        ExecutorService executorService2 = (ExecutorService) c().c();
        b();
        ufn ufnVar2 = new ufn();
        this.e = ufnVar2;
        b();
        this.d = new uin(ufnVar2);
        b();
        b().a.getClass();
        this.g = new uer(this.a, executorService2, b().c, b().a, null, null, null, null);
        uje ujeVar2 = this.c;
        if (!(ujeVar2 == null ? amlr.a : ammv.j(ujeVar2)).h()) {
            b();
            this.c = new ujc(this.a);
        }
        tip tipVar2 = this.h;
        if (tipVar2 == null) {
            throw new IllegalStateException("Property \"vePrimitives\" has not been set");
        }
        if (!(tipVar2 instanceof tio)) {
            b();
            g(new ukb(ufnVar2, tipVar2));
        }
        uin uinVar = this.d;
        if (uinVar == null || (ufnVar = this.e) == null || (executorService = this.f) == null || (uedVar = this.g) == null || (cls = this.b) == null || (ujeVar = this.c) == null || (tipVar = this.h) == null || (ujxVar = this.i) == null || (ugzVar = this.j) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" limitedAvailableAccountsModel");
            }
            if (this.e == null) {
                sb.append(" internalAccountsModel");
            }
            if (this.f == null) {
                sb.append(" backgroundExecutor");
            }
            if (this.g == null) {
                sb.append(" avatarImageLoader");
            }
            if (this.b == null) {
                sb.append(" accountClass");
            }
            if (this.c == null) {
                sb.append(" oneGoogleEventLogger");
            }
            if (this.h == null) {
                sb.append(" vePrimitives");
            }
            if (this.i == null) {
                sb.append(" visualElements");
            }
            if (this.j == null) {
                sb.append(" accountLayer");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new uik(uinVar, ufnVar, executorService, uedVar, cls, ujeVar, tipVar, ujxVar, ugzVar);
    }

    public final ugz b() {
        ugz ugzVar = this.j;
        if (ugzVar != null) {
            return ugzVar;
        }
        throw new IllegalStateException("Property \"accountLayer\" has not been set");
    }

    public final ammv c() {
        ExecutorService executorService = this.f;
        return executorService == null ? amlr.a : ammv.j(executorService);
    }

    public final void d(ugz ugzVar) {
        if (ugzVar == null) {
            throw new NullPointerException("Null accountLayer");
        }
        this.j = ugzVar;
    }

    public final void e(ExecutorService executorService) {
        if (executorService == null) {
            throw new NullPointerException("Null backgroundExecutor");
        }
        this.f = executorService;
    }

    public final void f(tip tipVar) {
        if (tipVar == null) {
            throw new NullPointerException("Null vePrimitives");
        }
        this.h = tipVar;
    }

    public final void g(ujx ujxVar) {
        if (ujxVar == null) {
            throw new NullPointerException("Null visualElements");
        }
        this.i = ujxVar;
    }
}
