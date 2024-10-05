package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class prl {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final prn f;
    public final String[] g;
    public final String h;
    public final String i;
    public final prl j;
    private final HashMap k;
    private final HashMap l;
    private List m;

    public prl(String str, String str2, long j, long j2, prn prnVar, String[] strArr, String str3, String str4, prl prlVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = prnVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        pse.c(str3);
        this.h = str3;
        this.j = prlVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    private static SpannableStringBuilder i(String str, Map map) {
        if (!map.containsKey(str)) {
            ppo ppoVar = new ppo();
            ppoVar.a = new SpannableStringBuilder();
            map.put(str, ppoVar);
        }
        CharSequence charSequence = ((ppo) map.get(str)).a;
        pse.c(charSequence);
        return (SpannableStringBuilder) charSequence;
    }

    public final int a() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final prl b(int i) {
        List list = this.m;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return (prl) list.get(i);
    }

    public final void c(prl prlVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(prlVar);
    }

    public final void d(TreeSet treeSet, boolean z) {
        boolean equals = "p".equals(this.a);
        boolean equals2 = "div".equals(this.a);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                prl prlVar = (prl) this.m.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                prlVar.d(treeSet, z2);
            }
        }
    }

    public final void e(long j, String str, List list) {
        String str2;
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (!h(j) || !"div".equals(this.a) || (str2 = this.i) == null) {
            for (int i = 0; i < a(); i++) {
                b(i).e(j, str, list);
            }
            return;
        }
        list.add(new Pair(str, str2));
    }

    public final void f(long j, Map map, Map map2, String str, Map map3) {
        prl prlVar;
        if (h(j)) {
            String str2 = !"".equals(this.h) ? this.h : str;
            for (Map.Entry entry : this.l.entrySet()) {
                String str3 = (String) entry.getKey();
                int intValue = this.k.containsKey(str3) ? ((Integer) this.k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    ppo ppoVar = (ppo) map3.get(str3);
                    pse.c(ppoVar);
                    pse.c((prm) map2.get(str2));
                    prn g = prh.g(this.f, this.g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) ppoVar.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        ppoVar.a = spannableStringBuilder;
                    }
                    if (g != null) {
                        prl prlVar2 = this.j;
                        if (g.a() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(g.a()), intValue, intValue2, 33);
                        }
                        if (g.f == 1) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (g.g == 1) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (g.c) {
                            muf.C(spannableStringBuilder, new ForegroundColorSpan(g.b), intValue, intValue2);
                        }
                        if (g.e) {
                            muf.C(spannableStringBuilder, new BackgroundColorSpan(g.d), intValue, intValue2);
                        }
                        String str4 = g.a;
                        if (str4 != null) {
                            muf.C(spannableStringBuilder, new TypefaceSpan(str4), intValue, intValue2);
                        }
                        if (g.r != null) {
                            muf.C(spannableStringBuilder, new muf(), intValue, intValue2);
                        }
                        int i = g.m;
                        if (i == 2) {
                            while (true) {
                                if (prlVar2 == null) {
                                    prlVar2 = null;
                                    break;
                                }
                                prn g2 = prh.g(prlVar2.f, prlVar2.g, map);
                                if (g2 != null && g2.m == 1) {
                                    break;
                                } else {
                                    prlVar2 = prlVar2.j;
                                }
                            }
                            if (prlVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(prlVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        prlVar = null;
                                        break;
                                    }
                                    prl prlVar3 = (prl) arrayDeque.pop();
                                    prn g3 = prh.g(prlVar3.f, prlVar3.g, map);
                                    if (g3 != null && g3.m == 3) {
                                        prlVar = prlVar3;
                                        break;
                                    }
                                    for (int a = prlVar3.a() - 1; a >= 0; a--) {
                                        arrayDeque.push(prlVar3.b(a));
                                    }
                                }
                                if (prlVar != null && prlVar.a() == 1 && prlVar.b(0).b != null) {
                                    String str5 = prlVar.b(0).b;
                                    int i2 = pts.a;
                                    prn g4 = prh.g(prlVar.f, prlVar.g, map);
                                    if (g4 == null || g4.n == -1) {
                                        prh.g(prlVar2.f, prlVar2.g, map);
                                    }
                                    spannableStringBuilder.setSpan(new muf(), intValue, intValue2, 33);
                                }
                            }
                        } else if (i == 3 || i == 4) {
                            spannableStringBuilder.setSpan(new prh(), intValue, intValue2, 33);
                        }
                        if (g.q == 1) {
                            muf.C(spannableStringBuilder, new muf(), intValue, intValue2);
                        }
                        int i3 = g.j;
                        if (i3 == 1) {
                            muf.C(spannableStringBuilder, new AbsoluteSizeSpan((int) g.k, true), intValue, intValue2);
                        } else if (i3 == 2) {
                            muf.C(spannableStringBuilder, new RelativeSizeSpan(g.k), intValue, intValue2);
                        } else if (i3 == 3) {
                            muf.C(spannableStringBuilder, new RelativeSizeSpan(g.k / 100.0f), intValue, intValue2);
                        }
                        if ("p".equals(this.a)) {
                            float f = g.s;
                            if (f != Float.MAX_VALUE) {
                                ppoVar.l = (f * (-90.0f)) / 100.0f;
                            }
                            Layout.Alignment alignment = g.o;
                            if (alignment != null) {
                                ppoVar.c = alignment;
                            }
                            Layout.Alignment alignment2 = g.p;
                            if (alignment2 != null) {
                                ppoVar.d = alignment2;
                            }
                        }
                    }
                }
            }
            for (int i4 = 0; i4 < a(); i4++) {
                b(i4).f(j, map, map2, str2, map3);
            }
        }
    }

    public final void g(long j, boolean z, String str, Map map) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (!this.c || !z) {
            if (!"br".equals(this.a) || !z) {
                if (h(j)) {
                    for (Map.Entry entry : map.entrySet()) {
                        HashMap hashMap = this.k;
                        String str2 = (String) entry.getKey();
                        CharSequence charSequence = ((ppo) entry.getValue()).a;
                        pse.c(charSequence);
                        hashMap.put(str2, Integer.valueOf(charSequence.length()));
                    }
                    boolean equals = "p".equals(this.a);
                    for (int i = 0; i < a(); i++) {
                        b(i).g(j, z || equals, str, map);
                    }
                    if (equals) {
                        SpannableStringBuilder i2 = i(str, map);
                        int length = i2.length();
                        do {
                            length--;
                            if (length < 0) {
                                break;
                            }
                        } while (i2.charAt(length) == ' ');
                        if (length >= 0 && i2.charAt(length) != '\n') {
                            i2.append('\n');
                        }
                    }
                    for (Map.Entry entry2 : map.entrySet()) {
                        HashMap hashMap2 = this.l;
                        String str3 = (String) entry2.getKey();
                        CharSequence charSequence2 = ((ppo) entry2.getValue()).a;
                        pse.c(charSequence2);
                        hashMap2.put(str3, Integer.valueOf(charSequence2.length()));
                    }
                    return;
                }
                return;
            }
            i(str, map).append('\n');
            return;
        }
        SpannableStringBuilder i3 = i(str, map);
        String str4 = this.b;
        pse.c(str4);
        i3.append((CharSequence) str4);
    }

    public final boolean h(long j) {
        long j2 = this.d;
        return (j2 == -9223372036854775807L && this.e == -9223372036854775807L) || (j2 <= j && this.e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.e) || (j2 <= j && j < this.e));
    }
}
