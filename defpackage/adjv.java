package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjv {
    private static final String a = zga.a("MDX.promotion");

    public static Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            atbr atbrVar = (atbr) it.next();
            try {
                adjk adjkVar = new adjk();
                int cN = amkq.cN(atbrVar.c);
                if (cN == 0) {
                    cN = 1;
                }
                adjkVar.a = d(cN);
                hashSet.add(new adjl(adjkVar.a, atbrVar.d, atbrVar.e, atbrVar.f, atbrVar.g));
            } catch (IllegalArgumentException e) {
                zga.f(a, "Failed to convert promotion (MdxNotification proto)", e);
            }
        }
        return hashSet;
    }

    public static Set b(Set set) {
        adgd adgdVar;
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            atbs atbsVar = (atbs) it.next();
            try {
                adkc adkcVar = new adkc();
                int cN = amkq.cN(atbsVar.c);
                if (cN == 0) {
                    cN = 1;
                }
                adkcVar.a = d(cN);
                atby atbyVar = atbsVar.d;
                if (atbyVar == null) {
                    atbyVar = atby.a;
                }
                if (atbyVar.c.size() != 0) {
                    for (atbv atbvVar : atbyVar.c) {
                        int cO = amkq.cO(atbvVar.c);
                        if (cO == 0) {
                            cO = 1;
                        }
                        int c = c(cO);
                        atbu atbuVar = atbvVar.d;
                        if (atbuVar == null) {
                            atbuVar = atbu.a;
                        }
                        int i = atbuVar.c;
                        atbu atbuVar2 = atbvVar.d;
                        if (atbuVar2 == null) {
                            atbuVar2 = atbu.a;
                        }
                        adkcVar.b.put(c, new adke(i, atbuVar2.d));
                    }
                }
                if (atbyVar.d.size() != 0) {
                    for (atbv atbvVar2 : atbyVar.d) {
                        int cO2 = amkq.cO(atbvVar2.c);
                        if (cO2 == 0) {
                            cO2 = 1;
                        }
                        int c2 = c(cO2);
                        atbu atbuVar3 = atbvVar2.d;
                        if (atbuVar3 == null) {
                            atbuVar3 = atbu.a;
                        }
                        int i2 = atbuVar3.c;
                        atbu atbuVar4 = atbvVar2.d;
                        if (atbuVar4 == null) {
                            atbuVar4 = atbu.a;
                        }
                        adkcVar.c.put(c2, new adke(i2, atbuVar4.d));
                    }
                }
                int cP = amkq.cP(atbyVar.e);
                if (cP == 0) {
                    cP = 1;
                }
                int i3 = cP - 1;
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Page type: %s is not recognized", Integer.toString(i3)));
                        break;
                    }
                    adgdVar = adgd.WATCH;
                } else {
                    adgdVar = adgd.BROWSE;
                }
                adkcVar.d = adgdVar;
                if (adgdVar == adgd.WATCH) {
                    adkcVar.f = true;
                }
                if ((atbyVar.b & 2) != 0) {
                    atbu atbuVar5 = atbyVar.f;
                    if (atbuVar5 == null) {
                        atbuVar5 = atbu.a;
                    }
                    int i4 = atbuVar5.c;
                    atbu atbuVar6 = atbyVar.f;
                    if (atbuVar6 == null) {
                        atbuVar6 = atbu.a;
                    }
                    adkcVar.e = new adke(i4, atbuVar6.d);
                }
                if ((atbyVar.b & 32) != 0) {
                    atbu atbuVar7 = atbyVar.g;
                    if (atbuVar7 == null) {
                        atbuVar7 = atbu.a;
                    }
                    int i5 = atbuVar7.c;
                    atbu atbuVar8 = atbyVar.g;
                    if (atbuVar8 == null) {
                        atbuVar8 = atbu.a;
                    }
                    adkcVar.g = new adke(i5, atbuVar8.d);
                }
                if (atbyVar.l.size() != 0) {
                    ArrayList arrayList = new ArrayList(atbyVar.l.size());
                    for (atbt atbtVar : atbyVar.l) {
                        int cN2 = amkq.cN(atbtVar.c);
                        if (cN2 == 0) {
                            cN2 = 1;
                        }
                        adkb d = d(cN2);
                        atbu atbuVar9 = atbtVar.d;
                        if (atbuVar9 == null) {
                            atbuVar9 = atbu.a;
                        }
                        long j = atbuVar9.c;
                        atbu atbuVar10 = atbtVar.d;
                        if (atbuVar10 == null) {
                            atbuVar10 = atbu.a;
                        }
                        arrayList.add(new adkd(d, new adke(j, atbuVar10.d), atbtVar.e));
                    }
                    adkcVar.l.clear();
                    adkcVar.l.addAll(arrayList);
                }
                if (atbyVar.h.size() != 0) {
                    ArrayList<Pair> arrayList2 = new ArrayList(atbyVar.h.size());
                    for (atbx atbxVar : atbyVar.h) {
                        arrayList2.add(new Pair(Long.valueOf(atbxVar.b), Long.valueOf(atbxVar.c)));
                    }
                    adkcVar.h.clear();
                    for (Pair pair : arrayList2) {
                        adkcVar.h.add(new adke(((Long) pair.first).longValue(), ((Long) pair.second).longValue()));
                    }
                }
                if (atbyVar.i.size() != 0) {
                    ArrayList arrayList3 = new ArrayList(atbyVar.i.size());
                    for (atbw atbwVar : atbyVar.i) {
                        ArrayList arrayList4 = new ArrayList();
                        if (atbwVar.d.size() != 0) {
                            for (atbu atbuVar11 : atbwVar.d) {
                                arrayList4.add(new adke(atbuVar11.c, atbuVar11.d));
                            }
                        }
                        arrayList3.add(new adkf((atay[]) new aonw(atbwVar.c, atbw.a).toArray(new atay[0]), arrayList4));
                    }
                    adkcVar.i.clear();
                    adkcVar.i.addAll(arrayList3);
                }
                if (atbyVar.j.size() != 0) {
                    aony aonyVar = atbyVar.j;
                    adkcVar.j.clear();
                    adkcVar.j.addAll(aonyVar);
                }
                if (atbyVar.k.size() != 0) {
                    aony aonyVar2 = atbyVar.k;
                    adkcVar.k.clear();
                    adkcVar.k.addAll(aonyVar2);
                }
                hashSet.add(new adkg(adkcVar.a, adkcVar.b, adkcVar.c, adkcVar.d, adkcVar.e, adkcVar.f, adkcVar.g, adkcVar.h, adkcVar.i, adkcVar.j, adkcVar.k, adkcVar.l));
            } catch (IllegalArgumentException e) {
                zga.f(a, "Failed to convert promotion trigger (MdxNotificationTrigger proto)", e);
            }
        }
        return hashSet;
    }

    private static int c(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Time period: %s is not recognized", Integer.toString(i2)));
    }

    private static adkb d(int i) {
        int i2 = i - 1;
        switch (i2) {
            case 1:
                return adkb.CAST_TOOLTIP;
            case 2:
                return adkb.CAST_TOOLTIP_REPRESSED;
            case 3:
                return adkb.CAST_SNACKBAR;
            case 4:
                return adkb.CAST_SNACKBAR_REPRESSED;
            case 5:
                return adkb.CAST_CLING;
            case 6:
                return adkb.CAST_CLING_REPRESSED;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Promotion type: %s is not recognized", Integer.toString(i2)));
        }
    }
}
