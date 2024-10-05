package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ackl implements ykl {
    final /* synthetic */ ImageView a;
    final /* synthetic */ ackn b;

    public ackl(ackn acknVar, ImageView imageView) {
        this.b = acknVar;
        this.a = imageView;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf(((Uri) obj).toString());
        zga.l(valueOf.length() != 0 ? "Error loading thumbnail from Uri: ".concat(valueOf) : new String("Error loading thumbnail from Uri: "));
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Bitmap bitmap = (Bitmap) obj2;
        Handler handler = this.b.c;
        final ImageView imageView = this.a;
        handler.post(new Runnable() { // from class: ackk
            @Override // java.lang.Runnable
            public final void run() {
                imageView.setImageBitmap(bitmap);
            }
        });
    }
}
