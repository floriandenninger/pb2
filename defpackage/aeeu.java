package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeeu {
    public final FormatStreamModel[] a;
    public final FormatStreamModel[] b;
    public final FormatStreamModel c;
    public final VideoQuality[] d;
    public final aanb[] e;
    public final aeex f;
    public final int g;
    public final boolean h;
    private final aees i;

    static {
        new aeeu(new FormatStreamModel[0], new FormatStreamModel[0], new FormatStreamModel(aqxz.b, null, 0L), new VideoQuality[0], new aanb[0], aeex.a, new aees(aeex.a, aees.a, false, ""), Integer.MAX_VALUE, false);
    }

    public aeeu(FormatStreamModel[] formatStreamModelArr, FormatStreamModel[] formatStreamModelArr2, FormatStreamModel formatStreamModel, VideoQuality[] videoQualityArr, aanb[] aanbVarArr, aeex aeexVar, aees aeesVar, int i, boolean z) {
        this.a = (FormatStreamModel[]) afki.a(formatStreamModelArr);
        this.b = (FormatStreamModel[]) afki.a(formatStreamModelArr2);
        this.c = formatStreamModel;
        this.d = (VideoQuality[]) afki.a(videoQualityArr);
        this.e = (aanb[]) afki.a(aanbVarArr);
        afki.a(aeexVar);
        this.f = aeexVar;
        afki.a(aeesVar);
        this.i = aeesVar;
        this.g = i;
        this.h = z;
    }

    public final int a() {
        return this.i.h;
    }

    public final aeex b() {
        return this.i.e;
    }

    public final String c() {
        return this.i.g;
    }

    public final String d() {
        aees aeesVar = this.i;
        if (aeesVar.h != -1) {
            if (aeesVar.j != -1) {
                long round = Math.round(Math.pow(1.6d, Math.round(Math.log(r0 / 1000) / Math.log(1.6d))));
                int i = this.i.i;
                String valueOf = i != -2 ? String.valueOf(i) : "none";
                int a = a();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("dt.");
                sb.append(round);
                sb.append(";lmq.");
                sb.append(a);
                sb.append(";dir.");
                sb.append(valueOf);
                return sb.toString();
            }
        }
        return "none";
    }

    public final boolean e() {
        FormatStreamModel formatStreamModel = this.c;
        return formatStreamModel != null && formatStreamModel.F();
    }

    public final boolean f() {
        return this.c != null && (aaoq.z().contains(Integer.valueOf(this.c.e())) || aaoq.e().contains(Integer.valueOf(this.c.e())));
    }

    public final FormatStreamModel[] g() {
        List b = this.f.b(Arrays.asList(this.a));
        return (FormatStreamModel[]) b.toArray(new FormatStreamModel[b.size()]);
    }
}
