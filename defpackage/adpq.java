package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpq implements aab {
    final /* synthetic */ adpr a;

    public adpq(adpr adprVar) {
        this.a = adprVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        adpr adprVar = this.a;
        if (adprVar.a) {
            return;
        }
        adprVar.a = true;
        Object lM = adprVar.lM();
        MdxSmartRemoteActivity mdxSmartRemoteActivity = (MdxSmartRemoteActivity) adprVar;
        eed eedVar = (eed) lM;
        mdxSmartRemoteActivity.c = eedVar.a.cO();
        mdxSmartRemoteActivity.d = (akai) eedVar.a.xH.get();
        mdxSmartRemoteActivity.g = new akap();
    }
}
