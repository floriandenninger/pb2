package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aju {
    static {
        new Locale("", "");
    }

    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
