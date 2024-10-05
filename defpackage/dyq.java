package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyq implements Iterable, dyn {
    public final String a;

    public dyq(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.a = str;
    }

    @Override // defpackage.dyn
    public final dyn d() {
        return new dyq(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dyq) {
            return this.a.equals(((dyq) obj).a);
        }
        return false;
    }

    @Override // defpackage.dyn
    public final Boolean g() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.dyn
    public final Double h() {
        if (this.a.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dyn
    public final String i() {
        return this.a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dyp(this, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0171. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78, types: [int] */
    /* JADX WARN: Type inference failed for: r0v99 */
    @Override // defpackage.dyn
    public final dyn ks(String str, dxk dxkVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c;
        dyq dyqVar;
        int i;
        dyn dygVar;
        String str6;
        double min;
        double min2;
        dyq dyqVar2;
        int i2;
        boolean z;
        dxk dxkVar2;
        int i3;
        int length;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str) && !"trim".equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str3 = "charAt";
                str4 = "hasOwnProperty";
                if (str.equals(str4)) {
                    str5 = "toString";
                    c = 2;
                    break;
                }
                c = 65535;
                str5 = "toString";
                break;
            case -1776922004:
                str3 = "charAt";
                if (str.equals("toString")) {
                    c = 14;
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c = '\f';
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    str4 = "hasOwnProperty";
                    c = 0;
                    str5 = "toString";
                    break;
                }
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case -1354795244:
                if (str.equals("concat")) {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    c = 1;
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c = '\r';
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case -906336856:
                if (str.equals("search")) {
                    c = 7;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case -726908483:
                if (str.equals(str2)) {
                    c = 11;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 4;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c = 15;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case 3568674:
                if (str.equals("trim")) {
                    c = 16;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case 103668165:
                if (str.equals("match")) {
                    c = 5;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case 109526418:
                if (str.equals("slice")) {
                    c = '\b';
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case 109648666:
                if (str.equals("split")) {
                    c = '\t';
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case 530542161:
                if (str.equals("substring")) {
                    c = '\n';
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case 1094496948:
                if (str.equals("replace")) {
                    c = 6;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 3;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    str5 = "toString";
                    break;
                }
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
            default:
                str3 = "charAt";
                str4 = "hasOwnProperty";
                c = 65535;
                str5 = "toString";
                break;
        }
        String str7 = str3;
        switch (c) {
            case 0:
                esv.E(str7, 1, list);
                int u = list.size() > 0 ? (int) esv.u(dxkVar.b((dyn) list.get(0)).h().doubleValue()) : 0;
                String str8 = this.a;
                if (u < 0 || u >= str8.length()) {
                    return dyn.m;
                }
                return new dyq(String.valueOf(str8.charAt(u)));
            case 1:
                dyqVar = this;
                if (list.size() != 0) {
                    StringBuilder sb = new StringBuilder(dyqVar.a);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        sb.append(dxkVar.b((dyn) list.get(i4)).i());
                    }
                    return new dyq(sb.toString());
                }
                return dyqVar;
            case 2:
                esv.B(str4, 1, list);
                String str9 = this.a;
                dyn b = dxkVar.b((dyn) list.get(0));
                if ("length".equals(b.i())) {
                    return dye.k;
                }
                double doubleValue = b.h().doubleValue();
                return (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str9.length()) ? dye.l : dye.k;
            case 3:
                esv.E("indexOf", 2, list);
                dygVar = new dyg(Double.valueOf(this.a.indexOf(list.size() > 0 ? dxkVar.b((dyn) list.get(0)).i() : "undefined", (int) esv.u(list.size() < 2 ? 0.0d : dxkVar.b((dyn) list.get(1)).h().doubleValue()))));
                return dygVar;
            case 4:
                esv.E("lastIndexOf", 2, list);
                String str10 = this.a;
                String i5 = list.size() > 0 ? dxkVar.b((dyn) list.get(0)).i() : "undefined";
                return new dyg(Double.valueOf(str10.lastIndexOf(i5, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : dxkVar.b((dyn) list.get(1)).h().doubleValue()) ? Double.POSITIVE_INFINITY : esv.u(r3)))));
            case 5:
                esv.E("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() > 0 ? dxkVar.b((dyn) list.get(0)).i() : "").matcher(this.a);
                return matcher.find() ? new dyd(new dyq(matcher.group())) : dyn.g;
            case 6:
                dyqVar = this;
                esv.E("replace", 2, list);
                dyn dynVar = dyn.f;
                if (list.size() > 0) {
                    str6 = dxkVar.b((dyn) list.get(0)).i();
                    if (list.size() > 1) {
                        dynVar = dxkVar.b((dyn) list.get(1));
                    }
                }
                String str11 = str6;
                String str12 = dyqVar.a;
                int indexOf = str12.indexOf(str11);
                if (indexOf >= 0) {
                    if (dynVar instanceof dyh) {
                        dynVar = ((dyh) dynVar).a(dxkVar, Arrays.asList(new dyq(str11), new dyg(Double.valueOf(indexOf)), dyqVar));
                    }
                    String substring = str12.substring(0, indexOf);
                    String i6 = dynVar.i();
                    String substring2 = str12.substring(indexOf + str11.length());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + String.valueOf(i6).length() + String.valueOf(substring2).length());
                    sb2.append(substring);
                    sb2.append(i6);
                    sb2.append(substring2);
                    dygVar = new dyq(sb2.toString());
                    return dygVar;
                }
                return dyqVar;
            case 7:
                esv.E("search", 1, list);
                if (Pattern.compile(list.size() > 0 ? dxkVar.b((dyn) list.get(0)).i() : "undefined").matcher(this.a).find()) {
                    return new dyg(Double.valueOf(r0.start()));
                }
                return new dyg(Double.valueOf(-1.0d));
            case '\b':
                esv.E("slice", 2, list);
                String str13 = this.a;
                double u2 = esv.u(list.size() > 0 ? dxkVar.b((dyn) list.get(0)).h().doubleValue() : 0.0d);
                if (u2 < 0.0d) {
                    double length2 = str13.length();
                    Double.isNaN(length2);
                    min = Math.max(length2 + u2, 0.0d);
                } else {
                    min = Math.min(u2, str13.length());
                }
                int i7 = (int) min;
                double u3 = esv.u(list.size() > 1 ? dxkVar.b((dyn) list.get(1)).h().doubleValue() : str13.length());
                if (u3 < 0.0d) {
                    double length3 = str13.length();
                    Double.isNaN(length3);
                    min2 = Math.max(length3 + u3, 0.0d);
                } else {
                    min2 = Math.min(u3, str13.length());
                }
                dyqVar2 = new dyq(str13.substring(i7, Math.max(0, ((int) min2) - i7) + i7));
                return dyqVar2;
            case '\t':
                esv.E("split", 2, list);
                String str14 = this.a;
                if (str14.length() == 0) {
                    return new dyd(this);
                }
                ArrayList arrayList = new ArrayList();
                if (list.size() == 0) {
                    arrayList.add(this);
                } else {
                    String i8 = dxkVar.b((dyn) list.get(0)).i();
                    long w = list.size() > 1 ? esv.w(dxkVar.b((dyn) list.get(1)).h().doubleValue()) : 2147483647L;
                    if (w == 0) {
                        return new dyd();
                    }
                    String[] split = str14.split(Pattern.quote(i8), ((int) w) + 1);
                    int length4 = split.length;
                    if (!i8.equals("") || length4 <= 0) {
                        i2 = length4;
                        z = false;
                    } else {
                        boolean equals = split[0].equals("");
                        i2 = length4 - 1;
                        if (!split[i2].equals("")) {
                            i2 = length4;
                        }
                        z = equals;
                    }
                    if (length4 > w) {
                        i2--;
                    }
                    for (?? r0 = z; r0 < i2; r0++) {
                        arrayList.add(new dyq(split[r0]));
                    }
                }
                return new dyd(arrayList);
            case '\n':
                esv.E("substring", 2, list);
                String str15 = this.a;
                if (list.size() > 0) {
                    dxkVar2 = dxkVar;
                    i3 = (int) esv.u(dxkVar2.b((dyn) list.get(0)).h().doubleValue());
                } else {
                    dxkVar2 = dxkVar;
                    i3 = 0;
                }
                if (list.size() > 1) {
                    length = (int) esv.u(dxkVar2.b((dyn) list.get(1)).h().doubleValue());
                } else {
                    length = str15.length();
                }
                int min3 = Math.min(Math.max(i3, 0), str15.length());
                int min4 = Math.min(Math.max(length, 0), str15.length());
                dyqVar2 = new dyq(str15.substring(Math.min(min3, min4), Math.max(min3, min4)));
                return dyqVar2;
            case 11:
                esv.B(str2, 0, list);
                return new dyq(this.a.toUpperCase());
            case '\f':
                esv.B("toLocaleLowerCase", 0, list);
                return new dyq(this.a.toLowerCase());
            case '\r':
                esv.B("toLowerCase", 0, list);
                return new dyq(this.a.toLowerCase(Locale.ENGLISH));
            case 14:
                dyqVar = this;
                esv.B(str5, 0, list);
                return dyqVar;
            case 15:
                esv.B("toUpperCase", 0, list);
                return new dyq(this.a.toUpperCase(Locale.ENGLISH));
            case 16:
                esv.B("toUpperCase", 0, list);
                return new dyq(this.a.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // defpackage.dyn
    public final Iterator l() {
        return new dyp(this, 1);
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb.toString();
    }
}
