package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeus extends aedn {
    aezf b;
    final /* synthetic */ aeut c;
    private final aaox e;
    private final aeru f;
    private volatile afaa g;
    private final aerf h;
    private volatile boolean i;
    private boolean j;
    private final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean a = new AtomicBoolean();

    public aeus(aeut aeutVar, aaox aaoxVar, boolean z, aeru aeruVar, aesa aesaVar) {
        VideoStreamingData d;
        this.c = aeutVar;
        this.b = null;
        this.e = aaoxVar;
        this.f = aeruVar;
        this.h = new aerf(aeruVar);
        aony<aqxz> aonyVar = aeutVar.i.s.q().g;
        if (aaoxVar.g()) {
            d = aaoxVar.h;
        } else {
            String str = aaoxVar.g;
            aapf aapfVar = aapf.a;
            aone createBuilder = aryv.a.createBuilder();
            for (aqxz aqxzVar : aonyVar) {
                aong aongVar = (aong) aqxz.b.createBuilder();
                int i = aqxzVar.d;
                aongVar.copyOnWrite();
                aqxz aqxzVar2 = (aqxz) aongVar.instance;
                aqxzVar2.c |= 1;
                aqxzVar2.d = i;
                int i2 = aqxzVar.g;
                aongVar.copyOnWrite();
                aqxz aqxzVar3 = (aqxz) aongVar.instance;
                aqxzVar3.c |= 8;
                aqxzVar3.g = i2;
                String str2 = aqxzVar.f;
                aongVar.copyOnWrite();
                aqxz aqxzVar4 = (aqxz) aongVar.instance;
                str2.getClass();
                aqxzVar4.c |= 4;
                aqxzVar4.f = str2;
                int i3 = aqxzVar.d;
                StringBuilder sb = new StringBuilder(28);
                sb.append("http://oda/?itag=");
                sb.append(i3);
                String sb2 = sb.toString();
                aongVar.copyOnWrite();
                aqxz aqxzVar5 = (aqxz) aongVar.instance;
                sb2.getClass();
                aqxzVar5.c |= 2;
                aqxzVar5.e = sb2;
                int i4 = aqxzVar.i;
                if (i4 > 0 && aqxzVar.j > 0) {
                    aongVar.copyOnWrite();
                    aqxz aqxzVar6 = (aqxz) aongVar.instance;
                    aqxzVar6.c |= 32;
                    aqxzVar6.i = i4;
                    int i5 = aqxzVar.j;
                    aongVar.copyOnWrite();
                    aqxz aqxzVar7 = (aqxz) aongVar.instance;
                    aqxzVar7.c |= 64;
                    aqxzVar7.j = i5;
                }
                createBuilder.am((aqxz) aongVar.build());
            }
            d = aapfVar.d((aryv) createBuilder.build(), str, -9223372036854775807L);
        }
        VideoStreamingData videoStreamingData = d;
        if (!z || aonyVar.isEmpty() || videoStreamingData == null) {
            return;
        }
        PlayerConfigModel playerConfigModel = aaoxVar.f;
        aetw aetwVar = aeutVar.i;
        afjd c = afje.c(videoStreamingData, playerConfigModel, aetwVar.s, aetwVar.h);
        PlayerConfigModel playerConfigModel2 = aaoxVar.f;
        aetw aetwVar2 = aeutVar.i;
        afjc b = afje.b(videoStreamingData, playerConfigModel2, aetwVar2.s, aetwVar2.d(playerConfigModel2));
        String str3 = aaoxVar.b;
        PlayerConfigModel playerConfigModel3 = aaoxVar.f;
        afjd afjdVar = this.c.i.m != null ? c : afje.e;
        afjc b2 = afje.b(videoStreamingData, playerConfigModel3, this.c.i.s, afje.d);
        aeez aeezVar = this.c.i.e;
        List list = videoStreamingData.p;
        Set set = afjdVar.a;
        Set set2 = b2.a;
        List d2 = aeez.d(list, set, "video/webm");
        List d3 = aeez.d(list, set2, "audio/webm");
        aees c2 = aeezVar.c.c(true, playerConfigModel3, str3, null);
        aeeu aeeuVar = new aeeu((FormatStreamModel[]) d2.toArray(new FormatStreamModel[0]), (FormatStreamModel[]) d3.toArray(new FormatStreamModel[0]), null, aeezVar.i(d2, str3), aeez.h(d3), c2.d, c2, aeezVar.d.aq(), false);
        aelf aelfVar = new aelf(aaoxVar.b, ammx.d(aaoxVar.g), ((aemt) aeruVar).a, aeutVar.i.e);
        this.b = new aezf(aeutVar, aaoxVar.b, aaoxVar.f, this.h, videoStreamingData, aesm.b, affc.a, c, b, aeeuVar, aelfVar, aeutVar.i.s, aesaVar, null);
        afhs afhsVar = aeutVar.i.s;
        if (afhsVar.V(afhsVar.q.a.a.Y(axyz.r).B())) {
            aelfVar.e(aeutVar.s.a(this.b, (asj) aear.r(null, this.b.b().p, true).first), this.b.h(), this.b.o);
        }
        aezf aezfVar = this.b;
        aezfVar.f = aaoxVar.i;
        boolean z2 = aezfVar.F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V() {
        bbr bbrVar;
        if (this.c.i.s.p().az || this.c.N != 3) {
            aeut aeutVar = this.c;
            aeutVar.w.o(aeutVar.i.m, this.b, false);
            aezf aezfVar = this.b;
            if (aezfVar != null && !aezfVar.q) {
                if (!aezfVar.p) {
                    this.c.d.k();
                }
                this.b.q = true;
            }
            if (this.a.compareAndSet(false, true)) {
                W();
            }
            aezf aezfVar2 = this.b;
            if (aezfVar2 != null && !aezfVar2.F) {
                if (aezfVar2.k() != null) {
                    int intValue = this.b.k().intValue();
                    this.b.q(null);
                    VideoStreamingData b = aapf.b(intValue);
                    PlayerConfigModel playerConfigModel = this.e.f;
                    aetw aetwVar = this.c.i;
                    afjd c = afje.c(b, playerConfigModel, aetwVar.s, aetwVar.h);
                    if (this.b.h().c != c.c) {
                        this.b.s(c);
                        this.b.o(true);
                    }
                }
                if (this.b.j() != null) {
                    int intValue2 = this.b.j().intValue();
                    if (!this.b.o.a.contains(Integer.valueOf(intValue2))) {
                        VideoStreamingData b2 = aapf.b(intValue2);
                        PlayerConfigModel playerConfigModel2 = this.e.f;
                        aetw aetwVar2 = this.c.i;
                        this.b.r(afje.b(b2, playerConfigModel2, aetwVar2.s, aetwVar2.d(playerConfigModel2)));
                        this.b.o(true);
                    }
                }
                if (this.b.v()) {
                    this.c.Q(this.b);
                    this.c.s.b(this.b);
                    this.b.o(false);
                }
            }
            if (this.d.compareAndSet(false, true) && this.b != null && this.i) {
                if (this.c.g.l() != 1) {
                    afkj.b("Warming started too late: playbackState != STATE_IDLE.");
                    return;
                }
                this.c.i.f(this.b);
                aevl aevlVar = this.c.w;
                aezf aezfVar3 = this.b;
                afky afkyVar = aevlVar.b.m;
                if (afkyVar != null) {
                    afkyVar.t(aevlVar.f(afkyVar, aezfVar3));
                    aevlVar.j();
                }
                ((aemt) this.f).a.w();
                this.c.al(false, false);
                aezf aezfVar4 = this.b;
                if (aezfVar4.F) {
                    bbrVar = this.c.C.a(aezfVar4);
                    afki.a(bbrVar);
                    this.c.W();
                } else {
                    bbrVar = this.g;
                    afki.a(bbrVar);
                    this.c.V();
                }
                if (this.c.i.s.p().f100J) {
                    aeru aeruVar = this.f;
                    aeut aeutVar2 = this.c;
                    bbrVar = new aevy(bbrVar, aeruVar, aeutVar2.k, aeutVar2.i.s);
                }
                if (this.c.i.s.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_SNAPPED_START)) {
                    this.c.g.i(poi.b);
                }
                aeut aeutVar3 = this.c;
                long j = this.e.i;
                afjf afjfVar = ((aemt) this.f).a;
                afki.a(afjfVar);
                aeutVar3.ae(bbrVar, j, afjfVar);
                this.j = true;
                aevh aevhVar = this.c.h;
                PlayerConfigModel a = this.b.a();
                aezf aezfVar5 = this.b;
                aevhVar.k(a, aezfVar5.K, aezfVar5.a);
                aeut aeutVar4 = this.c;
                aeutVar4.d.l(this.f, aeutVar4.i.s.af(), this.b.a());
                if (this.b.F) {
                    this.c.C.n(this.e.i);
                }
                if (this.c.i.s.x()) {
                    this.b.K.f("seek", afhm.c());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void W() {
        aezf aezfVar = this.b;
        if (aezfVar == null) {
            return;
        }
        afiv a = afiw.a(this.e.f);
        aaox aaoxVar = this.e;
        a.a = aaoxVar.b;
        a.g = ammv.i(aaoxVar.g);
        a.d = ((aemt) this.f).a;
        a.h = aezfVar.K;
        boolean z = true;
        a.b = new aeuw(aezfVar, 1);
        afhs afhsVar = this.c.i.s;
        if (!afhsVar.V(afhsVar.p.a.a.Y(axzc.j).B())) {
            aeut aeutVar = this.c;
            aeutVar.D = new afiy[]{aeutVar.f.a(a.a(), 5), this.c.f.a(a.a(), 5)};
        }
        String str = this.e.g;
        aejc b = str != null ? this.c.p.b(str) : null;
        if (b == null) {
            this.i = false;
            return;
        }
        try {
            if (aezfVar.F) {
                if (this.c.C.a(aezfVar) == null) {
                    z = false;
                }
                this.i = z;
                return;
            }
            aeut aeutVar2 = this.c;
            aeve aeveVar = aeutVar2.i.a;
            aerf aerfVar = this.h;
            PlayerConfigModel a2 = aezfVar.a();
            afaa afaaVar = new afaa(aeveVar.b, aeutVar2.i.b.k(), new aezy(aeve.g(aeutVar2, aezfVar.d, aezfVar), aeutVar2.i.s, a2.A(), a2.z(), aezfVar.d, aezfVar.b.a(), a2.t(), new aevc[]{aeveVar.f(aeutVar2.h)}, aeutVar2.i.d), aeutVar2.l, aezfVar, aerfVar, aezfVar.b.a(), aeveVar.g);
            afaaVar.jI(aeutVar2.k, aeutVar2.i.b);
            this.g = afaaVar;
            aekh aevgVar = new aevg(this.g, aezfVar, this.c);
            this.i = true;
            aquz aquzVar = this.e.f.c.e;
            if (aquzVar == null) {
                aquzVar = aquz.b;
            }
            if (!aquzVar.aZ) {
                aevgVar = this.g;
            }
            b.h(aevgVar);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(afhm.a(e));
            this.f.g(new afih("player.exception", 0L, valueOf.length() != 0 ? "swa;info.".concat(valueOf) : new String("swa;info.")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8 A[RETURN] */
    @Override // defpackage.aedn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aezf d(java.lang.String r17, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r18, defpackage.aeru r19, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r20, int r21) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeus.d(java.lang.String, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, aeru, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, int):aezf");
    }
}
