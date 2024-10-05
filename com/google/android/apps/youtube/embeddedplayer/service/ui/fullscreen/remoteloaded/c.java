package com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded;

import android.app.ActionBar;
import android.content.Context;
import android.os.RemoteException;
import android.view.Window;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.bl;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.bn;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;
import defpackage.oba;
import defpackage.zbg;
import defpackage.zbk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements zbk {
    public final com.google.android.apps.youtube.embeddedplayer.service.jar.a a;
    public final zbg b;
    public final ActionBar c;
    public final Window d;
    public f e = f.a;
    public boolean f;
    public boolean g;
    public final bl h;

    public c(Context context, com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar, bl blVar, zbg zbgVar) {
        context.getClass();
        this.a = aVar;
        this.h = blVar;
        this.c = aVar.c();
        this.d = aVar.d();
        this.b = zbgVar;
        this.f = true;
    }

    @Override // defpackage.zbk
    public final void w() {
        if (this.f && this.g) {
            bn bnVar = this.h.a;
            if (bnVar.f()) {
                try {
                    bnVar.c.J();
                    return;
                } catch (RemoteException e) {
                    oba.B(e);
                    return;
                }
            }
            oba.C();
        }
    }
}
