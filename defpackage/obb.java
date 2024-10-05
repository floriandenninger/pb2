package defpackage;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class obb implements obp {
    protected static final Rect u = new Rect();
    private final Set a = new CopyOnWriteArraySet();

    @Override // defpackage.obp
    public ammv I() {
        return amlr.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obo) it.next()).pa(this);
        }
    }

    @Override // defpackage.obp
    public final void K(obo oboVar) {
        this.a.add(oboVar);
    }

    @Override // defpackage.obp
    public final void L(obo oboVar) {
        this.a.remove(oboVar);
    }
}
