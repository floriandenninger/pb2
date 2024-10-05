package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class imw implements aihk {
    private final ing a;
    private final imn b;
    private final aaea c;
    private final amnv d;

    public imw(ing ingVar, imn imnVar, aaea aaeaVar, amnv amnvVar) {
        this.a = ingVar;
        this.b = imnVar;
        this.c = aaeaVar;
        this.d = amnvVar;
    }

    @Override // defpackage.aihk
    public final Pair a(PlaybackStartDescriptor playbackStartDescriptor, String str, aigd aigdVar, boolean z) {
        if (((ReelWatchEndpointOuterClass$ReelWatchEndpoint) playbackStartDescriptor.b.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) == null) {
            return new Pair(null, null);
        }
        return new Pair(b(playbackStartDescriptor.l(), str, playbackStartDescriptor, aigdVar, z), d(playbackStartDescriptor));
    }

    @Override // defpackage.aihk
    public final anhy b(String str, String str2, PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, boolean z) {
        aujz aujzVar;
        apxf apxfVar = playbackStartDescriptor.b;
        if (((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) == null) {
            return null;
        }
        afww afwwVar = new afww();
        aujs aujsVar = this.c.a().u;
        if (aujsVar == null) {
            aujsVar = aujs.a;
        }
        aujz aujzVar2 = aujsVar.d;
        if (aujzVar2 == null) {
            aujzVar2 = aujz.a;
        }
        if (aujzVar2.H && !TextUtils.isEmpty(str)) {
            imn imnVar = this.b;
            return imnVar.a.i(playbackStartDescriptor, str2, true, imnVar.a(str2, aigdVar.h));
        }
        this.a.e(apxfVar, str2, false, false, playbackStartDescriptor.e && !TextUtils.isEmpty(playbackStartDescriptor.l()) && (((aujzVar = (aujz) this.d.get()) != null && aujzVar.L) || aaox.h(this.c, playbackStartDescriptor.f(), str2, playbackStartDescriptor.c(), aigdVar.h, playbackStartDescriptor.z()) != null), afxb.a, afwwVar);
        return afwwVar;
    }

    @Override // defpackage.aihk
    public final anhy c(PlaybackStartDescriptor playbackStartDescriptor, String str, int i, aigd aigdVar) {
        return null;
    }

    @Override // defpackage.aihk
    public final anhy d(PlaybackStartDescriptor playbackStartDescriptor) {
        afww afwwVar = new afww();
        afwwVar.o(null);
        return afwwVar;
    }
}
