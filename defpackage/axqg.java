package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axqg implements axqk {
    private volatile Object a;
    private final Object b = new Object();
    private final boolean c;
    private final View d;

    public axqg(View view, boolean z) {
        this.d = view;
        this.c = z;
    }

    private final Context b(Class cls, boolean z) {
        Context context = this.d.getContext();
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context != axfq.m(context.getApplicationContext())) {
            return context;
        }
        ayaw.q(z, "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", this.d.getClass());
        return null;
    }

    private final axqk c(boolean z) {
        if (this.c) {
            Context b = b(axqd.class, z);
            if (b instanceof axqd) {
                ayaw.q(b.getClass().equals(axqd.class), "%s, Only account views can attach to account fragments.", this.d.getClass());
                axqd axqdVar = (axqd) b;
                ayaw.s(axqdVar.a, "The fragment has already been destroyed.");
                return (axqk) axqdVar.a;
            }
            if (z) {
                return null;
            }
            ayaw.q(!(r6 instanceof axqk), "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context %s", this.d.getClass(), b(axqk.class, false).getClass().getName());
        } else {
            Object b2 = b(axqk.class, z);
            if (b2 instanceof axqk) {
                return (axqk) b2;
            }
            if (z) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity.", this.d.getClass()));
    }

    public final axqk a() {
        return c(true);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        Object eiaVar;
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    axqk c = c(false);
                    if (this.c) {
                        efp at = ((axqf) axfq.n(c, axqf.class)).at();
                        at.c = this.d;
                        ayaw.j(at.c, View.class);
                        eiaVar = new eid(at.a, at.b, at.d);
                    } else {
                        efl lc = ((axqe) axfq.n(c, axqe.class)).lc();
                        lc.c = this.d;
                        ayaw.j(lc.c, View.class);
                        eiaVar = new eia(lc.a, lc.b);
                    }
                    this.a = eiaVar;
                }
            }
        }
        return this.a;
    }
}
