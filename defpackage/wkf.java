package defpackage;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.ValidationResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wkf implements alxc {
    private final afsy a;
    private final alyl b;

    public wkf(afsy afsyVar, alyl alylVar) {
        this.a = afsyVar;
        this.b = alylVar;
    }

    @Override // defpackage.alxc
    public final anhy a(AccountId accountId) {
        final afsx c = this.a.c();
        return amkq.m(anfq.h(this.b.a.b(accountId), akpw.g, angq.a), new amml() { // from class: wke
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                afsx afsxVar = afsx.this;
                alyk alykVar = (alyk) obj;
                if (!whu.j(afsxVar).equals(alykVar.b.c) || !whu.i(afsxVar).equals(alykVar.b.i)) {
                    throw new alwx(new wkd());
                }
                return ValidationResult.d();
            }
        }, angq.a);
    }
}
