package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aalz {
    public final askd a;
    private List b;
    private List c;

    public aalz(askd askdVar) {
        askdVar.getClass();
        this.a = askdVar;
    }

    public final List a() {
        if (this.c == null) {
            this.c = new ArrayList(this.a.f.size());
            for (askf askfVar : this.a.f) {
                int i = askfVar.b;
                if ((i & 1) != 0) {
                    List list = this.c;
                    atmt atmtVar = askfVar.c;
                    if (atmtVar == null) {
                        atmtVar = atmt.a;
                    }
                    list.add(ahbj.o(atmtVar));
                } else if ((i & 4) != 0) {
                    List list2 = this.c;
                    aulm aulmVar = askfVar.e;
                    if (aulmVar == null) {
                        aulmVar = aulm.a;
                    }
                    list2.add(ahbj.o(aulmVar));
                } else if ((i & 2) != 0) {
                    List list3 = this.c;
                    aufe aufeVar = askfVar.d;
                    if (aufeVar == null) {
                        aufeVar = aufe.a;
                    }
                    list3.add(ahbj.o(aufeVar));
                } else if ((i & 8) != 0) {
                    List list4 = this.c;
                    avgs avgsVar = askfVar.f;
                    if (avgsVar == null) {
                        avgsVar = avgs.a;
                    }
                    list4.add(ahbj.o(avgsVar));
                }
            }
        }
        return this.c;
    }

    public final List b() {
        if (this.b == null) {
            this.b = new ArrayList(this.a.e.size());
            for (askg askgVar : this.a.e) {
                if ((askgVar.c & 268435456) != 0) {
                    ausu ausuVar = askgVar.W;
                    if (ausuVar == null) {
                        ausuVar = ausu.a;
                    }
                    if ((ausuVar.b & 4194304) != 0) {
                        ausw auswVar = ausuVar.r;
                        if (auswVar == null) {
                            auswVar = ausw.a;
                        }
                        if ((auswVar.b & 4) != 0) {
                            this.b.add(new aaly(ausuVar));
                        } else {
                            ausw auswVar2 = ausuVar.r;
                            if (auswVar2 == null) {
                                auswVar2 = ausw.a;
                            }
                            if ((auswVar2.b & 8) != 0) {
                                this.b.add(new aamj(ausuVar));
                            }
                        }
                    }
                } else {
                    aooy Z = whu.Z(askgVar);
                    if (Z != null) {
                        this.b.add(Z);
                    }
                }
            }
        }
        return this.b;
    }
}
