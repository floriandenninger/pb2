package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cbx {
    protected final Context a;
    public final Object b = new Object();
    public final Set c = new LinkedHashSet();
    public Object d;
    protected final cfa e;

    static {
        ajbh.S("ConstraintTracker");
    }

    public cbx(Context context, cfa cfaVar) {
        this.a = context.getApplicationContext();
        this.e = cfaVar;
    }

    public abstract Object b();

    public abstract void d();

    public abstract void e();

    public final void f(cbf cbfVar) {
        synchronized (this.b) {
            if (this.c.remove(cbfVar) && this.c.isEmpty()) {
                e();
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.b) {
            Object obj2 = this.d;
            if (obj2 == obj || (obj2 != null && obj2.equals(obj))) {
                return;
            }
            this.d = obj;
            this.e.c.execute(new cbw(this, new ArrayList(this.c)));
        }
    }
}
