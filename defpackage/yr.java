package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yr implements View.OnClickListener {
    final qa a;
    final /* synthetic */ yt b;

    public yr(yt ytVar) {
        this.b = ytVar;
        this.a = new qa(ytVar.a.getContext(), ytVar.d);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yt ytVar = this.b;
        Window.Callback callback = ytVar.e;
        if (callback == null || !ytVar.f) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
