package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adng implements ynl {
    public final /* synthetic */ adnm a;
    public final /* synthetic */ adga b;
    private final /* synthetic */ int c;

    public /* synthetic */ adng(adnm adnmVar, adga adgaVar, int i) {
        this.c = i;
        this.a = adnmVar;
        this.b = adgaVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        if (this.c == 0) {
            this.a.m(this.b);
        } else {
            adnm adnmVar = this.a;
            adnmVar.c.remove(this.b);
        }
    }
}
