package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aahk {
    public static final CharSequence[] a = new CharSequence[0];

    @Deprecated
    public static Spanned a(aqyg aqygVar, aahd aahdVar, boolean z) {
        return b(null, aqygVar, aahdVar, z);
    }

    public static Spanned b(Context context, aqyg aqygVar, final aahd aahdVar, boolean z) {
        ajck ajckVar;
        if (aahdVar != null) {
            final aahh a2 = aahi.a(z);
            ajckVar = new ajck() { // from class: aahj
                @Override // defpackage.ajck
                public final ClickableSpan a(apxf apxfVar) {
                    return aahh.this.a(aahdVar, null, apxfVar);
                }
            };
        } else {
            ajckVar = null;
        }
        if (context == null || aqygVar == null || ajckVar == null) {
            return ajcq.c(aqygVar, ajckVar);
        }
        ajcn a3 = ajco.a();
        a3.a = context;
        a3.b = aqygVar;
        a3.c = ajckVar;
        return ajcq.a(a3.a());
    }

    @Deprecated
    public static Spanned[] c(aqyg[] aqygVarArr, aahd aahdVar, boolean z) {
        Spanned[] spannedArr = new Spanned[aqygVarArr.length];
        for (int i = 0; i < aqygVarArr.length; i++) {
            spannedArr[i] = a(aqygVarArr[i], aahdVar, z);
        }
        return spannedArr;
    }

    public static List d(List list, aahd aahdVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((aqyg) it.next(), aahdVar, false));
        }
        return arrayList;
    }
}
