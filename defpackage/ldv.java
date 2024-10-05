package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldv implements ajol {
    public arev a;
    public lgm b;
    public lgl c;

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        ajokVar.f("REFINEMENT_POSITION", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        arev arevVar = this.a;
        if (arevVar != null) {
            hashMap.put("HORIZONTAL_CARD_LIST", arevVar);
            ajokVar.f("HORIZONTAL_CARD_LIST", this.a);
        }
        ajokVar.g(hashMap);
        ajokVar.f("REFINEMENT_SELECTION_CONTROLLER", this.b);
        ajokVar.f("REFINEMENT_SELECTION_LISTENER", this.c);
    }
}
