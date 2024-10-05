package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajvm implements ajol {
    private final int a;

    public ajvm(int i) {
        this.a = i;
    }

    @Override // defpackage.ajol
    public void a(ajok ajokVar, ajng ajngVar, int i) {
        ajokVar.f("showLineSeparator", Boolean.valueOf(b(ajngVar, i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b(ajng ajngVar, int i) {
        ajob l;
        boolean z = i == ajngVar.a() + (-1);
        boolean z2 = !z && (ajngVar instanceof ajoc) && (l = ((ajoc) ajngVar).l(i)) != null && l.f(i) == l.a.a() + (-1);
        int i2 = this.a;
        if (i2 == 0) {
            return z || z2;
        }
        if (i2 == 1) {
            return z2;
        }
        if (i2 != 2) {
            return false;
        }
        return z;
    }
}
