package defpackage;

import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alzp {
    public final anib a;
    public final vgz b;

    public alzp(vgz vgzVar, anib anibVar) {
        this.b = vgzVar;
        this.a = anibVar;
    }

    public static alyk a(amao amaoVar) {
        AccountId b = AccountId.b(amaoVar.c);
        alym alymVar = amaoVar.d;
        if (alymVar == null) {
            alymVar = alym.a;
        }
        int w = alta.w(amaoVar.e);
        if (w == 0) {
            w = 1;
        }
        return alyk.a(b, alymVar, w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static amao b(amal amalVar, AccountId accountId) {
        try {
            int a = accountId.a();
            aoot aootVar = amalVar.d;
            Integer valueOf = Integer.valueOf(a);
            if (aootVar.containsKey(valueOf)) {
                return (amao) aootVar.get(valueOf);
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw new alzj(e);
        }
    }
}
