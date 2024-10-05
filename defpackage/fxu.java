package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fxu implements fyz {
    public View a;
    private final LinkedList b = new LinkedList();

    @Override // defpackage.fyz
    public final View a() {
        return this.a;
    }

    @Override // defpackage.fyz
    public final void b(fyy fyyVar) {
        if (d()) {
            fyyVar.a(this.a);
        } else {
            this.b.add(fyyVar);
        }
    }

    public final void c(View view) {
        this.a = view;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((fyy) it.next()).a(view);
        }
        this.b.clear();
    }

    @Override // defpackage.fyz
    public final boolean d() {
        return this.a != null;
    }
}
