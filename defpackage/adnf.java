package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adnf implements ynl {
    public final /* synthetic */ adnm a;
    public final /* synthetic */ adfy b;
    private final /* synthetic */ int c;

    public /* synthetic */ adnf(adnm adnmVar, adfy adfyVar, int i) {
        this.c = i;
        this.a = adnmVar;
        this.b = adfyVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            adnm adnmVar = this.a;
            adfy adfyVar = this.b;
            if (((Boolean) obj).booleanValue()) {
                adnmVar.l(adfyVar);
                return;
            }
            return;
        }
        if (i == 1) {
            this.a.l(this.b);
        } else {
            adnm adnmVar2 = this.a;
            adnmVar2.b.remove(this.b);
        }
    }
}
