package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.notification.push.optoutdialog.NotificationOptOutDialogActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agat implements aab {
    final /* synthetic */ agau a;

    public agat(agau agauVar) {
        this.a = agauVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        agau agauVar = this.a;
        if (agauVar.a) {
            return;
        }
        agauVar.a = true;
        Object lM = agauVar.lM();
        NotificationOptOutDialogActivity notificationOptOutDialogActivity = (NotificationOptOutDialogActivity) agauVar;
        eed eedVar = (eed) lM;
        notificationOptOutDialogActivity.b = eedVar.ly;
        notificationOptOutDialogActivity.c = ammv.j(eedVar.a.cl());
    }
}
