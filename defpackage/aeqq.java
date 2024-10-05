package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aeqq {
    public static final VideoQuality[] a = aeeq.a;
    public static final aanb[] b = aeeq.b;
    public static final aeex c = null;
    private final FormatStreamModel d;
    private final FormatStreamModel e;
    private final FormatStreamModel f;
    private final VideoQuality[] g;
    private final aanb[] h;
    private final aeex i;
    private final int j;
    private final long k;
    private final int l;
    private final aeqp m;

    public aeqq(FormatStreamModel formatStreamModel, FormatStreamModel formatStreamModel2, FormatStreamModel formatStreamModel3, VideoQuality[] videoQualityArr, aanb[] aanbVarArr, int i) {
        this(null, formatStreamModel2, null, videoQualityArr, aanbVarArr, c, 0, -1L, 0, null);
    }

    public int a() {
        return this.l;
    }

    public int b() {
        return this.j;
    }

    public long c() {
        return this.k;
    }

    public FormatStreamModel d() {
        return this.f;
    }

    public FormatStreamModel e() {
        return this.e;
    }

    public FormatStreamModel f() {
        return this.d;
    }

    public aeex g() {
        return this.i;
    }

    public aeqp h() {
        return this.m;
    }

    public boolean i() {
        return this.h.length > 1;
    }

    public boolean j() {
        return this.g.length > 1;
    }

    public aanb[] k() {
        return this.h;
    }

    public VideoQuality[] l() {
        return this.g;
    }

    public aeqq(FormatStreamModel formatStreamModel, FormatStreamModel formatStreamModel2, FormatStreamModel formatStreamModel3, VideoQuality[] videoQualityArr, aanb[] aanbVarArr, aeex aeexVar, int i) {
        this(null, null, null, videoQualityArr, aanbVarArr, aeexVar, 0, -1L, 0, null);
    }

    public aeqq(FormatStreamModel formatStreamModel, FormatStreamModel formatStreamModel2, FormatStreamModel formatStreamModel3, VideoQuality[] videoQualityArr, aanb[] aanbVarArr, aeex aeexVar, int i, long j, int i2, aeqp aeqpVar) {
        this.d = formatStreamModel;
        this.e = formatStreamModel2;
        this.f = formatStreamModel3;
        this.g = (VideoQuality[]) afki.a(videoQualityArr);
        this.h = (aanb[]) afki.a(aanbVarArr);
        this.i = aeexVar;
        this.j = i;
        this.k = j;
        this.l = i2;
        this.m = aeqpVar;
    }

    public String toString() {
        FormatStreamModel formatStreamModel = this.d;
        int e = formatStreamModel == null ? 0 : formatStreamModel.e();
        FormatStreamModel formatStreamModel2 = this.e;
        int e2 = formatStreamModel2 == null ? 0 : formatStreamModel2.e();
        FormatStreamModel formatStreamModel3 = this.f;
        int e3 = formatStreamModel3 != null ? formatStreamModel3.e() : 0;
        String bO = adyu.bO(this.j);
        long j = this.k;
        int i = this.l;
        StringBuilder sb = new StringBuilder(String.valueOf(bO).length() + 147);
        sb.append("currentVideoFormat=");
        sb.append(e);
        sb.append(" currentAudioFormat=");
        sb.append(e2);
        sb.append(" bestVideoFormat=");
        sb.append(e3);
        sb.append(" trigger=");
        sb.append(bO);
        sb.append(" estimate=");
        sb.append(j);
        sb.append(" source=");
        sb.append(i);
        return sb.toString();
    }
}
