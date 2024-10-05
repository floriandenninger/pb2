package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiua {
    public final transient List a;
    private final List b;

    public aiua(List list) {
        this.b = Collections.unmodifiableList(list);
        TreeSet treeSet = new TreeSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aiul aiulVar = (aiul) it.next();
            treeSet.addAll(aiulVar.b.b);
            treeSet.addAll(aiulVar.b.c);
            treeSet.addAll(aiulVar.c.a);
        }
        this.a = Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public static amru a(zfi zfiVar, long j) {
        return amru.r(new aity(j, j, new ArrayList(), zfiVar));
    }

    public final List b(long j) {
        Pair pair;
        ArrayList arrayList = new ArrayList();
        for (aiul aiulVar : this.b) {
            SubtitleWindowSettings a = aiulVar.c.a(j);
            if (a == null || !a.f) {
                aiup aiupVar = aiulVar.b;
                int a2 = aiupVar.a(j, false);
                if (a2 == -1) {
                    pair = aiup.a;
                } else {
                    CharSequence charSequence = (CharSequence) aiupVar.d.get(a2);
                    long longValue = ((Long) aiupVar.c.get(a2)).longValue();
                    while (true) {
                        int i = a2 + 1;
                        if (i >= aiupVar.b.size() || ((Long) aiupVar.c.get(i)).longValue() != longValue) {
                            break;
                        }
                        a2 = i;
                    }
                    pair = new Pair(charSequence, (CharSequence) aiupVar.d.get(a2));
                }
            } else {
                aiup aiupVar2 = aiulVar.b;
                int a3 = aiupVar2.a(j, true);
                if (a3 == -1) {
                    pair = aiup.a;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    while (true) {
                        int i2 = a3 + 1;
                        if (i2 >= aiupVar2.b.size() || ((Long) aiupVar2.b.get(i2)).longValue() > j || ((Long) aiupVar2.c.get(i2)).longValue() <= j) {
                            break;
                        }
                        CharSequence charSequence2 = (CharSequence) aiupVar2.d.get(a3);
                        if (charSequence2.length() > 0 && charSequence2.charAt(charSequence2.length() - 1) == '\n') {
                            spannableStringBuilder.append(charSequence2);
                            spannableStringBuilder2.append(charSequence2);
                        }
                        a3 = i2;
                    }
                    spannableStringBuilder.append((CharSequence) aiupVar2.d.get(a3));
                    long longValue2 = ((Long) aiupVar2.c.get(a3)).longValue();
                    while (a3 < aiupVar2.b.size() && ((Long) aiupVar2.c.get(a3)).longValue() == longValue2) {
                        CharSequence charSequence3 = (CharSequence) aiupVar2.d.get(a3);
                        if ((charSequence3.length() > 0 && charSequence3.charAt(charSequence3.length() - 1) == '\n') || (a3 = a3 + 1) >= aiupVar2.b.size() || ((Long) aiupVar2.c.get(a3)).longValue() > longValue2) {
                            spannableStringBuilder2.append(charSequence3);
                            break;
                        }
                    }
                    pair = new Pair(spannableStringBuilder, spannableStringBuilder2);
                }
            }
            arrayList.add(new SubtitleWindowSnapshot(aiulVar.a, j, (CharSequence) pair.first, (CharSequence) pair.second, a));
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (aiul aiulVar : this.b) {
            sb.append("[");
            sb.append(aiulVar);
            sb.append("]");
        }
        return sb.toString();
    }
}
