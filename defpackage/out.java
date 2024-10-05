package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.EmbedsBackgroundTaskWorker;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class out implements yle {
    private final anyx a;

    public out(f fVar, boolean z, String str) {
        this.a = new anyx(fVar, z, str);
    }

    @Override // defpackage.yle
    public final Bundle a() {
        return this.a.a;
    }

    @Override // defpackage.yle
    public final Class b() {
        return EmbedsBackgroundTaskWorker.class;
    }
}
