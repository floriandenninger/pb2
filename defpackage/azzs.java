package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azzs extends azzy {
    public final azzt c;
    public azzt d;

    public azzs(azzt azztVar) {
        super(null);
        this.c = azztVar;
    }

    @Override // defpackage.azzy
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        azzt azztVar = (azzt) obj;
        azztVar.getClass();
        azzt azztVar2 = obj2 == null ? this.c : this.d;
        if (azztVar2 != null && azztVar.c.c(this, azztVar2) && obj2 == null) {
            azzt azztVar3 = this.c;
            azzt azztVar4 = this.d;
            azztVar4.getClass();
            azztVar3.k(azztVar4);
        }
    }
}
