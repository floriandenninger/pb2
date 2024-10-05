package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuy implements cvz {
    private final AssetManager a;
    private final cuw b;

    public cuy(AssetManager assetManager, cuw cuwVar) {
        this.a = assetManager;
        this.b = cuwVar;
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ cvy a(Object obj, int i, int i2, cqn cqnVar) {
        Uri uri = (Uri) obj;
        return new cvy(new dcz(uri), this.b.a(this.a, uri.toString().substring(22)));
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
