package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aiaz extends aiax {
    public int a;

    public aiaz(aibi aibiVar, fnv fnvVar) {
        super(aibiVar, fnvVar);
        this.a = 0;
    }

    @Override // defpackage.aimq
    public final int B() {
        return this.a;
    }

    @Override // defpackage.aimq
    public final void C(int i) {
        this.a = i;
    }

    @Override // defpackage.aibc
    public aims d(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        return new aims(aimr.INSERT, playbackStartDescriptor, aigdVar);
    }

    @Override // defpackage.aiax, defpackage.aimq
    public final boolean u(int i) {
        return true;
    }
}
