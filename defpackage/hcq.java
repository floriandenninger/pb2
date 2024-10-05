package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.youtube.R;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hcq implements View.OnClickListener {
    public final EditorButtonView a;
    public final ImageView b;
    public boolean c;
    public how d;
    private final boolean e;
    private final Drawable f;
    private final Drawable g;
    private final Executor h;
    private final Executor i;
    private final jqr j;

    public hcq(Context context, EditorButtonView editorButtonView, ImageView imageView, Executor executor, Executor executor2, jqr jqrVar, boolean z, byte[] bArr) {
        this.a = editorButtonView;
        this.j = jqrVar;
        this.b = imageView;
        this.f = nz.b(context, R.drawable.ic_camera_align_button_on_v2);
        this.g = nz.b(context, R.drawable.ic_camera_align_button_off_v2);
        this.h = executor;
        this.i = executor2;
        this.e = z;
    }

    public final void a(boolean z) {
        if (z) {
            Drawable drawable = this.f;
            if (drawable != null) {
                this.a.b(drawable);
            }
            this.b.setVisibility(0);
            return;
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            this.a.b(drawable2);
        }
        this.b.setVisibility(8);
    }

    public final void b(Throwable th) {
        c(null);
        afsi.c(1, 6, "[ShortsCreation][Android]Failed to generate overlay", th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Bitmap bitmap) {
        String str;
        how howVar = this.d;
        if (howVar == null) {
            return;
        }
        howVar.f = bitmap;
        synchronized (howVar.b) {
            if (howVar.F() && !howVar.d.isEmpty()) {
                File l = howVar.l(((axey) amkq.bj(howVar.d)).h);
                try {
                    str = l.getCanonicalPath();
                } catch (IOException e) {
                    e = e;
                    str = null;
                }
                try {
                    fkc.x(howVar.f, l, Bitmap.CompressFormat.JPEG);
                    howVar.a.remove(str);
                } catch (IOException e2) {
                    e = e2;
                    if (str != null && howVar.a.add(str)) {
                        zga.f("ShortsProject", "Error saving align overlay image", e);
                        afsi.c(2, 6, "[ShortsCreation][Android][ProjectState]Error saving align overlay image", e);
                    }
                    d(false);
                }
            }
        }
        d(false);
    }

    public final void d(boolean z) {
        anhy S;
        yjk.f();
        how howVar = this.d;
        if (howVar == null) {
            return;
        }
        howVar.G(!z);
        Bitmap bitmap = howVar.f;
        File k = this.d.k();
        if (bitmap != null) {
            if (this.e && this.a.getVisibility() == 8) {
                hfq a = this.j.a(acsb.c(96649));
                a.h(true);
                a.g();
            }
            this.a.setVisibility(0);
            this.b.setImageBitmap(bitmap);
            return;
        }
        if (z && k != null) {
            final String absolutePath = k.getAbsolutePath();
            Executor executor = this.h;
            if (Build.VERSION.SDK_INT >= 28) {
                S = anaf.S(new hcr(absolutePath, 1), executor);
            } else {
                S = anaf.S(new hcr(absolutePath, 0), executor);
            }
            ynm.k(S, this.i, new ynk() { // from class: hco
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    hcq.this.b(th);
                }
            }, new ynl() { // from class: hcp
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    hcq hcqVar = hcq.this;
                    String str = absolutePath;
                    ammv ammvVar = (ammv) obj;
                    how howVar2 = hcqVar.d;
                    if (howVar2 == null) {
                        return;
                    }
                    File k2 = howVar2.k();
                    if (!ammvVar.h()) {
                        hcqVar.b(new IOException("bitmap retrieved was null"));
                    } else if (k2 == null || !str.equals(k2.getAbsolutePath())) {
                        zga.g("Align overlay discarded: current video segment has changed.");
                    } else {
                        hcqVar.c((Bitmap) ammvVar.c());
                    }
                }
            });
            return;
        }
        if (this.e && this.a.getVisibility() == 0) {
            hfq a2 = this.j.a(acsb.c(96649));
            a2.h(false);
            a2.g();
        }
        this.a.setVisibility(8);
        this.b.setImageDrawable(null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.a) {
            jqr jqrVar = this.j;
            if (jqrVar != null) {
                jqrVar.a(acsb.c(96649)).b();
            }
            boolean z = !this.c;
            this.c = z;
            a(z);
        }
    }
}
