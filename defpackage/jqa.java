package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import j$.time.Duration;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jqa implements jpi {
    private final Context a;
    private final aahv b;
    private final jpf c;
    private final axzg d;
    private final ajoy e;

    public jqa(Context context, aahv aahvVar, ajoy ajoyVar, jpf jpfVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
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
        return 173;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jpi
    public final /* synthetic */ jpg c(aakt aaktVar, String str, jph jphVar) {
        String title;
        aqoz b;
        aqpd e;
        Instant ofEpochSecond;
        String quantityString;
        String quantityString2;
        awil awilVar = (awil) aaktVar;
        aahu c = this.b.c();
        aqoi d = aqoj.d(str);
        if (awilVar != null) {
            atxb f = awilVar.f();
            apjq apjqVar = null;
            aqoz b2 = f != null ? f.b() : null;
            boolean k = this.c.k(awilVar.b(), b2);
            boolean l = this.c.l(awilVar.b(), b2);
            awjp g = awilVar.g();
            if (g != null) {
                awic f2 = g.f();
                avzf b3 = g.b();
                boolean z = (b3 == null || k || this.c.o(awilVar, b3.getLastPlaybackPositionSeconds().longValue())) ? false : true;
                if (l) {
                    title = this.a.getString(R.string.expired_video_title);
                } else {
                    title = g.getTitle();
                }
                d.am(title);
                d.d((l || f2 == null) ? "" : f2.getTitle());
                aong aongVar = (aong) awas.a.createBuilder();
                String videoId = g.getVideoId();
                aongVar.copyOnWrite();
                awas awasVar = (awas) aongVar.instance;
                videoId.getClass();
                awasVar.b |= 1;
                awasVar.c = videoId;
                aongVar.copyOnWrite();
                awas awasVar2 = (awas) aongVar.instance;
                awasVar2.b |= 2;
                awasVar2.d = 155;
                d.c(fhe.f((awas) aongVar.build()));
                d.aj(Integer.valueOf(z ? b3.getLastPlaybackPositionSeconds().intValue() : 0));
                d.ao(g.getVideoId());
                d.ah(true);
                d.ai(Boolean.valueOf(yjk.aa(this.a)));
                d.an(Integer.valueOf(acrb.DOWNLOADS_PAGE_VIDEO.Jk));
                d.ak(this.c.h(g.getPublishedTimestampMillis().longValue()));
                d.aq(g.getLocalizedStrings().c);
                if (!l) {
                    d.al(g.getThumbnail());
                }
                if (!k) {
                    d.ap(g.getLengthSeconds());
                }
                if (!k && !l) {
                    jpf jpfVar = this.c;
                    amrp f3 = amru.f();
                    atxb f4 = awilVar.f();
                    if (f4 != null && (b = f4.b()) != null && !b.getLicenses().isEmpty() && (e = jpf.e(b)) != null) {
                        if (e.f) {
                            aone createBuilder = apjq.a.createBuilder();
                            String string = jpfVar.c.getString(R.string.purchased);
                            createBuilder.copyOnWrite();
                            apjq apjqVar2 = (apjq) createBuilder.instance;
                            string.getClass();
                            apjqVar2.b |= 1;
                            apjqVar2.c = string;
                            apjqVar = (apjq) createBuilder.build();
                        } else {
                            if (b.getPlaybackStartSeconds().longValue() > 0) {
                                ofEpochSecond = Instant.ofEpochSecond(b.getPlaybackStartSeconds().longValue()).plus(Duration.ofSeconds(e.e));
                            } else {
                                ofEpochSecond = Instant.ofEpochSecond(b.getLicenseExpirySeconds().longValue());
                            }
                            Duration between = Duration.between(Instant.ofEpochMilli(jpfVar.d.c()), ofEpochSecond);
                            if (between.compareTo(Duration.ofHours(1L)) < 0) {
                                quantityString = jpfVar.c.getString(R.string.rental_medium_less_than_one_hour_remaining);
                                quantityString2 = jpfVar.c.getString(R.string.rental_long_less_than_one_hour_remaining);
                            } else if (between.compareTo(Duration.ofDays(2L)) < 0) {
                                long hours = between.toHours();
                                Resources resources = jpfVar.c.getResources();
                                int i = (int) hours;
                                Integer valueOf = Integer.valueOf(i);
                                quantityString = resources.getQuantityString(R.plurals.rental_medium_hours_remaining, i, valueOf);
                                quantityString2 = jpfVar.c.getResources().getQuantityString(R.plurals.rental_long_hours_remaining, i, valueOf);
                            } else if (between.compareTo(Duration.ofDays(7L)) < 0) {
                                long days = between.toDays();
                                Resources resources2 = jpfVar.c.getResources();
                                int i2 = (int) days;
                                Integer valueOf2 = Integer.valueOf(i2);
                                quantityString = resources2.getQuantityString(R.plurals.rental_medium_days_remaining, i2, valueOf2);
                                quantityString2 = jpfVar.c.getResources().getQuantityString(R.plurals.rental_long_days_remaining, i2, valueOf2);
                            } else {
                                long days2 = between.toDays();
                                Resources resources3 = jpfVar.c.getResources();
                                int i3 = (int) (days2 / 7);
                                Integer valueOf3 = Integer.valueOf(i3);
                                quantityString = resources3.getQuantityString(R.plurals.rental_medium_weeks_remaining, i3, valueOf3);
                                quantityString2 = jpfVar.c.getResources().getQuantityString(R.plurals.rental_long_weeks_remaining, i3, valueOf3);
                            }
                            String string2 = jpfVar.c.getString(R.string.rented);
                            aone createBuilder2 = apjq.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            apjq apjqVar3 = (apjq) createBuilder2.instance;
                            string2.getClass();
                            apjqVar3.b |= 1;
                            apjqVar3.c = string2;
                            createBuilder2.copyOnWrite();
                            apjq apjqVar4 = (apjq) createBuilder2.instance;
                            quantityString.getClass();
                            apjqVar4.b |= 2;
                            apjqVar4.d = quantityString;
                            StringBuilder sb = new StringBuilder(String.valueOf(string2).length() + 2 + String.valueOf(quantityString2).length());
                            sb.append(string2);
                            sb.append(", ");
                            sb.append(quantityString2);
                            String sb2 = sb.toString();
                            createBuilder2.copyOnWrite();
                            apjq apjqVar5 = (apjq) createBuilder2.instance;
                            sb2.getClass();
                            apjqVar5.b |= 4;
                            apjqVar5.e = sb2;
                            apjqVar = (apjq) createBuilder2.build();
                        }
                    }
                    if (apjqVar != null) {
                        f3.h(apjqVar);
                    }
                    amru g2 = f3.g();
                    if (g2 != null && !g2.isEmpty()) {
                        amxe it = g2.iterator();
                        while (it.hasNext()) {
                            apjq apjqVar6 = (apjq) it.next();
                            aone aoneVar = d.a;
                            aoneVar.copyOnWrite();
                            aqol aqolVar = (aqol) aoneVar.instance;
                            aqol aqolVar2 = aqol.a;
                            apjqVar6.getClass();
                            aony aonyVar = aqolVar.r;
                            if (!aonyVar.c()) {
                                aqolVar.r = aonm.mutableCopy(aonyVar);
                            }
                            aqolVar.r.add(apjqVar6);
                        }
                    }
                }
                d.a(c);
            }
        }
        return jpg.a(d.a(c));
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
        return aqok.class;
    }

    @Override // defpackage.jpi
    public final aajc h(String str) {
        return new aajc(2, str);
    }
}
