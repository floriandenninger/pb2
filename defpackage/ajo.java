package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajo implements ajp {
    private final /* synthetic */ int c;
    static final ajo b = new ajo(1);
    static final ajo a = new ajo(0);

    private ajo(int i) {
        this.c = i;
    }

    @Override // defpackage.ajp
    public final int a(CharSequence charSequence, int i) {
        if (this.c == 0) {
            int i2 = 2;
            for (int i3 = 0; i3 < i && i2 == 2; i3++) {
                i2 = ajt.b(Character.getDirectionality(charSequence.charAt(i3)));
            }
            return i2;
        }
        boolean z = false;
        for (int i4 = 0; i4 < i; i4++) {
            int a2 = ajt.a(Character.getDirectionality(charSequence.charAt(i4)));
            if (a2 == 0) {
                return 0;
            }
            if (a2 == 1) {
                z = true;
            }
        }
        return z ? 1 : 2;
    }
}
