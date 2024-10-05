package defpackage;

import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class l extends Format {
    private static final String[] d = {"number", "date", "time", "spellout", "ordinal", "duration"};
    private static final String[] e = {"", "currency", "percent", "integer"};
    private static final String[] f = {"", "short", "medium", "long", "full"};
    private static final Locale g = new Locale("");
    static final long serialVersionUID = 7136212545847378652L;
    public transient Locale a;
    public transient aa b;
    public transient Map c;
    private transient DateFormat h;
    private transient NumberFormat i;
    private transient k j;
    private transient k k;

    public l(String str, Locale locale) {
        Cloneable numberFormat;
        this.a = locale;
        try {
            aa aaVar = this.b;
            if (aaVar != null) {
                aaVar.i(str);
            } else {
                this.b = new aa(str);
            }
            Map map = this.c;
            if (map != null) {
                map.clear();
            }
            int b = this.b.b() - 2;
            int i = 1;
            while (i < b) {
                z d2 = this.b.d(i);
                if (d2.e == 6 && d2.b() == 2) {
                    int i2 = i + 2;
                    aa aaVar2 = this.b;
                    int i3 = i2 + 1;
                    String f2 = aaVar2.f(aaVar2.d(i2));
                    String str2 = "";
                    z d3 = this.b.d(i3);
                    if (d3.e == 11) {
                        str2 = this.b.f(d3);
                        i3++;
                    }
                    int c = c(f2, d);
                    if (c == 0) {
                        int c2 = c(str2, e);
                        if (c2 == 0) {
                            numberFormat = NumberFormat.getInstance(this.a);
                        } else if (c2 == 1) {
                            numberFormat = NumberFormat.getCurrencyInstance(this.a);
                        } else if (c2 == 2) {
                            numberFormat = NumberFormat.getPercentInstance(this.a);
                        } else if (c2 == 3) {
                            numberFormat = NumberFormat.getIntegerInstance(this.a);
                        } else {
                            numberFormat = new DecimalFormat(str2, new DecimalFormatSymbols(this.a));
                        }
                    } else if (c == 1) {
                        int c3 = c(str2, f);
                        if (c3 == 0) {
                            numberFormat = DateFormat.getDateInstance(2, this.a);
                        } else if (c3 == 1) {
                            numberFormat = DateFormat.getDateInstance(3, this.a);
                        } else if (c3 == 2) {
                            numberFormat = DateFormat.getDateInstance(2, this.a);
                        } else if (c3 == 3) {
                            numberFormat = DateFormat.getDateInstance(1, this.a);
                        } else if (c3 == 4) {
                            numberFormat = DateFormat.getDateInstance(0, this.a);
                        } else {
                            numberFormat = new SimpleDateFormat(str2, this.a);
                        }
                    } else if (c == 2) {
                        int c4 = c(str2, f);
                        if (c4 == 0) {
                            numberFormat = DateFormat.getTimeInstance(2, this.a);
                        } else if (c4 == 1) {
                            numberFormat = DateFormat.getTimeInstance(3, this.a);
                        } else if (c4 == 2) {
                            numberFormat = DateFormat.getTimeInstance(2, this.a);
                        } else if (c4 == 3) {
                            numberFormat = DateFormat.getTimeInstance(1, this.a);
                        } else if (c4 == 4) {
                            numberFormat = DateFormat.getTimeInstance(0, this.a);
                        } else {
                            numberFormat = new SimpleDateFormat(str2, this.a);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(f2).length() + 22);
                        sb.append("Unknown format type \"");
                        sb.append(f2);
                        sb.append("\"");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    if (this.c == null) {
                        this.c = new HashMap();
                    }
                    this.c.put(Integer.valueOf(i), numberFormat);
                    i = i3;
                }
                i++;
            }
        } catch (RuntimeException e2) {
            aa aaVar3 = this.b;
            if (aaVar3 != null) {
                aaVar3.a = null;
                aaVar3.d = false;
                aaVar3.b.clear();
                ArrayList arrayList = aaVar3.c;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            Map map2 = this.c;
            if (map2 != null) {
                map2.clear();
            }
            throw e2;
        }
    }

    public static final String a(Locale locale, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder(str.length());
        new l(str, locale).f(0, null, null, null, objArr, new g(sb), null);
        return sb.toString();
    }

    private static final int c(String str, String[] strArr) {
        byte[] bArr = e.a;
        if (str.length() != 0 && (e.a(str.charAt(0)) || e.a(str.charAt(str.length() - 1)))) {
            int length = str.length();
            int i = 0;
            while (i < length && e.a(str.charAt(i))) {
                i++;
            }
            if (i < length) {
                while (true) {
                    int i2 = length - 1;
                    if (!e.a(str.charAt(i2))) {
                        break;
                    }
                    length = i2;
                }
            }
            str = str.substring(i, length);
        }
        String lowerCase = str.toLowerCase(g);
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (lowerCase.equals(strArr[i3])) {
                return i3;
            }
        }
        return -1;
    }

    private final void d(Object obj, g gVar, FieldPosition fieldPosition) {
        if (obj == null || (obj instanceof Map)) {
            e(null, (Map) obj, gVar, fieldPosition);
        } else {
            e((Object[]) obj, null, gVar, fieldPosition);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0298, code lost:
    
        r30 = r9;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0382, code lost:
    
        if (r9 == 2) goto L178;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x050f A[LOOP:2: B:111:0x0286->B:122:0x050f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0607  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f(int r38, defpackage.j r39, java.lang.Object[] r40, java.util.Map r41, java.lang.Object[] r42, defpackage.g r43, java.text.FieldPosition r44) {
        /*
            Method dump skipped, instructions count: 1613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.f(int, j, java.lang.Object[], java.util.Map, java.lang.Object[], g, java.text.FieldPosition):void");
    }

    private final void h(String str, ParsePosition parsePosition, Object[] objArr, Map map) {
        String str2;
        String num;
        Object obj;
        short s;
        String str3;
        int length;
        Object obj2;
        Map map2;
        aa aaVar;
        int i;
        int i2;
        Format format;
        if (str == null) {
            return;
        }
        aa aaVar2 = this.b;
        String str4 = aaVar2.a;
        int a = aaVar2.d(0).a();
        int index = parsePosition.getIndex();
        ParsePosition parsePosition2 = new ParsePosition(0);
        boolean z = true;
        int i3 = 1;
        while (true) {
            z d2 = this.b.d(i3);
            int i4 = d2.e;
            int i5 = d2.a - a;
            if (i5 != 0 && !str4.regionMatches(a, str, index, i5)) {
                parsePosition.setErrorIndex(index);
                return;
            }
            index += i5;
            if (i4 == 2) {
                parsePosition.setIndex(index);
                return;
            }
            if (i4 == 3 || i4 == 4) {
                str2 = str4;
                a = d2.a();
            } else {
                int c = this.b.c(i3);
                int b = d2.b();
                int i6 = i3 + 1;
                z d3 = this.b.d(i6);
                if (objArr != null) {
                    s = d3.c;
                    obj = Integer.valueOf(s);
                    num = null;
                } else {
                    if (d3.e != 9) {
                        num = Integer.toString(d3.c);
                    } else {
                        num = this.b.f(d3);
                    }
                    obj = num;
                    s = 0;
                }
                int i7 = i6 + 1;
                Map map3 = this.c;
                if (map3 == null || (format = (Format) map3.get(Integer.valueOf(i7 - 2))) == null) {
                    if (b == z || ((map2 = this.c) != null && map2.containsKey(Integer.valueOf(i7 - 2)))) {
                        str2 = str4;
                        str3 = num;
                        StringBuilder sb = new StringBuilder();
                        aa aaVar3 = this.b;
                        String str5 = aaVar3.a;
                        int a2 = aaVar3.d(c).a();
                        int i8 = c + 1;
                        while (true) {
                            z d4 = this.b.d(i8);
                            int i9 = d4.e;
                            sb.append((CharSequence) str5, a2, d4.a);
                            if (i9 == 6 || i9 == 2) {
                                break;
                            }
                            a2 = d4.a();
                            i8++;
                        }
                        String sb2 = sb.toString();
                        if (sb2.length() != 0) {
                            length = str.indexOf(sb2, index);
                        } else {
                            length = str.length();
                        }
                        if (length >= 0) {
                            String substring = str.substring(index, length);
                            String obj3 = obj.toString();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(obj3).length() + 2);
                            sb3.append("{");
                            sb3.append(obj3);
                            sb3.append("}");
                            boolean equals = substring.equals(sb3.toString());
                            index = length;
                            z = !equals;
                            obj2 = true == equals ? null : substring;
                        } else {
                            parsePosition.setErrorIndex(index);
                            return;
                        }
                    } else if (b == 3) {
                        parsePosition2.setIndex(index);
                        aa aaVar4 = this.b;
                        int index2 = parsePosition2.getIndex();
                        double d5 = Double.NaN;
                        int i10 = index2;
                        while (true) {
                            if (aaVar4.h(i7) == 7) {
                                str2 = str4;
                                str3 = num;
                                break;
                            }
                            double a3 = aaVar4.a(aaVar4.d(i7));
                            int i11 = i7 + 2;
                            int c2 = aaVar4.c(i11);
                            String str6 = aaVar4.a;
                            int i12 = 0;
                            str2 = str4;
                            int a4 = aaVar4.d(i11).a();
                            while (true) {
                                i11++;
                                str3 = num;
                                z d6 = aaVar4.d(i11);
                                aaVar = aaVar4;
                                if (i11 != c2 && d6.e != 3) {
                                    num = str3;
                                    aaVar4 = aaVar;
                                }
                                int i13 = d6.a - a4;
                                if (i13 != 0 && !str.regionMatches(index2, str6, a4, i13)) {
                                    i = -1;
                                    break;
                                }
                                i12 += i13;
                                if (i11 == c2) {
                                    i = i12;
                                    break;
                                } else {
                                    a4 = d6.a();
                                    num = str3;
                                    aaVar4 = aaVar;
                                }
                            }
                            if (i >= 0 && (i2 = i + index2) > i10) {
                                if (i2 == str.length()) {
                                    i10 = i2;
                                    d5 = a3;
                                    break;
                                } else {
                                    i10 = i2;
                                    d5 = a3;
                                }
                            }
                            i7 = c2 + 1;
                            str4 = str2;
                            num = str3;
                            aaVar4 = aaVar;
                        }
                        if (i10 == index2) {
                            parsePosition2.setErrorIndex(index2);
                        } else {
                            parsePosition2.setIndex(i10);
                        }
                        if (parsePosition2.getIndex() != index) {
                            obj2 = Double.valueOf(d5);
                            index = parsePosition2.getIndex();
                            z = true;
                        } else {
                            parsePosition.setErrorIndex(index);
                            return;
                        }
                    } else {
                        if (d.b(b) || b == 5) {
                            throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                        }
                        String a5 = d.a(b);
                        StringBuilder sb4 = new StringBuilder(a5.length() + 19);
                        sb4.append("unexpected argType ");
                        sb4.append(a5);
                        throw new IllegalStateException(sb4.toString());
                    }
                } else {
                    parsePosition2.setIndex(index);
                    obj2 = format.parseObject(str, parsePosition2);
                    if (parsePosition2.getIndex() != index) {
                        index = parsePosition2.getIndex();
                        str2 = str4;
                        str3 = num;
                    } else {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                }
                if (z) {
                    if (objArr != null) {
                        objArr[s] = obj2;
                    } else {
                        if (map != null) {
                            map.put(str3, obj2);
                        }
                        a = this.b.d(c).a();
                        i3 = c;
                    }
                }
                a = this.b.d(c).a();
                i3 = c;
            }
            i3++;
            str4 = str2;
            z = true;
        }
    }

    public final NumberFormat b() {
        if (this.i == null) {
            this.i = NumberFormat.getInstance(this.a);
        }
        return this.i;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        d(obj, new g(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    @Override // java.text.Format
    public final AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (obj == null) {
            throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
        }
        StringBuilder sb = new StringBuilder();
        g gVar = new g(sb);
        gVar.c = new ArrayList();
        d(obj, gVar, null);
        AttributedString attributedString = new AttributedString(sb.toString());
        for (h hVar : gVar.c) {
            attributedString.addAttribute(hVar.a, hVar.b, hVar.c, hVar.d);
        }
        return attributedString.getIterator();
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }

    private final void e(Object[] objArr, Map map, g gVar, FieldPosition fieldPosition) {
        if (objArr != null && this.b.d) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        f(0, null, objArr, map, null, gVar, fieldPosition);
    }

    private final void g(int i, j jVar, Object[] objArr, Map map, Object[] objArr2, g gVar) {
        if (this.b.f != 2) {
            f(i, jVar, objArr, map, objArr2, gVar, null);
            return;
        }
        throw new UnsupportedOperationException("JDK apostrophe mode not supported");
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        if (this.b.d) {
            HashMap hashMap = new HashMap();
            int index = parsePosition.getIndex();
            h(str, parsePosition, null, hashMap);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return hashMap;
        }
        int i = 0;
        short s = -1;
        while (true) {
            if (i != 0) {
                i = this.b.c(i);
            }
            while (true) {
                i++;
                int h = this.b.h(i);
                if (h == 6) {
                    break;
                }
                if (h == 2) {
                    i = -1;
                    break;
                }
            }
            if (i < 0) {
                break;
            }
            short s2 = this.b.d(i + 1).c;
            if (s2 > s) {
                s = s2;
            }
        }
        Object[] objArr = new Object[s + 1];
        int index2 = parsePosition.getIndex();
        h(str, parsePosition, objArr, null);
        if (parsePosition.getIndex() == index2) {
            return null;
        }
        return objArr;
    }
}
