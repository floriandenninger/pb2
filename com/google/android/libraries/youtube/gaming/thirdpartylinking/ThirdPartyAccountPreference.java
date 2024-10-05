package com.google.android.libraries.youtube.gaming.thirdpartylinking;

import android.app.Activity;
import android.net.Uri;
import android.text.Spanned;
import androidx.preference.Preference;
import com.google.android.libraries.youtube.gaming.thirdpartylinking.ThirdPartyAccountPreference;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingRendererOuterClass;
import defpackage.aahd;
import defpackage.aahv;
import defpackage.aalt;
import defpackage.ahbw;
import defpackage.aii;
import defpackage.ajcq;
import defpackage.ajjz;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.aqzy;
import defpackage.arau;
import defpackage.aulq;
import defpackage.avgg;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrm;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.brz;
import defpackage.zxi;
import defpackage.zzp;
import defpackage.zzu;
import defpackage.zzv;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ThirdPartyAccountPreference extends Preference {
    public arau a;
    public final aahd b;
    private final aahv c;
    private ayqx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdPartyAccountPreference(Activity activity, aahd aahdVar, ajjz ajjzVar, aahv aahvVar, arau arauVar) {
        super(activity, null);
        aqyg aqygVar = null;
        this.b = aahdVar;
        this.a = arauVar;
        this.c = aahvVar;
        if ((arauVar.b & 1) != 0 && (aqygVar = arauVar.c) == null) {
            aqygVar = aqyg.a;
        }
        M(ajcq.b(aqygVar));
        k(new zzp(this, 0));
        this.o = new brz() { // from class: zzo
            @Override // defpackage.brz
            public final boolean b(Preference preference) {
                ThirdPartyAccountPreference thirdPartyAccountPreference = ThirdPartyAccountPreference.this;
                thirdPartyAccountPreference.k(new zzp(thirdPartyAccountPreference, 1));
                return true;
            }
        };
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.third_party_icon_size);
        avgg avggVar = arauVar.f;
        Uri D = ahbw.D(avggVar == null ? avgg.a : avggVar, dimensionPixelSize);
        if (D != null) {
            H(aii.a(activity, R.drawable.third_party_icon_placeholder));
            ajjzVar.l(D, new zzu(this, activity));
        }
        if ((arauVar.b & 512) != 0) {
            this.d = aahvVar.c().h(arauVar.j, false).ab(ayqr.a()).ay(new ayrs() { // from class: zzs
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    ThirdPartyAccountPreference thirdPartyAccountPreference = ThirdPartyAccountPreference.this;
                    aakt aaktVar = ((aakz) obj).c;
                    if (aaktVar instanceof aoug) {
                        thirdPartyAccountPreference.l(((aoug) aaktVar).getLinked().booleanValue());
                    } else {
                        zga.b("Entity update does not have account link status.");
                    }
                }
            }, zxi.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void C() {
        super.P();
        Object obj = this.d;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.d = null;
        }
    }

    public final void l(boolean z) {
        Spanned b;
        aqyg aqygVar = null;
        if (z) {
            arau arauVar = this.a;
            if ((arauVar.b & 2) != 0 && (aqygVar = arauVar.d) == null) {
                aqygVar = aqyg.a;
            }
            b = ajcq.b(aqygVar);
        } else {
            arau arauVar2 = this.a;
            if ((arauVar2.b & 4) != 0 && (aqygVar = arauVar2.e) == null) {
                aqygVar = aqyg.a;
            }
            b = ajcq.b(aqygVar);
        }
        n(b);
    }

    public final void k(final zzv zzvVar) {
        String str;
        String d;
        arau arauVar = this.a;
        int i = arauVar.b;
        if ((i & 512) != 0) {
            d = arauVar.j;
        } else {
            if ((i & 1024) == 0) {
                apxf apxfVar = arauVar.h;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aulq aulqVar = ((GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand) apxfVar.pX(GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.gamingAccountLinkSettingCommand)).c;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                str = ((aqzy) aulqVar.pX(GamingAccountLinkSettingRendererOuterClass.gamingAccountLinkSettingRenderer)).h;
            } else {
                str = arauVar.k;
            }
            d = aalt.d(122, str);
        }
        this.c.c().f(d).z(ayqr.a()).o(new ayrs() { // from class: zzr
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                zzv.this.a(((aoug) ((aakt) obj)).getLinked().booleanValue());
            }
        }).l(new ayrm() { // from class: zzq
            @Override // defpackage.ayrm
            public final void a() {
                zzvVar.a(ThirdPartyAccountPreference.this.a.g);
            }
        }).T();
    }
}
