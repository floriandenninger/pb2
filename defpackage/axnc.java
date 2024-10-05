package defpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axnc {
    static final Pattern a = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    public static deb a(axkr axkrVar, String str) {
        List c = c(axkrVar, str, true);
        if (c.isEmpty()) {
            return null;
        }
        return (deb) c.get(0);
    }

    public static List b(deg degVar, String str) {
        return c(degVar, str, false);
    }

    public static List c(Object obj, String str, boolean z) {
        String str2;
        if (str.startsWith("/")) {
            str = str.substring(1);
            while (obj instanceof deb) {
                obj = ((deb) obj).c();
            }
        }
        if (str.length() == 0) {
            if (obj instanceof deb) {
                return Collections.singletonList((deb) obj);
            }
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
        int i = 0;
        if (str.contains("/")) {
            str2 = str.substring(str.indexOf(47) + 1);
            str = str.substring(0, str.indexOf(47));
        } else {
            str2 = "";
        }
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            if ("..".equals(group)) {
                if (obj instanceof deb) {
                    return c(((deb) obj).c(), str2, z);
                }
                return Collections.emptyList();
            }
            if (obj instanceof deg) {
                int parseInt = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
                LinkedList linkedList = new LinkedList();
                for (deb debVar : ((deg) obj).i()) {
                    if (debVar.d().matches(group)) {
                        if (parseInt == -1 || parseInt == i) {
                            linkedList.addAll(c(debVar, str2, z));
                        }
                        i++;
                    }
                    if (z || parseInt >= 0) {
                        if (!linkedList.isEmpty()) {
                            break;
                        }
                    }
                }
                return linkedList;
            }
            return Collections.emptyList();
        }
        throw new RuntimeException(String.valueOf(str).concat(" is invalid path."));
    }
}
