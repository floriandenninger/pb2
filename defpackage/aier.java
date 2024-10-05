package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aier implements akbl {
    final /* synthetic */ awfl a;
    final /* synthetic */ aieu b;

    public aier(aieu aieuVar, awfl awflVar) {
        this.b = aieuVar;
        this.a = awflVar;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        this.b.i(this.a);
        this.b.c(this.a, true);
        this.b.b(awfj.YOU_THERE_EVENT_TYPE_PROMPT_SHOWN, this.a);
        this.b.b(awfj.YOU_THERE_EVENT_TYPE_WARNING_PROMPT_SHOWN, this.a);
    }
}
