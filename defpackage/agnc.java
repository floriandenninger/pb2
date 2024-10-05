package defpackage;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agnc {
    private static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(18, 93, 134, 243)));
    private static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(22, 95, 136, 247)));
    public atrx a;
    public final Spanned b;
    public final Spanned c;

    @Deprecated
    private agnc(aqxw aqxwVar, atrx atrxVar) {
        aqyg aqygVar;
        atrx atrxVar2 = atrx.UNKNOWN_FORMAT_TYPE;
        this.a = atrxVar;
        aqyg aqygVar2 = null;
        if ((aqxwVar.b & 1) != 0) {
            aqygVar = aqxwVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        this.b = ajcq.b(aqygVar);
        if ((aqxwVar.b & 2) != 0 && (aqygVar2 = aqxwVar.d) == null) {
            aqygVar2 = aqyg.a;
        }
        this.c = ajcq.b(aqygVar2);
    }

    public static amru a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agnc agncVar = (agnc) it.next();
            aone createBuilder = aqll.a.createBuilder();
            String obj = agncVar.b.toString();
            createBuilder.copyOnWrite();
            aqll aqllVar = (aqll) createBuilder.instance;
            obj.getClass();
            aqllVar.b |= 1;
            aqllVar.c = obj;
            String obj2 = agncVar.c.toString();
            createBuilder.copyOnWrite();
            aqll aqllVar2 = (aqll) createBuilder.instance;
            obj2.getClass();
            aqllVar2.b |= 4;
            aqllVar2.e = obj2;
            atrx atrxVar = agncVar.a;
            createBuilder.copyOnWrite();
            aqll aqllVar3 = (aqll) createBuilder.instance;
            aqllVar3.d = atrxVar.k;
            aqllVar3.b |= 2;
            arrayList.add((aqll) createBuilder.build());
        }
        return amru.o(arrayList);
    }

    public static List b(List list) {
        aqyg h;
        aqyg h2;
        aonm build;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqll aqllVar = (aqll) it.next();
            aone createBuilder = atrw.a.createBuilder();
            if ((aqllVar.b & 1) == 0) {
                h = ajcq.h("");
            } else {
                h = ajcq.h(aqllVar.c);
            }
            createBuilder.copyOnWrite();
            atrw atrwVar = (atrw) createBuilder.instance;
            h.getClass();
            atrwVar.c = h;
            atrwVar.b |= 1;
            if ((aqllVar.b & 4) == 0) {
                h2 = ajcq.h("");
            } else {
                h2 = ajcq.h(aqllVar.e);
            }
            createBuilder.copyOnWrite();
            atrw atrwVar2 = (atrw) createBuilder.instance;
            h2.getClass();
            atrwVar2.d = h2;
            atrwVar2.b |= 2;
            if ((aqllVar.b & 2) == 0) {
                build = createBuilder.build();
            } else {
                atrx b = atrx.b(aqllVar.d);
                if (b == null) {
                    b = atrx.UNKNOWN_FORMAT_TYPE;
                }
                createBuilder.copyOnWrite();
                atrw atrwVar3 = (atrw) createBuilder.instance;
                atrwVar3.e = b.k;
                atrwVar3.b |= 4;
                build = createBuilder.build();
            }
            arrayList.add(new agnc((atrw) build));
        }
        return arrayList;
    }

    public static List c(atsb atsbVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        atrz atrzVar = atsbVar.g;
        if (atrzVar == null) {
            atrzVar = atrz.a;
        }
        aqxx aqxxVar = atrzVar.b;
        if (aqxxVar == null) {
            aqxxVar = aqxx.a;
        }
        if (aqxxVar.c.size() <= 0) {
            if (aqxxVar.b.size() <= 0) {
                for (atrw atrwVar : atsbVar.e) {
                    aone createBuilder = aqll.a.createBuilder();
                    String str2 = "";
                    if ((atrwVar.b & 1) != 0) {
                        aqyg aqygVar = atrwVar.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                        str = ajcq.b(aqygVar).toString();
                    } else {
                        str = "";
                    }
                    createBuilder.copyOnWrite();
                    aqll aqllVar = (aqll) createBuilder.instance;
                    str.getClass();
                    aqllVar.b |= 1;
                    aqllVar.c = str;
                    if ((atrwVar.b & 2) != 0) {
                        aqyg aqygVar2 = atrwVar.d;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                        str2 = ajcq.b(aqygVar2).toString();
                    }
                    createBuilder.copyOnWrite();
                    aqll aqllVar2 = (aqll) createBuilder.instance;
                    str2.getClass();
                    aqllVar2.b |= 4;
                    aqllVar2.e = str2;
                    if ((atrwVar.b & 4) != 0) {
                        atrx b = atrx.b(atrwVar.e);
                        if (b == null) {
                            b = atrx.UNKNOWN_FORMAT_TYPE;
                        }
                        createBuilder.copyOnWrite();
                        aqll aqllVar3 = (aqll) createBuilder.instance;
                        aqllVar3.d = b.k;
                        aqllVar3.b |= 2;
                    }
                    if ((atrwVar.b & 8) != 0) {
                        atrv b2 = atrv.b(atrwVar.f);
                        if (b2 == null) {
                            b2 = atrv.OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN;
                        }
                        createBuilder.copyOnWrite();
                        aqll aqllVar4 = (aqll) createBuilder.instance;
                        aqllVar4.f = b2.e;
                        aqllVar4.b |= 8;
                    }
                    if ((atrwVar.b & 16) != 0) {
                        boolean z = atrwVar.g;
                        createBuilder.copyOnWrite();
                        aqll aqllVar5 = (aqll) createBuilder.instance;
                        aqllVar5.b |= 16;
                        aqllVar5.g = z;
                    }
                    arrayList.add((aqll) createBuilder.build());
                }
            } else {
                Iterator it = aqxxVar.b.iterator();
                while (it.hasNext()) {
                    arrayList.add(e((aqxw) it.next()));
                }
            }
        } else {
            Iterator it2 = aqxxVar.c.iterator();
            while (it2.hasNext()) {
                arrayList.add(e((aqxw) it2.next()));
            }
        }
        return arrayList;
    }

    @Deprecated
    public static Map d(atsb atsbVar) {
        HashMap hashMap = new HashMap();
        atrz atrzVar = atsbVar.g;
        if (atrzVar == null) {
            atrzVar = atrz.a;
        }
        aqxx aqxxVar = atrzVar.b;
        if (aqxxVar == null) {
            aqxxVar = aqxx.a;
        }
        if (aqxxVar.c.size() <= 0) {
            atrz atrzVar2 = atsbVar.g;
            if (atrzVar2 == null) {
                atrzVar2 = atrz.a;
            }
            aqxx aqxxVar2 = atrzVar2.b;
            if (aqxxVar2 == null) {
                aqxxVar2 = aqxx.a;
            }
            if (aqxxVar2.b.size() <= 0) {
                for (atrw atrwVar : atsbVar.e) {
                    atrx b = atrx.b(atrwVar.e);
                    if (b == null) {
                        b = atrx.UNKNOWN_FORMAT_TYPE;
                    }
                    hashMap.put(b, new agnc(atrwVar));
                }
            } else {
                atrz atrzVar3 = atsbVar.g;
                if (atrzVar3 == null) {
                    atrzVar3 = atrz.a;
                }
                aqxx aqxxVar3 = atrzVar3.b;
                if (aqxxVar3 == null) {
                    aqxxVar3 = aqxx.a;
                }
                for (aqxw aqxwVar : aqxxVar3.b) {
                    atrx f = f(aqxwVar);
                    if (hashMap.get(f) != null) {
                        String valueOf = String.valueOf(f);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                        sb.append("Overwriting format for: ");
                        sb.append(valueOf);
                        zga.l(sb.toString());
                    }
                    hashMap.put(f, new agnc(aqxwVar, f));
                }
            }
        } else {
            atrz atrzVar4 = atsbVar.g;
            if (atrzVar4 == null) {
                atrzVar4 = atrz.a;
            }
            aqxx aqxxVar4 = atrzVar4.b;
            if (aqxxVar4 == null) {
                aqxxVar4 = aqxx.a;
            }
            for (aqxw aqxwVar2 : aqxxVar4.c) {
                atrx f2 = f(aqxwVar2);
                if (hashMap.get(f2) != null) {
                    String valueOf2 = String.valueOf(f2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                    sb2.append("Overwriting format for: ");
                    sb2.append(valueOf2);
                    zga.l(sb2.toString());
                }
                hashMap.put(f2, new agnc(aqxwVar2, f2));
            }
        }
        return hashMap;
    }

    private static aqll e(aqxw aqxwVar) {
        String str;
        aone createBuilder = aqll.a.createBuilder();
        String str2 = "";
        if ((aqxwVar.b & 1) != 0) {
            aqyg aqygVar = aqxwVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            str = ajcq.b(aqygVar).toString();
        } else {
            str = "";
        }
        createBuilder.copyOnWrite();
        aqll aqllVar = (aqll) createBuilder.instance;
        str.getClass();
        aqllVar.b |= 1;
        aqllVar.c = str;
        if ((aqxwVar.b & 2) != 0) {
            aqyg aqygVar2 = aqxwVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            str2 = ajcq.b(aqygVar2).toString();
        }
        createBuilder.copyOnWrite();
        aqll aqllVar2 = (aqll) createBuilder.instance;
        str2.getClass();
        aqllVar2.b |= 4;
        aqllVar2.e = str2;
        atrx f = f(aqxwVar);
        createBuilder.copyOnWrite();
        aqll aqllVar3 = (aqll) createBuilder.instance;
        aqllVar3.d = f.k;
        aqllVar3.b |= 2;
        return (aqll) createBuilder.build();
    }

    private static atrx f(aqxw aqxwVar) {
        Set set = d;
        aqxv aqxvVar = aqxwVar.e;
        if (aqxvVar == null) {
            aqxvVar = aqxv.a;
        }
        if (set.contains(Integer.valueOf(aqxvVar.b))) {
            return atrx.SD;
        }
        Set set2 = e;
        aqxv aqxvVar2 = aqxwVar.e;
        if (aqxvVar2 == null) {
            aqxvVar2 = aqxv.a;
        }
        if (set2.contains(Integer.valueOf(aqxvVar2.b))) {
            return atrx.HD;
        }
        return atrx.LD;
    }

    @Deprecated
    public agnc(atrw atrwVar) {
        this.a = atrx.UNKNOWN_FORMAT_TYPE;
        atrx b = atrx.b(atrwVar.e);
        this.a = b == null ? atrx.UNKNOWN_FORMAT_TYPE : b;
        aqyg aqygVar = atrwVar.c;
        this.b = ajcq.b(aqygVar == null ? aqyg.a : aqygVar);
        aqyg aqygVar2 = atrwVar.d;
        this.c = ajcq.b(aqygVar2 == null ? aqyg.a : aqygVar2);
    }

    @Deprecated
    public agnc(atrx atrxVar, Spanned spanned, Spanned spanned2) {
        atrx atrxVar2 = atrx.UNKNOWN_FORMAT_TYPE;
        this.a = atrxVar;
        this.b = spanned;
        this.c = spanned2;
    }
}
