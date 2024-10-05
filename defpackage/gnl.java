package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gnl implements gni {
    private final Context a;
    private final ywr b;

    public gnl(Context context, ywr ywrVar) {
        this.a = context;
        this.b = ywrVar;
    }

    @Override // defpackage.gni
    public final gng a() {
        String string;
        if (e()) {
            if ((((gnh) this.b.c()).b & 8) == 0) {
                if (b() == gng.DARK) {
                    string = this.a.getString(R.string.app_theme_appearance_dark);
                } else {
                    string = this.a.getString(R.string.app_theme_appearance_system);
                }
                ynm.m(this.b.b(new fjz(string, 5)), egw.p);
            } else {
                string = ((gnh) this.b.c()).f;
            }
            if (amkq.b(string, this.a.getString(R.string.app_theme_appearance_light))) {
                return gng.LIGHT;
            }
            if (amkq.b(string, this.a.getString(R.string.app_theme_appearance_dark))) {
                return gng.DARK;
            }
            return c();
        }
        return b();
    }

    @Override // defpackage.gni
    public final gng b() {
        return ((gnh) this.b.c()).e ? gng.DARK : gng.LIGHT;
    }

    @Override // defpackage.gni
    public final gng c() {
        if ((this.a.getResources().getConfiguration().uiMode & 48) == 32) {
            return gng.DARK;
        }
        return gng.LIGHT;
    }

    @Override // defpackage.gni
    public final void d(final gng gngVar) {
        gngVar.getClass();
        ynm.m(this.b.b(new amml() { // from class: gnk
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                gng gngVar2 = gng.this;
                aone builder = ((gnh) obj).toBuilder();
                boolean z = gngVar2 == gng.DARK;
                builder.copyOnWrite();
                gnh gnhVar = (gnh) builder.instance;
                gnhVar.b |= 4;
                gnhVar.e = z;
                return (gnh) builder.build();
            }
        }), egw.q);
    }

    @Override // defpackage.gni
    public final boolean e() {
        return Build.VERSION.SDK_INT > 28;
    }
}
