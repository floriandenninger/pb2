package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jjo implements ypd {
    public static final amsx a = amsx.s(aglb.class, agko.class);
    public final azrw b;
    public final azrw c;
    public final Executor d;
    public final azrw e;
    public final azrw f;
    public final azqw g;
    public boolean h;
    private final azrw i;
    private final azrw j;
    private final azrw k;
    private final azrw l;
    private final azrw m;

    public jjo(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, Executor executor, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10) {
        ayqi ayqiVar;
        this.i = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
        this.d = anaf.E(executor);
        this.e = azrwVar5;
        this.j = azrwVar6;
        this.k = azrwVar7;
        this.l = azrwVar8;
        this.f = azrwVar9;
        this.m = azrwVar10;
        azqy ap = azqy.ap();
        this.g = ap;
        aypn F = ap.av().F();
        if (((axzf) azrwVar9.get()).s()) {
            ayqiVar = (ayqi) azrwVar10.get();
        } else {
            ayqiVar = (ayqi) azrwVar.get();
        }
        F.E(ayqiVar).x(jif.c).ae(jif.e).ae(jif.d).X(new izw(5));
    }

    public final void a(final jhx jhxVar) {
        Set<jhg> set = (Set) this.j.get();
        Set<jhl> set2 = (Set) this.k.get();
        Set<jhk> set3 = (Set) this.l.get();
        if (((axzf) this.f.get()).s()) {
            final CountDownLatch countDownLatch = new CountDownLatch(set.size() + set2.size() + set3.size());
            for (final jhg jhgVar : set) {
                ((ayqi) this.m.get()).f(new Runnable() { // from class: jiv
                    @Override // java.lang.Runnable
                    public final void run() {
                        jhx jhxVar2 = jhx.this;
                        jhg jhgVar2 = jhgVar;
                        CountDownLatch countDownLatch2 = countDownLatch;
                        amsx amsxVar = jjo.a;
                        try {
                            jhxVar2.a(jhgVar2);
                        } catch (RuntimeException e) {
                            afsi.c(2, 28, String.valueOf(jhgVar2.getClass().getSimpleName()).concat(" initialization."), e);
                        } finally {
                            countDownLatch2.countDown();
                        }
                    }
                });
            }
            for (final jhl jhlVar : set2) {
                ((ayqi) this.m.get()).f(new Runnable() { // from class: jiy
                    @Override // java.lang.Runnable
                    public final void run() {
                        jhx jhxVar2 = jhx.this;
                        jhl jhlVar2 = jhlVar;
                        CountDownLatch countDownLatch2 = countDownLatch;
                        amsx amsxVar = jjo.a;
                        try {
                            jhxVar2.a(jhlVar2);
                        } catch (RuntimeException e) {
                            afsi.c(2, 28, String.valueOf(jhlVar2.getClass().getSimpleName()).concat(" initialization."), e);
                        } finally {
                            countDownLatch2.countDown();
                        }
                    }
                });
            }
            for (final jhk jhkVar : set3) {
                ((ayqi) this.m.get()).f(new Runnable() { // from class: jix
                    @Override // java.lang.Runnable
                    public final void run() {
                        jhx jhxVar2 = jhx.this;
                        jhk jhkVar2 = jhkVar;
                        CountDownLatch countDownLatch2 = countDownLatch;
                        amsx amsxVar = jjo.a;
                        try {
                            jhxVar2.a(jhkVar2);
                        } catch (RuntimeException e) {
                            afsi.c(2, 28, String.valueOf(jhkVar2.getClass().getSimpleName()).concat(" initialization."), e);
                        } finally {
                            countDownLatch2.countDown();
                        }
                    }
                });
            }
            try {
                countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
                return;
            } catch (InterruptedException e) {
                throw new IllegalStateException("Initialization projections are incomplete.", e);
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jhxVar.a((jhg) it.next());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            jhxVar.a((jhl) it2.next());
        }
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            jhxVar.a((jhk) it3.next());
        }
    }

    public final void b(amml ammlVar, String str) {
        aaio c = ((aaih) ((aahv) this.c.get()).c()).c();
        jhx jhxVar = (jhx) ammlVar.apply(c);
        Iterator it = ((Set) this.j.get()).iterator();
        while (it.hasNext()) {
            jhxVar.a((jhg) it.next());
        }
        Iterator it2 = ((Set) this.l.get()).iterator();
        while (it2.hasNext()) {
            jhxVar.a((jhk) it2.next());
        }
        evr.bN(c, str);
    }

    public final void c(amml ammlVar, String str) {
        aaio c = ((aaih) ((aahv) this.c.get()).c()).c();
        jhx jhxVar = (jhx) ammlVar.apply(c);
        Iterator it = ((Set) this.j.get()).iterator();
        while (it.hasNext()) {
            jhxVar.a((jhg) it.next());
        }
        Iterator it2 = ((Set) this.k.get()).iterator();
        while (it2.hasNext()) {
            jhxVar.a((jhl) it2.next());
        }
        evr.bN(c, str);
    }

    public final void d() {
        ((ypa) this.i.get()).g(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case -1:
                return new Class[]{aftm.class, agkl.class, agko.class, agkq.class, agks.class, agku.class, agla.class, aglb.class, aglg.class, aglh.class, agli.class};
            case 0:
                this.h = false;
                this.d.execute(new jiz(this));
                return null;
            case 1:
                agkl agklVar = (agkl) obj;
                final agni e = ((agof) this.b.get()).a().i().e(agklVar.a);
                if (e == null) {
                    return null;
                }
                this.g.c(jia.a(agklVar.a, agkl.class, new Runnable(this) { // from class: jji
                    public final /* synthetic */ jjo a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i2 != 0) {
                            this.a.b(new jiq(e, 1), "Error updating entities for OfflinePlaylistAddEvent.");
                        } else {
                            this.a.b(new jiq(e, 0), "Error updating entities for OfflinePlaylistSyncEvent.");
                        }
                    }
                }));
                return null;
            case 2:
                final agko agkoVar = (agko) obj;
                this.g.c(jia.a(agkoVar.a, agko.class, new Runnable() { // from class: jja
                    @Override // java.lang.Runnable
                    public final void run() {
                        jjo jjoVar = jjo.this;
                        final agko agkoVar2 = agkoVar;
                        jjoVar.b(new amml() { // from class: jil
                            @Override // defpackage.amml
                            public final Object apply(Object obj2) {
                                final agko agkoVar3 = agko.this;
                                final aalc aalcVar = (aalc) obj2;
                                return new jhx() { // from class: jii
                                    @Override // defpackage.jhx
                                    public final void a(Object obj3) {
                                        aalc aalcVar2 = aalc.this;
                                        agko agkoVar4 = agkoVar3;
                                        amsx amsxVar = jjo.a;
                                        ((jjs) obj3).i(aalcVar2, agkoVar4.a);
                                    }
                                };
                            }
                        }, "Error updating entities for OfflinePlaylistDeleteEvent.");
                    }
                }));
                return null;
            case 3:
                final agkq agkqVar = (agkq) obj;
                final agni e2 = ((agof) this.b.get()).a().i().e(agkqVar.a.d());
                if (e2 == null) {
                    return null;
                }
                this.g.c(jia.a(agkqVar.a.d(), agkq.class, new Runnable() { // from class: jjj
                    @Override // java.lang.Runnable
                    public final void run() {
                        jjo jjoVar = jjo.this;
                        final agni agniVar = e2;
                        final agkq agkqVar2 = agkqVar;
                        jjoVar.b(new amml() { // from class: jir
                            @Override // defpackage.amml
                            public final Object apply(Object obj2) {
                                final agni agniVar2 = agni.this;
                                final agkq agkqVar3 = agkqVar2;
                                final aalc aalcVar = (aalc) obj2;
                                return new jhx() { // from class: jjm
                                    @Override // defpackage.jhx
                                    public final void a(Object obj3) {
                                        aalc aalcVar2 = aalc.this;
                                        agni agniVar3 = agniVar2;
                                        agkq agkqVar4 = agkqVar3;
                                        amsx amsxVar = jjo.a;
                                        ((jjs) obj3).j(aalcVar2, agniVar3, agkqVar4.a);
                                    }
                                };
                            }
                        }, "Error updating entities for OfflinePlaylistProgressedEvent.");
                    }
                }));
                return null;
            case 4:
                String d = ((agks) obj).a.d();
                final agni e3 = ((agof) this.b.get()).a().i().e(d);
                if (e3 == null) {
                    return null;
                }
                this.g.c(jia.a(d, agko.class, new Runnable(this) { // from class: jji
                    public final /* synthetic */ jjo a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i3 != 0) {
                            this.a.b(new jiq(e3, 1), "Error updating entities for OfflinePlaylistAddEvent.");
                        } else {
                            this.a.b(new jiq(e3, 0), "Error updating entities for OfflinePlaylistSyncEvent.");
                        }
                    }
                }));
                return null;
            case 5:
                final agku agkuVar = (agku) obj;
                this.g.c(jia.b(agkuVar.a.m(), agku.class, new Runnable() { // from class: jjb
                    @Override // java.lang.Runnable
                    public final void run() {
                        jjo jjoVar = jjo.this;
                        final agku agkuVar2 = agkuVar;
                        jjoVar.c(new amml() { // from class: jim
                            @Override // defpackage.amml
                            public final Object apply(Object obj2) {
                                final agku agkuVar3 = agku.this;
                                final aalc aalcVar = (aalc) obj2;
                                return new jhx() { // from class: jis
                                    @Override // defpackage.jhx
                                    public final void a(Object obj3) {
                                        aalc aalcVar2 = aalc.this;
                                        agku agkuVar4 = agkuVar3;
                                        amsx amsxVar = jjo.a;
                                        ((jju) obj3).l(aalcVar2, agkuVar4.a);
                                    }
                                };
                            }
                        }, "Error updating entities for OfflineSingleVideoAddEvent.");
                    }
                }));
                return null;
            case 6:
                final agla aglaVar = (agla) obj;
                this.g.c(jia.b(aglaVar.a.m(), agla.class, new Runnable() { // from class: jjc
                    @Override // java.lang.Runnable
                    public final void run() {
                        jjo jjoVar = jjo.this;
                        final agla aglaVar2 = aglaVar;
                        jjoVar.c(new amml() { // from class: jin
                            @Override // defpackage.amml
                            public final Object apply(Object obj2) {
                                final agla aglaVar3 = agla.this;
                                final aalc aalcVar = (aalc) obj2;
                                return new jhx() { // from class: jiw
                                    @Override // defpackage.jhx
                                    public final void a(Object obj3) {
                                        aalc aalcVar2 = aalc.this;
                                        agla aglaVar4 = aglaVar3;
                                        amsx amsxVar = jjo.a;
                                        ((jju) obj3).m(aalcVar2, aglaVar4.a);
                                    }
                                };
                            }
                        }, "Error updating entities for OfflineVideoCompleteEvent.");
                    }
                }));
                return null;
            case 7:
                final aglb aglbVar = (aglb) obj;
                this.g.c(jia.b(aglbVar.a, aglb.class, new Runnable() { // from class: jjd
                    @Override // java.lang.Runnable
                    public final void run() {
                        jjo jjoVar = jjo.this;
                        final aglb aglbVar2 = aglbVar;
                        jjoVar.c(new amml() { // from class: jio
                            @Override // defpackage.amml
                            public final Object apply(Object obj2) {
                                final aglb aglbVar3 = aglb.this;
                                final aalc aalcVar = (aalc) obj2;
                                return new jhx() { // from class: jjh
                                    @Override // defpackage.jhx
                                    public final void a(Object obj3) {
                                        aalc aalcVar2 = aalc.this;
                                        aglb aglbVar4 = aglbVar3;
                                        amsx amsxVar = jjo.a;
                                        ((jju) obj3).n(aalcVar2, aglbVar4.a);
                                    }
                                };
                            }
                        }, "Error updating entities for OfflineVideoDeleteEvent.");
                    }
                }));
                return null;
            case 8:
                final aglg aglgVar = (aglg) obj;
                this.g.c(jia.b(aglgVar.a, aglg.class, new Runnable() { // from class: jje
                    @Override // java.lang.Runnable
                    public final void run() {
                        jjo jjoVar = jjo.this;
                        agnv e4 = ((agof) jjoVar.b.get()).a().m().e(aglgVar.a);
                        if (e4 != null) {
                            jjoVar.c(new jit(e4, 1), "Error updating entities for OfflineVideoPlaybackPositionChangedEvent.");
                        }
                    }
                }));
                return null;
            case 9:
                final aglh aglhVar = (aglh) obj;
                this.g.c(jia.b(aglhVar.a, aglh.class, new Runnable() { // from class: jjf
                    @Override // java.lang.Runnable
                    public final void run() {
                        jjo jjoVar = jjo.this;
                        agnv e4 = ((agof) jjoVar.b.get()).a().m().e(aglhVar.a);
                        if (e4 != null) {
                            jjoVar.c(new jit(e4, 0), "Error updating entities for OfflineVideoRefreshEvent.");
                        }
                    }
                }));
                return null;
            case 10:
                final agli agliVar = (agli) obj;
                this.g.c(jia.b(agliVar.a.m(), agli.class, new Runnable() { // from class: jjg
                    @Override // java.lang.Runnable
                    public final void run() {
                        jjo jjoVar = jjo.this;
                        final agli agliVar2 = agliVar;
                        jjoVar.c(new amml() { // from class: jip
                            @Override // defpackage.amml
                            public final Object apply(Object obj2) {
                                final agli agliVar3 = agli.this;
                                final aalc aalcVar = (aalc) obj2;
                                return new jhx() { // from class: jjk
                                    @Override // defpackage.jhx
                                    public final void a(Object obj3) {
                                        aalc aalcVar2 = aalc.this;
                                        agli agliVar4 = agliVar3;
                                        amsx amsxVar = jjo.a;
                                        ((jju) obj3).q(aalcVar2, agliVar4.a);
                                    }
                                };
                            }
                        }, "Error updating entities for OfflineVideoStatusUpdateEvent.");
                    }
                }));
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
