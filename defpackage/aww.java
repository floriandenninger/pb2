package defpackage;

import android.media.AudioTrack;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aww {
    public final Handler a = new Handler();
    public final AudioTrack.StreamEventCallback b = new awv(this);
    final /* synthetic */ awx c;

    public aww(awx awxVar) {
        this.c = awxVar;
    }
}
