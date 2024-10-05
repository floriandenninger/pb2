package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aev extends aer {
    final /* synthetic */ aew c;

    public aev(aew aewVar) {
        this.c = aewVar;
    }

    @Override // defpackage.aer
    protected final String c() {
        aes aesVar = (aes) this.c.a.get();
        if (aesVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + aesVar.a + "]";
    }
}
