package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aehu extends afiz {
    private final afjf a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehu(ate ateVar, afjf afjfVar) {
        super(ateVar);
        afki.a(ateVar);
        afki.a(afjfVar);
        this.a = afjfVar;
    }

    @Override // defpackage.afiz, defpackage.ate
    public final long h(ath athVar) {
        String queryParameter;
        if (!this.b && (queryParameter = athVar.a.getQueryParameter("itag")) != null) {
            try {
                int parseInt = Integer.parseInt(queryParameter);
                Set b = aaoq.b();
                Integer valueOf = Integer.valueOf(parseInt);
                if (b.contains(valueOf)) {
                    this.b = true;
                    this.a.H();
                } else if (aaoq.c().contains(valueOf) || aaoq.v().contains(valueOf)) {
                    this.b = true;
                    this.a.I();
                }
            } catch (NumberFormatException unused) {
            }
        }
        return super.h(athVar);
    }
}
