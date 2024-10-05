package defpackage;

import android.view.View;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fzy {
    public View a;
    LinkedList b;

    public final fzz a() {
        return new fzz(this.a, this.b);
    }

    public final void b(fyz fyzVar) {
        if (this.b == null) {
            this.b = new LinkedList();
        }
        this.b.add(fyzVar);
    }
}
