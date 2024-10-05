package defpackage;

import android.media.VolumeProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class arq extends VolumeProvider {
    final /* synthetic */ ars a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arq(ars arsVar, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = arsVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        this.a.b(i);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        this.a.c(i);
    }
}
