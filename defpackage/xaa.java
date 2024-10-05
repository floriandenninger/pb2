package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xaa implements swv {
    private final aahd a;

    public xaa(aahd aahdVar) {
        aahdVar.getClass();
        this.a = aahdVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return aqkx.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, swu swuVar) {
        aqkx aqkxVar = (aqkx) obj;
        View view = swuVar.a;
        szk szkVar = swuVar.c;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Object obj2 = swuVar.d;
        if (obj2 instanceof ajgc) {
            ajgc ajgcVar = (ajgc) obj2;
            Object obj3 = ajgcVar.a;
            r6 = obj3 != null ? obj3 : null;
            List list = ajgcVar.e;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        float f = view != null ? view.getResources().getDisplayMetrics().density : 0.0f;
        for (apxf apxfVar : aqkxVar.c) {
            hashMap.clear();
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            if (view != null) {
                xbw xbwVar = new xbw(view);
                if (szkVar != null) {
                    xbwVar.d((int) (szkVar.a / f), (int) (szkVar.b / f));
                }
                arrayList2.add(xbwVar);
            } else {
                afsi.b(2, 23, "The command has no view set in its event data. Please use a command property that satisfies this. https://goto.google.com/cmdprops-android");
            }
            if (r6 != null) {
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", r6);
            }
            if (!arrayList2.isEmpty()) {
                hashMap.put("MacrosConverters.CustomConvertersKey", arrayList2.toArray(new afxe[arrayList2.size()]));
            }
            hashMap.put("com.google.android.libraries.elements.interfaces.command_event_data", swuVar);
            aong aongVar = (aong) apxfVar.toBuilder();
            ahbn.i(aongVar, swuVar, view);
            ahbn.h(hashMap, swuVar);
            this.a.c((apxf) aongVar.build(), hashMap);
        }
        return ayph.f();
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
