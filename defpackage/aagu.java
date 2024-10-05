package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aagu extends aagx {
    private final amru a;
    private final aahd b;

    public aagu(amru amruVar, aahd aahdVar) {
        this.a = amruVar;
        this.b = aahdVar;
    }

    @Override // defpackage.aagx, defpackage.aahd
    public final void c(apxf apxfVar, Map map) {
        if (apxfVar == null) {
            return;
        }
        amru amruVar = this.a;
        int size = amruVar.size();
        for (int i = 0; i < size; i++) {
            aaha f = ((aagx) amruVar.get(i)).f(apxfVar);
            if (f != aaha.x) {
                try {
                    f.kE(apxfVar, map);
                    return;
                } catch (aahm e) {
                    zga.d("CommandResolver threw exception during resolution", e);
                }
            }
        }
        aahd aahdVar = this.b;
        if (aahdVar != null) {
            aahdVar.c(apxfVar, map);
            return;
        }
        String valueOf = String.valueOf(apxfVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Unknown command not resolved");
        sb.append(valueOf);
        zga.l(sb.toString());
    }

    @Override // defpackage.aagx
    public final aaha f(apxf apxfVar) {
        if (aahe.a(apxfVar) == null) {
            return aaha.x;
        }
        amru amruVar = this.a;
        int size = amruVar.size();
        int i = 0;
        while (i < size) {
            aaha f = ((aagx) amruVar.get(i)).f(apxfVar);
            i++;
            if (f != aaha.x) {
                return f;
            }
        }
        return aaha.x;
    }
}
