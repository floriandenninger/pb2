package defpackage;

import android.text.TextUtils;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fjo implements View.OnClickListener {
    private final fjs a;
    private final agyr b;
    private final aahd c;
    private final String d;
    private final atsb e;
    private final apmg f;
    private final azrw g;
    private final azrw h;
    private final acra i;

    public fjo(fjs fjsVar, agyr agyrVar, aahd aahdVar, String str, atsb atsbVar, apmg apmgVar, azrw azrwVar, azrw azrwVar2, acra acraVar) {
        this.a = fjsVar;
        this.b = agyrVar;
        this.c = aahdVar;
        this.d = str;
        this.e = atsbVar;
        this.f = apmgVar;
        this.g = azrwVar;
        this.h = azrwVar2;
        this.i = acraVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (TextUtils.isEmpty(this.d)) {
            return;
        }
        apmg apmgVar = this.f;
        if (apmgVar != null) {
            if ((apmgVar.b & 16384) != 0) {
                aahd aahdVar = this.c;
                apxf apxfVar = apmgVar.o;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
                return;
            }
            return;
        }
        if (!this.a.i(this.d)) {
            this.b.j(this.d, this.e, this.i, null);
            return;
        }
        if (((Boolean) this.g.get()).booleanValue()) {
            this.b.g(this.d);
        } else if (((Boolean) this.h.get()).booleanValue()) {
            this.b.f(this.d, agyg.a(true));
        } else {
            this.b.a(this.d, agyg.a(true));
        }
    }
}
