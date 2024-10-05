package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ajq implements ajn {
    private final ajp a;

    public ajq(ajp ajpVar) {
        this.a = ajpVar;
    }

    @Override // defpackage.ajn
    public final boolean a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        ajp ajpVar = this.a;
        if (ajpVar != null) {
            int a = ajpVar.a(charSequence, i);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return b();
            }
            return false;
        }
        return b();
    }

    protected abstract boolean b();
}
