package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mcx {
    private static final amsx a = amsx.s(mcy.FEED_FILTER_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP, mcy.FEED_FILTER_BAR_TUTORIAL_SHOWN_COUNT);

    public static mcz a(vfm vfmVar, mcz mczVar) {
        aone builder = mczVar.toBuilder();
        if (vfmVar.e(mcy.FEED_FILTER_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP)) {
            long b = vfmVar.b(mcy.FEED_FILTER_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP, -1L);
            builder.copyOnWrite();
            mcz mczVar2 = (mcz) builder.instance;
            mczVar2.b |= 1;
            mczVar2.c = b;
        }
        if (vfmVar.e(mcy.FEED_FILTER_BAR_TUTORIAL_SHOWN_COUNT)) {
            int a2 = vfmVar.a(mcy.FEED_FILTER_BAR_TUTORIAL_SHOWN_COUNT, 0);
            builder.copyOnWrite();
            mcz mczVar3 = (mcz) builder.instance;
            mczVar3.b |= 2;
            mczVar3.d = a2;
        }
        return (mcz) builder.build();
    }

    public static ywr b(Context context, azrw azrwVar, anib anibVar, String str, ylr ylrVar) {
        return whl.p("topbar_proto.pb", context, (vfg) azrwVar.get(), anibVar, str, lyk.c, mcz.a, a, ylrVar);
    }
}
