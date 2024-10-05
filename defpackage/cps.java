package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cps {
    public static final Map a;
    public static final amnv b;
    public final cpq c = new cpq(this);
    public final Map d = new HashMap();
    public final ajkn e;

    static {
        EnumMap enumMap = new EnumMap(cof.class);
        a = enumMap;
        b = amkq.x(new jgc(1));
        enumMap.put((EnumMap) cof.IMMEDIATE, (cof) 4);
        enumMap.put((EnumMap) cof.HIGH, (cof) 3);
        enumMap.put((EnumMap) cof.NORMAL, (cof) 2);
        enumMap.put((EnumMap) cof.LOW, (cof) 1);
    }

    public cps(ajkn ajknVar) {
        this.e = ajknVar;
    }
}
