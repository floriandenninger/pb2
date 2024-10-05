package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class angm extends ango {
    final /* synthetic */ angp a;
    private final anfy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public angm(angp angpVar, anfy anfyVar, Executor executor) {
        super(angpVar, executor);
        this.a = angpVar;
        anfyVar.getClass();
        this.c = anfyVar;
    }

    @Override // defpackage.anhx
    public final /* bridge */ /* synthetic */ Object a() {
        anhy a = this.c.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.anhx
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.ango
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.qK((anhy) obj);
    }
}
