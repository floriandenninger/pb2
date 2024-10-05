package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yfq {
    private static final amyi a = amyi.o();

    public static boolean a(Context context) {
        try {
            return wbs.Z(context) == 1;
        } catch (Resources.NotFoundException e) {
            ((amyf) ((amyf) ((amyf) a.g()).h(e)).i("com/google/android/libraries/youtube/commerce/red/ui/DarkThemeUtil", "isDarkTheme", 31, "DarkThemeUtil.java")).q("No ytThemeType attribute in current theme.");
            return false;
        }
    }
}
