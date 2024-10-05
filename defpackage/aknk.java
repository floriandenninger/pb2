package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aknk implements amnv {
    public final /* synthetic */ aknn a;
    private final /* synthetic */ int b;

    public /* synthetic */ aknk(aknn aknnVar, int i) {
        this.b = i;
        this.a = aknnVar;
    }

    @Override // defpackage.amnv
    public final Object get() {
        if (this.b == 0) {
            File file = new File(this.a.a);
            if (!file.exists() || !file.canRead()) {
                return amru.q();
            }
            return amru.p(file.listFiles(afho.b));
        }
        return this.a.b.listFiles(zfp.b);
    }
}
