package defpackage;

import android.widget.TextView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gno extends ajyf {
    private final TextView k;
    private final akbu l;

    public gno(aahd aahdVar, akbu akbuVar, ajut ajutVar, aoae aoaeVar, aadw aadwVar, TextView textView, byte[] bArr) {
        super(aahdVar, ajutVar, aoaeVar, aadwVar, textView, null);
        this.l = akbuVar;
        this.k = textView;
    }

    @Override // defpackage.ajyf, defpackage.ajyd
    public final void a(apmg apmgVar, acra acraVar, Map map) {
        arej arejVar;
        super.a(apmgVar, acraVar, map);
        if (apmgVar != null) {
            arel arelVar = apmgVar.m;
            if (arelVar == null) {
                arelVar = arel.a;
            }
            if (arelVar.b == 102716411) {
                akbu akbuVar = this.l;
                arel arelVar2 = apmgVar.m;
                if (arelVar2 == null) {
                    arelVar2 = arel.a;
                }
                if (arelVar2.b == 102716411) {
                    arejVar = (arej) arelVar2.c;
                } else {
                    arejVar = arej.a;
                }
                akbuVar.b(arejVar, this.k, apmgVar, acraVar);
            }
        }
    }
}
