package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajna implements ajnf {
    final /* synthetic */ ajnb a;

    public ajna(ajnb ajnbVar) {
        this.a = ajnbVar;
    }

    @Override // defpackage.yoq
    public final void d(int i, int i2) {
        int i3 = this.a.b;
        if (i >= i3) {
            return;
        }
        int min = Math.min(i2 + i, i3) - i;
        ajnb ajnbVar = this.a;
        int i4 = ajnbVar.b;
        int size = ((you) ajnbVar.a).size();
        if (i4 < size + min) {
            this.a.b -= min;
        }
        this.a.z(i, min);
        ajnb ajnbVar2 = this.a;
        ajnbVar2.b = i4;
        int i5 = i4 - min;
        if (size > i5) {
            ajnbVar2.y(i5, Math.min(size, i4) - i5);
        }
    }

    @Override // defpackage.ajnf
    public final void pc() {
        this.a.v();
    }

    @Override // defpackage.yoq
    public final void pd(int i, int i2) {
        ajnb ajnbVar = this.a;
        int i3 = ajnbVar.b;
        if (i >= i3) {
            return;
        }
        ajnbVar.x(i, Math.min(i2 + i, i3) - i);
    }

    @Override // defpackage.yoq
    public final void pe(int i, int i2) {
        int i3 = this.a.b;
        if (i >= i3) {
            return;
        }
        int min = Math.min(i + i2, i3) - i;
        ajnb ajnbVar = this.a;
        int i4 = ajnbVar.b;
        int size = ((you) ajnbVar.a).size() - i2;
        this.a.b = Math.max(i4, size + min);
        this.a.y(i, min);
        this.a.b = i4;
        int min2 = Math.min(size, i4) + min;
        ajnb ajnbVar2 = this.a;
        int i5 = ajnbVar2.b;
        if (min2 > i5) {
            ajnbVar2.z(i5, min2 - i5);
        }
    }

    @Override // defpackage.yoq
    public final void e(int i, int i2) {
        ajnb ajnbVar = this.a;
        int i3 = ajnbVar.b;
        if (i < i3 || i2 < i3) {
            if (i >= i3 || i2 >= i3 || i + 1 > i3 || i2 + 1 > i3) {
                ajnbVar.v();
            } else {
                ajnbVar.A(i, i2);
            }
        }
    }
}
