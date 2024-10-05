package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crl extends cqt {
    public crl(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.cqw
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.cqt
    protected final /* synthetic */ Object f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.cqt
    protected final /* synthetic */ void g(Object obj) {
        ((InputStream) obj).close();
    }
}
