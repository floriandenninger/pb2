package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aomw {
    static final aomw a = new aomw(null);
    private static volatile boolean b = false;
    private static volatile aomw c;
    private static volatile aomw d;
    private final Map e;

    public aomw() {
        this.e = new HashMap();
    }

    public static aomw a() {
        aomw aomwVar = c;
        if (aomwVar == null) {
            synchronized (aomw.class) {
                aomwVar = c;
                if (aomwVar == null) {
                    aomwVar = a;
                    c = aomwVar;
                }
            }
        }
        return aomwVar;
    }

    public static aomw c() {
        return new aomw();
    }

    public aonk d(aooy aooyVar, int i) {
        return (aonk) this.e.get(new aomv(aooyVar, i));
    }

    public final void e(aonk aonkVar) {
        this.e.put(new aomv(aonkVar.a, aonkVar.a()), aonkVar);
    }

    public aomw(byte[] bArr) {
        this.e = Collections.emptyMap();
    }

    public static aomw b() {
        aomw aomwVar = d;
        if (aomwVar != null) {
            return aomwVar;
        }
        synchronized (aomw.class) {
            aomw aomwVar2 = d;
            if (aomwVar2 != null) {
                return aomwVar2;
            }
            aomw b2 = aond.b(aomw.class);
            d = b2;
            return b2;
        }
    }
}
