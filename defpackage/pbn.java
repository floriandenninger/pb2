package defpackage;

import android.media.MediaDrm;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pbn {
    public final MediaDrm a;

    public pbn(UUID uuid) {
        opn.h(uuid);
        this.a = new MediaDrm(uuid);
    }

    public final void a(pbi pbiVar) {
        this.a.setOnEventListener(pbiVar == null ? null : new pbk(pbiVar));
    }

    public final void b(String str, String str2) {
        this.a.setPropertyString(str, str2);
    }
}
