package defpackage;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uzd {
    private static final amyi b = amyi.m("GlobMatcher");
    public final Pattern a;

    private uzd(String str, Pattern pattern) {
        str.getClass();
        this.a = pattern;
    }

    public static ammv a(String str) {
        ajbh ajbhVar = new ajbh((byte[]) null, (byte[]) null);
        StringBuilder sb = new StringBuilder();
        if (ajbhVar.R(str.toCharArray(), sb, false)) {
            try {
                return ammv.j(new uzd(str, Pattern.compile(sb.toString(), 2)));
            } catch (PatternSyntaxException e) {
                ((amyf) ((amyf) ((amyf) b.f()).h(e)).i("com/google/android/libraries/saferwebview/GlobMatcher", "create", 44, "GlobMatcher.java")).s("Internal error. Generated regex is invalid: %s", sb);
                return amlr.a;
            }
        }
        ((amyf) ((amyf) b.f()).i("com/google/android/libraries/saferwebview/GlobMatcher", "create", 49, "GlobMatcher.java")).s("Internal error. Can't parse glob-pattern: %s", str);
        return amlr.a;
    }
}
