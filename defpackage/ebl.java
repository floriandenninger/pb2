package defpackage;

import android.app.Activity;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebl extends ecl {
    private final Activity h;
    private final View i;

    public ebl(ebe ebeVar, aone aoneVar, int i, View view, Activity activity) {
        super(ebeVar, "h8EVC95dwYnFQkP2MhkDIC/tXo0ux4wCcOlQmWH2MzSwaPfcZ/24kCQO32wp6PV0", "0H2C2EeQe84lGZgr+dAw2Fmmx+KWvzkBWNdP/wQOLp8=", aoneVar, i, 62);
        this.i = view;
        this.h = activity;
    }

    @Override // defpackage.ecl
    protected final void a() {
        if (this.i == null) {
            return;
        }
        boolean booleanValue = ((Boolean) pyi.l.e()).booleanValue();
        Object[] objArr = (Object[]) this.d.invoke(null, this.i, this.h, Boolean.valueOf(booleanValue));
        synchronized (this.g) {
            aone aoneVar = this.g;
            long longValue = ((Long) objArr[0]).longValue();
            aoneVar.copyOnWrite();
            dvo dvoVar = (dvo) aoneVar.instance;
            dvo dvoVar2 = dvo.a;
            dvoVar.c |= 67108864;
            dvoVar.V = longValue;
            aone aoneVar2 = this.g;
            long longValue2 = ((Long) objArr[1]).longValue();
            aoneVar2.copyOnWrite();
            dvo dvoVar3 = (dvo) aoneVar2.instance;
            dvoVar3.c |= 134217728;
            dvoVar3.W = longValue2;
            if (booleanValue) {
                aone aoneVar3 = this.g;
                String str = (String) objArr[2];
                aoneVar3.copyOnWrite();
                dvo dvoVar4 = (dvo) aoneVar3.instance;
                str.getClass();
                dvoVar4.c |= 268435456;
                dvoVar4.X = str;
            }
        }
    }
}
