package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpz implements jpi {
    private final Context a;
    private final aahv b;
    private final jpf c;
    private final axzg d;
    private final ajoy e;

    public jpz(Context context, aahv aahvVar, ajoy ajoyVar, jpf jpfVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = context;
        this.b = aahvVar;
        this.e = ajoyVar;
        this.c = jpfVar;
        this.d = axzgVar;
    }

    @Override // defpackage.jpi
    public final int a() {
        return 155;
    }

    @Override // defpackage.jpi
    public final int b() {
        return 284;
    }

    @Override // defpackage.jpi
    public final /* bridge */ /* synthetic */ jpg c(aakt aaktVar, String str, jph jphVar) {
        String title;
        awil awilVar = (awil) aaktVar;
        aahu c = this.b.c();
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = aqmo.a.createBuilder();
        createBuilder.copyOnWrite();
        aqmo aqmoVar = (aqmo) createBuilder.instance;
        aqmoVar.c |= 1;
        aqmoVar.d = str;
        aqml aqmlVar = new aqml(createBuilder);
        if (awilVar != null) {
            atxb f = awilVar.f();
            aqoz b = f != null ? f.b() : null;
            boolean k = this.c.k(awilVar.b(), b);
            boolean l = this.c.l(awilVar.b(), b);
            awjp g = awilVar.g();
            if (g != null) {
                awic f2 = g.f();
                avzf b2 = g.b();
                boolean z = (b2 == null || k || this.c.o(awilVar, b2.getLastPlaybackPositionSeconds().longValue())) ? false : true;
                if (l) {
                    title = this.a.getString(R.string.expired_video_title);
                } else {
                    title = g.getTitle();
                }
                aone aoneVar = aqmlVar.a;
                aoneVar.copyOnWrite();
                aqmo aqmoVar2 = (aqmo) aoneVar.instance;
                title.getClass();
                aqmoVar2.c |= 4;
                aqmoVar2.f = title;
                String title2 = (l || f2 == null) ? "" : f2.getTitle();
                aone aoneVar2 = aqmlVar.a;
                aoneVar2.copyOnWrite();
                aqmo aqmoVar3 = (aqmo) aoneVar2.instance;
                title2.getClass();
                aqmoVar3.c |= 8;
                aqmoVar3.g = title2;
                Integer valueOf = Integer.valueOf(z ? b2.getLastPlaybackPositionSeconds().intValue() : 0);
                aone aoneVar3 = aqmlVar.a;
                int intValue = valueOf.intValue();
                aoneVar3.copyOnWrite();
                aqmo aqmoVar4 = (aqmo) aoneVar3.instance;
                aqmoVar4.c |= 64;
                aqmoVar4.j = intValue;
                String videoId = g.getVideoId();
                aone aoneVar4 = aqmlVar.a;
                aoneVar4.copyOnWrite();
                aqmo aqmoVar5 = (aqmo) aoneVar4.instance;
                videoId.getClass();
                aqmoVar5.c |= 2;
                aqmoVar5.e = videoId;
                String h = this.c.h(g.getPublishedTimestampMillis().longValue());
                aone aoneVar5 = aqmlVar.a;
                aoneVar5.copyOnWrite();
                aqmo aqmoVar6 = (aqmo) aoneVar5.instance;
                h.getClass();
                aqmoVar6.c |= 1024;
                aqmoVar6.n = h;
                String str2 = g.getLocalizedStrings().c;
                aone aoneVar6 = aqmlVar.a;
                aoneVar6.copyOnWrite();
                aqmo aqmoVar7 = (aqmo) aoneVar6.instance;
                str2.getClass();
                aqmoVar7.c |= 512;
                aqmoVar7.m = str2;
                aone createBuilder2 = apjq.a.createBuilder();
                String string = this.a.getString(R.string.offline_button_complete_text);
                createBuilder2.copyOnWrite();
                apjq apjqVar = (apjq) createBuilder2.instance;
                string.getClass();
                apjqVar.b = 1 | apjqVar.b;
                apjqVar.c = string;
                apjq[] apjqVarArr = {(apjq) createBuilder2.build()};
                for (int i = 0; i <= 0; i++) {
                    apjq apjqVar2 = apjqVarArr[i];
                    aone aoneVar7 = aqmlVar.a;
                    aoneVar7.copyOnWrite();
                    aqmo aqmoVar8 = (aqmo) aoneVar7.instance;
                    apjqVar2.getClass();
                    aony aonyVar = aqmoVar8.o;
                    if (!aonyVar.c()) {
                        aqmoVar8.o = aonm.mutableCopy(aonyVar);
                    }
                    aqmoVar8.o.add(apjqVar2);
                }
                if (!l) {
                    avgg thumbnail = g.getThumbnail();
                    aone aoneVar8 = aqmlVar.a;
                    aoneVar8.copyOnWrite();
                    aqmo aqmoVar9 = (aqmo) aoneVar8.instance;
                    thumbnail.getClass();
                    aqmoVar9.k = thumbnail;
                    aqmoVar9.c |= 128;
                    if (f2 != null && (f2.b.c & 16) != 0) {
                        avgg avatar = f2.getAvatar();
                        aone aoneVar9 = aqmlVar.a;
                        aoneVar9.copyOnWrite();
                        aqmo aqmoVar10 = (aqmo) aoneVar9.instance;
                        avatar.getClass();
                        aqmoVar10.p = avatar;
                        aqmoVar10.c |= 2048;
                    }
                }
                if (!k) {
                    Integer lengthSeconds = g.getLengthSeconds();
                    aone aoneVar10 = aqmlVar.a;
                    int intValue2 = lengthSeconds.intValue();
                    aoneVar10.copyOnWrite();
                    aqmo aqmoVar11 = (aqmo) aoneVar10.instance;
                    aqmoVar11.c |= 16;
                    aqmoVar11.h = intValue2;
                }
                aqmlVar.a(c);
            }
        }
        return jpg.a(aqmlVar.a(c));
    }

    @Override // defpackage.jpi
    public final ammv d(String str) {
        awas z = etx.z(str, this.d);
        return z == null ? amlr.a : ammv.j(fhe.h(z.c));
    }

    @Override // defpackage.jpi
    public final amsx e(String str) {
        awas z = etx.z(str, this.d);
        if (z == null) {
            return amvs.a;
        }
        String str2 = z.c;
        String h = fhe.h(str2);
        String y = fhe.y(str2);
        HashSet ap = amkq.ap(this.e.G(h), this.e.G(y), this.e.G(fhe.q(str2)), this.e.G(fhe.A(str2)), this.e.G(fhe.l(str2)));
        awjp awjpVar = (awjp) this.b.c().f(y).g(awjp.class).X();
        String g = awjpVar != null ? awjpVar.g() : null;
        if (g != null) {
            ap.add(this.e.G(g));
        }
        return amsx.p(ap);
    }

    @Override // defpackage.jpi
    public final Class f() {
        return awil.class;
    }

    @Override // defpackage.jpi
    public final Class g() {
        return aqmn.class;
    }

    @Override // defpackage.jpi
    public final aajc h(String str) {
        return new aajc(2, str);
    }
}
