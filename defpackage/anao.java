package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anao extends anap {
    private final anan c;

    public anao(amyl amylVar, int i, anan ananVar) {
        super(amylVar, i);
        this.c = ananVar;
        StringBuilder sb = new StringBuilder("%");
        amylVar.f(sb);
        sb.append(true != amylVar.d() ? 't' : 'T');
        sb.append(ananVar.G);
    }

    @Override // defpackage.anap
    public final void a(anaq anaqVar, Object obj) {
        anan ananVar = this.c;
        amyl amylVar = this.b;
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb = new StringBuilder("%");
            amylVar.f(sb);
            sb.append(true != amylVar.d() ? 't' : 'T');
            sb.append(ananVar.G);
            ((anau) anaqVar).d.append(String.format(amyr.a, sb.toString(), obj));
            return;
        }
        StringBuilder sb2 = ((anau) anaqVar).d;
        char c = ananVar.G;
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("%t");
        sb3.append(c);
        anau.d(sb2, obj, sb3.toString());
    }
}
