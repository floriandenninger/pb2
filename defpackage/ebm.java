package defpackage;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebm extends ecl {
    public ebm(ebe ebeVar, aone aoneVar, int i) {
        super(ebeVar, "pECbn1i7ArZz8HseR71ZVkvFfTp84DNv2haWC1WmGQudMO74UcIxEa2NyELtzZhK", "LbaQh8VAFWEQeupBiMdSh8EgMse5yKT8p6jkCYTG+aQ=", aoneVar, i, 49);
    }

    @Override // defpackage.ecl
    protected final void a() {
        aone aoneVar = this.g;
        aoneVar.copyOnWrite();
        dvo dvoVar = (dvo) aoneVar.instance;
        dvo dvoVar2 = dvo.a;
        dvoVar.K = 2;
        dvoVar.c |= 2048;
        try {
            boolean booleanValue = ((Boolean) this.d.invoke(null, this.a.a)).booleanValue();
            aone aoneVar2 = this.g;
            int i = true != booleanValue ? 1 : 2;
            aoneVar2.copyOnWrite();
            dvo dvoVar3 = (dvo) aoneVar2.instance;
            dvoVar3.K = i - 1;
            dvoVar3.c |= 2048;
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
