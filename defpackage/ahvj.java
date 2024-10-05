package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahvj implements ypd {
    final /* synthetic */ ahvm a;

    public ahvj(ahvm ahvmVar) {
        this.a = ahvmVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahyp.class};
        }
        if (i == 0) {
            ahyp ahypVar = (ahyp) obj;
            ahvm ahvmVar = this.a;
            if (ahvmVar.F == null) {
                ahvmVar.F = new HashMap();
            }
            this.a.F.put(ahypVar.a, ahypVar.b);
            ahvm ahvmVar2 = this.a;
            ahvmVar2.s.px(ahvmVar2.F);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
