package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azaf extends ayzz {
    private static final long serialVersionUID = -5898283885385201806L;
    final int d = 1;

    @Override // defpackage.ayzz
    public final void d() {
        if (this.b > this.d) {
            azab azabVar = (azab) ((azab) get()).get();
            if (azabVar != null) {
                this.b--;
                set(azabVar);
                return;
            }
            throw new IllegalStateException("Empty list!");
        }
    }
}
