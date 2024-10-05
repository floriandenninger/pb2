package defpackage;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alxi implements alxe {
    public static final amxj a = amxj.l("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl");
    public final List b = new ArrayList();
    private final alwu c;
    private final azrw d;
    private final anib e;

    public alxi(alwu alwuVar, ammv ammvVar, anib anibVar) {
        this.c = alwuVar;
        this.d = (azrw) ((amna) ammvVar).a;
        this.e = anibVar;
    }

    @Override // defpackage.alxe
    public final void a(alxd alxdVar) {
        uqq.j();
        synchronized (this.b) {
            this.b.add(alxdVar);
        }
    }

    @Override // defpackage.alxe
    public final void b(alxd alxdVar) {
        uqq.j();
        synchronized (this.b) {
            this.b.remove(alxdVar);
        }
    }

    @Override // defpackage.alxe
    public final amru c() {
        return (amru) this.d.get();
    }

    @Override // defpackage.alxe
    public final anhy d(final AccountId accountId, final List list, Intent intent) {
        amil l = amjw.l("Validate Requirements");
        try {
            anhy i = anfq.i(this.c.a(accountId), amjk.c(new anfz() { // from class: alxh
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    List<alxc> list2 = list;
                    final AccountId accountId2 = accountId;
                    ArrayList arrayList = new ArrayList(list2.size());
                    for (final alxc alxcVar : list2) {
                        arrayList.add(new anfy() { // from class: alxf
                            @Override // defpackage.anfy
                            public final anhy a() {
                                return alxc.this.a(accountId2);
                            }
                        });
                    }
                    return anfq.h(alta.x(arrayList, akgg.i, angq.a), amjk.a(akpw.e), angq.a);
                }
            }), angq.a);
            l.a(i);
            l.close();
            return i;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.alxe
    public final anhy e() {
        return anaf.T(amjk.b(new anfy() { // from class: alxg
            @Override // defpackage.anfy
            public final anhy a() {
                amru o;
                anhy O;
                alxi alxiVar = alxi.this;
                synchronized (alxiVar.b) {
                    o = amru.o(alxiVar.b);
                }
                ArrayList arrayList = new ArrayList(o.size());
                int size = o.size();
                for (int i = 0; i < size; i++) {
                    try {
                        O = ((alxd) o.get(i)).g();
                    } catch (Throwable th) {
                        ((amxh) ((amxh) ((amxh) alxi.a.f()).h(th)).i("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl", "lambda$notifyRequirementStateChanged$6", (char) 195, "AccountRequirementManagerImpl.java")).q("OnRequirementStateChanged observer failed.");
                        O = anaf.O(null);
                    }
                    arrayList.add(O);
                }
                return anaf.H(arrayList).a(anaf.aa(), angq.a);
            }
        }), this.e);
    }
}
