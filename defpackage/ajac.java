package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajac {
    public String a;
    public byte[] b;
    public aryi c;
    public VideoStreamingData d;
    public aryb e;
    public aomf f;
    public atxz g;
    public Boolean h;
    public String i;

    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException("Null currentVideoId");
        }
        this.a = str;
    }

    public final void b(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void c(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null trackingParams");
        }
        this.b = bArr;
    }
}
