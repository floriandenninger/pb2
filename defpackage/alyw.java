package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alyw {
    public final alzp a;
    public final alzr b;

    public alyw(alzp alzpVar, alzr alzrVar) {
        this.a = alzpVar;
        this.b = alzrVar;
    }

    public final anhy a(final String str, final String str2) {
        alzp alzpVar = this.a;
        return anfq.h(alzpVar.b.a(), new amml() { // from class: alzo
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                String str3 = str;
                String str4 = str2;
                for (amao amaoVar : Collections.unmodifiableMap(((amal) obj).d).values()) {
                    alym alymVar = amaoVar.d;
                    if (alymVar == null) {
                        alymVar = alym.a;
                    }
                    if (alymVar.i.equals(str3)) {
                        alym alymVar2 = amaoVar.d;
                        if (alymVar2 == null) {
                            alymVar2 = alym.a;
                        }
                        if (alymVar2.c.equals(str4)) {
                            return AccountId.b(amaoVar.c);
                        }
                    }
                }
                throw new alzj(str3.length() != 0 ? "No account is found for ".concat(str3) : new String("No account is found for "));
            }
        }, alzpVar.a);
    }

    public final anhy b(AccountId accountId) {
        return anfq.h(this.a.b.a(), new alzn(accountId, 0), angq.a);
    }

    public final anhy c() {
        alzp alzpVar = this.a;
        return anfq.h(alzpVar.b.a(), akpw.j, alzpVar.a);
    }
}
