package defpackage;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acfd implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    final /* synthetic */ LiveCreationActivity a;

    public acfd(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        acgf acgfVar = this.a.G;
        if (acgfVar == null || !acgfVar.av()) {
            return;
        }
        this.a.G.aG();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            onCancel(dialogInterface);
            return;
        }
        if (i != -1) {
            return;
        }
        LiveCreationActivity liveCreationActivity = this.a;
        acgf acgfVar = liveCreationActivity.G;
        if (acgfVar != null) {
            acgfVar.q();
        }
        liveCreationActivity.F = null;
        liveCreationActivity.E = null;
        liveCreationActivity.G = null;
        liveCreationActivity.C.a = true;
        liveCreationActivity.s(false);
        if (!TextUtils.isEmpty(liveCreationActivity.C.c)) {
            liveCreationActivity.g.execute(new acfb(liveCreationActivity));
        }
        liveCreationActivity.finish();
    }
}
