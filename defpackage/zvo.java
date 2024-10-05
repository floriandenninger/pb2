package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zvo implements Callable {
    private final Context a;

    public zvo(Context context) {
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return GalleryActivity.a(this.a);
    }
}
