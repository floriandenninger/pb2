package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wbp implements ajvb {
    private final Context a;
    private final wic b;
    private final azrw c;
    private ajos d;
    private final wbz e;

    public wbp(Context context, wic wicVar, wbz wbzVar, azrw azrwVar) {
        this.a = context;
        this.b = wicVar;
        this.e = wbzVar;
        this.c = azrwVar;
    }

    @Override // defpackage.ajvb
    public final void a(Class cls) {
        amkq.E(cls == aatd.class);
        this.d = new ajnq();
        if (this.e.b()) {
            this.d.f(aouz.class, new wbn(this.a, (aahd) this.c.get(), this.b));
        }
    }

    @Override // defpackage.amnv
    public final /* synthetic */ Object get() {
        return this.d;
    }
}
