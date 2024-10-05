package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wqb {
    private wyg a = null;

    public final void a() {
        wyg wygVar = this.a;
        if (wygVar == null) {
            whu.l(null, "Tried to submit survey with no registered listener");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : wygVar.c.w()) {
            xgq xgqVar = (xgq) xgvVar.b;
            if (((wwz) wygVar.b.get()).g().contains(xgqVar.a)) {
                String str = xgqVar.a;
                if (TextUtils.equals(str, str)) {
                    arrayList.add(xgvVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            whu.l(null, "No associated layouts for survey submit click. Exit category: 1");
        } else {
            ((wyh) wygVar.a.get()).r(arrayList);
        }
    }

    public final void b(wyg wygVar) {
        if (this.a != null) {
            whu.l(null, "Tried to override existing survey listener");
        } else {
            this.a = wygVar;
        }
    }
}
