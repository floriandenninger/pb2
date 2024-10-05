package defpackage;

import android.net.Uri;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vlq {
    private static final aofk a;
    private static final aofd b;

    static {
        aone createBuilder = aofk.a.createBuilder();
        createBuilder.copyOnWrite();
        aofk aofkVar = (aofk) createBuilder.instance;
        aofkVar.c = 1;
        aofkVar.b |= 1;
        a = (aofk) createBuilder.build();
        aone createBuilder2 = aofd.a.createBuilder();
        aogv aogvVar = aogv.UNKNOWN;
        createBuilder2.copyOnWrite();
        aofd aofdVar = (aofd) createBuilder2.instance;
        aofdVar.c = aogvVar.s;
        aofdVar.b |= 1;
        b = (aofd) createBuilder2.build();
    }

    public static aofd a(csz cszVar) {
        if (cszVar == null) {
            return b;
        }
        for (Throwable th : cszVar.a()) {
            if (th instanceof cpy) {
                cpy cpyVar = (cpy) th;
                aone createBuilder = aofd.a.createBuilder();
                if (cpyVar.getCause() instanceof SocketTimeoutException) {
                    aogv aogvVar = aogv.DEADLINE_EXCEEDED;
                    createBuilder.copyOnWrite();
                    aofd aofdVar = (aofd) createBuilder.instance;
                    aofdVar.c = aogvVar.s;
                    aofdVar.b |= 1;
                    aofk aofkVar = a;
                    createBuilder.copyOnWrite();
                    aofd aofdVar2 = (aofd) createBuilder.instance;
                    aofkVar.getClass();
                    aofdVar2.e = aofkVar;
                    aofdVar2.b |= 4;
                    return (aofd) createBuilder.build();
                }
                if (cpyVar.getCause() instanceof UnknownHostException) {
                    aogv aogvVar2 = aogv.CANCELLED;
                    createBuilder.copyOnWrite();
                    aofd aofdVar3 = (aofd) createBuilder.instance;
                    aofdVar3.c = aogvVar2.s;
                    aofdVar3.b |= 1;
                    aofk aofkVar2 = a;
                    createBuilder.copyOnWrite();
                    aofd aofdVar4 = (aofd) createBuilder.instance;
                    aofkVar2.getClass();
                    aofdVar4.e = aofkVar2;
                    aofdVar4.b |= 4;
                    return (aofd) createBuilder.build();
                }
                aone builder = a.toBuilder();
                int i = cpyVar.a;
                builder.copyOnWrite();
                aofk aofkVar3 = (aofk) builder.instance;
                aofkVar3.b |= 2;
                aofkVar3.d = i;
                createBuilder.copyOnWrite();
                aofd aofdVar5 = (aofd) createBuilder.instance;
                aofk aofkVar4 = (aofk) builder.build();
                aofkVar4.getClass();
                aofdVar5.e = aofkVar4;
                aofdVar5.b |= 4;
                int i2 = cpyVar.a;
                if (i2 == 403) {
                    aogv aogvVar3 = aogv.UNAUTHENTICATED;
                    createBuilder.copyOnWrite();
                    aofd aofdVar6 = (aofd) createBuilder.instance;
                    aofdVar6.c = aogvVar3.s;
                    aofdVar6.b |= 1;
                } else if (i2 == 404) {
                    aogv aogvVar4 = aogv.NOT_FOUND;
                    createBuilder.copyOnWrite();
                    aofd aofdVar7 = (aofd) createBuilder.instance;
                    aofdVar7.c = aogvVar4.s;
                    aofdVar7.b |= 1;
                } else if (i2 == 500) {
                    aogv aogvVar5 = aogv.INTERNAL;
                    createBuilder.copyOnWrite();
                    aofd aofdVar8 = (aofd) createBuilder.instance;
                    aofdVar8.c = aogvVar5.s;
                    aofdVar8.b |= 1;
                }
                return (aofd) createBuilder.build();
            }
        }
        return b;
    }

    public static aofg b(Object obj) {
        aone createBuilder = aofg.a.createBuilder();
        int d = d(obj);
        createBuilder.copyOnWrite();
        aofg aofgVar = (aofg) createBuilder.instance;
        aofgVar.c = d - 1;
        aofgVar.b |= 1;
        return (aofg) createBuilder.build();
    }

    public static aofg c(Object obj, int i) {
        aone createBuilder = aofg.a.createBuilder();
        int d = d(obj);
        createBuilder.copyOnWrite();
        aofg aofgVar = (aofg) createBuilder.instance;
        aofgVar.c = d - 1;
        int i2 = 1;
        aofgVar.b |= 1;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i3 == 0) {
            i2 = 3;
        } else if (i3 == 1) {
            i2 = 5;
        } else if (i3 == 2) {
            i2 = 2;
        } else if (i3 == 3) {
            i2 = 6;
        } else if (i3 == 4) {
            i2 = 4;
        }
        createBuilder.copyOnWrite();
        aofg aofgVar2 = (aofg) createBuilder.instance;
        aofgVar2.d = i2 - 1;
        aofgVar2.b |= 2;
        return (aofg) createBuilder.build();
    }

    private static int d(Object obj) {
        if (obj instanceof Uri) {
            return 3;
        }
        return obj instanceof vkd ? 2 : 1;
    }
}
