package defpackage;

import com.google.apps.tiktok.account.AccountId;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amdu extends ant {
    final /* synthetic */ amdw a;
    private final AccountId b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amdu(amdw amdwVar, AccountId accountId) {
        super(amdwVar.b, null);
        this.a = amdwVar;
        this.b = accountId;
    }

    @Override // defpackage.ant
    public final apm d(Class cls, aph aphVar) {
        amkq.N(cls.equals(amdv.class));
        return new amdv(aphVar, this.a.a, this.b);
    }
}
