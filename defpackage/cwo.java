package defpackage;

import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwo implements cwa {
    public static final cwo a = new cwo(1, null);
    private final /* synthetic */ int b;

    public cwo(int i) {
        this.b = i;
    }

    @Deprecated
    public cwo(int i, byte[] bArr) {
        this.b = i;
    }

    @Override // defpackage.cwa
    public final void d() {
    }

    @Override // defpackage.cwa
    public final cvz c(cwg cwgVar) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? i != 2 ? new ajlg(cwgVar.a(Uri.class, InputStream.class)) : new cwx(cwgVar.a(cvo.class, InputStream.class), 0) : cwe.a;
        }
        return new cwp(cwgVar.a(cvo.class, InputStream.class));
    }
}
