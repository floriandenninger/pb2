package com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service;

import com.google.android.apps.youtube.embeddedplayer.service.model.AdEventData;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import defpackage.aaea;
import defpackage.acpl;
import defpackage.afsi;
import defpackage.ahej;
import defpackage.aqsa;
import defpackage.aqsb;
import defpackage.aqsc;
import defpackage.aqsd;
import defpackage.arpn;
import defpackage.arpp;
import defpackage.xac;
import defpackage.xad;
import defpackage.xaf;
import defpackage.xag;
import defpackage.xce;
import defpackage.xfn;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements ypd {
    public final aaea a;
    int b = 2;
    public boolean c;
    private final acpl d;
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.service.a e;
    private final String f;
    private String g;

    public b(com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar, acpl acplVar, String str, aaea aaeaVar) {
        this.e = aVar;
        this.d = acplVar;
        this.f = str;
        this.a = aaeaVar;
    }

    private final void a(int i, int i2) {
        aqsb aqsbVar;
        aqsa aqsaVar;
        if (i == 0) {
            aqsbVar = aqsb.EMBEDS_AD_EVENT_TYPE_AD_STARTED;
        } else if (i == 1) {
            aqsbVar = aqsb.EMBEDS_AD_EVENT_TYPE_AD_COMPLETED;
        } else if (i == 2) {
            aqsbVar = aqsb.EMBEDS_AD_EVENT_TYPE_AD_SKIPPED;
        } else if (i == 3) {
            aqsbVar = aqsb.EMBEDS_AD_EVENT_TYPE_AD_CLICKED;
        } else if (i == 4) {
            aqsbVar = aqsb.EMBEDS_AD_EVENT_TYPE_AD_PAUSED;
        } else if (i != 5) {
            aqsbVar = aqsb.EMBEDS_AD_EVENT_TYPE_AD_SUSPENDED;
        } else {
            aqsbVar = aqsb.EMBEDS_AD_EVENT_TYPE_AD_RESUMED;
        }
        if (i2 == 1) {
            aqsaVar = aqsa.EMBEDS_AD_BREAK_TYPE_PRE_ROLL;
        } else if (i2 == 2) {
            aqsaVar = aqsa.EMBEDS_AD_BREAK_TYPE_MID_ROLL;
        } else if (i2 == 3) {
            aqsaVar = aqsa.EMBEDS_AD_BREAK_TYPE_POST_ROLL;
        } else {
            aqsaVar = aqsa.EMBEDS_AD_BREAK_TYPE_UNKNOWN;
        }
        aqsc a = aqsd.a();
        a.copyOnWrite();
        ((aqsd) a.instance).g(aqsbVar);
        a.copyOnWrite();
        ((aqsd) a.instance).f(aqsaVar);
        String str = this.f;
        a.copyOnWrite();
        ((aqsd) a.instance).h(str);
        aqsd aqsdVar = (aqsd) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).cu(aqsdVar);
        arpp arppVar = (arpp) a2.build();
        if (this.c) {
            this.d.c(arppVar);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        int i2 = 4;
        int i3 = 3;
        int i4 = 1;
        if (i == -1) {
            return new Class[]{xac.class, xad.class, xag.class, ahej.class};
        }
        if (i == 0) {
            com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar = this.e;
            com.google.android.apps.youtube.embeddedplayer.service.model.a c = AdEventData.c();
            c.c(3);
            c.b(0);
            c.a = this.g;
            aVar.a(c.a());
            a(3, 0);
            return null;
        }
        if (i == 1) {
            xad xadVar = (xad) obj;
            if (xadVar.a() != xce.USER_SKIPPED && xadVar.a() != xce.VIDEO_ENDED) {
                return null;
            }
            this.b = 2;
            xfn xfnVar = xfn.PRE_ROLL;
            int ordinal = xadVar.a().ordinal();
            if (ordinal != 0) {
                if (ordinal != 3) {
                    String valueOf = String.valueOf(xadVar.a());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                    sb.append("Unexpected AdCompleteEvent reason value: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                i4 = 2;
            }
            PlayerAd b = xadVar.b();
            String str = b != null ? b.g : "";
            com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar2 = this.e;
            com.google.android.apps.youtube.embeddedplayer.service.model.a c2 = AdEventData.c();
            c2.c(i4);
            c2.b(0);
            c2.a = str;
            aVar2.a(c2.a());
            a(i4, 0);
            return null;
        }
        if (i == 2) {
            xag xagVar = (xag) obj;
            if (xagVar.a() != xaf.AD_VIDEO_PLAY_REQUESTED) {
                return null;
            }
            PlayerAd c3 = xagVar.c();
            if (c3 != null) {
                this.g = c3.g;
            }
            this.b = 0;
            xce xceVar = xce.VIDEO_ENDED;
            xfn xfnVar2 = xfn.PRE_ROLL;
            int ordinal2 = xagVar.b().ordinal();
            if (ordinal2 == 0) {
                i3 = 1;
            } else if (ordinal2 == 1) {
                i3 = 2;
            } else if (ordinal2 != 2) {
                String valueOf2 = String.valueOf(xagVar.b());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 52);
                sb2.append("AdVideoStageEvent contains an unexpected BreakType: ");
                sb2.append(valueOf2);
                afsi.b(1, 4, sb2.toString());
                i3 = 0;
            }
            com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar3 = this.e;
            com.google.android.apps.youtube.embeddedplayer.service.model.a c4 = AdEventData.c();
            c4.c(0);
            c4.b(i3);
            c4.a = this.g;
            aVar3.a(c4.a());
            a(0, i3);
            return null;
        }
        if (i == 3) {
            ahej ahejVar = (ahej) obj;
            if (this.b == 2) {
                return null;
            }
            int a = ahejVar.a();
            if (a != 2) {
                if (a == 3) {
                    this.b = 1;
                } else {
                    if (a != 4 && a != 7 && a != 8) {
                        return null;
                    }
                    this.b = 2;
                    i2 = 6;
                }
            } else {
                if (this.b != 1) {
                    return null;
                }
                this.b = 0;
                i2 = 5;
            }
            com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar4 = this.e;
            com.google.android.apps.youtube.embeddedplayer.service.model.a c5 = AdEventData.c();
            c5.c(i2);
            c5.b(0);
            c5.a = this.g;
            aVar4.a(c5.a());
            a(i2, 0);
            return null;
        }
        StringBuilder sb3 = new StringBuilder(32);
        sb3.append("unsupported op code: ");
        sb3.append(i);
        throw new IllegalStateException(sb3.toString());
    }
}
