package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xzx implements ykl {
    public final ImageView a;
    public final Animation b;
    public final boolean c;
    private final afri d;
    private final Executor e;

    public xzx(ImageView imageView, afri afriVar, Executor executor, boolean z) {
        this.a = imageView;
        this.d = afriVar;
        this.e = executor;
        imageView.setTag(R.id.bitmap_loader_tag, this);
        Animation loadAnimation = AnimationUtils.loadAnimation(imageView.getContext(), android.R.anim.fade_in);
        this.b = loadAnimation;
        loadAnimation.setDuration(imageView.getContext().getResources().getInteger(android.R.integer.config_shortAnimTime));
        this.c = z;
    }

    private final void c() {
        this.a.setTag(R.id.bitmap_loader_tag, null);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        if (this.a.getTag(R.id.bitmap_loader_tag) != this) {
            return;
        }
        c();
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Failed to load image. ");
        sb.append(valueOf);
        zga.b(sb.toString());
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Drawable drawable;
        Uri uri = (Uri) obj;
        byte[] bArr = (byte[]) obj2;
        if (this.a.getTag(R.id.bitmap_loader_tag) != this) {
            return;
        }
        c();
        try {
            drawable = (Drawable) this.d.b(bArr);
        } catch (IOException | zjg unused) {
            zga.b("Failed to decode the image bytes to Drawable.");
            drawable = null;
        }
        this.e.execute(new xzw(this, drawable, uri));
    }
}
