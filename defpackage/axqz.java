package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axqz {
    public static final Pattern a = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern b = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern c = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    public static final String a(String str, Pattern pattern, String str2, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(i) : str2;
    }

    public static final String b(String str) {
        return str == null ? "US-ASCII" : str;
    }
}
