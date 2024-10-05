package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wkc implements alxk, alxl {
    public final alyw a;
    public final alyl b;
    public final amdh c;
    public final afsy d;
    private final alzf e;
    private final wjz f;

    public wkc(alyw alywVar, alyl alylVar, amdh amdhVar, afsy afsyVar, alzf alzfVar, wjz wjzVar) {
        this.a = alywVar;
        this.b = alylVar;
        this.c = amdhVar;
        this.d = afsyVar;
        this.e = alzfVar;
        this.f = wjzVar;
    }

    @Override // defpackage.alxj
    public final anhy a(alxo alxoVar) {
        this.f.a(aouq.ACCOUNT_SELECTOR_EVENT_TYPE_AUTO, aoun.ACCOUNT_SELECTOR_EVENT_API_GET_SELECTION, aoup.ACCOUNT_SELECTOR_EVENT_RESULT_INITIATED);
        final int i = 1;
        anhy i2 = anfq.i(anht.q(this.e.a()), amjk.c(new anfz(this) { // from class: wkb
            public final /* synthetic */ wkc a;

            {
                this.a = this;
            }

            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                if (i == 0) {
                    wkc wkcVar = this.a;
                    afsx c = wkcVar.d.c();
                    return wkcVar.a.a(whu.i(c), whu.j(c));
                }
                wkc wkcVar2 = this.a;
                final amdh amdhVar = wkcVar2.c;
                final alyv alyvVar = (alyv) wkcVar2.b.b.get();
                final amdl amdlVar = amdl.DONT_CARE;
                amdlVar.getClass();
                final long c2 = amdhVar.a.c();
                anhy a = alyvVar.b.g.a();
                alzp alzpVar = alyvVar.a.a;
                anhy h = anfq.h(alzpVar.b.a(), akpw.i, alzpVar.a);
                return anfq.h(angk.b(anaf.K(a, h).a(amjk.g(new alyu(a, h, 0)), angq.a)).c(amjk.d(new angg() { // from class: amdg
                    @Override // defpackage.angg
                    public final angk a(angi angiVar, Object obj2) {
                        amdh amdhVar2 = amdh.this;
                        amdl amdlVar2 = amdlVar;
                        long j = c2;
                        alyv alyvVar2 = alyvVar;
                        amdf amdfVar = (amdf) obj2;
                        if (amdfVar.b() && amdfVar.c()) {
                            amkq.O(amdfVar.b(), "Cannot get timestamp for a CacheResult that does not have content");
                            amkq.O(amdfVar.c(), "Cannot get timestamp for an invalid CacheResult");
                            if (amdfVar.b.a > j - amdlVar2.k) {
                                return angk.b(anaf.O(null));
                            }
                        }
                        anhy d = alyvVar2.b.d();
                        amdhVar2.b.a(d);
                        return angk.b(anfq.h(d, amkq.aa(), angq.a));
                    }
                }), angq.a).h(), amkq.aa(), angq.a);
            }
        }), angq.a);
        final int i3 = 0;
        return anfq.i(i2, amjk.c(new anfz(this) { // from class: wkb
            public final /* synthetic */ wkc a;

            {
                this.a = this;
            }

            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                if (i3 == 0) {
                    wkc wkcVar = this.a;
                    afsx c = wkcVar.d.c();
                    return wkcVar.a.a(whu.i(c), whu.j(c));
                }
                wkc wkcVar2 = this.a;
                final amdh amdhVar = wkcVar2.c;
                final alyv alyvVar = (alyv) wkcVar2.b.b.get();
                final amdl amdlVar = amdl.DONT_CARE;
                amdlVar.getClass();
                final long c2 = amdhVar.a.c();
                anhy a = alyvVar.b.g.a();
                alzp alzpVar = alyvVar.a.a;
                anhy h = anfq.h(alzpVar.b.a(), akpw.i, alzpVar.a);
                return anfq.h(angk.b(anaf.K(a, h).a(amjk.g(new alyu(a, h, 0)), angq.a)).c(amjk.d(new angg() { // from class: amdg
                    @Override // defpackage.angg
                    public final angk a(angi angiVar, Object obj2) {
                        amdh amdhVar2 = amdh.this;
                        amdl amdlVar2 = amdlVar;
                        long j = c2;
                        alyv alyvVar2 = alyvVar;
                        amdf amdfVar = (amdf) obj2;
                        if (amdfVar.b() && amdfVar.c()) {
                            amkq.O(amdfVar.b(), "Cannot get timestamp for a CacheResult that does not have content");
                            amkq.O(amdfVar.c(), "Cannot get timestamp for an invalid CacheResult");
                            if (amdfVar.b.a > j - amdlVar2.k) {
                                return angk.b(anaf.O(null));
                            }
                        }
                        anhy d = alyvVar2.b.d();
                        amdhVar2.b.a(d);
                        return angk.b(anfq.h(d, amkq.aa(), angq.a));
                    }
                }), angq.a).h(), amkq.aa(), angq.a);
            }
        }), angq.a);
    }

    @Override // defpackage.alxk
    public final anhy b(final AccountId accountId) {
        this.f.a(aouq.ACCOUNT_SELECTOR_EVENT_TYPE_AUTO, aoun.ACCOUNT_SELECTOR_EVENT_API_USE_SELECTION, aoup.ACCOUNT_SELECTOR_EVENT_RESULT_INITIATED);
        final amab amabVar = (amab) this.a.b;
        return anfq.i(amabVar.h.a(), amjk.c(new anfz() { // from class: alzw
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                final amab amabVar2 = amab.this;
                final AccountId accountId2 = accountId;
                amao b = alzp.b((amal) obj, accountId2);
                int w = alta.w(b.e);
                if (w == 0 || w != 2) {
                    final alyo a = alyo.a(accountId2, amab.a(b).b);
                    Set set = (Set) ((axqs) amabVar2.c).a;
                    ArrayList arrayList = new ArrayList(set.size());
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(((alyr) it.next()).a());
                        } catch (Exception e) {
                            arrayList.add(anaf.N(e));
                        }
                    }
                    return anfq.i(anaf.J(arrayList).b(amjk.b(new anfy() { // from class: alzs
                        @Override // defpackage.anfy
                        public final anhy a() {
                            return amab.this.h.b(new alzn(accountId2, 3), angq.a);
                        }
                    }), angq.a), amjk.c(new anfz() { // from class: alzx
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            final amab amabVar3 = amab.this;
                            return amab.b((Set) ((axqs) amabVar3.g).a).b(amjk.b(new anfy() { // from class: alzt
                                @Override // defpackage.anfy
                                public final anhy a() {
                                    return amab.b((Set) amab.this.d.get()).a(aein.e, angq.a);
                                }
                            }), angq.a);
                        }
                    }), angq.a);
                }
                return anaf.O(null);
            }
        }), angq.a);
    }
}
