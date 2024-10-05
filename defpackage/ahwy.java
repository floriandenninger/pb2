package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahwy implements aioa, ypd {
    private final /* synthetic */ int a;

    public ahwy(int i) {
        this.a = i;
    }

    public ahwy(Context context, int i) {
        this.a = i;
        new AlertDialog.Builder(context).setTitle(context.getString(R.string.playback_rate_title)).setNegativeButton(R.string.cancel, hgs.k);
    }

    public static final void a(ahef ahefVar) {
        if (ahefVar.c() != aign.NEW) {
            ahefVar.c();
        }
        ahefVar.b();
    }

    public static final void b(ahef ahefVar) {
        ahefVar.c().e();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (this.a != 0) {
            if (i == -1) {
                return new Class[]{ahef.class};
            }
            if (i == 0) {
                b((ahef) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            a((ahef) obj);
            return null;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("unsupported op code: ");
        sb2.append(i);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return this.a != 0 ? new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 16L)).h(ahbw.e(1)).Y(new ahfo(0), ahfo.b)} : new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 65536L)).h(ahbw.e(1)).Y(new ahwx(0), ahwx.b)};
    }
}
