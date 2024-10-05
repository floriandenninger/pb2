package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbe implements bbz {
    private final SparseArray a;
    private final int[] b;

    public bbe(atd atdVar, bil bilVar) {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, (bbz) Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(bbz.class).getConstructor(atd.class).newInstance(atdVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (bbz) Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(bbz.class).getConstructor(atd.class).newInstance(atdVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (bbz) Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(bbz.class).getConstructor(atd.class).newInstance(atdVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (bbz) Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(bbz.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new bcq(atdVar, bilVar));
        this.a = sparseArray;
        this.b = new int[sparseArray.size()];
        for (int i = 0; i < this.a.size(); i++) {
            this.b[i] = this.a.keyAt(i);
        }
    }
}
