package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udj implements uau {
    private final twx a;
    private final ucj b;
    private final shf c;
    private final ammv d;
    private final ubh e;

    public udj(twx twxVar, ucj ucjVar, shf shfVar, ammv ammvVar, ubh ubhVar) {
        this.a = twxVar;
        this.c = shfVar;
        this.d = ammvVar;
        this.b = ucjVar;
        this.e = ubhVar;
    }

    public static int c(aojh aojhVar) {
        aone builder = aojhVar.toBuilder();
        builder.copyOnWrite();
        aojh aojhVar2 = (aojh) builder.instance;
        aojhVar2.h = null;
        aojhVar2.b &= -33;
        return ((aojh) builder.build()).hashCode();
    }

    @Override // defpackage.uau
    public final void a(String str, aooy aooyVar, Throwable th) {
        tzk.g("StoreTargetCallback", "Registration finished for account: %s (FAILURE).", str);
        try {
            twp b = this.a.b(str).b();
            b.d(twb.FAILED_REGISTRATION);
            this.a.e(b.a());
            ((afyo) ((amna) this.d).a).a(th);
        } catch (tww unused) {
        }
    }

    @Override // defpackage.uau
    public final void b(String str, aooy aooyVar, aooy aooyVar2) {
        tzk.e("StoreTargetCallback", "Registration finished for account: %s (SUCCESS).", str);
        aojh aojhVar = (aojh) aooyVar;
        aoji aojiVar = (aoji) aooyVar2;
        try {
            twu b = this.a.b(str);
            twp b2 = b.b();
            b2.c(c(aojhVar));
            b2.d(twb.REGISTERED);
            b2.e = Long.valueOf(this.c.c());
            if (aojiVar.d != 0 && b.h == 0 && b.i.longValue() == 0) {
                b2.f = Long.valueOf(aojiVar.d);
            }
            if ((aojiVar.b & 4) != 0) {
                b2.b = aojiVar.c;
            } else if (TextUtils.isEmpty(b.c)) {
                try {
                    b2.b = this.b.a(str);
                } catch (Exception e) {
                    tzk.c("StoreTargetCallback", e, "Failed to get the obfuscated account ID for: %s", str);
                }
            }
            twu a = b2.a();
            this.a.e(a);
            ((afyo) ((amna) this.d).a).b();
            aokm a2 = aokm.a(aojhVar.c);
            if (a2 == null) {
                a2 = aokm.REGISTRATION_REASON_UNSPECIFIED;
            }
            if (a2 == aokm.LOCALE_CHANGED) {
                this.e.b(a, aokf.LOCALE_CHANGED);
            }
        } catch (tww unused) {
        }
    }
}
