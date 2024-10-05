package defpackage;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tus implements tug, tve, tvf {
    public final tvd a;
    public final agcm b;
    private final Map c = new LinkedHashMap();
    private final Object d = new Object();
    private final tvg e;
    private final tuj f;

    public tus(tvg tvgVar, tvd tvdVar, agcm agcmVar, tuj tujVar, byte[] bArr, byte[] bArr2) {
        this.e = tvgVar;
        this.a = tvdVar;
        this.b = agcmVar;
        this.f = tujVar;
    }

    public static boolean k(tvb tvbVar) {
        tva tvaVar = tvbVar.c;
        if (tvaVar == null) {
            tvaVar = tva.a;
        }
        return !tvaVar.equals(tva.a);
    }

    public static boolean l(tvb tvbVar) {
        return !tvb.a.equals(tvbVar);
    }

    public static boolean m(tvb tvbVar) {
        aodx aodxVar = tvbVar.b;
        if (aodxVar == null) {
            aodxVar = aodx.a;
        }
        alwc an = rwh.an(aodxVar);
        return (an == null || an.e) ? false : true;
    }

    private final void o() {
        this.f.c();
    }

    @Override // defpackage.tug
    public final anhy a() {
        o();
        return amka.c(amka.c(this.b.f()).h(new amml() { // from class: tuk
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                tus tusVar = tus.this;
                tvb tvbVar = (tvb) obj;
                if (tus.l(tvbVar)) {
                    aodx aodxVar = tvbVar.b;
                    if (aodxVar == null) {
                        aodxVar = aodx.a;
                    }
                    return ammv.j(aodxVar);
                }
                return tusVar.g();
            }
        }, angq.a)).b(Exception.class, new jom(17), angq.a).h(new tqf(20), angq.a);
    }

    @Override // defpackage.tug
    public final anhy b(tuf tufVar, int i) {
        o();
        return amka.c(this.b.f()).i(new tum(this, i, 0), angq.a).b(Exception.class, new jom(18), angq.a).h(new tur(1), angq.a);
    }

    @Override // defpackage.tug
    public final anhy c() {
        o();
        return amka.c(amka.c(this.b.f()).i(new tul(this, 1), angq.a).h(tur.a, angq.a)).b(Exception.class, new jom(19), angq.a).h(new tur(0), angq.a);
    }

    @Override // defpackage.tug
    public final anhy d(final tuf tufVar, final int i) {
        o();
        return amka.c(this.b.f()).i(new anfz() { // from class: tun
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                final tus tusVar = tus.this;
                final tuf tufVar2 = tufVar;
                final int i2 = i;
                final tvb tvbVar = (tvb) obj;
                if (!tus.l(tvbVar) || !tus.k(tvbVar)) {
                    return tusVar.n(i2);
                }
                tvd tvdVar = tusVar.a;
                tva tvaVar = tvbVar.c;
                if (tvaVar == null) {
                    tvaVar = tva.a;
                }
                return amka.c(tvdVar.a(tvaVar, i2)).h(tqf.r, angq.a).a(Exception.class, tqf.t, angq.a).i(new anfz() { // from class: tup
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        tus tusVar2 = tus.this;
                        tvb tvbVar2 = tvbVar;
                        int i3 = i2;
                        ammv ammvVar = (ammv) obj2;
                        if (ammvVar.h()) {
                            if (!tus.m(tvbVar2)) {
                                rwh.ao((InputStream) ammvVar.c());
                                return anaf.N(new tui());
                            }
                            return anaf.O((InputStream) ammvVar.c());
                        }
                        return tusVar2.n(i3);
                    }
                }, angq.a);
            }
        }, angq.a).b(Exception.class, new jom(20), angq.a).h(new tur(2), angq.a);
    }

    @Override // defpackage.tug
    public final void e(tue tueVar, Executor executor) {
        executor.getClass();
        synchronized (this.d) {
            this.c.put(tueVar, executor);
        }
    }

    @Override // defpackage.tug
    public final void f(tue tueVar) {
        synchronized (this.d) {
            this.c.remove(tueVar);
        }
    }

    public final ammv g() {
        this.e.a();
        return amlr.a;
    }

    public final anhy h() {
        return amkq.n(this.e.a(), new tul(this, 0), angq.a);
    }

    @Override // defpackage.tve
    public final void i() {
        amrz j;
        synchronized (this.d) {
            j = amrz.j(this.c);
        }
        amxd listIterator = j.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            Executor executor = (Executor) entry.getValue();
            tue tueVar = (tue) entry.getKey();
            tueVar.getClass();
            executor.execute(amjk.f(new tuq(tueVar, 1)));
        }
    }

    @Override // defpackage.tvf
    public final void j() {
        amrz j;
        synchronized (this.d) {
            j = amrz.j(this.c);
        }
        amxd listIterator = j.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            Executor executor = (Executor) entry.getValue();
            tue tueVar = (tue) entry.getKey();
            tueVar.getClass();
            executor.execute(amjk.f(new tuq(tueVar, 0)));
        }
    }

    public final anhy n(int i) {
        return amkq.n(h(), new tum(this, i, 1), angq.a);
    }
}
