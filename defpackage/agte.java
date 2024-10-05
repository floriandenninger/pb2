package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.Key;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agte {
    ahah a;
    private final Key b;
    private boolean c;
    private final agof d;

    public agte(agof agofVar, Key key) {
        this.d = agofVar;
        this.b = key;
    }

    public final synchronized agtg a(agnm agnmVar) {
        agsj agsjVar;
        int i;
        long j;
        byte[] bArr;
        agtf agtfVar = new agtf();
        agtfVar.a = agnmVar;
        agtfVar.c = 3;
        agtfVar.b = 0;
        agsn a = this.d.a();
        agsj h = a.h();
        int a2 = h.a(agnmVar.g(), agnmVar.a());
        if (a2 == -1) {
            return agtfVar.a();
        }
        this.c = false;
        agne c = h.c(agnmVar.g(), agnmVar.a(), a2, 0);
        if (c != null && (bArr = c.f) != null && bArr.length == 10) {
            this.c = true;
        }
        this.a = new ahah(this.c);
        int pow = ((int) Math.pow(2.0d, a2)) * 4096;
        double b = agnmVar.b();
        double d = pow;
        Double.isNaN(b);
        Double.isNaN(d);
        int ceil = (int) Math.ceil(b / d);
        agej b2 = a.b();
        phg phgVar = null;
        if (b2 != null) {
            Iterator it = ((ageh) b2).get().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                phg phgVar2 = (phg) it.next();
                if (phgVar2.g().contains(agnmVar.f())) {
                    phgVar = phgVar2;
                    break;
                }
            }
        }
        if (phgVar == null) {
            return agtfVar.a();
        }
        agtfVar.b = pow;
        byte[] bArr2 = new byte[pow];
        int i2 = 0;
        while (i2 < ceil) {
            agne c2 = h.c(agnmVar.g(), agnmVar.a(), a2, i2);
            if (c2 != null && c2.f != null) {
                long j2 = i2 * pow;
                i = ceil;
                agsjVar = h;
                int min = (int) Math.min(pow, agnmVar.b() - j2);
                bgm bgmVar = new bgm(this.b.getEncoded(), new phj(phgVar, agtc.a, new pht("Offline"), null, 4, null));
                String f = agnmVar.f();
                try {
                    bgmVar.h(new ath(Uri.EMPTY, j2, min, f));
                } catch (IOException e) {
                    e = e;
                    j = j2;
                }
                try {
                    bgmVar.g(bArr2, 0, min);
                    this.a.c();
                    ahae a3 = ahah.a(this.c);
                    double d2 = min;
                    Double.isNaN(d2);
                    int ceil2 = (int) Math.ceil(d2 / 4096.0d);
                    for (int i3 = 0; i3 < ceil2; i3++) {
                        int i4 = i3 * 4096;
                        int min2 = Math.min(4096, min - i4);
                        a3.b();
                        a3.c(bArr2, i4, min2);
                        this.a.b(a3.d());
                    }
                    if (!Arrays.equals(this.a.d(), c2.f)) {
                        agtfVar.b(j2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    j = j2;
                    StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 36);
                    sb.append("Couldn't read from data source for ");
                    sb.append(f);
                    sb.append("\n");
                    zga.d(sb.toString(), e);
                    agtfVar.b(j);
                    i2++;
                    ceil = i;
                    h = agsjVar;
                }
                i2++;
                ceil = i;
                h = agsjVar;
            }
            agsjVar = h;
            i = ceil;
            agtfVar.b(i2 * pow);
            i2++;
            ceil = i;
            h = agsjVar;
        }
        return agtfVar.a();
    }
}
