package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alqq implements alqo {
    public final alqn a;
    private final alqy b;
    private final alqm c;
    private final alra d;
    private final Handler e = new Handler(Looper.getMainLooper());

    public alqq(alqy alqyVar, alqn alqnVar, alqm alqmVar, alra alraVar) {
        this.b = alqyVar;
        this.a = alqnVar;
        this.c = alqmVar;
        this.d = alraVar;
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        if (r1.containsAll(r3) != false) goto L21;
     */
    @Override // defpackage.alqo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.alsc a(defpackage.alqv r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqq.a(alqv):alsc");
    }

    @Override // defpackage.alqo
    public final Set b() {
        return this.c.a();
    }
}
