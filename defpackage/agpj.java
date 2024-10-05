package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpj implements aihk {
    private final agqv a;
    private final agrd b;

    public agpj(agqv agqvVar, agrd agrdVar) {
        this.a = agqvVar;
        this.b = agrdVar;
    }

    @Override // defpackage.aihk
    public final Pair a(PlaybackStartDescriptor playbackStartDescriptor, String str, aigd aigdVar, boolean z) {
        return new Pair(this.a.a(playbackStartDescriptor), e(playbackStartDescriptor));
    }

    @Override // defpackage.aihk
    public final anhy b(String str, String str2, PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, boolean z) {
        return this.a.a(playbackStartDescriptor);
    }

    @Override // defpackage.aihk
    public final anhy c(PlaybackStartDescriptor playbackStartDescriptor, String str, int i, aigd aigdVar) {
        return this.a.b(playbackStartDescriptor);
    }

    @Override // defpackage.aihk
    public final anhy d(PlaybackStartDescriptor playbackStartDescriptor) {
        return e(playbackStartDescriptor);
    }

    protected final anhy e(PlaybackStartDescriptor playbackStartDescriptor) {
        return this.b.b(playbackStartDescriptor, true);
    }
}
