package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import androidx.preference.Preference;
import com.google.android.apps.youtube.app.settings.DigestNotificationPreference;
import com.google.android.apps.youtube.app.settings.QuietHoursNotificationPreference;
import com.google.android.libraries.youtube.gaming.thirdpartylinking.ThirdPartyAccountPreference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lld extends wgo {
    private final zzw i;
    private final ajyw j;
    private final ajyw k;

    public lld(Context context, aahd aahdVar, acra acraVar, llc llcVar, akgl akglVar, ajyw ajywVar, ajyw ajywVar2, zzw zzwVar, wfv wfvVar, aoae aoaeVar, afsy afsyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context, aahdVar, acraVar, llcVar, akglVar, wfvVar, aoaeVar, afsyVar, null, null, null, null);
        this.k = ajywVar;
        this.j = ajywVar2;
        this.i = zzwVar;
    }

    @Override // defpackage.wgo, defpackage.akgk
    public final Preference a(aupw aupwVar, String str) {
        Spanned b;
        Spanned b2;
        aupu aupuVar = aupwVar.e;
        if (aupuVar == null) {
            aupuVar = aupu.a;
        }
        int bx = aobq.bx(aupuVar.c);
        aqyg aqygVar = null;
        if (bx == 0 || bx != 271) {
            int bx2 = aobq.bx(aupuVar.c);
            if (bx2 == 0 || bx2 != 274) {
                if ((aupwVar.b & 1024) == 0) {
                    return super.a(aupwVar, str);
                }
                zzw zzwVar = this.i;
                arau arauVar = aupwVar.n;
                if (arauVar == null) {
                    arauVar = arau.a;
                }
                arau arauVar2 = arauVar;
                Activity activity = (Activity) zzwVar.a.get();
                activity.getClass();
                aahd aahdVar = (aahd) zzwVar.b.get();
                aahdVar.getClass();
                ajjz ajjzVar = (ajjz) zzwVar.c.get();
                ajjzVar.getClass();
                aahv aahvVar = (aahv) zzwVar.d.get();
                aahvVar.getClass();
                arauVar2.getClass();
                ThirdPartyAccountPreference thirdPartyAccountPreference = new ThirdPartyAccountPreference(activity, aahdVar, ajjzVar, aahvVar, arauVar2);
                thirdPartyAccountPreference.Z();
                return thirdPartyAccountPreference;
            }
            ajyw ajywVar = this.j;
            Context context = (Context) ajywVar.a.get();
            context.getClass();
            lqa lqaVar = (lqa) ajywVar.b.get();
            lqaVar.getClass();
            acqz acqzVar = (acqz) ajywVar.c.get();
            acqzVar.getClass();
            aupuVar.getClass();
            QuietHoursNotificationPreference quietHoursNotificationPreference = new QuietHoursNotificationPreference(context, lqaVar, acqzVar, aupuVar);
            if ((aupuVar.b & 16) != 0) {
                aqyg aqygVar2 = aupuVar.d;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                quietHoursNotificationPreference.M(ajcq.b(aqygVar2));
            }
            if (aupuVar.g && (aupuVar.b & 4096) != 0) {
                aqyg aqygVar3 = aupuVar.k;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                b = ajcq.b(aqygVar3);
            } else if (aupuVar.f || (aupuVar.b & 2048) == 0) {
                if ((aupuVar.b & 32) != 0 && (aqygVar = aupuVar.e) == null) {
                    aqygVar = aqyg.a;
                }
                b = ajcq.b(aqygVar);
            } else {
                aqyg aqygVar4 = aupuVar.j;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
                b = ajcq.b(aqygVar4);
            }
            quietHoursNotificationPreference.n(b);
            quietHoursNotificationPreference.Z();
            return quietHoursNotificationPreference;
        }
        ajyw ajywVar2 = this.k;
        Context context2 = (Context) ajywVar2.a.get();
        context2.getClass();
        lpu lpuVar = (lpu) ajywVar2.b.get();
        lpuVar.getClass();
        acqz acqzVar2 = (acqz) ajywVar2.c.get();
        acqzVar2.getClass();
        aupuVar.getClass();
        DigestNotificationPreference digestNotificationPreference = new DigestNotificationPreference(context2, lpuVar, acqzVar2, aupuVar);
        if ((aupuVar.b & 16) != 0) {
            aqyg aqygVar5 = aupuVar.d;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
            digestNotificationPreference.M(ajcq.b(aqygVar5));
        }
        if (aupuVar.g && (aupuVar.b & 4096) != 0) {
            aqyg aqygVar6 = aupuVar.k;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            b2 = ajcq.b(aqygVar6);
        } else if (aupuVar.f || (aupuVar.b & 2048) == 0) {
            if ((aupuVar.b & 32) != 0 && (aqygVar = aupuVar.e) == null) {
                aqygVar = aqyg.a;
            }
            b2 = ajcq.b(aqygVar);
        } else {
            aqyg aqygVar7 = aupuVar.j;
            if (aqygVar7 == null) {
                aqygVar7 = aqyg.a;
            }
            b2 = ajcq.b(aqygVar7);
        }
        digestNotificationPreference.n(b2);
        digestNotificationPreference.Z();
        return digestNotificationPreference;
    }
}
