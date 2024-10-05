package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class usi extends use implements uog, upq {
    private static final amxj h = amxj.l("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl");
    public final upo a;
    public final Application b;
    public final axpg c;
    public final axpg e;
    private final anic i;
    public final Object d = new Object();
    public final ArrayList f = new ArrayList(0);
    public final AtomicInteger g = new AtomicInteger();

    public usi(upp uppVar, Context context, uok uokVar, anic anicVar, axpg axpgVar, axpg axpgVar2, azrw azrwVar, Executor executor) {
        this.a = uppVar.a(executor, axpgVar, azrwVar);
        this.b = (Application) context;
        this.i = anicVar;
        this.c = axpgVar;
        this.e = axpgVar2;
        uokVar.a(this);
    }

    @Override // defpackage.upq, defpackage.uyo
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.use
    public final void b(final usc uscVar) {
        if (!uscVar.q()) {
            ((amxh) ((amxh) h.g()).i("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordAsFuture", 87, "NetworkMetricServiceImpl.java")).q("skip logging NetworkEvent due to empty bandwidth/latency data");
            anhy anhyVar = anhv.a;
        } else if (!this.a.c(null)) {
            anhy anhyVar2 = anhv.a;
        } else {
            this.g.incrementAndGet();
            anaf.T(new anfy() { // from class: usg
                @Override // defpackage.anfy
                public final anhy a() {
                    usc[] uscVarArr;
                    anhy b;
                    usi usiVar = usi.this;
                    usc uscVar2 = uscVar;
                    try {
                        uscVar2.p(usiVar.b);
                        int i = ((usb) usiVar.c.get()).a;
                        synchronized (usiVar.d) {
                            usiVar.f.ensureCapacity(i);
                            usiVar.f.add(uscVar2);
                            if (usiVar.f.size() >= i) {
                                ArrayList arrayList = usiVar.f;
                                uscVarArr = (usc[]) arrayList.toArray(new usc[arrayList.size()]);
                                usiVar.f.clear();
                            } else {
                                uscVarArr = null;
                            }
                        }
                        if (uscVarArr == null) {
                            b = anhv.a;
                        } else {
                            upo upoVar = usiVar.a;
                            upj a = upk.a();
                            a.d(((usd) usiVar.e.get()).d(uscVarArr));
                            b = upoVar.b(a.a());
                        }
                        return b;
                    } finally {
                        usiVar.g.decrementAndGet();
                    }
                }
            }, this.i);
        }
    }

    public final anhy c() {
        final usc[] uscVarArr;
        if (this.g.get() > 0) {
            return anaf.Q(new anfy() { // from class: usf
                @Override // defpackage.anfy
                public final anhy a() {
                    return usi.this.c();
                }
            }, 1L, TimeUnit.SECONDS, this.i);
        }
        synchronized (this.d) {
            if (this.f.isEmpty()) {
                uscVarArr = null;
            } else {
                ArrayList arrayList = this.f;
                uscVarArr = (usc[]) arrayList.toArray(new usc[arrayList.size()]);
                this.f.clear();
            }
        }
        if (uscVarArr == null) {
            return anhv.a;
        }
        return anaf.T(new anfy() { // from class: ush
            @Override // defpackage.anfy
            public final anhy a() {
                usi usiVar = usi.this;
                usc[] uscVarArr2 = uscVarArr;
                upo upoVar = usiVar.a;
                upj a = upk.a();
                a.d(((usd) usiVar.e.get()).d(uscVarArr2));
                return upoVar.b(a.a());
            }
        }, this.i);
    }

    @Override // defpackage.uog
    public final void d(Activity activity) {
        c();
    }
}
