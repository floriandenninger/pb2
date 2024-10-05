package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aonh extends aonm implements aoni {
    public aomz l = aomz.a;

    private void a(aonk aonkVar) {
        if (aonkVar.a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public aomz d() {
        aomz aomzVar = this.l;
        if (aomzVar.c) {
            this.l = aomzVar.clone();
        }
        return this.l;
    }

    @Override // defpackage.aoni
    public final Object pX(aomu aomuVar) {
        aonk checkIsLite;
        checkIsLite = aonm.checkIsLite(aomuVar);
        a(checkIsLite);
        Object l = this.l.l(checkIsLite.d);
        if (l == null) {
            return checkIsLite.b;
        }
        aonj aonjVar = checkIsLite.d;
        if (aonjVar.d) {
            if (aonjVar.a() != aoqo.ENUM) {
                return l;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) l).iterator();
            while (it.hasNext()) {
                arrayList.add(checkIsLite.c(it.next()));
            }
            return arrayList;
        }
        return checkIsLite.c(l);
    }

    @Override // defpackage.aoni
    public final boolean pY(aomu aomuVar) {
        aonk checkIsLite;
        checkIsLite = aonm.checkIsLite(aomuVar);
        a(checkIsLite);
        aomz aomzVar = this.l;
        aonj aonjVar = checkIsLite.d;
        if (aonjVar.d) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return aomzVar.b.get(aonjVar) != null;
    }
}
