package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
class akql {
    final Pattern a;
    final String b;

    public akql(Pattern pattern, String str) {
        this.a = pattern;
        this.b = str;
    }

    public String a(String str) {
        Matcher matcher = this.a.matcher(str);
        if (!matcher.find() || matcher.groupCount() != 2) {
            return null;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        String str2 = this.b;
        String replace = group2.replace("/", "-");
        int length = str2.length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(group).length() + String.valueOf(replace).length());
        sb.append(str2);
        sb.append("-");
        sb.append(group);
        sb.append("-");
        sb.append(replace);
        return sb.toString();
    }
}
