package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fnt {
    private final Object a;
    private apxf b;
    private PlaybackStartDescriptor c;

    public fnt(UUID uuid, PlaybackStartDescriptor playbackStartDescriptor) {
        this(uuid, fkc.e(playbackStartDescriptor));
        this.c = playbackStartDescriptor;
    }

    public final synchronized PlaybackStartDescriptor a() {
        if (this.c == null) {
            apxf apxfVar = this.b;
            aifz d = PlaybackStartDescriptor.d();
            d.a = apxfVar;
            this.c = d.a();
        }
        return this.c;
    }

    public final synchronized apxf b() {
        return this.b;
    }

    public final String c() {
        return a().l();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnt)) {
            return false;
        }
        return this.a.equals(((fnt) fnt.class.cast(obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public fnt(UUID uuid, apxf apxfVar) {
        this.a = uuid;
        apxfVar.getClass();
        this.b = apxfVar;
    }
}
