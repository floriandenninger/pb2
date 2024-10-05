package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class opm {
    private static final amsx a = amsx.t(opn.PIVOT_BAR_LIBRARY_TAB_VISITED, opn.PIVOT_BAR_ACCOUNT_HINT_SHOWN, opn.PIVOT_BAR_LIBRARY_HINT_TIMESTAMP);

    public static opo a(vfm vfmVar, opo opoVar) {
        aone builder = opoVar.toBuilder();
        if (vfmVar.e(opn.PIVOT_BAR_LIBRARY_TAB_VISITED)) {
            boolean m = whl.m(opn.PIVOT_BAR_LIBRARY_TAB_VISITED, vfmVar);
            builder.copyOnWrite();
            opo opoVar2 = (opo) builder.instance;
            opoVar2.b |= 1;
            opoVar2.c = m;
        }
        if (vfmVar.e(opn.PIVOT_BAR_ACCOUNT_HINT_SHOWN)) {
            boolean m2 = whl.m(opn.PIVOT_BAR_ACCOUNT_HINT_SHOWN, vfmVar);
            builder.copyOnWrite();
            opo opoVar3 = (opo) builder.instance;
            opoVar3.b |= 2;
            opoVar3.d = m2;
        }
        if (vfmVar.e(opn.PIVOT_BAR_LIBRARY_HINT_TIMESTAMP)) {
            long b = vfmVar.b(opn.PIVOT_BAR_LIBRARY_HINT_TIMESTAMP, 0L);
            builder.copyOnWrite();
            opo opoVar4 = (opo) builder.instance;
            opoVar4.b |= 4;
            opoVar4.e = b;
        }
        return (opo) builder.build();
    }

    public static ywr b(Context context, azrw azrwVar, anib anibVar, String str, ylr ylrVar) {
        return whl.p("pivotbar_proto.pb", context, (vfg) azrwVar.get(), anibVar, str, lyk.d, opo.a, a, ylrVar);
    }
}
