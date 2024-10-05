package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahsf extends ahsg {
    final /* synthetic */ ahsl a;
    private final avgf b;

    public ahsf(ahsl ahslVar, avgf avgfVar) {
        this.a = ahslVar;
        this.b = avgfVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String.valueOf(String.valueOf((Uri) obj)).length();
        kgv kgvVar = this.a.v;
        avgf avgfVar = this.b;
        int i = avgfVar.d;
        int i2 = avgfVar.e;
        kgvVar.b = (Bitmap) obj2;
        kgvVar.c = i;
        kgvVar.d = i2;
        kgvVar.Z(1);
    }
}
