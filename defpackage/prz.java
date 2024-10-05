package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class prz {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map c;
    private static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap.put("red", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, PrivateKeyType.INVALID)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, PrivateKeyType.INVALID)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, PrivateKeyType.INVALID)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, PrivateKeyType.INVALID)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString a(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prz.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ppo b(String str) {
        pry pryVar = new pry();
        h(str, pryVar);
        return pryVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ppp c(CharSequence charSequence) {
        pry pryVar = new pry();
        pryVar.c = charSequence;
        return pryVar.a().a();
    }

    public static pru d(pth pthVar, List list) {
        String s = pthVar.s();
        if (s == null) {
            return null;
        }
        Pattern pattern = a;
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            return e(null, matcher, pthVar, list);
        }
        String s2 = pthVar.s();
        if (s2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(s2);
        if (matcher2.matches()) {
            return e(s.trim(), matcher2, pthVar, list);
        }
        return null;
    }

    private static pru e(String str, Matcher matcher, pth pthVar, List list) {
        pry pryVar = new pry();
        try {
            String group = matcher.group(1);
            pse.c(group);
            pryVar.a = psb.b(group);
            String group2 = matcher.group(2);
            pse.c(group2);
            pryVar.b = psb.b(group2);
            String group3 = matcher.group(3);
            pse.c(group3);
            h(group3, pryVar);
            StringBuilder sb = new StringBuilder();
            String s = pthVar.s();
            while (!TextUtils.isEmpty(s)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(s.trim());
                s = pthVar.s();
            }
            pryVar.c = a(str, sb.toString(), list);
            return new pru(pryVar.a().a(), pryVar.a, pryVar.b);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            Log.w("WebvttCueParser", valueOf.length() != 0 ? "Skipping cue with bad header: ".concat(valueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    private static List f(List list, String str, prw prwVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            prt prtVar = (prt) list.get(i);
            String str2 = prwVar.a;
            Set set = prwVar.d;
            String str3 = prwVar.c;
            if (!prtVar.a.isEmpty() || !prtVar.b.isEmpty() || !prtVar.c.isEmpty() || !prtVar.d.isEmpty()) {
                int b2 = prt.b(prt.b(prt.b(0, prtVar.a, str, 1073741824), prtVar.b, str2, 2), prtVar.d, str3, 4);
                if (b2 != -1 && set.containsAll(prtVar.c)) {
                    size = b2 + (prtVar.c.size() * 4);
                }
                size = 0;
            } else {
                if (TextUtils.isEmpty(str2)) {
                    size = 1;
                }
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new prx(size, prtVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void g(String str, prw prwVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        int i = prwVar.b;
        int length = spannableStringBuilder.length();
        String str2 = prwVar.a;
        int hashCode = str2.hashCode();
        if (hashCode == 0) {
            if (str2.equals("")) {
                c2 = 7;
            }
            c2 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c2 = 5;
            }
            c2 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c2 = 4;
            }
            c2 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c2 = 6;
            }
            c2 = 65535;
        } else {
            if (str2.equals("u")) {
                c2 = 3;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 2:
                i(list2, str, prwVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, prv.a);
                int i2 = prwVar.b;
                int i3 = 0;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if ("rt".equals(((prv) arrayList.get(i4)).b.a)) {
                        prv prvVar = (prv) arrayList.get(i4);
                        i(list2, str, prvVar.b);
                        int i5 = prvVar.b.b - i3;
                        int i6 = prvVar.c - i3;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i5, i6);
                        spannableStringBuilder.delete(i5, i6);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new muf(), i2, i5, 33);
                        i3 += subSequence.length();
                        i2 = i5;
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 4:
                for (String str3 : prwVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List f = f(list2, str, prwVar);
        for (int i7 = 0; i7 < f.size(); i7++) {
            prt prtVar = ((prx) f.get(i7)).b;
            if (prtVar != null) {
                if (prtVar.a() != -1) {
                    muf.C(spannableStringBuilder, new StyleSpan(prtVar.a()), i, length);
                }
                if (prtVar.j == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (prtVar.g) {
                    muf.C(spannableStringBuilder, new ForegroundColorSpan(prtVar.f), i, length);
                }
                if (prtVar.i) {
                    muf.C(spannableStringBuilder, new BackgroundColorSpan(prtVar.h), i, length);
                }
                String str4 = prtVar.e;
                if (str4 != null) {
                    muf.C(spannableStringBuilder, new TypefaceSpan(str4), i, length);
                }
                int i8 = prtVar.m;
                if (i8 == 1) {
                    muf.C(spannableStringBuilder, new AbsoluteSizeSpan((int) prtVar.n, true), i, length);
                } else if (i8 == 2) {
                    muf.C(spannableStringBuilder, new RelativeSizeSpan(prtVar.n), i, length);
                } else if (i8 == 3) {
                    muf.C(spannableStringBuilder, new RelativeSizeSpan(prtVar.n / 100.0f), i, length);
                }
                if (prtVar.p) {
                    spannableStringBuilder.setSpan(new muf(), i, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x006b, code lost:
    
        if (r15 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x006d, code lost:
    
        if (r15 == 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x006f, code lost:
    
        if (r15 == 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0072, code lost:
    
        if (r15 == 3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0074, code lost:
    
        r5 = java.lang.String.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x007c, code lost:
    
        if (r5.length() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x007e, code lost:
    
        r5 = "Invalid anchor value: ".concat(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0088, code lost:
    
        android.util.Log.w("WebvttCueParser", r5);
        r5 = org.chromium.net.CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0083, code lost:
    
        r5 = new java.lang.String("Invalid anchor value: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0091, code lost:
    
        r18.g = r5;
        r6 = r6.substring(0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x008e, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0090, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x0143. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(java.lang.String r17, defpackage.pry r18) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prz.h(java.lang.String, pry):void");
    }

    private static void i(List list, String str, prw prwVar) {
        List f = f(list, str, prwVar);
        for (int i = 0; i < f.size() && ((prx) f.get(i)).b.o == -1; i++) {
        }
    }
}
