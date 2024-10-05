package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzx implements udr {
    public final txa a;
    public final uds b;
    private final twx c;
    private final tzu d;
    private final shf e;

    public tzx(txa txaVar, twx twxVar, tzu tzuVar, uds udsVar, shf shfVar) {
        this.a = txaVar;
        this.c = twxVar;
        this.d = tzuVar;
        this.b = udsVar;
        this.e = shfVar;
    }

    @Override // defpackage.udr
    public final /* synthetic */ long d() {
        return 0L;
    }

    @Override // defpackage.udr
    public final twc e(Bundle bundle) {
        twu b;
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        long j = bundle.getLong("com.google.android.libraries.notifications.DELIVERED_TIMESTAMP");
        boolean z = bundle.getInt("com.google.android.libraries.notifications.MUTE_NOTIFICATION") == 1;
        if (TextUtils.isEmpty(string)) {
            b = null;
        } else {
            try {
                b = this.c.b(string);
            } catch (tww e) {
                return twc.a(e);
            }
        }
        twu twuVar = b;
        List b2 = this.a.b(string, 5);
        ArrayList arrayList = new ArrayList();
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((aokh) aonm.parseFrom(aokh.a, ((twz) it.next()).b));
            } catch (aoob e2) {
                tzk.c("OnNotificationReceivedHandler", e2, "Unable to parse FrontendNotificationThread message", new Object[0]);
            }
        }
        this.a.d(string, b2);
        this.d.a(twuVar, arrayList, twd.b(), new tzg(Long.valueOf(j), Long.valueOf(this.e.d()), aohm.SCHEDULED_RECEIVER), z);
        return twc.a;
    }

    @Override // defpackage.udr
    public final String f() {
        return "ON_NOTIFICATION_RECEIVED";
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
