package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acvs implements ylb {
    public static final /* synthetic */ int k = 0;
    public final addy a;
    public final adch b;
    public final ysy c;
    public final acun d;
    public final anib e;
    public final boolean f;
    public final ylf i;
    private anhy n;
    private final aoae o;
    private static final String l = zga.a("MDX.BackgroundScanTaskRunner");
    private static final acvl m = acvl.a().a();
    static final aeqp j = new aeqp(0, 30L);
    public final Runnable h = new acvr(this);
    final Handler g = new Handler(Looper.getMainLooper());

    public acvs(addy addyVar, adch adchVar, aoae aoaeVar, ysy ysyVar, azrw azrwVar, acun acunVar, anib anibVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = addyVar;
        this.b = adchVar;
        this.o = aoaeVar;
        this.c = ysyVar;
        this.i = (ylf) azrwVar.get();
        this.d = acunVar;
        this.e = anibVar;
        this.f = z;
    }

    public static /* synthetic */ void c(Throwable th) {
        String str = l;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65);
        sb.append("Could not get available media routes for making background scan: ");
        sb.append(valueOf);
        zga.c(str, sb.toString());
    }

    private final amsx f() {
        HashSet hashSet = new HashSet();
        amxd listIterator = this.o.e().listIterator();
        while (listIterator.hasNext()) {
            acvj acvjVar = (acvj) listIterator.next();
            try {
                if (((acvl) ynm.g(acvjVar.a(), 5L, TimeUnit.SECONDS, m)).a) {
                    hashSet.add(acvjVar);
                }
            } catch (Exception e) {
                zga.d("Failed to read the clientConfig", e);
            }
        }
        return amsx.p(hashSet);
    }

    private static anhy g(final amsx amsxVar) {
        amkq.N(!amsxVar.isEmpty());
        amrp amrpVar = new amrp();
        amxd listIterator = amsxVar.listIterator();
        while (listIterator.hasNext()) {
            amrpVar.h(((acvj) listIterator.next()).a());
        }
        final amru g = amrpVar.g();
        return anaf.H(g).a(new Callable() { // from class: acvq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                amsx<acvj> amsxVar2 = amsx.this;
                amru amruVar = g;
                int i = acvs.k;
                amxe it = amruVar.iterator();
                int i2 = Integer.MAX_VALUE;
                int i3 = Integer.MAX_VALUE;
                int i4 = 0;
                for (acvj acvjVar : amsxVar2) {
                    try {
                        acvl acvlVar = (acvl) anaf.W((Future) it.next());
                        String.format(Locale.US, "client %s: enabled=%b scan_duration=%d scan_period=%d scan_period_no_devices=%d", acvjVar.b(), Boolean.valueOf(acvlVar.a), Integer.valueOf(acvlVar.b), Integer.valueOf(acvlVar.d), Integer.valueOf(acvlVar.c));
                        i4 = Math.max(i4, acvlVar.b);
                        i3 = Math.min(i3, acvlVar.c);
                        i2 = Math.min(i2, acvlVar.d);
                    } catch (ExecutionException e) {
                        String b = acvjVar.b();
                        zga.d(b.length() != 0 ? "Could not read the config values for ".concat(b) : new String("Could not read the config values for "), e);
                    }
                }
                acvk a = acvl.a();
                a.c(i4);
                a.d(i2);
                a.e(i3);
                return a.a();
            }
        }, angq.a);
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        amsx f = f();
        int i = 0;
        if (f.isEmpty()) {
            return 0;
        }
        ynm.i(g(f), new acvo(this, 1));
        amkq.N(!f.isEmpty());
        anhy g = g(f);
        this.n = g;
        ynm.k(g, ynm.a, abbr.m, new acvo(this, i));
        return 2;
    }

    public final void b(List list) {
        final amru o;
        amsx f = f();
        if (!this.c.r()) {
            o = amru.q();
            amxd listIterator = f.listIterator();
            while (listIterator.hasNext()) {
                ((acvj) listIterator.next()).d();
            }
        } else {
            o = amru.o(list);
            amxd listIterator2 = f.listIterator();
            while (listIterator2.hasNext()) {
                ((acvj) listIterator2.next()).c(o);
            }
        }
        ynm.k(this.n, ynm.a, abbr.l, new ynl() { // from class: acvp
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                acvs acvsVar = acvs.this;
                acvl acvlVar = (acvl) obj;
                boolean isEmpty = o.isEmpty();
                int i = isEmpty ^ true ? acvlVar.d : acvlVar.c;
                String.format(Locale.US, "scheduling task with %s seconds of delay", Integer.valueOf(i));
                acvsVar.i.e("mdx_background_scanner", i, true, true != isEmpty ? 0 : 2, null, acvs.j, false);
                acvsVar.i.c("mdx_fallback_background_scanner");
                acvsVar.g.removeCallbacks(acvsVar.h);
                acvsVar.a.B(acvsVar);
            }
        });
    }
}
