package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.Feature;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ukf implements Callable {
    public final /* synthetic */ ukg a;
    private final /* synthetic */ int b;

    public /* synthetic */ ukf(ukg ukgVar, int i) {
        this.b = i;
        this.a = ukgVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        if (i == 0) {
            return Arrays.asList(qde.n(this.a.b, ukg.a));
        }
        int i2 = 1;
        if (i == 1) {
            return Arrays.asList(qde.m(this.a.b));
        }
        Context context = this.a.b;
        qip.an(context);
        qde.h(context, 11400000);
        String str = context.getApplicationInfo().packageName;
        uvr.g(context);
        if (axst.c() && qde.j(context)) {
            qog G = prh.G(context);
            qip.az(str, "Client package name cannot be null!");
            qrd b = qre.b();
            b.b = new Feature[]{qcv.c};
            b.a = new rnv(str, i2);
            b.c = 1514;
            try {
                Bundle bundle = (Bundle) qde.d(((qob) G).w(b.a()), "google accounts access request");
                String string = bundle.getString("Error");
                Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
                qef a = qef.a(string);
                if (qef.SUCCESS.equals(a)) {
                    return true;
                }
                if (!qef.b(a)) {
                    throw new qcw(string);
                }
                rvm rvmVar = qde.d;
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb.append("isUserRecoverableError status: ");
                sb.append(valueOf);
                rvmVar.b("GoogleAuthUtil", sb.toString());
                throw new UserRecoverableAuthException(string, intent);
            } catch (qnx e) {
                qde.i(e, "google accounts access request");
            }
        }
        return (Boolean) qde.c(context, qde.c, new qdc(str));
    }
}
