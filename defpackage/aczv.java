package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczv {
    public static final /* synthetic */ int d = 0;
    public final azrw a;
    public final adaf b;
    public final Executor c;

    static {
        zga.a("Handoff.Store");
    }

    public aczv(azrw azrwVar, adaf adafVar, Executor executor) {
        this.a = azrwVar;
        this.b = adafVar;
        this.c = executor;
    }

    public final anhy a() {
        return anfq.h(((vgz) this.a.get()).a(), aczu.c, this.c);
    }

    public final void b() {
        ynm.i(a(), new ynl() { // from class: aczs
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                aczv aczvVar = aczv.this;
                String str = (String) obj;
                String.format("RecordingUserAction: [id=%s]", str);
                aczvVar.b.a(str);
                aczvVar.c();
            }
        });
    }

    public final void c() {
        ((vgz) this.a.get()).b(aczu.a, this.c);
    }
}
