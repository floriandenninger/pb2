package defpackage;

import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class zdw extends bsk {
    public Map aD;
    public zaw aE;

    private final void aJ(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || preferenceGroup.k() <= 0) {
            return;
        }
        int k = preferenceGroup.k();
        while (true) {
            k--;
            if (k < 0) {
                return;
            }
            Object o = preferenceGroup.o(k);
            if (o instanceof PreferenceGroup) {
                aJ((PreferenceGroup) o);
            } else if (o instanceof zdx) {
                zdx zdxVar = (zdx) o;
                zdxVar.ag(this);
                zdxVar.af(this.aE);
                zdxVar.ah(this.aD);
            }
        }
    }

    @Override // defpackage.bsk
    public final void aF(PreferenceScreen preferenceScreen) {
        aJ(preferenceScreen);
        super.aF(preferenceScreen);
    }
}
