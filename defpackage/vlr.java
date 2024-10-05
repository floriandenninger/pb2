package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vlr {
    private static final aofd a;

    static {
        aone createBuilder = aofd.a.createBuilder();
        aogv aogvVar = aogv.UNKNOWN;
        createBuilder.copyOnWrite();
        aofd aofdVar = (aofd) createBuilder.instance;
        aofdVar.c = aogvVar.s;
        aofdVar.b |= 1;
        a = (aofd) createBuilder.build();
    }

    public static aofd a(Throwable th) {
        if (th instanceof qcw) {
            aone createBuilder = aofd.a.createBuilder();
            aogv aogvVar = aogv.UNAUTHENTICATED;
            createBuilder.copyOnWrite();
            aofd aofdVar = (aofd) createBuilder.instance;
            aofdVar.c = aogvVar.s;
            aofdVar.b |= 1;
            int i = true != vlm.b(th) ? 7 : 6;
            createBuilder.copyOnWrite();
            aofd aofdVar2 = (aofd) createBuilder.instance;
            aofdVar2.d = i - 1;
            aofdVar2.b |= 2;
            return (aofd) createBuilder.build();
        }
        if (th instanceof aydd) {
            aogv a2 = aogv.a(((aydd) th).a.getCode().value());
            if (a2 == null) {
                return a;
            }
            aone createBuilder2 = aofd.a.createBuilder();
            createBuilder2.copyOnWrite();
            aofd aofdVar3 = (aofd) createBuilder2.instance;
            aofdVar3.c = a2.s;
            aofdVar3.b |= 1;
            return (aofd) createBuilder2.build();
        }
        if (!(th instanceof IOException)) {
            return a;
        }
        aone createBuilder3 = aofd.a.createBuilder();
        aogv aogvVar2 = aogv.UNAVAILABLE;
        createBuilder3.copyOnWrite();
        aofd aofdVar4 = (aofd) createBuilder3.instance;
        aofdVar4.c = aogvVar2.s;
        aofdVar4.b |= 1;
        return (aofd) createBuilder3.build();
    }
}
