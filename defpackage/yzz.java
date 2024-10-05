package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class yzz implements ykl {
    private final zab a;
    public final ImageView b;
    private final zae c;
    private final Animation d;
    private boolean e;

    public yzz(ImageView imageView, zab zabVar, zae zaeVar) {
        this.b = imageView;
        zabVar.getClass();
        this.a = zabVar;
        this.c = zaeVar;
        Animation b = zabVar.b();
        this.d = b;
        if (b != null) {
            b.setAnimationListener(new yzy(this));
        }
        imageView.setTag(R.id.bitmap_loader_tag, this);
        this.e = false;
    }

    private final void d() {
        this.b.setTag(R.id.bitmap_loader_tag, null);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        if (this.b.getTag(R.id.bitmap_loader_tag) != this) {
            zae zaeVar = this.c;
            if (zaeVar instanceof ajjo) {
                ((ajjo) zaeVar).a(this.b);
                return;
            }
            return;
        }
        zae zaeVar2 = this.c;
        if (zaeVar2 != null) {
            zaeVar2.d(this.b);
        }
        zae zaeVar3 = this.c;
        if ((zaeVar3 instanceof ajjo) && ((ajjo) zaeVar3).e.b) {
            ahbw.R(new ajka(exc, uri, "Default"));
        }
        d();
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (this.b.getTag(R.id.bitmap_loader_tag) != this) {
            zae zaeVar = this.c;
            if (zaeVar instanceof ajjo) {
                ((ajjo) zaeVar).a(this.b);
                return;
            }
            return;
        }
        bitmap.prepareToDraw();
        this.e = true;
        this.a.a(this.b, bitmap);
        zae zaeVar2 = this.c;
        if (zaeVar2 != null) {
            zaeVar2.f(this.b);
        }
        if (uri.equals(this.b.getTag(R.id.bitmap_source_tag)) || this.d == null) {
            c();
            return;
        }
        this.b.setTag(R.id.bitmap_source_tag, uri);
        if (this.d.hasStarted() && !this.d.hasEnded()) {
            this.d.cancel();
            this.d.reset();
        }
        if (this.b.hasOverlappingRendering()) {
            this.b.setLayerType(2, null);
        }
        this.b.startAnimation(this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        if (!this.e) {
            zga.l("Ignoring onBitmapRendered called before onResponse.");
            return;
        }
        if (this.b.getTag(R.id.bitmap_loader_tag) != this) {
            return;
        }
        this.b.invalidate();
        zae zaeVar = this.c;
        if (zaeVar != null) {
            zaeVar.g();
        }
        d();
    }
}
