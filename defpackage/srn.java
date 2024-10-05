package defpackage;

import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class srn extends IntersectionObserver {
    private final ArrayList a;
    private final sww b;
    private final swu c;
    private final szx d;

    public srn(axom axomVar, sww swwVar, swu swuVar, szz szzVar) {
        this.b = swwVar;
        this.c = swuVar;
        aoam aoamVar = new aoam();
        int b = axomVar.b(4);
        aoam aoamVar2 = null;
        if (b != 0) {
            aoamVar.f(axomVar.a(b + axomVar.a), axomVar.b);
        } else {
            aoamVar = null;
        }
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (aoamVar == null) {
            this.d = null;
            return;
        }
        arrayList.add(szz.f(aoamVar));
        aoam aoamVar3 = new aoam();
        int b2 = axomVar.b(6);
        if (b2 != 0) {
            aoamVar3.f(axomVar.a(b2 + axomVar.a), axomVar.b);
            aoamVar2 = aoamVar3;
        }
        this.d = szzVar.g(aoamVar2);
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final void criteriaMatched(ArrayList arrayList) {
        szx szxVar = this.d;
        if (szxVar != null) {
            this.b.b(szxVar.a(), this.c).Q();
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final ArrayList getCriteriaList() {
        return this.a;
    }
}
