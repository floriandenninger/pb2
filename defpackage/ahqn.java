package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahqn {
    public final Set a = new HashSet();
    public acsa b;
    public byte[] c;
    public byte[] d;
    public acra e;

    public static acsa a(apxf apxfVar) {
        if (apxfVar == null || !apxfVar.pY(atmb.b)) {
            return null;
        }
        awav awavVar = ((atmc) apxfVar.pX(atmb.b)).h;
        if (awavVar == null) {
            awavVar = awav.a;
        }
        return adyu.ce(awavVar);
    }

    public static void b(acra acraVar, acsa acsaVar, String str) {
        if (acsaVar == null) {
            acraVar.r(str);
        } else {
            acraVar.s(acsaVar, str);
        }
    }

    public static final acsm d(acsl acslVar, Runnable runnable, acqx acqxVar, apxf apxfVar) {
        acsm f;
        acsa a = a(apxfVar);
        if (a != null) {
            f = acslVar.g(acqxVar, a);
        } else {
            f = acslVar.f(acqxVar);
        }
        runnable.run();
        return f;
    }

    public final void c(acra acraVar) {
        acraVar.getClass();
        this.e = acraVar;
    }
}
