package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abwe implements absn {
    public final /* synthetic */ abwy a;
    private final /* synthetic */ int b;

    public /* synthetic */ abwe(abwy abwyVar, int i) {
        this.b = i;
        this.a = abwyVar;
    }

    @Override // defpackage.absn
    public final void a(int i) {
        int i2 = 1;
        if (this.b == 0) {
            abwy abwyVar = this.a;
            if (abwyVar.d.d() && adyu.cP(i)) {
                abwyVar.s.removeCallbacks(new abwb(abwyVar, i2));
                abwyVar.a();
                return;
            }
            return;
        }
        abwy abwyVar2 = this.a;
        if (abwyVar2.S && abwyVar2.i.k()) {
            if (i != 7 && i != 9) {
                if (i == 37) {
                    abwyVar2.j.e();
                    abwyVar2.i.m();
                    return;
                }
                switch (i) {
                    case 12:
                    case 19:
                        break;
                    case 13:
                    case 15:
                        abwyVar2.f.d(0, abwyVar2.P, abwyVar2.t.getString(R.string.lc_error_video_quality_good), true);
                        return;
                    case 14:
                        zga.b("Capture video quality is poor. Video is likely unusable.");
                        abwyVar2.f.d(2, abwyVar2.P, abwyVar2.t.getString(R.string.lc_error_video_quality_poor), false);
                        return;
                    case 16:
                    case 18:
                        if (abwyVar2.w()) {
                            abwyVar2.f.d(0, abwyVar2.O, abwyVar2.t.getString(R.string.lc_error_audio_quality_good), true);
                            return;
                        }
                        return;
                    case 17:
                        zga.b("Capture audio frame rate is poor. Audio is likely unusable.");
                        if (abwyVar2.w() && abwyVar2.i.l()) {
                            abwyVar2.f.d(2, abwyVar2.O, abwyVar2.t.getString(R.string.lc_error_audio_quality_poor), false);
                            return;
                        }
                        return;
                    default:
                        switch (i) {
                            case 28:
                            case 30:
                                abwyVar2.f.d(0, abwyVar2.Q, abwyVar2.t.getString(R.string.lc_error_video_quality_good), true);
                                return;
                            case 29:
                                zga.b("ABR controller video quality is poor. Video is likely unusable.");
                                abwyVar2.f.d(2, abwyVar2.Q, abwyVar2.t.getString(R.string.lc_error_video_quality_poor), false);
                                return;
                            default:
                                StringBuilder sb = new StringBuilder(26);
                                sb.append("Capture error: ");
                                sb.append(i);
                                zga.b(sb.toString());
                                abwyVar2.h(i);
                                return;
                        }
                }
            }
            abwyVar2.u(true, true);
            zga.b("Codec or communication error during capture. Offering retry.");
            if (abwyVar2.i.l()) {
                abwyVar2.i.e(5);
            } else {
                abwyVar2.i.m();
            }
        }
    }
}
