package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afyd implements amml {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ afyd(int i, int i2, boolean z, int i3) {
        this.d = i3;
        this.b = i;
        this.c = i2;
        this.a = z;
    }

    public /* synthetic */ afyd(boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.d == 0) {
            boolean z = this.a;
            int i = this.b;
            int i2 = this.c;
            Bitmap bitmap = (Bitmap) obj;
            return (!z || bitmap == null) ? bitmap : (bitmap.getWidth() == i && bitmap.getHeight() == i2) ? bitmap : Bitmap.createScaledBitmap(bitmap, i, i2, true);
        }
        int i3 = this.b;
        int i4 = this.c;
        boolean z2 = this.a;
        eok eokVar = (eok) obj;
        aone builder = eokVar.toBuilder();
        builder.copyOnWrite();
        eok eokVar2 = (eok) builder.instance;
        eokVar2.b |= 1;
        eokVar2.c = true;
        builder.copyOnWrite();
        eok eokVar3 = (eok) builder.instance;
        eokVar3.b |= 128;
        eokVar3.j = false;
        builder.copyOnWrite();
        eok eokVar4 = (eok) builder.instance;
        eokVar4.b |= 2;
        eokVar4.d = i3;
        builder.copyOnWrite();
        eok eokVar5 = (eok) builder.instance;
        eokVar5.b |= 4;
        eokVar5.e = i4;
        builder.copyOnWrite();
        eok eokVar6 = (eok) builder.instance;
        eokVar6.b |= 8;
        eokVar6.f = z2;
        boolean z3 = eokVar.l;
        builder.copyOnWrite();
        eok eokVar7 = (eok) builder.instance;
        eokVar7.b |= 512;
        eokVar7.l = true;
        return (eok) builder.build();
    }
}
