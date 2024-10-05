package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aarv {
    static {
        Pattern.compile("([a-zA-Z0-9]{2,3})_([a-zA-Z0-9]{2,3})?_[a-zA-Z0-9_]*#([a-zA-Z0-9]{4})");
    }

    public static String a(Locale locale) {
        return locale.toLanguageTag();
    }
}
