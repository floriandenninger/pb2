package defpackage;

import android.media.MediaDrm;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pbk implements MediaDrm.OnEventListener {
    final /* synthetic */ pbi a;

    public pbk(pbi pbiVar) {
        this.a = pbiVar;
    }

    @Override // android.media.MediaDrm.OnEventListener
    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.a.g(bArr, i);
    }
}
