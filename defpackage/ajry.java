package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajry {
    public avgg a;
    public arfr b = arfr.UNKNOWN;
    public String c;
    public Integer d;

    public static List a(List list) {
        return b(list, null);
    }

    public static List b(List list, Map map) {
        arfs arfsVar;
        ArrayList arrayList = new ArrayList(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            asor asorVar = (asor) it.next();
            if (asorVar.b == 128538449) {
                asoq asoqVar = (asoq) asorVar.c;
                int i = asoqVar.b;
                if (i == 2) {
                    avgg avggVar = (avgg) asoqVar.c;
                    ajry ajryVar = new ajry();
                    ajryVar.a = avggVar;
                    ajryVar.b = arfr.UNKNOWN;
                    ajryVar.c = ajsf.c(avggVar);
                    arrayList.add(ajryVar);
                } else if (i == 1) {
                    arfr b = arfr.b(((arfs) asoqVar.c).c);
                    if (b == null) {
                        b = arfr.UNKNOWN;
                    }
                    if (b != arfr.UNKNOWN) {
                        if (asoqVar.b == 1) {
                            arfsVar = (arfs) asoqVar.c;
                        } else {
                            arfsVar = arfs.a;
                        }
                        arfr b2 = arfr.b(arfsVar.c);
                        if (b2 == null) {
                            b2 = arfr.UNKNOWN;
                        }
                        Integer num = (map == null || !map.containsKey(b2)) ? null : (Integer) map.get(b2);
                        aott aottVar = asoqVar.d;
                        if (aottVar == null) {
                            aottVar = aott.a;
                        }
                        ajry ajryVar2 = new ajry();
                        ajryVar2.a = null;
                        ajryVar2.b = b2;
                        if (aottVar != null && (aottVar.b & 1) != 0) {
                            aots aotsVar = aottVar.c;
                            if (aotsVar == null) {
                                aotsVar = aots.a;
                            }
                            if ((aotsVar.b & 2) != 0) {
                                aots aotsVar2 = aottVar.c;
                                if (aotsVar2 == null) {
                                    aotsVar2 = aots.a;
                                }
                                ajryVar2.c = aotsVar2.c;
                            }
                        }
                        ajryVar2.d = num;
                        arrayList.add(ajryVar2);
                    }
                }
            }
        }
        return arrayList;
    }
}
