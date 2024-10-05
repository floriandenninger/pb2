package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kcd {
    public final kbx a;
    public final ConcurrentMap b = new ConcurrentHashMap();
    private final Context c;
    private final wdm d;

    public kcd(kbx kbxVar, Context context, wdm wdmVar) {
        this.a = kbxVar;
        this.c = context;
        this.d = wdmVar;
    }

    public final String a() {
        String str = this.d.a().b;
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public final void b() {
        uvr.e(this.c);
    }

    public final void c(String str) {
        rpt b;
        qob qobVar = this.a.get();
        if (qmz.d.h(qobVar.w, 12451000) == 0) {
            qrd b2 = qre.b();
            b2.a = new rnv(str, 0);
            b = qobVar.t(b2.a());
        } else {
            b = rqr.b(new qnx(new Status(16)));
        }
        b.r(new kcc(this, str));
        b.n(new acwu(1));
    }

    public final void d() {
        c(a());
    }

    public final void e() {
        this.c.registerReceiver(new kbz(this), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
    }

    public final void f(Executor executor) {
        executor.execute(new kby(this, 1));
    }

    public final void g(Executor executor) {
        executor.execute(new kby(this, 0));
    }
}
