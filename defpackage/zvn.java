package defpackage;

import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zvn {
    public long a;
    public String b;
    public File c;
    public File d;
    public final /* synthetic */ GalleryActivity e;

    public zvn(GalleryActivity galleryActivity) {
        this.e = galleryActivity;
    }

    public final void a() {
        if (this.c.exists()) {
            this.c.delete();
        }
    }

    public final void b() {
        this.e.j();
    }

    public final void c() {
        this.e.getWindow().clearFlags(128);
        this.e.d.f(new wcy());
        this.c = null;
        this.d = null;
        this.b = null;
        this.a = -1L;
    }
}
