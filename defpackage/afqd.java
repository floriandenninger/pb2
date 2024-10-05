package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afqd {
    private final aqjf a;
    private final int b;
    private aqje c;
    private afqq d;
    private aqji e;
    private aqji f;
    private aqji g;
    private aqji h;

    public afqd(ynx ynxVar, Context context) {
        atej atejVar = ynxVar.a().k;
        if ((atejVar == null ? atej.a : atejVar).k == null) {
            aquo aquoVar = aquo.a;
        }
        atej atejVar2 = ynxVar.a().k;
        aqjf aqjfVar = (atejVar2 == null ? atej.a : atejVar2).j;
        aqjfVar = aqjfVar == null ? aqjf.a : aqjfVar;
        this.a = aqjfVar;
        this.b = aqjfVar.j;
        if (aqjfVar.c >= 0) {
            int i = aqjfVar.d;
        }
        if (context != null) {
            new File(context.getFilesDir(), "desv2");
        }
    }

    private static final void o(aone aoneVar, int i, int i2, int i3) {
        int am = aobq.am(((aqji) aoneVar.instance).e);
        if (am != 0 && am != 1 && (i = aobq.am(((aqji) aoneVar.instance).e)) == 0) {
            i = 1;
        }
        aoneVar.copyOnWrite();
        aqji aqjiVar = (aqji) aoneVar.instance;
        aqjiVar.e = i - 1;
        aqjiVar.b |= 4;
        int i4 = aqjiVar.c;
        boolean z = false;
        if (i4 >= 0 && aqjiVar.d > i4) {
            z = true;
        }
        if (z) {
            i2 = i4;
        }
        aoneVar.copyOnWrite();
        aqji aqjiVar2 = (aqji) aoneVar.instance;
        aqjiVar2.b |= 1;
        aqjiVar2.c = i2;
        if (z) {
            i3 = aqjiVar2.d;
        }
        aoneVar.copyOnWrite();
        aqji aqjiVar3 = (aqji) aoneVar.instance;
        aqjiVar3.b |= 2;
        aqjiVar3.d = i3;
    }

    private static final aqji p(aone aoneVar, aqjm aqjmVar) {
        aqjm aqjmVar2 = aqjm.DELAYED_EVENT_TIER_UNSPECIFIED;
        int ordinal = aqjmVar.ordinal();
        if (ordinal == 1) {
            o(aoneVar, 2, 60, 120);
        } else if (ordinal == 2) {
            o(aoneVar, 3, 60, 120);
        } else if (ordinal == 3) {
            o(aoneVar, 3, 4, 5);
        } else if (ordinal == 4) {
            o(aoneVar, 2, 60, 120);
        } else {
            o(aoneVar, 2, 60, 120);
        }
        return (aqji) aoneVar.build();
    }

    public final double a() {
        return this.a.m;
    }

    public final double b() {
        return this.a.o;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a.h;
    }

    public final afqq e() {
        aqjg aqjgVar;
        if (this.d == null) {
            aqjf aqjfVar = this.a;
            if ((aqjfVar.b & 128) != 0) {
                aqjgVar = aqjfVar.f;
                if (aqjgVar == null) {
                    aqjgVar = aqjg.a;
                }
            } else {
                aqjgVar = null;
            }
            this.d = new afqf(aqjgVar);
        }
        return this.d;
    }

    public final aqji g() {
        if (this.e == null) {
            aqjj aqjjVar = this.a.g;
            if (aqjjVar == null) {
                aqjjVar = aqjj.a;
            }
            aqji aqjiVar = aqjjVar.c;
            if (aqjiVar == null) {
                aqjiVar = aqji.a;
            }
            this.e = p(aqjiVar.toBuilder(), aqjm.DELAYED_EVENT_TIER_DEFAULT);
        }
        return this.e;
    }

    public final aqji h() {
        if (this.g == null) {
            aqjj aqjjVar = this.a.g;
            if (aqjjVar == null) {
                aqjjVar = aqjj.a;
            }
            aqji aqjiVar = aqjjVar.d;
            if (aqjiVar == null) {
                aqjiVar = aqji.a;
            }
            this.g = p(aqjiVar.toBuilder(), aqjm.DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY);
        }
        return this.g;
    }

    public final aqji i() {
        if (this.f == null) {
            aqjj aqjjVar = this.a.g;
            if (aqjjVar == null) {
                aqjjVar = aqjj.a;
            }
            aqji aqjiVar = aqjjVar.e;
            if (aqjiVar == null) {
                aqjiVar = aqji.a;
            }
            this.f = p(aqjiVar.toBuilder(), aqjm.DELAYED_EVENT_TIER_FAST);
        }
        return this.f;
    }

    public final aqji j() {
        if (this.h == null) {
            aqjj aqjjVar = this.a.g;
            if (aqjjVar == null) {
                aqjjVar = aqjj.a;
            }
            aqji aqjiVar = aqjjVar.f;
            if (aqjiVar == null) {
                aqjiVar = aqji.a;
            }
            this.h = p(aqjiVar.toBuilder(), aqjm.DELAYED_EVENT_TIER_IMMEDIATE);
        }
        return this.h;
    }

    public final boolean k() {
        return this.a.l;
    }

    public final boolean l() {
        aqjf aqjfVar = this.a;
        if ((aqjfVar.b & 8388608) != 0) {
            return aqjfVar.n;
        }
        return false;
    }

    public final boolean m() {
        return this.a.k;
    }

    public final boolean n() {
        return this.a.p;
    }

    public final aqje f() {
        aone createBuilder;
        if (this.c == null) {
            aqjf aqjfVar = this.a;
            if ((aqjfVar.b & 16) == 0) {
                createBuilder = aqje.a.createBuilder();
                createBuilder.copyOnWrite();
                aqje aqjeVar = (aqje) createBuilder.instance;
                aqjeVar.b |= 1;
                aqjeVar.c = true;
            } else {
                aqje aqjeVar2 = aqjfVar.e;
                if (aqjeVar2 == null) {
                    aqjeVar2 = aqje.a;
                }
                createBuilder = aqjeVar2.toBuilder();
            }
            aqje aqjeVar3 = (aqje) createBuilder.instance;
            int i = aqjeVar3.d;
            boolean z = i >= 0 && aqjeVar3.e > i;
            if (!z) {
                i = 0;
            }
            createBuilder.copyOnWrite();
            aqje aqjeVar4 = (aqje) createBuilder.instance;
            aqjeVar4.b |= 2;
            aqjeVar4.d = i;
            int i2 = z ? aqjeVar4.e : 10;
            createBuilder.copyOnWrite();
            aqje aqjeVar5 = (aqje) createBuilder.instance;
            aqjeVar5.b |= 4;
            aqjeVar5.e = i2;
            this.c = (aqje) createBuilder.build();
        }
        return this.c;
    }
}
