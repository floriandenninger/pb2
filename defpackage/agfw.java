package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agfw extends agof implements aftc, ypd {
    public final Context a;
    public final Executor b;
    public final yxn c;
    public final agsg d;
    public final agzr e;
    private final ypa g;
    private final azrw h;
    private final afsy i;
    private final agzz j;
    private final aght k;
    private final SharedPreferences l;
    private volatile agfp m;

    public agfw(Context context, ypa ypaVar, Executor executor, yxn yxnVar, azrw azrwVar, afsy afsyVar, agzz agzzVar, aght aghtVar, agrc agrcVar, aghg aghgVar, SharedPreferences sharedPreferences, agsg agsgVar, agzr agzrVar) {
        this.a = context;
        this.g = ypaVar;
        this.b = executor;
        this.c = yxnVar;
        this.i = afsyVar;
        this.h = azrwVar;
        this.j = agzzVar;
        this.k = aghtVar;
        this.l = sharedPreferences;
        this.d = agsgVar;
        this.e = agzrVar;
        ypaVar.g(agrcVar);
        ypaVar.g(this);
        aghgVar.a.g(aghgVar);
        aghgVar.h = false;
    }

    private final agsn i(afsx afsxVar) {
        afsxVar.getClass();
        if (!afsxVar.z()) {
            agfp agfpVar = this.m;
            if (agfpVar != null && afsxVar.d().equals(agfpVar.G)) {
                return agfpVar;
            }
            g();
            agfp agfpVar2 = new agfp(this.a, afsxVar);
            this.m = agfpVar2;
            ((agei) this.h.get()).h(agfpVar2.t);
            agfpVar2.u();
            this.g.g(agfpVar2);
            return agfpVar2;
        }
        throw new IllegalArgumentException("Identity must be signed in.");
    }

    @Override // defpackage.agof
    public final synchronized agsn a() {
        afsx c = this.i.c();
        if (c.z()) {
            return this.f;
        }
        try {
            if (this.m == null) {
                return i(c);
            }
            return this.m;
        } catch (SQLiteException e) {
            if (this.k.f) {
                return this.f;
            }
            throw e;
        }
    }

    @Override // defpackage.aftc
    public final void b(final afsx afsxVar) {
        this.b.execute(new Runnable() { // from class: agfv
            @Override // java.lang.Runnable
            public final void run() {
                agfw agfwVar = agfw.this;
                afsx afsxVar2 = afsxVar;
                Context context = agfwVar.a;
                yxn yxnVar = agfwVar.c;
                String d = afsxVar2.d();
                agsg agsgVar = agfwVar.d;
                context.deleteDatabase(agfp.p(d));
                agmm.v(context, yxnVar, d, agsgVar);
            }
        });
    }

    @Override // defpackage.agof
    public final String c() {
        return this.l.getString("current_offline_store_tag", "NO_OP_STORE_TAG");
    }

    @Override // defpackage.agof
    public final synchronized String d() {
        agsn a;
        a = a();
        return a != null ? a.q() : "NO_OP_STORE_TAG";
    }

    @Override // defpackage.agof
    public final synchronized void e() {
        afsx c = this.i.c();
        if (c.z()) {
            return;
        }
        int a = this.j.a();
        if (a == 1) {
            i(c);
            return;
        }
        if (a != 2) {
            i(c);
            agfp agfpVar = this.m;
            if (agfpVar == null || !agfpVar.m().j().isEmpty() || !agfpVar.i().j().isEmpty() || !agfpVar.k().d().isEmpty()) {
                this.j.b(true);
            } else {
                this.j.b(false);
            }
        }
    }

    public final void g() {
        if (this.m != null) {
            this.g.m(this.m);
            this.m.x();
            this.m = null;
            ((agei) this.h.get()).h(null);
        }
    }

    @Override // defpackage.agof
    public final boolean h() {
        if (this.m == null) {
            return false;
        }
        agfp agfpVar = this.m;
        return agfpVar.H && agfpVar.I.e();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        final int i2 = 0;
        final int i3 = 1;
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            if (zgx.f(this.a) || this.e.j()) {
                this.b.execute(new Runnable(this) { // from class: agfu
                    public final /* synthetic */ agfw a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i3 != 0) {
                            this.a.e();
                        } else {
                            this.a.g();
                        }
                    }
                });
                return null;
            }
            e();
            return null;
        }
        if (i == 1) {
            if (this.e.j()) {
                this.b.execute(new Runnable(this) { // from class: agfu
                    public final /* synthetic */ agfw a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i2 != 0) {
                            this.a.e();
                        } else {
                            this.a.g();
                        }
                    }
                });
                return null;
            }
            g();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
