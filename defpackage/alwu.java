package defpackage;

import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alwu implements alxc {
    private final alyw a;

    public alwu(alyw alywVar) {
        this.a = alywVar;
    }

    @Override // defpackage.alxc
    public final anhy a(AccountId accountId) {
        return anfq.h(aney.h(anfq.h(this.a.a.b.a(), new alzn(accountId, 2), angq.a), IllegalArgumentException.class, amjk.a(akpw.d), angq.a), amjk.a(akpw.c), angq.a);
    }
}
