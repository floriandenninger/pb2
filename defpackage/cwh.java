package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwh implements cwa {
    private final Resources a;
    private final /* synthetic */ int b;

    public cwh(Resources resources, int i) {
        this.b = i;
        this.a = resources;
    }

    @Override // defpackage.cwa
    public final void d() {
    }

    @Override // defpackage.cwa
    public final cvz c(cwg cwgVar) {
        int i = this.b;
        if (i == 0) {
            return new cwi(this.a, cwgVar.a(Uri.class, ParcelFileDescriptor.class));
        }
        if (i != 1) {
            return i != 2 ? new cwi(this.a, cwe.a) : new cwi(this.a, cwgVar.a(Uri.class, InputStream.class));
        }
        return new cwi(this.a, cwgVar.a(Uri.class, AssetFileDescriptor.class));
    }
}
