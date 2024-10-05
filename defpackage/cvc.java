package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvc implements cwa {
    private final /* synthetic */ int a;

    public cvc(int i) {
        this.a = i;
    }

    @Override // defpackage.cwa
    public final void d() {
    }

    @Override // defpackage.cwa
    public final cvz c(cwg cwgVar) {
        int i = this.a;
        if (i == 0) {
            return new cvd(new cvb(0));
        }
        if (i == 1) {
            return new cvd(new cvb(1));
        }
        if (i == 2) {
            return new cvg();
        }
        if (i != 3) {
            return i != 4 ? new cwx(cwgVar.a(Uri.class, InputStream.class), 1) : new cwx(cwgVar.a(Uri.class, ParcelFileDescriptor.class), 1);
        }
        return new cwx(cwgVar.a(Uri.class, AssetFileDescriptor.class), 1);
    }
}
