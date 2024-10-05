package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anar extends anap {
    private static final Map c;
    private final amyk d;

    static {
        EnumMap enumMap = new EnumMap(amyk.class);
        for (amyk amykVar : amyk.values()) {
            anar[] anarVarArr = new anar[10];
            for (int i = 0; i < 10; i++) {
                anarVarArr[i] = new anar(i, amykVar, amyl.a);
            }
            enumMap.put((EnumMap) amykVar, (amyk) anarVarArr);
        }
        c = Collections.unmodifiableMap(enumMap);
    }

    private anar(int i, amyk amykVar, amyl amylVar) {
        super(amylVar, i);
        anaf.d(amykVar, "format char");
        this.d = amykVar;
        if (amylVar.c()) {
            String str = amykVar.o;
            return;
        }
        int i2 = amykVar.l;
        i2 = amylVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        amylVar.f(sb);
        sb.append((char) i2);
    }

    public static anar b(int i, amyk amykVar, amyl amylVar) {
        if (i >= 10 || !amylVar.c()) {
            return new anar(i, amykVar, amylVar);
        }
        return ((anar[]) c.get(amykVar))[i];
    }

    @Override // defpackage.anap
    public final void a(anaq anaqVar, Object obj) {
        anaqVar.a(obj, this.d, this.b);
    }
}
