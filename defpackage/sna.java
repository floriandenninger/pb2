package defpackage;

import j$.time.Instant;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sna implements swv {
    final axpg a;
    private final /* synthetic */ int b;

    public sna(axpg axpgVar, int i) {
        this.b = i;
        this.a = axpgVar;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    public final aomu a() {
        int i = this.b;
        if (i == 0) {
            return avex.b;
        }
        if (i != 1) {
            return i != 2 ? awpv.b : awpo.b;
        }
        return auyg.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, swu swuVar) {
        boolean contains;
        int i = this.b;
        if (i == 0) {
            final avex avexVar = (avex) obj;
            return ((ajfd) this.a.get()).a().c(ayph.k(new Callable() { // from class: smy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    sna snaVar = sna.this;
                    avex avexVar2 = avexVar;
                    if (avexVar2.c) {
                        final ajfd ajfdVar = (ajfd) snaVar.a.get();
                        ajfdVar.b(false);
                        int size = avexVar2.d.size();
                        StringBuilder sb = new StringBuilder(33);
                        sb.append("TextToSpeechController");
                        sb.append(size - 1);
                        final String sb2 = sb.toString();
                        ayph j = ayph.j(new aypj() { // from class: smw
                            @Override // defpackage.aypj
                            public final void a(ayue ayueVar) {
                                String str = sb2;
                                final ajfd ajfdVar2 = ajfdVar;
                                final smz smzVar = new smz(str, ayueVar);
                                ayrz.f(ayueVar, aynu.e(new ayrm() { // from class: smx
                                    @Override // defpackage.ayrm
                                    public final void a() {
                                        ajfd ajfdVar3 = ajfd.this;
                                        ajfdVar3.a.f.k(smzVar);
                                    }
                                }));
                                ajfdVar2.a.f.j(smzVar);
                            }
                        });
                        yzm yzmVar = ajfdVar.a;
                        yzmVar.b(false);
                        for (ajfe ajfeVar : yzmVar.e) {
                            ((acqq) ajfeVar.b).D(new acqx(acrb.WEB_LINK_TTSBUTTON_PLAY));
                            ajfeVar.b.I(3, new acqx(acrb.WEB_LINK_TTSBUTTON_PLAY), null);
                            aneu aneuVar = aneu.a;
                            ajfeVar.c = Instant.now();
                        }
                        String str = "";
                        for (int i2 = 0; i2 < avexVar2.d.size(); i2++) {
                            StringBuilder sb3 = new StringBuilder(33);
                            sb3.append("TextToSpeechController");
                            sb3.append(i2);
                            String sb4 = sb3.toString();
                            if (avexVar2.f.size() > i2) {
                                String str2 = (String) avexVar2.f.get(i2);
                                if (!str.equals(str2)) {
                                    Locale locale = new Locale(str2);
                                    yzm yzmVar2 = ajfdVar.a;
                                    if (yzmVar2.a.isLanguageAvailable(locale) >= 0) {
                                        yzmVar2.a.setLanguage(locale);
                                    } else {
                                        zga.l("TTS Locale is not available");
                                    }
                                    str = str2;
                                }
                            }
                            ajfdVar.a.a((String) avexVar2.d.get(i2), 1, sb4);
                            if (avexVar2.e.size() > i2) {
                                aoms aomsVar = (aoms) avexVar2.e.get(i2);
                                ajfdVar.a.a.playSilentUtterance(Math.round((aomsVar.b * 1000) + (aomsVar.c / 1000)), 1, sb4);
                            }
                        }
                        return j;
                    }
                    ((ajfd) snaVar.a.get()).b(true);
                    return ayph.f();
                }
            }));
        }
        if (i == 1) {
            final byte[] bArr = null;
            return ((ajfd) this.a.get()).a().c(ayph.k(new Callable(bArr) { // from class: smv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ((ajfd) sna.this.a.get()).b(false);
                    return ayph.f();
                }
            }));
        }
        if (i == 2) {
            awpo awpoVar = (awpo) obj;
            sww swwVar = (sww) this.a.get();
            if (awpoVar.c.length() > 0) {
                String str = awpoVar.c;
                synchronized (tai.a) {
                    contains = tai.a.contains(str);
                }
                if (contains) {
                    return ayph.f();
                }
            }
            String str2 = awpoVar.c;
            synchronized (tai.a) {
                tai.a.add(str2);
            }
            awnw awnwVar = awpoVar.d;
            if (awnwVar == null) {
                awnwVar = awnw.a;
            }
            return swwVar.d(awnwVar, swuVar, 1);
        }
        awpv awpvVar = (awpv) obj;
        sww swwVar2 = (sww) this.a.get();
        if (awpvVar.c.size() > 0) {
            return ayph.h(aypn.w(awpvVar.c).A(new sty(swwVar2, swuVar, 2)));
        }
        return ayph.f();
    }
}
