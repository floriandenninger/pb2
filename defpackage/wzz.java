package defpackage;

import android.content.Context;
import android.view.View;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wzz implements swv {
    private final Context a;
    private final aahd b;

    public wzz(Context context, aahd aahdVar) {
        this.a = context;
        aahdVar.getClass();
        this.b = aahdVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return aozy.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        aozy aozyVar = (aozy) obj;
        View view = swuVar.a;
        szk szkVar = swuVar.c;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.elements.interfaces.command_event_data", swuVar);
        if (view == null || szkVar == null) {
            afsi.b(2, 23, "The adsBorderClickProtectionWrapperCommand has no view set in its event data. Please use a command property that satisfies this. https://goto.google.com/cmdprops-android");
        } else {
            view.getLocationOnScreen(new int[2]);
            int i = (int) ((szkVar.a + r3[0]) / view.getResources().getDisplayMetrics().density);
            int M = yjk.M(this.a);
            if (i >= aozyVar.e && i <= M - aozyVar.f) {
                apxf apxfVar = aozyVar.c;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aong aongVar = (aong) apxfVar.toBuilder();
                ahbn.i(aongVar, swuVar, view);
                this.b.c((apxf) aongVar.build(), hashMap);
            } else {
                apxf apxfVar2 = aozyVar.d;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aong aongVar2 = (aong) apxfVar2.toBuilder();
                ahbn.i(aongVar2, swuVar, view);
                this.b.c((apxf) aongVar2.build(), hashMap);
            }
        }
        return ayph.f();
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
