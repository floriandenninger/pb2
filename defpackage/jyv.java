package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jyv implements amml {
    public final /* synthetic */ jyx a;
    private final /* synthetic */ int b;

    public /* synthetic */ jyv(jyx jyxVar, int i) {
        this.b = i;
        this.a = jyxVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b == 0) {
            amsv amsvVar = (amsv) obj;
            amsvVar.c(this.a.b);
            return amsvVar;
        }
        fzf fzfVar = (fzf) obj;
        fzfVar.e(new jyv(this.a, 0));
        return fzfVar;
    }
}
