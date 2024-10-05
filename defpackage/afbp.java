package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afbp implements aekh {
    public afbl a;
    aelu b;
    aelu c;
    final /* synthetic */ afbs d;
    private final aaox e;
    private final afbl f;
    private final VideoStreamingData g;
    private final Object h;
    private final aeru i;
    private final boolean j;
    private final boolean k;
    private int l;

    public afbp(afbs afbsVar, aaox aaoxVar, afbl afblVar, VideoStreamingData videoStreamingData, Object obj, aeru aeruVar) {
        this.d = afbsVar;
        this.e = aaoxVar;
        this.f = afblVar;
        this.g = videoStreamingData;
        this.h = obj;
        this.i = aeruVar;
        arfd a = afbsVar.O.a.a();
        boolean z = false;
        if (a != null) {
            atcl atclVar = a.i;
            apkr apkrVar = (atclVar == null ? atcl.a : atclVar).j;
            if ((apkrVar == null ? apkr.a : apkrVar).b) {
                z = true;
            }
        }
        this.j = z;
        this.k = afbsVar.O.p().j;
    }

    @Override // defpackage.aekh
    public final void a(final aelu aeluVar, int i) {
        final int i2 = 1;
        if (this.j || this.k) {
            this.f.a(aeluVar, i);
            if (i - 1 != 0) {
                this.b = aeluVar;
            } else {
                this.c = aeluVar;
            }
            int i3 = this.l + 1;
            this.l = i3;
            if (i3 == 2) {
                if (this.b == null || this.c == null) {
                    afkj.b("PrewarmTrackRenderersListener missing video or audio data.");
                    return;
                } else {
                    this.d.j.post(new Runnable() { // from class: afbn
                        @Override // java.lang.Runnable
                        public final void run() {
                            afbp.this.b();
                        }
                    });
                    return;
                }
            }
            return;
        }
        this.f.a(aeluVar, i);
        if (i - 1 != 0) {
            this.d.j.post(new Runnable(this) { // from class: afbo
                public final /* synthetic */ afbp a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i2 == 0) {
                        afbp afbpVar = this.a;
                        afbpVar.c = aeluVar;
                        afbl afblVar = afbpVar.a;
                        if (afblVar != null) {
                            afblVar.a(afbpVar.c, 1);
                            return;
                        }
                        return;
                    }
                    afbp afbpVar2 = this.a;
                    afbpVar2.b = aeluVar;
                    afbpVar2.b();
                }
            });
        } else {
            final int i4 = 0;
            this.d.j.post(new Runnable(this) { // from class: afbo
                public final /* synthetic */ afbp a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i4 == 0) {
                        afbp afbpVar = this.a;
                        afbpVar.c = aeluVar;
                        afbl afblVar = afbpVar.a;
                        if (afblVar != null) {
                            afblVar.a(afbpVar.c, 1);
                            return;
                        }
                        return;
                    }
                    afbp afbpVar2 = this.a;
                    afbpVar2.b = aeluVar;
                    afbpVar2.b();
                }
            });
        }
    }

    public final void b() {
        aelu aeluVar;
        aelu aeluVar2;
        arfd a;
        yjk.f();
        if (this.h != this.d.B) {
            return;
        }
        int i = this.b.d;
        yjk.f();
        VideoStreamingData b = aapf.b(i);
        PlayerConfigModel playerConfigModel = this.e.f;
        afbs afbsVar = this.d;
        afjd c = afje.c(b, playerConfigModel, afbsVar.O, afbsVar.a);
        int t = this.e.f.t();
        if ((this.j || this.k) && (aeluVar = this.b) != null && (aeluVar2 = this.c) != null) {
            int i2 = (int) (aeluVar.i + aeluVar2.i);
            long h = this.d.d.h() / 8;
            afhs afhsVar = this.d.O;
            int t2 = this.e.f.t();
            if (i2 > 0 && h > 0 && (a = afhsVar.a.a()) != null) {
                atcl atclVar = a.i;
                if (atclVar == null) {
                    atclVar = atcl.a;
                }
                apkr apkrVar = atclVar.j;
                if (apkrVar == null) {
                    apkrVar = apkr.a;
                }
                int i3 = apkrVar.c;
                if (i3 > 0 && apkrVar.e >= 0) {
                    t = Math.max(apkrVar.d, Math.min(apkrVar.e, (int) Math.max(0.0f, (1.0f - (((float) h) / i2)) * i3)));
                    aeru aeruVar = this.i;
                    StringBuilder sb = new StringBuilder(44);
                    sb.append(t);
                    sb.append(";");
                    sb.append(h);
                    sb.append(";");
                    sb.append(i2);
                    aeruVar.i("bamb", new aeqs(sb.toString()));
                }
            }
            t = t2;
            aeru aeruVar2 = this.i;
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append(t);
            sb2.append(";");
            sb2.append(h);
            sb2.append(";");
            sb2.append(i2);
            aeruVar2.i("bamb", new aeqs(sb2.toString()));
        }
        int i4 = t;
        afbs afbsVar2 = this.d;
        if (afbsVar2.N != c.c || !afbsVar2.aa() || this.j) {
            afbs afbsVar3 = this.d;
            aeiw L = afbsVar3.L("video/x-unknown", afbsVar3.c);
            afbs afbsVar4 = this.d;
            afbl afblVar = new afbl(L, afbsVar4.L("audio/x-unknown", afbsVar4.c));
            this.a = afblVar;
            this.d.ac(this.e, afblVar, this.g, c.c, i4, ((aemt) this.i).a);
            this.d.C.d = c;
            this.a.a(this.b, 2);
            aelu aeluVar3 = this.c;
            if (aeluVar3 != null) {
                this.a.a(aeluVar3, 1);
                return;
            }
            return;
        }
        this.d.C.d = c;
    }
}
