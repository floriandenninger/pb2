package com.google.android.libraries.youtube.notification;

import android.content.Context;
import android.content.Intent;
import defpackage.afsi;
import defpackage.afxm;
import defpackage.ajoy;
import defpackage.aoot;
import defpackage.aqvj;
import defpackage.aqvk;
import defpackage.axzf;
import defpackage.ylf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NotificationInteractionBroadcastReceiver extends afxm {
    public ylf a;
    public axzf b;
    public ajoy c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afxm, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Boolean bool;
        a(context);
        aqvj aqvjVar = this.b.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45352806L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352806L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352806L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            try {
                this.a.e("notification_interaction", 0L, false, 1, intent.getExtras(), null, false);
                return;
            } catch (RuntimeException e) {
                afsi.c(2, 7, "Notification interaction extras exceed the size limit", e);
                this.c.v("notification_interaction", intent.getExtras());
                return;
            }
        }
        this.c.v("notification_interaction", intent.getExtras());
    }
}
