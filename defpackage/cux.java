package defpackage;

import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cux implements cwa, cuw {
    private final AssetManager a;
    private final /* synthetic */ int b;

    public cux(AssetManager assetManager, int i) {
        this.b = i;
        this.a = assetManager;
    }

    @Override // defpackage.cwa
    public final void d() {
    }

    @Override // defpackage.cuw
    public final cqw a(AssetManager assetManager, String str) {
        return this.b != 0 ? new crd(assetManager, str) : new crl(assetManager, str);
    }

    @Override // defpackage.cwa
    public final cvz c(cwg cwgVar) {
        return this.b != 0 ? new cuy(this.a, this) : new cuy(this.a, this);
    }
}
