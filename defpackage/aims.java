package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aims {
    public static final aims a = new aims(aimr.NEXT);
    public static final aims b = new aims(aimr.PREVIOUS);
    public static final aims c = new aims(aimr.AUTOPLAY);
    public static final aims d = new aims(aimr.AUTONAV);
    public final aimr e;
    public final PlaybackStartDescriptor f;
    public final aigd g;

    private aims(aimr aimrVar) {
        this(aimrVar, null, null, null);
    }

    public aims(aimr aimrVar, PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, byte[] bArr) {
        this.e = aimrVar;
        this.f = playbackStartDescriptor;
        this.g = aigdVar;
    }

    public static final int a(boolean z) {
        return z ? 2 : 1;
    }

    public aims(aimr aimrVar, PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        this(aimrVar, playbackStartDescriptor, aigdVar, null);
    }
}
