package defpackage;

import android.text.TextUtils;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzd {
    private final twx a;
    private final txa b;
    private final ubr c;
    private final Set d;
    private final txo e;
    private final tzh f;

    public tzd(twx twxVar, txa txaVar, txo txoVar, ubr ubrVar, tzh tzhVar, Set set) {
        this.a = twxVar;
        this.b = txaVar;
        this.e = txoVar;
        this.c = ubrVar;
        this.f = tzhVar;
        this.d = set;
    }

    private final synchronized void b(twu twuVar, boolean z) {
        if (!z) {
            tzf a = this.f.a(aoic.NOTIFICATION_DATA_CLEANED);
            a.d(twuVar);
            a.i();
        } else {
            if (twuVar == null) {
                this.f.a(aoic.ACCOUNT_DATA_CLEANED).i();
                return;
            }
            tzk.e("AccountCleanupUtil", "Account deleted: %s", twuVar.b);
            if (TextUtils.isEmpty(twuVar.c)) {
                return;
            }
            tzf a2 = this.f.a(aoic.ACCOUNT_DATA_CLEANED);
            ((tzj) a2).m = twuVar.c;
            a2.i();
        }
    }

    public final synchronized void a(twu twuVar, boolean z) {
        String str = twuVar == null ? null : twuVar.b;
        tzk.e("AccountCleanupUtil", "Notification data deleted: %s", str);
        b(twuVar, z);
        this.c.d(twuVar, aohq.ACCOUNT_DATA_CLEANED);
        amxd listIterator = ((amvs) this.d).listIterator();
        while (listIterator.hasNext()) {
            ((ucp) listIterator.next()).d();
        }
        this.b.c(str);
        this.e.a.d(str);
        if (twuVar == null || !z) {
            return;
        }
        this.a.d(str);
    }
}
