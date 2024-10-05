package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aagx implements aahd {
    public static aagt g() {
        return new aagt();
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void a(apxf apxfVar) {
        aahc.a(this, apxfVar);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    public void c(apxf apxfVar, Map map) {
        try {
            f(apxfVar).kE(apxfVar, map);
        } catch (aahm unused) {
            String valueOf = String.valueOf(apxfVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Unknown command not resolved: ");
            sb.append(valueOf);
            zga.b(sb.toString());
        }
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void d(List list, Map map) {
        aahc.c(this, list, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void e(List list, Object obj) {
        aahc.d(this, list, obj);
    }

    public abstract aaha f(apxf apxfVar);
}
