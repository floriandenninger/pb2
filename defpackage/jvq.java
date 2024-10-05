package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jvq implements ykl {
    private final /* synthetic */ int a;

    public jvq(int i) {
        this.a = i;
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void b(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        if (i == 1) {
        } else if (i == 2) {
        } else if (i != 3) {
        }
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void a(Object obj, Exception exc) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            } else {
                return;
            }
        }
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Error connecting to screen: ");
        sb.append(valueOf);
        zga.b(sb.toString());
    }
}
