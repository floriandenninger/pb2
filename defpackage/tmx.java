package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tmx implements amnv {
    final /* synthetic */ Executor a;
    final /* synthetic */ tko b;
    final /* synthetic */ axpg c;
    final /* synthetic */ Context d;
    final /* synthetic */ ammv e;
    final /* synthetic */ vcw f;
    final /* synthetic */ ammv g;

    public tmx(Executor executor, tko tkoVar, axpg axpgVar, Context context, ammv ammvVar, vcw vcwVar, ammv ammvVar2) {
        this.a = executor;
        this.b = tkoVar;
        this.c = axpgVar;
        this.d = context;
        this.e = ammvVar;
        this.f = vcwVar;
        this.g = ammvVar2;
    }

    @Override // defpackage.amnv
    public final /* bridge */ /* synthetic */ Object get() {
        Executor executor = this.a;
        this.b.g();
        tmv tmvVar = new tmv(executor);
        CronetEngine cronetEngine = (CronetEngine) this.c.get();
        cronetEngine.getClass();
        tvx tvxVar = new tvx(new tvl(new tvk(cronetEngine)), this.d, tmvVar);
        if (this.e.h()) {
            tvxVar.g((tvv) this.e.c());
        }
        Context context = this.d;
        vcw vcwVar = this.f;
        tmw tmwVar = null;
        if (this.g.h() && ((axpg) this.g.c()).get() != null) {
            tmwVar = new tmw(this.g);
        }
        return new tmt(context, tvxVar, vcwVar, tmwVar);
    }
}
