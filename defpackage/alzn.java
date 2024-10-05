package defpackage;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class alzn implements amml {
    public final /* synthetic */ AccountId a;
    private final /* synthetic */ int b;

    public /* synthetic */ alzn(AccountId accountId, int i) {
        this.b = i;
        this.a = accountId;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            return alzp.a(alzp.b((amal) obj, this.a));
        }
        if (i == 1) {
            return new AccountActionResult(this.a, alym.a, null, null);
        }
        if (i == 2) {
            int w = alta.w(alzp.b((amal) obj, this.a).e);
            return Boolean.valueOf(w != 0 && w == 2);
        }
        AccountId accountId = this.a;
        aone builder = ((amal) obj).toBuilder();
        int a = accountId.a();
        Map unmodifiableMap = Collections.unmodifiableMap(((amal) builder.instance).d);
        Integer valueOf = Integer.valueOf(a);
        if (unmodifiableMap.containsKey(valueOf)) {
            aone builder2 = ((amao) unmodifiableMap.get(valueOf)).toBuilder();
            builder2.copyOnWrite();
            amao amaoVar = (amao) builder2.instance;
            amaoVar.e = 1;
            amaoVar.b |= 4;
            builder.G(accountId.a(), (amao) builder2.build());
            return (amal) builder.build();
        }
        throw new IllegalArgumentException();
    }
}
