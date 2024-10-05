package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akfs implements axzs {
    public static final ayca a = ayca.c("Authorization", aycd.a);
    public final aycd b;
    public final String c;

    public akfs(aycd aycdVar, String str) {
        this.b = aycdVar;
        this.c = str;
    }

    @Override // defpackage.axzs
    public final axzr a(aych aychVar, axzo axzoVar, axzp axzpVar) {
        return new akfr(this, axzpVar.a(aychVar, axzoVar));
    }
}
