package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gwl implements aab {
    final /* synthetic */ gwm a;

    public gwl(gwm gwmVar) {
        this.a = gwmVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        gwm gwmVar = this.a;
        if (gwmVar.c) {
            return;
        }
        gwmVar.c = true;
        Object lM = gwmVar.lM();
        GalFlowActivity galFlowActivity = (GalFlowActivity) gwmVar;
        eed eedVar = (eed) lM;
        galFlowActivity.a = (gwg) eedVar.a.a.h.get();
        galFlowActivity.b = eedVar.ft();
    }
}
