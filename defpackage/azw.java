package defpackage;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azw {
    public final baa a;
    public final MediaFormat b;
    public final pms c;
    public final Surface d;
    public final MediaCrypto e;

    public azw(baa baaVar, MediaFormat mediaFormat, pms pmsVar, Surface surface, MediaCrypto mediaCrypto) {
        this.a = baaVar;
        this.b = mediaFormat;
        this.c = pmsVar;
        this.d = surface;
        this.e = mediaCrypto;
    }

    public static azw a(baa baaVar, MediaFormat mediaFormat, pms pmsVar, Surface surface, MediaCrypto mediaCrypto) {
        return new azw(baaVar, mediaFormat, pmsVar, surface, mediaCrypto);
    }
}
