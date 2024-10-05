package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.search.voice.PermissionRequestActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lhp implements aab {
    final /* synthetic */ lhq a;

    public lhp(lhq lhqVar) {
        this.a = lhqVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        lhq lhqVar = this.a;
        if (lhqVar.a) {
            return;
        }
        lhqVar.a = true;
        lhqVar.lM();
        ((PermissionRequestActivity) lhqVar).b = new akap();
    }
}
