package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fnv {
    private final Random c = new Random();
    public final List a = new ArrayList();
    public final yop b = new yop();

    private final UUID d() {
        return new UUID(this.c.nextLong(), this.c.nextLong());
    }

    private final synchronized UUID e(apxf apxfVar) {
        Iterator it = this.a.iterator();
        UUID uuid = null;
        while (it.hasNext() && (uuid = (UUID) ((fnu) it.next()).a.b.get(apxfVar)) == null) {
        }
        if (uuid != null) {
            return uuid;
        }
        UUID d = d();
        a(apxfVar, d);
        return d;
    }

    public final synchronized void a(apxf apxfVar, UUID uuid) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fnu) it.next()).a.b.put(apxfVar, uuid);
        }
    }

    public final synchronized fnt b(PlaybackStartDescriptor playbackStartDescriptor) {
        apxf apxfVar = playbackStartDescriptor.b;
        if (apxfVar == null) {
            return new fnt(d(), playbackStartDescriptor);
        }
        return new fnt(e(apxfVar), playbackStartDescriptor);
    }

    public final fnt c(apxf apxfVar) {
        apxfVar.getClass();
        return new fnt(e(apxfVar), apxfVar);
    }
}
