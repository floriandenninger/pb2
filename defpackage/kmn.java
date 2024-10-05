package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kmn extends ahus implements ypd {
    public boolean a;

    public kmn(Context context) {
        super(context);
        this.a = false;
    }

    @Override // defpackage.ahuy
    public final View a(Context context) {
        return View.inflate(context, R.layout.pip_ad_overlay, null);
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final void d(Context context, View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahus
    public final ahux kU(Context context) {
        ahux kU = super.kU(context);
        kU.b();
        kU.a = 0;
        kU.a();
        kU.b = 0;
        return kU;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            boolean h = ((ahef) obj).c().h();
            this.a = h;
            if (h) {
                kX();
                return null;
            }
            kV();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.a;
    }
}
