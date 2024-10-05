package defpackage;

import com.youtube.libraries.bandwidth.BandwidthSampleCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeog extends BandwidthSampleCallback {
    final /* synthetic */ aeoh a;

    public aeog(aeoh aeohVar) {
        this.a = aeohVar;
    }

    @Override // com.youtube.libraries.bandwidth.BandwidthSampleCallback
    public final void onLatencySample(float f) {
        aeoh aeohVar = this.a;
        if (aeohVar.f.size() >= aeohVar.k) {
            aeohVar.f.removeFirst();
        }
        aeohVar.f.addLast(Float.valueOf(f));
        aeohVar.b.c(-1.0f, f, -1L, 1, aeohVar.a);
    }

    @Override // com.youtube.libraries.bandwidth.BandwidthSampleCallback
    public final void onOnesieSample(float f, float f2) {
        aeoh aeohVar = this.a;
        if (aeohVar.g.size() >= aeohVar.l) {
            aeohVar.g.removeFirst();
        }
        aeohVar.g.addLast(Float.valueOf(f2));
        aeohVar.h = 0L;
        aeohVar.b.c(-1.0f, f2, 0L, 2, aeohVar.a);
    }

    @Override // com.youtube.libraries.bandwidth.BandwidthSampleCallback
    public final void onSample(float f, float f2) {
        aeoh aeohVar = this.a;
        if (aeohVar.d.size() >= aeohVar.i) {
            aeohVar.d.removeFirst();
        }
        if (aeohVar.e.size() >= aeohVar.j) {
            aeohVar.e.removeFirst();
        }
        aeohVar.d.addLast(Float.valueOf(f));
        aeohVar.e.addLast(Float.valueOf(f2));
        long j = aeohVar.h + 1;
        aeohVar.h = j;
        aeohVar.b.c(f, f2, j, 3, aeohVar.a);
    }
}
