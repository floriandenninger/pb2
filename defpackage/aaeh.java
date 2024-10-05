package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaeh implements aaeg {
    public static final /* synthetic */ aaeh a = new aaeh(2);
    private final /* synthetic */ int b;

    public aaeh(int i) {
        this.b = i;
    }

    private static void b(aphf aphfVar, ArrayList arrayList) {
        apxf apxfVar;
        if ((aphfVar.b & 4) != 0) {
            aphe apheVar = aphfVar.e;
            if (apheVar == null) {
                apheVar = aphe.a;
            }
            apxf apxfVar2 = null;
            if (apheVar.b == 84996305) {
                aphc aphcVar = (aphc) apheVar.c;
                int i = aphcVar.b & 1;
                if (i != 0) {
                    if (i != 0) {
                        apxfVar = aphcVar.c;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                    } else {
                        apxfVar = null;
                    }
                    arrayList.add(apxfVar);
                }
            }
            if (apheVar.b == 111631903) {
                aphb aphbVar = (aphb) apheVar.c;
                int i2 = aphbVar.b & 1;
                if (i2 != 0) {
                    if (i2 != 0 && (apxfVar2 = aphbVar.c) == null) {
                        apxfVar2 = apxf.a;
                    }
                    arrayList.add(apxfVar2);
                }
            }
        }
    }

    @Override // defpackage.aaeg
    public final List a(Object obj) {
        auov auovVar;
        arke arkeVar;
        aveh avehVar;
        int i = this.b;
        if (i == 0) {
            ArrayList arrayList = new ArrayList();
            if (obj instanceof asfc) {
                asfc asfcVar = (asfc) obj;
                if ((asfcVar.b & 2) != 0) {
                    asfd asfdVar = asfcVar.d;
                    if (asfdVar == null) {
                        asfdVar = asfd.a;
                    }
                    if (asfdVar.b == 51779735) {
                        aseu aseuVar = (aseu) asfdVar.c;
                        if ((aseuVar.b & 4) != 0) {
                            aseq aseqVar = aseuVar.e;
                            if (aseqVar == null) {
                                aseqVar = aseq.a;
                            }
                            if (aseqVar.b == 46659098) {
                                aphg aphgVar = (aphg) aseqVar.c;
                                Iterator it = aphgVar.b.iterator();
                                while (it.hasNext()) {
                                    b((aphf) it.next(), arrayList);
                                }
                                Iterator it2 = aphgVar.c.iterator();
                                while (it2.hasNext()) {
                                    b((aphf) it2.next(), arrayList);
                                }
                                Iterator it3 = aphgVar.d.iterator();
                                while (it3.hasNext()) {
                                    b((aphf) it3.next(), arrayList);
                                }
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
        if (i == 1) {
            if (obj instanceof arjv) {
                arjv arjvVar = (arjv) obj;
                if ((arjvVar.b & 64) != 0) {
                    amrp amrpVar = new amrp();
                    arjw arjwVar = arjvVar.f;
                    if (arjwVar == null) {
                        arjwVar = arjw.a;
                    }
                    if (arjwVar.b == 49399797) {
                        auovVar = (auov) arjwVar.c;
                    } else {
                        auovVar = auov.a;
                    }
                    amrpVar.j(auovVar.e);
                    arjw arjwVar2 = arjvVar.f;
                    if (arjwVar2 == null) {
                        arjwVar2 = arjw.a;
                    }
                    if (arjwVar2.b == 58173949) {
                        arkeVar = (arke) arjwVar2.c;
                    } else {
                        arkeVar = arke.a;
                    }
                    for (arjy arjyVar : arkeVar.c) {
                        if (arjyVar.b == 58174010) {
                            avehVar = (aveh) arjyVar.c;
                        } else {
                            avehVar = aveh.a;
                        }
                        aved avedVar = avehVar.k;
                        if (avedVar == null) {
                            avedVar = aved.a;
                        }
                        auov auovVar2 = avedVar.c;
                        if (auovVar2 == null) {
                            auovVar2 = auov.a;
                        }
                        amrpVar.j(auovVar2.e);
                    }
                    return amrpVar.g();
                }
            }
            return amru.q();
        }
        aapw aapwVar = aapw.a;
        return amru.q();
    }
}
