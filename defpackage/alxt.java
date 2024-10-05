package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alxt {
    public final Set a;
    public final Random c = new Random();
    public final ArrayList b = new ArrayList(2);

    public alxt(Set set) {
        this.a = set;
    }

    public final void a(AccountId accountId, alym alymVar) {
        amkq.N(alymVar != null);
        amkq.N(!alymVar.equals(alym.a));
        amkq.N((alymVar.b & 256) != 0);
        String str = alymVar.i;
        new alxr(accountId);
        amxd listIterator = ((amvs) this.a).listIterator();
        while (listIterator.hasNext()) {
            ((alxs) listIterator.next()).d();
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((alxs) arrayList.get(i)).d();
        }
    }

    public final void b(AccountId accountId, alym alymVar) {
        amil l = amjw.l("onBeforeActivityAccountReady");
        try {
            String str = alymVar.i;
            new alxq(new alxr(accountId));
            amxd listIterator = ((amvs) this.a).listIterator();
            while (listIterator.hasNext()) {
                alxs alxsVar = (alxs) listIterator.next();
                if (alxsVar instanceof alxu) {
                    ((alxu) alxsVar).g();
                }
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                alxs alxsVar2 = (alxs) it.next();
                if (alxsVar2 instanceof alxu) {
                    ((alxu) alxsVar2).g();
                }
            }
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void c() {
        amil l = amjw.l("onBeforeAccountError");
        try {
            amxd listIterator = ((amvs) this.a).listIterator();
            while (listIterator.hasNext()) {
                alxs alxsVar = (alxs) listIterator.next();
                if (alxsVar instanceof alxu) {
                    ((alxu) alxsVar).e();
                }
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                alxs alxsVar2 = (alxs) it.next();
                if (alxsVar2 instanceof alxu) {
                    ((alxu) alxsVar2).e();
                }
            }
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void d() {
        amil l = amjw.l("onBeforeAccountLoading");
        try {
            amxd listIterator = ((amvs) this.a).listIterator();
            while (listIterator.hasNext()) {
                alxs alxsVar = (alxs) listIterator.next();
                if (alxsVar instanceof alxu) {
                    ((alxu) alxsVar).f();
                }
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                alxs alxsVar2 = (alxs) it.next();
                if (alxsVar2 instanceof alxu) {
                    ((alxu) alxsVar2).f();
                }
            }
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
