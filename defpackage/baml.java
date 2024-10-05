package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baml implements bamw, bams {
    private static final Map a = new HashMap();
    private final bajj b;
    private final boolean c;

    public baml(bajj bajjVar, boolean z) {
        this.b = bajjVar;
        this.c = z;
    }

    @Override // defpackage.bams
    public final int a() {
        return b();
    }

    @Override // defpackage.bamw
    public final int b() {
        return this.c ? 6 : 20;
    }

    @Override // defpackage.bams
    public final int c(bamv bamvVar, String str, int i) {
        int intValue;
        Set set;
        Locale locale = bamvVar.d;
        Map map = a;
        synchronized (map) {
            Map map2 = (Map) map.get(locale);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(locale, map2);
            }
            Object[] objArr = (Object[]) map2.get(this.b);
            if (objArr == null) {
                set = new HashSet(32);
                bajw bajwVar = new bajw(bajn.a);
                bajj bajjVar = this.b;
                bajh a2 = bajjVar.a(bajwVar.b);
                if (!a2.t()) {
                    String valueOf = String.valueOf(bajjVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("Field '");
                    sb.append(valueOf);
                    sb.append("' is not supported");
                    throw new IllegalArgumentException(sb.toString());
                }
                bajv bajvVar = new bajv(bajwVar, a2);
                int d = bajvVar.b.d();
                int c = bajvVar.b.c();
                if (c - d > 32) {
                    return i ^ (-1);
                }
                int b = bajvVar.b.b(locale);
                while (d <= c) {
                    bajw bajwVar2 = bajvVar.a;
                    long h = bajvVar.b.h(bajwVar2.a, d);
                    bajf bajfVar = bajwVar2.b;
                    bajwVar2.a = h;
                    set.add(bajvVar.e(locale));
                    set.add(bajvVar.e(locale).toLowerCase(locale));
                    set.add(bajvVar.e(locale).toUpperCase(locale));
                    set.add(bajvVar.f(locale));
                    set.add(bajvVar.f(locale).toLowerCase(locale));
                    set.add(bajvVar.f(locale).toUpperCase(locale));
                    d++;
                    b = b;
                }
                int i2 = b;
                if ("en".equals(locale.getLanguage()) && this.b == bajj.c) {
                    set.add("BCE");
                    set.add("bce");
                    set.add("CE");
                    set.add("ce");
                    intValue = 3;
                } else {
                    intValue = i2;
                }
                map2.put(this.b, new Object[]{set, Integer.valueOf(intValue)});
            } else {
                Set set2 = (Set) objArr[0];
                intValue = ((Integer) objArr[1]).intValue();
                set = set2;
            }
            for (int min = Math.min(str.length(), i + intValue); min > i; min--) {
                String substring = str.substring(i, min);
                if (set.contains(substring)) {
                    bamvVar.c(new bamt(this.b.a(bamvVar.a), substring, locale));
                    return min;
                }
            }
            return i ^ (-1);
        }
    }

    @Override // defpackage.bamw
    public final void d(StringBuffer stringBuffer, long j, bajf bajfVar, int i, bajn bajnVar, Locale locale) {
        String m;
        try {
            bajh a2 = this.b.a(bajfVar);
            if (this.c) {
                m = a2.k(j, locale);
            } else {
                m = a2.m(j, locale);
            }
            stringBuffer.append(m);
        } catch (RuntimeException unused) {
            stringBuffer.append((char) 65533);
        }
    }
}
