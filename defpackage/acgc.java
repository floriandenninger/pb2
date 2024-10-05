package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acgc implements ykl {
    final /* synthetic */ acgf a;

    public acgc(acgf acgfVar) {
        this.a = acgfVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf((Uri) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Error loading thumbnail from Uri: ");
        sb.append(valueOf);
        zga.l(sb.toString());
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Bitmap bitmap = (Bitmap) obj2;
        this.a.b.post(new Runnable() { // from class: acgb
            @Override // java.lang.Runnable
            public final void run() {
                acgc acgcVar = acgc.this;
                acgcVar.a.ao.setImageBitmap(bitmap);
            }
        });
        this.a.ar = bitmap;
    }
}
