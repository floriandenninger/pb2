package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gqs implements aaha {
    private final keg a;
    private final /* synthetic */ int b;

    public gqs(keg kegVar, int i, byte[] bArr) {
        this.b = i;
        kegVar.getClass();
        this.a = kegVar;
    }

    public gqs(keg kegVar, int i) {
        this.b = i;
        kegVar.getClass();
        this.a = kegVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.b != 0) {
            this.a.e(false);
        } else {
            this.a.e(true);
        }
    }
}
