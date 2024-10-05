package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyp implements Comparator, Serializable {
    private static final long serialVersionUID = 1;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int bY;
        aowc aowcVar = (aowc) obj;
        aowc aowcVar2 = (aowc) obj2;
        int bY2 = amkq.bY(aowcVar.d);
        if ((bY2 != 0 && bY2 == 2) || ((bY = amkq.bY(aowcVar2.d)) != 0 && bY == 2)) {
            int bY3 = amkq.bY(aowcVar.d);
            if (bY3 != 0 && bY3 == 2) {
                return -1;
            }
        } else {
            int bY4 = amkq.bY(aowcVar.d);
            if (bY4 == 0 || bY4 != 4) {
                int bY5 = amkq.bY(aowcVar2.d);
                if (bY5 != 0 && bY5 == 4) {
                    return -1;
                }
                return aowcVar.b - aowcVar2.b;
            }
            int bY6 = amkq.bY(aowcVar2.d);
            if (bY6 != 0 && bY6 == 4) {
                return 0;
            }
        }
        return 1;
    }
}
