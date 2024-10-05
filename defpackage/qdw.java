package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qdw extends qob implements qdk {
    private static final qnw a;
    private static final rvm b;
    private static final pse c;
    private static final qar d;

    static {
        pse pseVar = new pse();
        c = pseVar;
        qdu qduVar = new qdu();
        d = qduVar;
        a = new qnw("GoogleAuthService.API", qduVar, pseVar, null, null, null, null);
        b = qar.g("GoogleAuthServiceClient");
    }

    public qdw(Context context) {
        super(context, a, qnt.f, qoa.a);
    }

    public static void a(Status status, Object obj, rpv rpvVar) {
        if (qar.p(status, obj, rpvVar)) {
            return;
        }
        b.b("The task is already complete.", new Object[0]);
    }
}
