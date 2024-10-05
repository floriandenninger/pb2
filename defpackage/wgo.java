package defpackage;

import android.content.Context;
import android.text.Spanned;
import androidx.preference.DialogPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.libraries.youtube.account.inlineauth.settings.QuickPurchaseAuthMethodPreference;
import com.google.android.libraries.youtube.account.inlineauth.settings.QuickPurchaseEnabledPreference;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class wgo extends akgk {
    public final wfv a;
    public final akgl b;
    private final aoae i;

    public wgo(Context context, aahd aahdVar, acra acraVar, llc llcVar, akgl akglVar, wfv wfvVar, aoae aoaeVar, afsy afsyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(context, aahdVar, acraVar, llcVar, akglVar, afsyVar);
        this.a = wfvVar;
        this.i = aoaeVar;
        this.b = akglVar;
    }

    @Override // defpackage.akgk
    public Preference a(aupw aupwVar, String str) {
        int bx;
        int bx2;
        int bx3;
        Spanned b;
        aupu aupuVar = aupwVar.e;
        if (aupuVar == null) {
            aupuVar = aupu.a;
        }
        final auqh auqhVar = aupwVar.h;
        if (auqhVar == null) {
            auqhVar = auqh.a;
        }
        int bx4 = aobq.bx(aupuVar.c);
        if ((bx4 != 0 && bx4 == 290) || (((bx = aobq.bx(aupuVar.c)) != 0 && bx == 289) || ((bx2 = aobq.bx(aupuVar.c)) != 0 && bx2 == 225))) {
            aupu aupuVar2 = aupwVar.e;
            if (aupuVar2 == null) {
                aupuVar2 = aupu.a;
            }
            aupu aupuVar3 = aupuVar2;
            int bx5 = aobq.bx(aupuVar.c);
            boolean z = (bx5 != 0 && bx5 == 289) || ((bx3 = aobq.bx(aupuVar.c)) != 0 && bx3 == 225);
            QuickPurchaseEnabledPreference quickPurchaseEnabledPreference = new QuickPurchaseEnabledPreference(this.c, z, this.i, this.b, aupuVar3, null, null, null, null);
            if ((aupuVar3.b & 16) != 0) {
                aqyg aqygVar = aupuVar3.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                quickPurchaseEnabledPreference.M(ajcq.b(aqygVar));
            }
            quickPurchaseEnabledPreference.y = Boolean.valueOf(aupuVar3.f);
            quickPurchaseEnabledPreference.n = new wgn(quickPurchaseEnabledPreference, this, this.b, aupuVar3, this.i, quickPurchaseEnabledPreference, this.d, z, null, null, null, null);
            quickPurchaseEnabledPreference.G(!aupuVar3.g);
            if (aupuVar3.g && (aupuVar3.b & 4096) != 0) {
                aqyg aqygVar2 = aupuVar3.k;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                b = ajcq.b(aqygVar2);
            } else if (aupuVar3.f || (aupuVar3.b & 2048) == 0) {
                aqyg aqygVar3 = aupuVar3.e;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                b = ajcq.b(aqygVar3);
            } else {
                aqyg aqygVar4 = aupuVar3.j;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
                b = ajcq.b(aqygVar4);
            }
            quickPurchaseEnabledPreference.n(b);
            this.i.b.add(quickPurchaseEnabledPreference);
            quickPurchaseEnabledPreference.Z();
            return quickPurchaseEnabledPreference;
        }
        int bx6 = aobq.bx(auqhVar.c);
        if (bx6 == 0 || bx6 != 291) {
            return super.a(aupwVar, str);
        }
        final QuickPurchaseAuthMethodPreference quickPurchaseAuthMethodPreference = new QuickPurchaseAuthMethodPreference(this.c, this.b);
        if ((auqhVar.b & 2) != 0) {
            aqyg aqygVar5 = auqhVar.d;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
            quickPurchaseAuthMethodPreference.M(ajcq.b(aqygVar5));
            aqyg aqygVar6 = auqhVar.d;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            ((DialogPreference) quickPurchaseAuthMethodPreference).a = ajcq.b(aqygVar6);
            quickPurchaseAuthMethodPreference.I("billing_quick_purchase_auth_preference");
        }
        if ((auqhVar.b & 4) != 0) {
            aqyg aqygVar7 = auqhVar.e;
            if (aqygVar7 == null) {
                aqygVar7 = aqyg.a;
            }
            quickPurchaseAuthMethodPreference.n(ajcq.b(aqygVar7));
        }
        final List aU = amkq.aU(amkq.aP(amkq.bg(auqhVar.f, new ammy() { // from class: wgm
            @Override // defpackage.ammy
            public final boolean a(Object obj) {
                auqd auqdVar = (auqd) obj;
                return auqdVar.b == 64166933 && (!"FINGERPRINT".equalsIgnoreCase((auqdVar.b == 64166933 ? (auqc) auqdVar.c : auqc.a).c) || wgo.this.a.a());
            }
        })), wgr.b);
        int i = 0;
        while (true) {
            if (i >= aU.size()) {
                i = -1;
                break;
            }
            if ("FINGERPRINT".equalsIgnoreCase(((auqc) aU.get(i)).c)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            quickPurchaseAuthMethodPreference.G = i;
            quickPurchaseAuthMethodPreference.H = aU;
        }
        CharSequence[] charSequenceArr = new CharSequence[aU.size()];
        CharSequence[] charSequenceArr2 = new CharSequence[aU.size()];
        int i2 = -1;
        for (int i3 = 0; i3 < aU.size(); i3++) {
            auqc auqcVar = (auqc) aU.get(i3);
            charSequenceArr[i3] = auqcVar.c;
            charSequenceArr2[i3] = auqcVar.e;
            if (true == this.b.h(auqcVar)) {
                i2 = i3;
            }
        }
        ((ListPreference) quickPurchaseAuthMethodPreference).g = charSequenceArr;
        ((ListPreference) quickPurchaseAuthMethodPreference).h = charSequenceArr2;
        if (i2 != -1) {
            quickPurchaseAuthMethodPreference.f(i2 != -1 ? i2 : -1);
            quickPurchaseAuthMethodPreference.n(quickPurchaseAuthMethodPreference.l());
        }
        quickPurchaseAuthMethodPreference.n = new bry() { // from class: wgl
            @Override // defpackage.bry
            public final boolean a(Preference preference, Object obj) {
                wgo wgoVar = wgo.this;
                auqh auqhVar2 = auqhVar;
                List list = aU;
                QuickPurchaseAuthMethodPreference quickPurchaseAuthMethodPreference2 = quickPurchaseAuthMethodPreference;
                akgl akglVar = wgoVar.b;
                aahd aahdVar = wgoVar.d;
                String str2 = ((ListPreference) quickPurchaseAuthMethodPreference2).i;
                if (str2 != null && str2.equals(obj)) {
                    return false;
                }
                String obj2 = obj.toString();
                int i4 = 0;
                while (true) {
                    if (i4 >= list.size()) {
                        i4 = -1;
                        break;
                    }
                    if (((auqc) list.get(i4)).e.equals(obj2)) {
                        break;
                    }
                    i4++;
                }
                auqc auqcVar2 = (auqc) list.get(i4);
                if ("FINGERPRINT".equalsIgnoreCase(auqcVar2.c)) {
                    apxf apxfVar = auqcVar2.g;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    if (apxfVar.pY(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", quickPurchaseAuthMethodPreference2);
                        apxf apxfVar2 = auqcVar2.g;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar.c(apxfVar2, hashMap);
                        return false;
                    }
                }
                akmq.b(obj, auqhVar2, wgoVar, akglVar, null);
                return true;
            }
        };
        quickPurchaseAuthMethodPreference.Z();
        return quickPurchaseAuthMethodPreference;
    }
}
