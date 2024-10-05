package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jih implements ypd {
    public static final amsx a = amsx.v(awiu.class, asxs.class, awic.class, asxn.class, astq.class);
    public final aalu b;
    public final aahv c;
    public final aais d;
    public final afsy e;
    public final ayqw f = new ayqw();
    public final Object g = new Object();
    public Future h;
    private final azrw i;
    private final ExecutorService j;
    private final axzf k;

    public jih(azrw azrwVar, aalu aaluVar, aahv aahvVar, aais aaisVar, afsy afsyVar, ExecutorService executorService, axzf axzfVar, byte[] bArr) {
        this.i = azrwVar;
        this.b = aaluVar;
        this.c = aahvVar;
        this.d = aaisVar;
        this.e = afsyVar;
        this.j = executorService;
        this.k = axzfVar;
    }

    public static aakt a(aahu aahuVar, aakt aaktVar) {
        return aaktVar.e().a(aahuVar);
    }

    public final void b() {
        synchronized (this.g) {
            if (this.k.b().booleanValue() && this.h == null) {
                this.h = this.j.submit(new Runnable() { // from class: jig
                    @Override // java.lang.Runnable
                    public final void run() {
                        final jih jihVar = jih.this;
                        yjk.e();
                        afsx c = jihVar.e.c();
                        final aair a2 = jihVar.d.a(c);
                        final aahu a3 = jihVar.c.a(c);
                        ArrayList arrayList = new ArrayList();
                        amxd listIterator = jih.a.listIterator();
                        while (listIterator.hasNext()) {
                            arrayList.add(a2.k((int) jihVar.b.b((Class) listIterator.next())));
                        }
                        azbr azbrVar = new azbr(aypn.w(arrayList).t(jif.a).t(jif.b));
                        ayrv ayrvVar = aynu.o;
                        azbrVar.c(new ayrv() { // from class: jid
                            @Override // defpackage.ayrv
                            public final Object a(Object obj) {
                                aair aairVar = aair.this;
                                final aahu aahuVar = a3;
                                aypy T = aypy.T((List) obj);
                                aairVar.getClass();
                                final int i = 1;
                                final int i2 = 0;
                                return T.t(new joz(aairVar, i)).Y(new ayrv() { // from class: jie
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        if (i == 0) {
                                            aahu aahuVar2 = aahuVar;
                                            amsx amsxVar = jih.a;
                                            aalc c2 = aahuVar2.c();
                                            c2.j((List) obj2);
                                            aswt d = aswu.d(fhe.n(asww.b, "OFFLINE_GENERATION_STATUS_ENTITY_ID_PES_TO_IMES"));
                                            d.b(asws.GENERATION_STATUS_DONE);
                                            c2.k(d);
                                            return c2.b();
                                        }
                                        return jih.a(aahuVar, (aakt) obj2);
                                    }
                                }).av().c(new ayrv() { // from class: jie
                                    @Override // defpackage.ayrv
                                    public final Object a(Object obj2) {
                                        if (i2 == 0) {
                                            aahu aahuVar2 = aahuVar;
                                            amsx amsxVar = jih.a;
                                            aalc c2 = aahuVar2.c();
                                            c2.j((List) obj2);
                                            aswt d = aswu.d(fhe.n(asww.b, "OFFLINE_GENERATION_STATUS_ENTITY_ID_PES_TO_IMES"));
                                            d.b(asws.GENERATION_STATUS_DONE);
                                            c2.k(d);
                                            return c2.b();
                                        }
                                        return jih.a(aahuVar, (aakt) obj2);
                                    }
                                });
                            }
                        }).o(new ayrm() { // from class: jib
                            @Override // defpackage.ayrm
                            public final void a() {
                                jih jihVar2 = jih.this;
                                aair aairVar = a2;
                                final aahu aahuVar = a3;
                                amxd listIterator2 = jih.a.listIterator();
                                while (listIterator2.hasNext()) {
                                    jihVar2.f.d(aairVar.g((Class) listIterator2.next()).Y(ivh.u).ax(new ayrs() { // from class: jic
                                        @Override // defpackage.ayrs
                                        public final void a(Object obj) {
                                            aahu aahuVar2 = aahu.this;
                                            ammw ammwVar = (ammw) obj;
                                            String str = (String) ammwVar.a;
                                            ammv ammvVar = (ammv) ammwVar.b;
                                            if (ammvVar.h()) {
                                                aalc c2 = aahuVar2.c();
                                                c2.d(jih.a(aahuVar2, (aakt) ammvVar.c()));
                                                evr.bN(c2, "Error copying entity into the InMemoryEntityStore from the OfflinePersistentToInMemoryEntityStoreProjectionController");
                                            } else {
                                                aalc c3 = aahuVar2.c();
                                                c3.g(str);
                                                evr.bN(c3, "Error removing the entity from the InMemoryEntityStore from the OfflinePersistentToInMemoryEntityStoreProjectionController");
                                            }
                                        }
                                    }));
                                }
                            }
                        }).Q();
                    }
                });
            }
        }
    }

    public final void c() {
        ((ypa) this.i.get()).g(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class};
        }
        if (i == 0) {
            synchronized (this.g) {
                Future future = this.h;
                if (future != null) {
                    future.cancel(false);
                    this.h = null;
                }
                this.f.c();
            }
            b();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
