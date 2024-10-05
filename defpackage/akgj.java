package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class akgj implements bry {
    protected final SwitchPreference a;
    protected final aupu b;
    protected final akgk c;
    protected final akgl d;
    final afwx e = new akgh(this);
    public boolean f;
    public boolean g;

    public akgj(SwitchPreference switchPreference, akgk akgkVar, akgl akglVar, aupu aupuVar) {
        this.a = switchPreference;
        this.b = aupuVar;
        this.c = akgkVar;
        this.d = akglVar;
    }

    private final void c(boolean z, aqdt aqdtVar) {
        Object obj;
        apxf apxfVar = aqdtVar.r;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        this.f = !apxfVar.pY(FeedbackEndpointOuterClass.feedbackEndpoint);
        akgk akgkVar = this.c;
        Context context = akgkVar.c;
        aahd aahdVar = akgkVar.d;
        acra acraVar = akgkVar.e;
        akgi akgiVar = new akgi(this, z);
        if (!this.f) {
            obj = this.e;
        } else {
            obj = Boolean.valueOf(z);
        }
        ajdf.c(context, aqdtVar, aahdVar, acraVar, akgiVar, obj);
    }

    @Override // defpackage.bry
    public boolean a(Preference preference, Object obj) {
        aqdt aqdtVar;
        aqdt aqdtVar2;
        SwitchPreference switchPreference = this.a;
        if (preference != switchPreference) {
            throw new IllegalArgumentException("SwitchPreferenceChangeListener must be attached to the same SwitchPreference as was used for construction.");
        }
        Boolean bool = (Boolean) obj;
        if (((TwoStatePreference) switchPreference).a == bool.booleanValue()) {
            return true;
        }
        this.c.h.b(akgk.b(this.b).bV);
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            aupu aupuVar = this.b;
            if ((aupuVar.b & 8192) != 0) {
                aupz aupzVar = aupuVar.l;
                if (aupzVar == null) {
                    aupzVar = aupz.a;
                }
                if (aupzVar.b == 64099105) {
                    aqdtVar2 = (aqdt) aupzVar.c;
                } else {
                    aqdtVar2 = aqdt.a;
                }
                c(true, aqdtVar2);
                return false;
            }
        }
        if (!booleanValue) {
            aupu aupuVar2 = this.b;
            if ((aupuVar2.b & 16384) != 0) {
                aupz aupzVar2 = aupuVar2.m;
                if (aupzVar2 == null) {
                    aupzVar2 = aupz.a;
                }
                if (aupzVar2.b == 64099105) {
                    aqdtVar = (aqdt) aupzVar2.c;
                } else {
                    aqdtVar = aqdt.a;
                }
                c(false, aqdtVar);
                return false;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        aqyg aqygVar = null;
        if (booleanValue) {
            aahd aahdVar = this.c.d;
            apxf apxfVar = this.b.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, hashMap);
            aupu aupuVar3 = this.b;
            if ((aupuVar3.b & 32) != 0 && (aqygVar = aupuVar3.e) == null) {
                aqygVar = aqyg.a;
            }
            preference.n(ajcq.b(aqygVar));
        } else {
            aahd aahdVar2 = this.c.d;
            apxf apxfVar2 = this.b.i;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar2.c(apxfVar2, hashMap);
            aupu aupuVar4 = this.b;
            int i = aupuVar4.b & 2048;
            if (i != 0) {
                if (i != 0 && (aqygVar = aupuVar4.j) == null) {
                    aqygVar = aqyg.a;
                }
                preference.n(ajcq.b(aqygVar));
            }
        }
        this.d.d(this.b, booleanValue);
        return true;
    }

    public final void b(boolean z) {
        aqyg aqygVar;
        SwitchPreference switchPreference = this.a;
        aupu aupuVar = this.b;
        if ((aupuVar.b & 32) != 0) {
            aqygVar = aupuVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        switchPreference.n(ajcq.b(aqygVar));
        this.d.d(this.b, z);
        this.a.k(z);
    }
}
