package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amgr {
    public final amhf a;
    public final amfi b;
    public final AccountId c;

    public amgr(amhf amhfVar) {
        this.a = amhfVar;
        amhe amheVar = amhfVar.c;
        this.b = new amfi(amheVar == null ? amhe.a : amheVar);
        this.c = (amhfVar.b & 2) != 0 ? AccountId.b(amhfVar.d) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amgr a(amhf amhfVar) {
        return new amgr(amhfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amgr) {
            amgr amgrVar = (amgr) obj;
            if (this.b.equals(amgrVar.b)) {
                AccountId accountId = this.c;
                AccountId accountId2 = amgrVar.c;
                if (accountId == null) {
                    if (accountId2 == null) {
                        return true;
                    }
                } else if (accountId.equals(accountId2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}
