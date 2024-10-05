package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axqa implements axqk {
    private volatile Object a;
    private final Object b = new Object();
    private final ce c;

    public axqa(ce ceVar) {
        this.c = ceVar;
    }

    public static final Context a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static ContextWrapper b(Context context, ce ceVar) {
        return new axqd(context, ceVar);
    }

    public static ContextWrapper c(LayoutInflater layoutInflater, ce ceVar) {
        return new axqd(layoutInflater, ceVar);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    ayaw.s(this.c.N(), "Sting Fragments must be attached before creating the component.");
                    ayaw.q(this.c.N() instanceof axqk, "Sting Fragments must be attached to an @Sting Activity. Found: %s", this.c.N().getClass());
                    eem lb = ((axpz) axfq.n(this.c.N(), axpz.class)).lb();
                    lb.c = this.c;
                    ayaw.j(lb.c, ce.class);
                    this.a = new ehw(lb.a, lb.d, lb.b, lb.c);
                }
            }
        }
        return this.a;
    }
}
