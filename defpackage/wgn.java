package defpackage;

import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wgn extends akgj {
    private final wej h;
    private final boolean i;
    private final aahd j;
    private final aoae k;

    public wgn(SwitchPreference switchPreference, akgk akgkVar, akgl akglVar, aupu aupuVar, aoae aoaeVar, wej wejVar, aahd aahdVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(switchPreference, akgkVar, akglVar, aupuVar);
        this.k = aoaeVar;
        this.h = wejVar;
        this.i = z;
        this.j = aahdVar;
    }

    @Override // defpackage.akgj, defpackage.bry
    public final boolean a(Preference preference, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            apxf apxfVar = this.b.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand)) {
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.h);
                aahd aahdVar = this.j;
                apxf apxfVar2 = this.b.h;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar.c(apxfVar2, hashMap);
                return false;
            }
        }
        boolean a = super.a(preference, obj);
        this.k.t(this.i, !((TwoStatePreference) this.a).a);
        return a;
    }
}
