package defpackage;

import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mvb {
    public final ViewGroup a;
    public final Deque b;
    private final muy c;

    public mvb(ViewGroup viewGroup, muy muyVar) {
        this.a = viewGroup;
        muyVar.getClass();
        this.c = muyVar;
        this.b = new ArrayDeque();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final muz a() {
        muz muzVar = (muz) this.b.pollLast();
        if (muzVar != null && muzVar.oE().getParent() != null) {
            this.b.offerFirst(muzVar);
            muzVar = null;
        }
        return muzVar == null ? this.c.a(this.a) : muzVar;
    }
}
