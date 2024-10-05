package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class afgm {
    public final List a = new ArrayList();
    private final String b;

    public afgm(String str) {
        this.b = str;
    }

    public final void a(String str) {
        for (afgs afgsVar : this.a) {
            long j = afgs.a;
            afgq afgqVar = afgsVar.e;
            String str2 = this.b;
            String e = afgsVar.e();
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 1 + String.valueOf(str).length());
            sb.append(e);
            sb.append(":");
            sb.append(str);
            afgqVar.a(str2, sb.toString());
        }
    }
}
