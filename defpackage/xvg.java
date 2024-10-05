package defpackage;

import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class xvg implements View.OnClickListener {
    public final /* synthetic */ xvt a;
    public final /* synthetic */ apmg b;
    public final /* synthetic */ acra c;
    public final /* synthetic */ Map d;
    private final /* synthetic */ int e;

    public /* synthetic */ xvg(xvt xvtVar, apmg apmgVar, acra acraVar, Map map, int i) {
        this.e = i;
        this.a = xvtVar;
        this.b = apmgVar;
        this.c = acraVar;
        this.d = map;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.e == 0) {
            xvt xvtVar = this.a;
            apmg apmgVar = this.b;
            acra acraVar = this.c;
            Map map = this.d;
            int i = apmgVar.b;
            if ((i & 16384) != 0) {
                if ((i & 1048576) != 0) {
                    acraVar.I(3, new acqx(apmgVar.t), null);
                }
                aahd aahdVar = xvtVar.d;
                apxf apxfVar = apmgVar.o;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, map);
                return;
            }
            return;
        }
        this.a.h(this.b, this.c, this.d);
    }
}
