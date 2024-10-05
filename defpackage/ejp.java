package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ejp extends js {
    final /* synthetic */ ejq a;

    public ejp(ejq ejqVar) {
        this.a = ejqVar;
    }

    @Override // defpackage.js
    public final void c() {
        ajox ajoxVar = this.a.c;
        if (ajoxVar != null) {
            int b = ajoxVar.b();
            for (int i = 0; i < b; i++) {
                ejq ejqVar = this.a;
                ejqVar.a(ejqVar.c.getItem(i));
            }
        }
    }

    @Override // defpackage.js
    public final void f(int i, int i2) {
        if (this.a.c != null) {
            int i3 = i2 + i;
            while (i < i3) {
                ejq ejqVar = this.a;
                ejqVar.a(ejqVar.c.getItem(i));
                i++;
            }
        }
    }
}
