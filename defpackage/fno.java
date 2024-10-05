package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fno {
    public final aypn a;

    public fno(final zaz zazVar, gpe gpeVar, final obr obrVar) {
        this.a = aypn.e(zazVar.d(), gpeVar.c, new ayro() { // from class: fnn
            @Override // defpackage.ayro
            public final Object a(Object obj, Object obj2) {
                int i;
                int i2;
                int i3;
                zaz zazVar2 = zaz.this;
                obr obrVar2 = obrVar;
                zck zckVar = (zck) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Rect rect = new Rect();
                if (zazVar2.m()) {
                    rect.set(zckVar.a.a);
                } else if (zazVar2.l() && !obrVar2.e()) {
                    zbe zbeVar = zckVar.a;
                    zat zatVar = zbeVar.b;
                    int i4 = 0;
                    if (zatVar.a.isEmpty()) {
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                    } else {
                        int b = zatVar.b();
                        int d = zatVar.d();
                        i3 = zatVar.c();
                        i = zatVar.a();
                        i4 = d;
                        i2 = b;
                    }
                    Rect rect2 = zbeVar.d;
                    if (booleanValue) {
                        i2 = Math.max(rect2.left, i2);
                        i4 = Math.max(rect2.top, i4);
                        i3 = Math.max(rect2.right, i3);
                        i = Math.max(rect2.bottom, i);
                    }
                    rect.set(new Rect(i2, i4, i3, i));
                }
                return rect;
            }
        });
    }
}
