package defpackage;

import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tie {
    public final thp a;

    public tie(thp thpVar) {
        this.a = thpVar;
    }

    public static void a(aong[] aongVarArr, int i, boolean z) {
        aong aongVar = aongVarArr[i];
        if (aongVar.pY(anck.a)) {
            z = true;
        } else if (z) {
            aonk aonkVar = anck.a;
            ancr ancrVar = (ancr) aongVar.instance;
            aongVar.e(aonkVar, Long.valueOf((ancrVar.c << 32) | (ancrVar.d & 4294967295L)));
        }
        Iterator it = Collections.unmodifiableList(((ancr) aongVar.instance).e).iterator();
        while (it.hasNext()) {
            a(aongVarArr, ((Integer) it.next()).intValue(), z);
        }
    }
}
