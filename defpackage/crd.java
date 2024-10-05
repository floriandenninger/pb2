package defpackage;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crd extends cqt {
    public crd(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.cqw
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.cqt
    protected final /* bridge */ /* synthetic */ Object f(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    @Override // defpackage.cqt
    protected final /* synthetic */ void g(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
