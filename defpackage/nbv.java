package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbv implements ngy {
    public final nbu a;
    public nck b;
    public apxf c;
    public List d;
    public List e;
    public List f;
    private final euv g;
    private String h;

    public nbv(euv euvVar, nbu nbuVar) {
        this.g = euvVar;
        this.a = nbuVar;
    }

    public final ncf a() {
        return (ncf) this.g.b(this.h, ncf.class, "PSP15CState", nbo.c);
    }

    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ ngw b(Object obj) {
        ngw ngwVar = new ngw();
        augo augoVar = augo.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        int ordinal = ((augo) obj).ordinal();
        final int i = 1;
        if (ordinal != 1) {
            final int i2 = 2;
            if (ordinal == 2) {
                final int i3 = 0;
                ngwVar.c = new Runnable(this) { // from class: nbt
                    public final /* synthetic */ nbv a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        if (i4 != 0) {
                            if (i4 == 1) {
                                nbv nbvVar = this.a;
                                nbvVar.b.e(nbvVar.d, true);
                                return;
                            } else {
                                nbv nbvVar2 = this.a;
                                nbvVar2.b.q(nbvVar2.c);
                                return;
                            }
                        }
                        nbv nbvVar3 = this.a;
                        boolean l = nbvVar3.l();
                        nbvVar3.b.e(l ? nbvVar3.f : nbvVar3.e, true);
                        boolean z = true ^ l;
                        nbvVar3.a().a = z;
                        nbu nbuVar = nbvVar3.a;
                        if (nbuVar != null) {
                            nbuVar.a(z);
                        }
                    }
                };
                ngwVar.a = true;
            } else if (ordinal == 3) {
                ngwVar.c = new Runnable(this) { // from class: nbt
                    public final /* synthetic */ nbv a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i2;
                        if (i4 != 0) {
                            if (i4 == 1) {
                                nbv nbvVar = this.a;
                                nbvVar.b.e(nbvVar.d, true);
                                return;
                            } else {
                                nbv nbvVar2 = this.a;
                                nbvVar2.b.q(nbvVar2.c);
                                return;
                            }
                        }
                        nbv nbvVar3 = this.a;
                        boolean l = nbvVar3.l();
                        nbvVar3.b.e(l ? nbvVar3.f : nbvVar3.e, true);
                        boolean z = true ^ l;
                        nbvVar3.a().a = z;
                        nbu nbuVar = nbvVar3.a;
                        if (nbuVar != null) {
                            nbuVar.a(z);
                        }
                    }
                };
                ngwVar.a = true;
            }
        } else {
            ngwVar.c = new Runnable(this) { // from class: nbt
                public final /* synthetic */ nbv a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            nbv nbvVar = this.a;
                            nbvVar.b.e(nbvVar.d, true);
                            return;
                        } else {
                            nbv nbvVar2 = this.a;
                            nbvVar2.b.q(nbvVar2.c);
                            return;
                        }
                    }
                    nbv nbvVar3 = this.a;
                    boolean l = nbvVar3.l();
                    nbvVar3.b.e(l ? nbvVar3.f : nbvVar3.e, true);
                    boolean z = true ^ l;
                    nbvVar3.a().a = z;
                    nbu nbuVar = nbvVar3.a;
                    if (nbuVar != null) {
                        nbuVar.a(z);
                    }
                }
            };
            ngwVar.a = true;
            ngwVar.b = true;
        }
        return ngwVar;
    }

    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ Integer c(Object obj) {
        augt augtVar = (augt) obj;
        if (augtVar == null || (augtVar.b & 2) == 0) {
            return null;
        }
        return Integer.valueOf(augtVar.d);
    }

    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        augt augtVar = (augt) obj;
        augo augoVar = augo.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        if (augtVar == null) {
            return augoVar;
        }
        if (l()) {
            if ((augtVar.b & 8) == 0) {
                return augoVar;
            }
            augo b = augo.b(augtVar.f);
            if (b != null) {
                return b;
            }
        } else {
            if ((augtVar.b & 4) == 0) {
                return augoVar;
            }
            augo b2 = augo.b(augtVar.e);
            if (b2 != null) {
                return b2;
            }
        }
        return augo.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
    }

    @Override // defpackage.ngy
    public final /* synthetic */ Object e() {
        return augo.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_NOOP;
    }

    @Override // defpackage.ngy
    public final /* synthetic */ Object f() {
        return augo.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_OPEN_AD;
    }

    @Override // defpackage.ngy
    public final /* synthetic */ Object g() {
        return augo.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
    }

    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ void h(Map map, Object[] objArr) {
        for (augt augtVar : (augt[]) objArr) {
            augq b = augq.b(augtVar.c);
            if (b == null) {
                b = augq.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN;
            }
            map.put(b, augtVar);
        }
    }

    @Override // defpackage.ngy
    public final void i() {
        this.b.q(this.c);
    }

    @Override // defpackage.ngy
    public final void j(nck nckVar) {
        this.b = nckVar;
    }

    public final void k(String str, apxf apxfVar, List list, List list2, List list3) {
        this.h = str;
        this.c = apxfVar;
        this.d = list;
        this.e = list2;
        this.f = list3;
    }

    public final boolean l() {
        return a().a;
    }
}
