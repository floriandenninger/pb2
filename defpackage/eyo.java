package defpackage;

import com.google.protos.youtube.api.innertube.RefreshAppActionOuterClass$RefreshAppAction;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyo implements aaha {
    private final Set a;

    public eyo(Set set) {
        this.a = set;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (!apxfVar.pY(RefreshAppActionOuterClass$RefreshAppAction.refreshAppAction)) {
            throw new aahm();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
