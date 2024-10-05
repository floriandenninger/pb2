package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uok {
    public final uom a;

    public uok(Context context, uom uomVar) {
        this.a = uomVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(uomVar.b);
        application.registerComponentCallbacks(uomVar.b);
    }

    public final void a(uoj uojVar) {
        uom uomVar = this.a;
        uojVar.getClass();
        uol uolVar = uomVar.b;
        int i = uol.c;
        uolVar.a.add(uojVar);
    }

    public final void b(uoj uojVar) {
        uom uomVar = this.a;
        uojVar.getClass();
        uol uolVar = uomVar.b;
        int i = uol.c;
        uolVar.a.remove(uojVar);
    }
}
