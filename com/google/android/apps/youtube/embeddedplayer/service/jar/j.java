package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.av;
import defpackage.alux;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class j implements alux {
    final /* synthetic */ m a;

    public j(m mVar) {
        this.a = mVar;
    }

    @Override // defpackage.alux
    public final String a(String str) {
        av avVar;
        m mVar = this.a;
        if (mVar.c == null || (avVar = mVar.d) == null) {
            av avVar2 = mVar.b;
            return avVar2 != null ? avVar2.d(str) : "";
        }
        return avVar.d(str);
    }
}
