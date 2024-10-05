package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afr extends afk {
    public ArrayList aH = new ArrayList();

    public void T() {
        ArrayList arrayList = this.aH;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            afk afkVar = (afk) this.aH.get(i);
            if (afkVar instanceof afr) {
                ((afr) afkVar).T();
            }
        }
    }

    public final void Y(afk afkVar) {
        this.aH.remove(afkVar);
        afkVar.s();
    }

    @Override // defpackage.afk
    public void s() {
        this.aH.clear();
        super.s();
    }

    @Override // defpackage.afk
    public final void u(afa afaVar) {
        super.u(afaVar);
        int size = this.aH.size();
        for (int i = 0; i < size; i++) {
            ((afk) this.aH.get(i)).u(afaVar);
        }
    }
}
