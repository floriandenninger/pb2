package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hun implements ykl {
    final /* synthetic */ FrameLayout a;
    final /* synthetic */ hur b;

    public hun(hur hurVar, FrameLayout frameLayout) {
        this.b = hurVar;
        this.a = frameLayout;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.b.d.post(new mrf(this.a, 1));
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Bitmap bitmap = (Bitmap) obj2;
        Handler handler = this.b.d;
        final FrameLayout frameLayout = this.a;
        handler.post(new Runnable() { // from class: hum
            @Override // java.lang.Runnable
            public final void run() {
                FrameLayout frameLayout2 = frameLayout;
                ga a = gl.a(frameLayout2.getResources(), bitmap);
                a.c();
                ((ImageView) frameLayout2.findViewById(R.id.reel_post_confirmation_avatar)).setImageDrawable(a);
            }
        });
    }
}
