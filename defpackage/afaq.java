package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afaq implements amnv {
    public final /* synthetic */ afbs a;
    private final /* synthetic */ int b;

    public /* synthetic */ afaq(afbs afbsVar, int i) {
        this.b = i;
        this.a = afbsVar;
    }

    @Override // defpackage.amnv
    public final Object get() {
        VideoStreamingData videoStreamingData;
        pao paoVar;
        int a;
        pah h;
        int i = this.b;
        if (i == 0) {
            return Integer.valueOf(this.a.x.v());
        }
        if (i == 1) {
            return Integer.valueOf(this.a.x.q());
        }
        if (i == 2) {
            return Integer.valueOf(this.a.x.B());
        }
        if (i != 3) {
            if (i == 4) {
                aeeu aeeuVar = this.a.G;
                return Boolean.valueOf(aeeuVar != null && aeeuVar.f.e());
            }
            if (i == 5) {
                return Long.valueOf(this.a.g());
            }
            afbs afbsVar = this.a;
            return Integer.valueOf(afbsVar.x.j() + afbsVar.F.j);
        }
        afbs afbsVar2 = this.a;
        aquz aquzVar = afbsVar2.x.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        long j = Long.MAX_VALUE;
        if (aquzVar.as && (videoStreamingData = afbsVar2.t) != null) {
            aaos aaosVar = videoStreamingData.k;
            if (videoStreamingData.B()) {
                if (aaosVar == null) {
                    j = afbsVar2.E() * 1000;
                } else {
                    Object obj = aaosVar.l;
                    if (obj != null && (a = (paoVar = (pao) obj).a()) != 0) {
                        par b = paoVar.b(a - 1);
                        if (!b.b.isEmpty()) {
                            pal palVar = (pal) b.b.get(0);
                            if (!palVar.b.isEmpty() && (h = ((pav) palVar.b.get(0)).h()) != null) {
                                int b2 = h.b(0L);
                                j = h.e(b2) + h.d(b2, 0L);
                            }
                        }
                    }
                }
            }
        }
        return Long.valueOf(j);
    }
}
