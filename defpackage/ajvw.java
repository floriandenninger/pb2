package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajvw implements ajvb {
    private final Context a;
    private final aahd b;
    private final ajos c;
    private ajvu d;

    public ajvw(Context context, aahd aahdVar) {
        context.getClass();
        this.a = context;
        aahdVar.getClass();
        this.b = aahdVar;
        this.c = new ajnq();
    }

    @Override // defpackage.ajvb
    public final void a(Class cls) {
        if (atda.class.isAssignableFrom(cls)) {
            this.c.f(atda.class, b());
        }
    }

    public final ajvu b() {
        if (this.d == null) {
            this.d = new ajvu(this.a, this.b);
        }
        return this.d;
    }

    @Override // defpackage.amnv
    public final /* synthetic */ Object get() {
        return this.c;
    }
}
