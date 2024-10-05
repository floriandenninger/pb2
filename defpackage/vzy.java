package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vzy implements ylb {
    private final afsy a;
    private final wcu b;
    private final axzf c;

    public vzy(afsy afsyVar, wcu wcuVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = afsyVar;
        this.b = wcuVar;
        this.c = axzfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        Boolean bool;
        aqvj aqvjVar = this.c.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45357991L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45357991L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45357991L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (!bool.booleanValue()) {
            return 0;
        }
        yjk.e();
        afsx c = this.a.c();
        if (!(c instanceof AccountIdentity)) {
            return 0;
        }
        AccountIdentity accountIdentity = (AccountIdentity) c;
        if (this.b.b(accountIdentity.d()) == null) {
            this.b.c(accountIdentity);
        }
        return 0;
    }
}
