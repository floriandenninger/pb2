package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afgh implements afgp {
    final /* synthetic */ afgs a;

    public afgh(afgs afgsVar) {
        this.a = afgsVar;
    }

    @Override // defpackage.afgp
    public final int a() {
        return 20;
    }

    public final String b() {
        float a = this.a.b.b.a();
        if (a != -1.0f) {
            return String.format(Locale.US, "%s:%s:%d", this.a.e(), this.a.b(a, 3), Integer.valueOf(this.a.b.b.b() ? 1 : 0));
        }
        return null;
    }

    @Override // defpackage.afgp
    public final void c(ajun ajunVar) {
        String b = b();
        if (b != null) {
            ajunVar.j("bat", b);
        }
    }
}
