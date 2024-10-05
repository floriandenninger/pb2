package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ubd implements udr {
    public Map a;

    public abstract uag a(Bundle bundle, aoko aokoVar);

    protected abstract String b();

    @Override // defpackage.udr
    public final /* synthetic */ long d() {
        return 0L;
    }

    @Override // defpackage.udr
    public final twc e(Bundle bundle) {
        String b = b();
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        int i = bundle.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT");
        aone createBuilder = aoko.a.createBuilder();
        createBuilder.copyOnWrite();
        aoko aokoVar = (aoko) createBuilder.instance;
        aokoVar.b |= 1;
        aokoVar.c = i;
        uag a = a(bundle, (aoko) createBuilder.build());
        if (!a.b() || !a.d) {
            if (TextUtils.isEmpty(b) || !this.a.containsKey(b)) {
                tzk.a("ScheduledRpcHandler", "Scheduled RPC callback not found. Callback key: [%s]", b);
            } else {
                tzk.a("ScheduledRpcHandler", "Calling scheduled RPC callback. Callback key: [%s]", b);
                uau uauVar = (uau) this.a.get(b);
                if (!a.b()) {
                    uauVar.b(string, a.a, a.b);
                } else {
                    uauVar.a(string, a.a, a.c);
                }
            }
            if (a.b()) {
                return twc.a(a.c);
            }
            return twc.a;
        }
        Throwable th = a.c;
        tvy b2 = twc.b();
        b2.b = 2;
        b2.a = th;
        return b2.a();
    }

    @Override // defpackage.udr
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.udr
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.udr
    public final /* synthetic */ void i() {
    }
}
