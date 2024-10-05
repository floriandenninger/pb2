package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adec implements Callable {
    public final /* synthetic */ List a;
    private final /* synthetic */ int b;

    public /* synthetic */ adec(List list, int i) {
        this.b = i;
        this.a = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        if (i == 0) {
            return (Map) Collection.EL.stream(this.a).map(acxx.d).filter(nty.f).collect(Collectors.toMap(acxx.e, acxx.f));
        }
        if (i == 1) {
            Iterator it = this.a.iterator();
            tff tffVar = null;
            while (it.hasNext()) {
                tff tffVar2 = (tff) anaf.W((anhy) it.next());
                if (tffVar2 != null) {
                    amkq.O(tffVar == null, "More than one auth provider provided result.");
                    tffVar = tffVar2;
                }
            }
            if (tffVar != null) {
                return tffVar;
            }
            throw new UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
        }
        List list = this.a;
        amrp f = amru.f();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            f.j((Iterable) anaf.W((anhy) it2.next()));
        }
        return f.g();
    }
}
