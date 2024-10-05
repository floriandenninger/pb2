package defpackage;

import android.content.Context;
import com.google.android.libraries.backup.Backup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lyl {

    @Backup
    public static final String SPATIAL_AUDIO_MEALBAR_SHOWN = "spatial_audio_mealbar_shown";
    private static final amsx a = amsx.r(SPATIAL_AUDIO_MEALBAR_SHOWN);

    private lyl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lym a(vfm vfmVar, lym lymVar) {
        aone builder = lymVar.toBuilder();
        if (vfmVar.e(SPATIAL_AUDIO_MEALBAR_SHOWN)) {
            boolean m = whl.m(SPATIAL_AUDIO_MEALBAR_SHOWN, vfmVar);
            builder.copyOnWrite();
            lym lymVar2 = (lym) builder.instance;
            lymVar2.b |= 1;
            lymVar2.c = m;
        }
        return (lym) builder.build();
    }

    public static ywr b(Context context, azrw azrwVar, anib anibVar, String str, ylr ylrVar) {
        return whl.p("spatial_audio_mealbar_proto.pb", context, (vfg) azrwVar.get(), anibVar, str, lyk.a, lym.a, a, ylrVar);
    }
}
