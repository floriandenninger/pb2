package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeom extends yvo {
    public final String a;
    public final azrh b;
    public final acpl c;
    private final aknq k;
    private final ScheduledExecutorService l;
    private final afsy m;

    public aeom(String str, aknq aknqVar, ScheduledExecutorService scheduledExecutorService, afsy afsyVar, azrh azrhVar, acpl acplVar) {
        super(1, str, null);
        this.a = str;
        this.k = aknqVar;
        this.l = scheduledExecutorService;
        this.m = afsyVar;
        this.b = azrhVar;
        this.c = acplVar;
    }

    @Override // defpackage.yvo
    public final cnq d(cnq cnqVar) {
        aeon.c(this.a, this.c);
        return cnqVar;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        if (cnhVar.a != 200) {
            aeon.c(this.a, this.c);
            return cnm.a(new cng());
        }
        anaf.Y(this.k.b(aeon.b(this.a, this.m), cnhVar, aeok.a), new aeol(this, cnhVar), this.l);
        return cnm.b(null, new cnc());
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
    }
}
