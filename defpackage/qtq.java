package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qtq {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
