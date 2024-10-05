package defpackage;

import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class srp extends IntersectionObserver {
    public final sww a;
    public final swu b;
    public szx c;
    public boolean d;
    private final ArrayList e;
    private szx f;
    private szx g;
    private IntersectionCriteria h;
    private IntersectionCriteria i;
    private long j;
    private boolean k;
    private ayqx l;

    public srp(axor axorVar, sww swwVar, swu swuVar, szz szzVar) {
        this.a = swwVar;
        this.b = swuVar;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        if (axorVar.aI() != null) {
            IntersectionCriteria f = szz.f(axorVar.aI());
            this.h = f;
            arrayList.add(f);
        }
        if (axorVar.aJ() != null) {
            IntersectionCriteria f2 = szz.f(axorVar.aJ());
            this.i = f2;
            arrayList.add(f2);
        }
        if (this.h == null || this.i == null) {
            arrayList.clear();
            return;
        }
        aoam aoamVar = new aoam();
        int b = axorVar.b(8);
        aoam aoamVar2 = null;
        if (b != 0) {
            aoamVar.f(axorVar.a(b + axorVar.a), axorVar.b);
        } else {
            aoamVar = null;
        }
        this.f = szzVar.g(aoamVar);
        aoam aoamVar3 = new aoam();
        int b2 = axorVar.b(10);
        if (b2 != 0) {
            aoamVar3.f(axorVar.a(b2 + axorVar.a), axorVar.b);
        } else {
            aoamVar3 = null;
        }
        this.g = szzVar.g(aoamVar3);
        aoam aoamVar4 = new aoam();
        int b3 = axorVar.b(12);
        if (b3 != 0) {
            aoamVar4.f(axorVar.a(b3 + axorVar.a), axorVar.b);
            aoamVar2 = aoamVar4;
        }
        this.c = szzVar.g(aoamVar2);
        this.j = Math.max(axorVar.b(14) != 0 ? axorVar.b.getInt(r4 + axorVar.a) & 4294967295L : 0L, 0L);
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final void criteriaMatched(ArrayList arrayList) {
        szx szxVar;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IntersectionCriteria intersectionCriteria = (IntersectionCriteria) arrayList.get(i);
            if (amkq.b(intersectionCriteria, this.h)) {
                if (!this.k) {
                    this.k = true;
                    szx szxVar2 = this.f;
                    if (szxVar2 != null) {
                        this.a.b(szxVar2.a(), this.b).B(azre.c()).Q();
                    }
                    if (this.c != null) {
                        ayqx ax = aypy.am(this.j, TimeUnit.MILLISECONDS, azre.a()).ax(new ayrs() { // from class: sro
                            @Override // defpackage.ayrs
                            public final void a(Object obj) {
                                srp srpVar = srp.this;
                                szx szxVar3 = srpVar.c;
                                if (szxVar3 != null) {
                                    srpVar.a.b(szxVar3.a(), srpVar.b).Q();
                                    srpVar.d = true;
                                }
                            }
                        });
                        this.l = ax;
                        ayry ayryVar = this.b.i.f;
                        if (ayryVar != null) {
                            ayryVar.d(ax);
                        }
                    }
                }
            } else if (amkq.b(intersectionCriteria, this.i)) {
                Object obj = this.l;
                if (obj != null) {
                    ayrz.c((AtomicReference) obj);
                }
                if (this.k && !this.d && (szxVar = this.g) != null) {
                    this.a.b(szxVar.a(), this.b).Q();
                }
                this.k = false;
                this.d = false;
            }
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final ArrayList getCriteriaList() {
        return this.e;
    }
}
