package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class uqa implements amnv {
    public final /* synthetic */ azrw a;
    private final /* synthetic */ int b;

    public /* synthetic */ uqa(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    @Override // defpackage.amnv
    public final Object get() {
        switch (this.b) {
            case 0:
                return (uqd) this.a.get();
            case 1:
                return (ajop) this.a.get();
            case 2:
                return (zaw) this.a.get();
            case 3:
                return (aahd) this.a.get();
            case 4:
                return (ysl) this.a.get();
            case 5:
                return (ysl) this.a.get();
            case 6:
                return (File) this.a.get();
            case 7:
                return Integer.valueOf(((apdb) this.a.get()).q);
            default:
                return Integer.valueOf(((apdb) this.a.get()).q);
        }
    }
}
