package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ulx implements ukk {
    public static final /* synthetic */ int b = 0;
    private static final rms c;
    private final Context d;
    private final rmx e;
    private final Executor f;
    private final uke g;
    private final qmy h;
    private final qob j;
    private final qob k;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final rmv i = new rmv() { // from class: ulv
        @Override // defpackage.rmv
        public final void a() {
            Iterator it = ulx.this.a.iterator();
            while (it.hasNext()) {
                ((ufi) it.next()).a();
            }
        }
    };

    static {
        rms rmsVar = new rms();
        rmsVar.a = 1;
        c = rmsVar;
    }

    public ulx(Context context, qob qobVar, rmx rmxVar, qob qobVar2, uke ukeVar, Executor executor, qmy qmyVar) {
        this.d = context;
        this.j = qobVar;
        this.e = rmxVar;
        this.k = qobVar2;
        this.f = executor;
        this.g = ukeVar;
        this.h = qmyVar;
    }

    public static Object g(anhy anhyVar, String str) {
        try {
            return anaf.W(anhyVar);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if ((cause instanceof qnl) || (cause instanceof qnk)) {
                throw e;
            }
            Log.e("OneGoogle", str.length() != 0 ? "Failed to load ".concat(str) : new String("Failed to load "), e);
            return null;
        }
    }

    private final anhy h(int i) {
        if (qnm.g(i)) {
            return anaf.N(new qnl(i, "Google Play Services not available", this.h.i(this.d, i, null)));
        }
        return anaf.N(new qnk(i));
    }

    @Override // defpackage.ukk
    public final anhy a() {
        return b();
    }

    @Override // defpackage.ukk
    public final anhy b() {
        final anhy v;
        final anhy a = this.g.a();
        int h = this.h.h(this.d, 10000000);
        if (h != 0) {
            v = h(h);
        } else {
            qob qobVar = this.j;
            rms rmsVar = c;
            qnw qnwVar = rnb.a;
            qof qofVar = qobVar.D;
            rnn rnnVar = new rnn(qofVar, rmsVar);
            qofVar.a(rnnVar);
            v = uou.v(rnnVar, amjk.a(tur.m), angq.a);
        }
        ukg ukgVar = (ukg) this.g;
        final anhy l = amkq.l(new ukf(ukgVar, 0), ukgVar.c);
        return new amkb(anaf.I(a, v, l)).a(new Callable() { // from class: ulw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                anhy anhyVar = anhy.this;
                anhy anhyVar2 = l;
                anhy anhyVar3 = v;
                List list = (List) ulx.g(anhyVar, "device accounts");
                List<Account> list2 = (List) ulx.g(anhyVar2, "g1 accounts");
                amru amruVar = (amru) ulx.g(anhyVar3, "owners");
                if (list != null || list2 != null || amruVar != null) {
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            uou.x(((Account) it.next()).name, arrayList, hashMap);
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (list2 != null) {
                        for (Account account : list2) {
                            if (!z) {
                                uou.x(account.name, arrayList, hashMap);
                            }
                            ukh ukhVar = (ukh) hashMap.get(account.name);
                            if (ukhVar != null) {
                                ukhVar.d(true);
                            }
                        }
                    }
                    if (amruVar != null) {
                        int size = amruVar.size();
                        for (int i = 0; i < size; i++) {
                            uki ukiVar = (uki) amruVar.get(i);
                            String str = ukiVar.a;
                            if (!z) {
                                uou.x(str, arrayList, hashMap);
                            }
                            ukh ukhVar2 = (ukh) hashMap.get(str);
                            if (ukhVar2 != null) {
                                ukhVar2.a = ukiVar.c;
                                ukhVar2.b = ukiVar.d;
                                ukhVar2.c = ukiVar.e;
                                ukhVar2.d = ukiVar.f;
                                ukhVar2.e = ukiVar.i;
                                ukhVar2.c(ukiVar.h);
                            }
                        }
                    }
                    amrp f = amru.f();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        f.h(((ukh) hashMap.get((String) it2.next())).a());
                    }
                    return f.g();
                }
                throw new ukj();
            }
        }, angq.a);
    }

    @Override // defpackage.ukk
    public final void c(ufi ufiVar) {
        if (this.a.isEmpty()) {
            rmx rmxVar = this.e;
            qql q = rmxVar.q(this.i, rmv.class.getName());
            final rnf rnfVar = new rnf(q);
            final int i = 0;
            qqu qquVar = new qqu() { // from class: rmw
                @Override // defpackage.qqu
                public final void a(Object obj, Object obj2) {
                    if (i == 0) {
                        ((rnd) ((rnk) obj).D()).a(rnfVar, true, 1);
                        ((rpv) obj2).b(null);
                    } else {
                        ((rnd) ((rnk) obj).D()).a(rnfVar, false, 0);
                        ((rpv) obj2).b(true);
                    }
                }
            };
            final int i2 = 1;
            qqu qquVar2 = new qqu() { // from class: rmw
                @Override // defpackage.qqu
                public final void a(Object obj, Object obj2) {
                    if (i2 == 0) {
                        ((rnd) ((rnk) obj).D()).a(rnfVar, true, 1);
                        ((rpv) obj2).b(null);
                    } else {
                        ((rnd) ((rnk) obj).D()).a(rnfVar, false, 0);
                        ((rpv) obj2).b(true);
                    }
                }
            };
            qqs a = qqt.a();
            a.a = qquVar;
            a.b = qquVar2;
            a.c = q;
            a.e = 2720;
            rmxVar.u(a.a());
        }
        this.a.add(ufiVar);
    }

    @Override // defpackage.ukk
    public final void d(ufi ufiVar) {
        this.a.remove(ufiVar);
        if (this.a.isEmpty()) {
            this.e.v(qar.q(this.i, rmv.class.getName()), 2721);
        }
    }

    @Override // defpackage.ukk
    public final anhy e(String str, int i) {
        return f(str, i);
    }

    @Override // defpackage.ukk
    public final anhy f(String str, int i) {
        int h = this.h.h(this.d, 10400000);
        if (h != 0) {
            return h(h);
        }
        qob qobVar = this.k;
        int A = uou.A(i);
        qnw qnwVar = rnb.a;
        qof qofVar = qobVar.D;
        rnp rnpVar = new rnp(qofVar, str, A);
        qofVar.a(rnpVar);
        return uou.v(rnpVar, tur.n, this.f);
    }
}
