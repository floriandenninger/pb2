package defpackage;

import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ysf {
    private static final Pattern b = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    private static final Pattern c = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    private static final Pattern d = Pattern.compile("\\s*([^\\s/=;\"]+)/([^\\s/=;\"]+)\\s*(;.*)?", 32);
    private static final Pattern e = Pattern.compile("\\s*;\\s*([^\\s/=;\"]+)=(\"([^\"]*)\"|[^\\s;\"]*)");
    public final SortedMap a = new TreeMap();
    private String f;
    private String g;
    private String h;

    public ysf(String str) {
        this.f = "application";
        this.g = "octet-stream";
        Matcher matcher = d.matcher(str);
        amkq.F(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        Pattern pattern = b;
        amkq.F(pattern.matcher(group).matches(), "Type contains reserved characters");
        this.f = group;
        this.h = null;
        String group2 = matcher.group(2);
        amkq.F(pattern.matcher(group2).matches(), "Subtype contains reserved characters");
        this.g = group2;
        this.h = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = e.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                group5 = group5 == null ? matcher2.group(2) : group5;
                if (group5 == null) {
                    this.h = null;
                    this.a.remove(group4.toLowerCase(Locale.ENGLISH));
                } else {
                    amkq.F(c.matcher(group4).matches(), "Name contains reserved characters");
                    this.h = null;
                    this.a.put(group4.toLowerCase(Locale.ENGLISH), group5);
                }
            }
        }
    }

    public final String a() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('/');
        sb.append(this.g);
        for (Map.Entry entry : this.a.entrySet()) {
            String str2 = (String) entry.getValue();
            sb.append("; ");
            sb.append((String) entry.getKey());
            sb.append("=");
            if (!c.matcher(str2).matches()) {
                String replace = str2.replace("\\", "\\\\").replace("\"", "\\\"");
                StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 2);
                sb2.append("\"");
                sb2.append(replace);
                sb2.append("\"");
                str2 = sb2.toString();
            }
            sb.append(str2);
        }
        String sb3 = sb.toString();
        this.h = sb3;
        return sb3;
    }

    public final boolean equals(Object obj) {
        ysf ysfVar;
        return (obj instanceof ysf) && (ysfVar = (ysf) obj) != null && this.f.equalsIgnoreCase(ysfVar.f) && this.g.equalsIgnoreCase(ysfVar.g) && this.a.equals(ysfVar.a);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
