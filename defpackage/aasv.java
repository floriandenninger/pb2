package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aasv extends aasu {
    private final Set a;

    public aasv(aarm aarmVar, ysl yslVar, aooy aooyVar, aapw aapwVar, ykr ykrVar, ykq ykqVar) {
        this(aarmVar, yslVar, aooyVar, amsx.r(aapwVar), ykrVar, ykqVar);
    }

    @Override // defpackage.aasu
    public final void l(aooy aooyVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((aapw) it.next()).a(aooyVar);
        }
    }

    public aasv(aarm aarmVar, ysl yslVar, aooy aooyVar, Set set, ykr ykrVar, ykq ykqVar) {
        super(aarmVar, yslVar, aooyVar, ykrVar, ykqVar);
        set.getClass();
        this.a = set;
    }
}
