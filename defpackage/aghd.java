package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghd {
    public final azrw a;
    public final azrw b;
    public final shf c;
    public final agil d;

    public aghd(azrw azrwVar, azrw azrwVar2, agil agilVar, shf shfVar) {
        agilVar.getClass();
        this.d = agilVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar.getClass();
        this.a = azrwVar;
        shfVar.getClass();
        this.c = shfVar;
    }

    public final boolean a(String str, List list) {
        yjk.e();
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    return this.d.F(str, list);
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder(str.length() + 48);
                sb.append("Error saving ad breaks for ad [originalVideoId=");
                sb.append(str);
                sb.append("]");
                zga.d(sb.toString(), e);
                return false;
            }
        }
        this.d.F(str, Collections.emptyList());
        return false;
    }
}
