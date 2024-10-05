package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amab implements alzr {
    public final anib a;
    public final anib b;
    public final azrw c;
    public final azrw d;
    public final azrw e;
    public final azrw f;
    public final azrw g;
    public final vgz h;

    public amab(vgz vgzVar, anib anibVar, anib anibVar2, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        this.h = vgzVar;
        this.a = anibVar;
        this.b = anibVar2;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.g = azrwVar5;
        this.e = azrwVar3;
        this.f = azrwVar4;
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

    public static anhm b(Set set) {
        anhy N;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                N = ((alyq) it.next()).a();
                arrayList.add(N);
            } catch (Exception e) {
                N = anaf.N(e);
            }
            amba.b(N, "AccountEnabledInterceptor Failed", new Object[0]);
        }
        return anaf.H(arrayList);
    }
}
