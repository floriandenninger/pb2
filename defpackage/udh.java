package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udh {
    public final twx a;
    private final shf b;
    private final twn c;
    private final uat d;
    private final ucn e;
    private final uar f;
    private final ammv g;
    private final tze h;

    public udh(shf shfVar, tze tzeVar, twn twnVar, uat uatVar, twx twxVar, ucn ucnVar, uar uarVar, ammv ammvVar, Context context) {
        this.b = shfVar;
        this.h = tzeVar;
        this.c = twnVar;
        this.d = uatVar;
        this.a = twxVar;
        this.e = ucnVar;
        this.f = uarVar;
        this.g = ammvVar;
        tyo.j(context);
    }

    private final void b(String str, Throwable th) {
        twp a = twu.a();
        a.b(str);
        a.a();
        ((afyo) ((amna) this.g).a).a(th);
    }

    public final void a(String str, boolean z, aokm aokmVar) {
        twu a;
        amkq.F(!TextUtils.isEmpty(str), "Account name must not be empty.");
        if (!this.e.b(str)) {
            tzk.b("RegistrationHandler", "Registration failed. Account is not available on device, %s.", str);
            Exception exc = new Exception("Account intended to register is not available on device.");
            b(str, exc);
            twc.a(exc);
            return;
        }
        try {
            tze tzeVar = this.h;
            try {
                a = tzeVar.a.b(str);
            } catch (tww unused) {
                twp a2 = twu.a();
                a2.b(str);
                twu a3 = a2.a();
                long a4 = tzeVar.a.a(a3);
                twp b = a3.b();
                b.a = Long.valueOf(a4);
                a = b.a();
            }
            if (!z) {
                try {
                    int c = udj.c(this.f.a(str, aokmVar, aoko.a));
                    if (a.f == twb.REGISTERED || a.f == twb.PENDING_REGISTRATION) {
                        int i = a.h;
                        if (i != 0 && i == c) {
                            long c2 = this.b.c();
                            long longValue = a.g.longValue();
                            long max = Math.max(0L, this.c.f.longValue());
                            if (c2 - longValue > max) {
                                tzk.e("RegistrationHandler", "Last registration was more than [%d] ms ago, considering this as new.", Long.valueOf(max));
                            } else {
                                tzk.e("RegistrationHandler", "Not treating this register request as new. The last registration was at [%d], which is less than [%d] ms ago (current time [%d]), also the request hash [%d] doesn't differ from the old one.", Long.valueOf(longValue), Long.valueOf(max), Long.valueOf(c2), Integer.valueOf(c));
                                tzk.e("RegistrationHandler", "Skip registration. Target already stored for account: %s.", str);
                                ((afyo) ((amna) this.g).a).b();
                                twc twcVar = twc.a;
                                return;
                            }
                        }
                        tzk.e("RegistrationHandler", "New request hash [%d] differs with old request hash [%d].", Integer.valueOf(c), Integer.valueOf(i));
                    }
                } catch (uab unused2) {
                }
            }
            this.h.a(str, twb.PENDING_REGISTRATION);
            tzk.e("RegistrationHandler", "Registration scheduled for account: %s.", str);
            this.d.e(a, aokmVar);
        } catch (twv e) {
            tzk.b("RegistrationHandler", "Registration failed. Error inserting account, %s.", str);
            b(str, e);
            twc.a(e);
        }
    }
}
