package defpackage;

import java.util.Collections;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dxy {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public static final int a(dxk dxkVar, dym dymVar, dyn dynVar) {
        dyn a = dymVar.a(dxkVar, Collections.singletonList(dynVar));
        if (a instanceof dyg) {
            return esv.v(a.h().doubleValue());
        }
        return -1;
    }
}
