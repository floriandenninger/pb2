package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dpm extends dlv {
    final /* synthetic */ dpt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpm(dpt dptVar, dlv dlvVar) {
        super(dlvVar);
        this.a = dptVar;
    }

    @Override // defpackage.dlv
    public final void a(dlv dlvVar) {
        dpt dptVar = this.a;
        try {
            dptVar.k();
        } catch (IndexOutOfBoundsException e) {
            String c = dpt.c(dptVar);
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 169 + String.valueOf(message).length());
            sb.append("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://bit.ly/39Oq0Hs for more information. Debug info: ");
            sb.append(c);
            sb.append(message);
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
