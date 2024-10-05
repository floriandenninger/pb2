package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akpn implements anfz {
    final /* synthetic */ String a;
    final /* synthetic */ akpp b;

    public akpn(akpp akppVar, String str) {
        this.b = akppVar;
        this.a = str;
    }

    @Override // defpackage.anfz
    public final /* bridge */ /* synthetic */ anhy a(Object obj) {
        akps akpsVar = (akps) obj;
        if (akpsVar != null) {
            return anaf.O(akpsVar);
        }
        return this.b.a(this.a, false);
    }
}
