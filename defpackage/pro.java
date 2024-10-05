package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pro implements ppw {
    private final prl a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;

    public pro(prl prlVar, Map map, Map map2, Map map3) {
        this.a = prlVar;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        prlVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    @Override // defpackage.ppw
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.ppw
    public final int b(long j) {
        int ak = pts.ak(this.b, j, false);
        if (ak < this.b.length) {
            return ak;
        }
        return -1;
    }

    @Override // defpackage.ppw
    public final long c(int i) {
        return this.b[i];
    }

    @Override // defpackage.ppw
    public final List d(long j) {
        prl prlVar = this.a;
        Map map = this.c;
        Map map2 = this.d;
        Map map3 = this.e;
        ArrayList arrayList = new ArrayList();
        prlVar.e(j, prlVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        prlVar.g(j, false, prlVar.h, treeMap);
        prlVar.f(j, map, map2, prlVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                prm prmVar = (prm) map2.get(pair.first);
                pse.c(prmVar);
                ppo ppoVar = new ppo();
                ppoVar.b = decodeByteArray;
                ppoVar.f = prmVar.b;
                ppoVar.g = 0;
                ppoVar.b(prmVar.c, 0);
                ppoVar.e = prmVar.e;
                ppoVar.h = prmVar.f;
                ppoVar.i = prmVar.g;
                ppoVar.k = prmVar.j;
                arrayList2.add(ppoVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            prm prmVar2 = (prm) map2.get(entry.getKey());
            pse.c(prmVar2);
            ppo ppoVar2 = (ppo) entry.getValue();
            CharSequence charSequence = ppoVar2.a;
            pse.c(charSequence);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (prh prhVar : (prh[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), prh.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(prhVar), spannableStringBuilder.getSpanEnd(prhVar), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            ppoVar2.b(prmVar2.c, prmVar2.d);
            ppoVar2.e = prmVar2.e;
            ppoVar2.f = prmVar2.b;
            ppoVar2.h = prmVar2.f;
            ppoVar2.c(prmVar2.i, prmVar2.h);
            ppoVar2.k = prmVar2.j;
            arrayList2.add(ppoVar2.a());
        }
        return arrayList2;
    }
}
