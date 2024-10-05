package defpackage;

import android.app.KeyguardManager;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aco {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(KeyguardManager keyguardManager) {
        return keyguardManager.isKeyguardSecure();
    }

    public static agf b(afk afkVar, int i, ArrayList arrayList, agf agfVar) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = afkVar.an;
        } else {
            i2 = afkVar.ao;
        }
        if (i2 != -1 && (agfVar == null || i2 != agfVar.c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                agf agfVar2 = (agf) arrayList.get(i4);
                if (agfVar2.c == i2) {
                    if (agfVar != null) {
                        agfVar.c(i, agfVar2);
                        arrayList.remove(agfVar);
                    }
                    agfVar = agfVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return agfVar;
        }
        if (agfVar == null) {
            if (afkVar instanceof afo) {
                afo afoVar = (afo) afkVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= afoVar.ar) {
                        i3 = -1;
                        break;
                    }
                    afk afkVar2 = afoVar.aq[i5];
                    if (i != 0) {
                        i3 = afkVar2.ao;
                        if (i3 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i3 = afkVar2.an;
                        if (i3 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i3 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        agf agfVar3 = (agf) arrayList.get(i6);
                        if (agfVar3.c == i3) {
                            agfVar = agfVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (agfVar == null) {
                agfVar = new agf(i);
            }
            arrayList.add(agfVar);
        }
        if (agfVar.d(afkVar)) {
            if (afkVar instanceof afn) {
                afn afnVar = (afn) afkVar;
                afnVar.d.c(afnVar.aq == 0 ? 1 : 0, arrayList, agfVar);
            }
            if (i != 0) {
                afkVar.ao = agfVar.c;
                afkVar.K.c(1, arrayList, agfVar);
                afkVar.N.c(1, arrayList, agfVar);
                afkVar.M.c(1, arrayList, agfVar);
            } else {
                afkVar.an = agfVar.c;
                afkVar.f45J.c(0, arrayList, agfVar);
                afkVar.L.c(0, arrayList, agfVar);
            }
            afkVar.Q.c(i, arrayList, agfVar);
        }
        return agfVar;
    }

    public static agf c(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            agf agfVar = (agf) arrayList.get(i2);
            if (i == agfVar.c) {
                return agfVar;
            }
        }
        return null;
    }

    public static boolean d(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
