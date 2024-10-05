package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acni {
    private static final Pattern b = Pattern.compile("a=rtpmap:(\\d+) H264");
    private static final Pattern c = Pattern.compile("a=rtpmap:(\\d+) H265X");
    private static final Pattern d = Pattern.compile("a=rtpmap:(\\d+) VP8");
    private static final Pattern e = Pattern.compile("a=rtpmap:(\\d+) VP9");
    public static final Pattern a = Pattern.compile("a=rtpmap:(\\d+) opus/(\\d+)/(\\d+)");
    private static final Pattern f = Pattern.compile("m=video.+");
    private static final Pattern g = Pattern.compile("a=msid-semantic: WMS( ((.+)/(\\d+)( )?)*)*(\r)?\n");
    private static final Pattern h = Pattern.compile("m=application(.*)(\r)?\n");
    private static final Pattern i = Pattern.compile("m=video(.*)(\r)?\n");
    private static final Long j = 4294967296L;

    public static String a(String str) {
        if (str == null || !str.contains("/")) {
            return str;
        }
        Iterator it = amnm.d("/").f(str).iterator();
        int aW = amkq.aW(it, 1);
        if (it.hasNext()) {
            return (String) it.next();
        }
        StringBuilder sb = new StringBuilder(91);
        sb.append("position (1) must be less than the number of elements that remained (");
        sb.append(aW);
        sb.append(")");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static String b(int i2) {
        return Long.toString(i2 < 0 ? j.longValue() + i2 : i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(java.lang.String r27, defpackage.aofv r28) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acni.c(java.lang.String, aofv):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(String str, axio axioVar) {
        Pattern pattern;
        Matcher matcher = f.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        String group = matcher.group(0);
        ArrayList arrayList = new ArrayList();
        axio axioVar2 = axio.UNKNOWN;
        int ordinal = axioVar.ordinal();
        if (ordinal == 1) {
            pattern = d;
        } else if (ordinal == 2) {
            pattern = e;
        } else if (ordinal == 3) {
            pattern = b;
        } else {
            if (ordinal != 4) {
                String valueOf = String.valueOf(axioVar.name());
                zga.m("SessionDescriptionUtil", valueOf.length() != 0 ? "Unexpected codec ".concat(valueOf) : new String("Unexpected codec "));
                return str;
            }
            pattern = c;
        }
        Matcher matcher2 = pattern.matcher(str);
        while (matcher2.find()) {
            arrayList.add(matcher2.group(1));
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(group.split(" ")));
        if (arrayList2.size() <= 3) {
            return str;
        }
        f(arrayList2, arrayList);
        f(arrayList2, arrayList);
        return matcher.replaceFirst(TextUtils.join(" ", arrayList2));
    }

    private static String e(aofq aofqVar, Map map) {
        aofs aofsVar = aofqVar.c;
        if (aofsVar == null) {
            return "";
        }
        String b2 = b(aofsVar.b);
        return map.containsKey(b2) ? String.format("%s/%s", map.get(b2), b2) : "";
    }

    private static void f(List list, List list2) {
        for (int i2 = 3; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            if (list2.contains(str)) {
                list.subList(3, list.size()).remove(str);
                list.add(3, str);
            }
        }
    }
}
