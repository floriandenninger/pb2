package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tqd {
    public static volatile boolean a = false;
    public final Context b;
    public final tss c;
    public final tov d;
    public final tow e;
    public final trf f;
    public final trh g;
    public final tnj h;
    public final tme i;
    public final tth j;
    public final tsw k;
    public final tta l;
    public final ammv m;
    public final Executor n;
    public final ammv o;
    public final tko p;

    public tqd(Context context, tss tssVar, trf trfVar, trh trhVar, tov tovVar, tow towVar, tnj tnjVar, tme tmeVar, tth tthVar, tsw tswVar, tta ttaVar, ammv ammvVar, Executor executor, ammv ammvVar2, tko tkoVar) {
        this.b = context;
        this.c = tssVar;
        this.f = trfVar;
        this.g = trhVar;
        this.d = tovVar;
        this.e = towVar;
        this.h = tnjVar;
        this.i = tmeVar;
        this.j = tthVar;
        this.k = tswVar;
        this.l = ttaVar;
        this.m = ammvVar;
        this.n = executor;
        this.o = ammvVar2;
        this.p = tkoVar;
    }

    public final anhy a() {
        return amkq.n(this.f.a(), new tpu(this, 4), this.n);
    }

    public final anhy b(final boolean z) {
        int i = tsx.a;
        return anfq.i(c(), new anfz() { // from class: tqb
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                tqd tqdVar = tqd.this;
                boolean z2 = z;
                tqdVar.p.v();
                tqdVar.c.g(1031);
                tov tovVar = tqdVar.d;
                return anfq.i(tovVar.d.d(), new top(tovVar, z2, 0), tovVar.h);
            }
        }, this.n);
    }

    public final anhy c() {
        if (a) {
            return anaf.O(null);
        }
        final SharedPreferences ar = rwh.ar(this.b, "gms_icing_mdd_manager_metadata", this.m);
        return amka.c(anaf.O(null)).i(new anfz() { // from class: tpv
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                tqd tqdVar = tqd.this;
                SharedPreferences sharedPreferences = ar;
                int i = 0;
                if (!sharedPreferences.getBoolean("mdd_migrated_to_offroad", false)) {
                    int i2 = tsx.a;
                    return amkq.m(tqdVar.a(), new tps(sharedPreferences, i), tqdVar.n);
                }
                return anaf.O(null);
            }
        }, this.n).i(new tpu(this, 10), this.n).i(new tpu(this, 6), this.n).i(new tpu(this, 7), this.n).h(rtp.t, this.n);
    }
}
