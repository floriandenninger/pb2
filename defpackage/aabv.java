package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aabv extends ykv {
    private final azrw a;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;

    public aabv(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7) {
        this.a = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.e = azrwVar4;
        this.f = azrwVar5;
        this.g = azrwVar6;
        this.h = azrwVar7;
    }

    public static void d(aawl aawlVar) {
        aawlVar.b();
    }

    @Override // defpackage.ykv
    protected final void a() {
        this.h.get();
        ((ysl) this.f.get()).c();
        ((ysl) this.g.get()).c();
        aahv aahvVar = (aahv) this.d.get();
        aais aaisVar = (aais) this.e.get();
        aahvVar.g();
        aaisVar.g();
        ((Application) this.c.get()).registerActivityLifecycleCallbacks((aasd) this.a.get());
    }
}
