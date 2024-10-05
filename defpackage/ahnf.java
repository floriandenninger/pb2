package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahnf implements ykl {
    final /* synthetic */ ahng a;

    public ahnf(ahng ahngVar) {
        this.a = ahngVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("Error requesting bitmap for autonav video thumbnail:");
        sb.append(valueOf);
        zga.b(sb.toString());
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        ahjp ahjpVar = this.a.b;
        if (bitmap == null) {
            zga.b("Cannot set null bitmap.");
        } else {
            boolean z = true;
            if (ahjpVar.i.getWidth() == bitmap.getWidth() && ahjpVar.i.getHeight() == bitmap.getHeight()) {
                z = false;
            }
            ahjpVar.j = z;
            ahjpVar.i = bitmap;
            ahjpVar.g();
        }
        float width = bitmap.getWidth() / bitmap.getHeight();
        this.a.b.rJ(1.0f, 1.0f, 1.0f);
        if (width != 1.7777778f) {
            this.a.b.rJ(1.0f / width, 1.0f, 1.0f);
        }
        this.a.b.l = false;
    }
}
