package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.mdx.MdxSmartRemoteMealbarController;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jcf implements ykl {
    final /* synthetic */ MdxSmartRemoteMealbarController a;

    public jcf(MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController) {
        this.a = mdxSmartRemoteMealbarController;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void b(Object obj, Object obj2) {
        Intent y = adyu.y(this.a.a);
        y.putExtra("com.google.android.libraries.youtube.mdx.smartremote.startingUiMode", 3);
        y.putExtra("com.google.android.libraries.youtube.mdx.smartremote.dialogStyle", this.a.h.a);
        this.a.a.startActivity(y);
    }
}
