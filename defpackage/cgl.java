package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgl extends Paint {
    public cgl() {
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public cgl(int i) {
        super(i);
    }

    public cgl(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public cgl(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }
}
