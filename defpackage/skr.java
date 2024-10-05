package defpackage;

import android.content.Context;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class skr implements skk {
    public final Context a;
    private ammv b = amlr.a;
    private final Object c = new Object();
    private final trp d;

    public skr(Context context, trp trpVar, byte[] bArr) {
        this.a = context;
        this.d = trpVar;
    }

    @Override // defpackage.skk
    public final boolean a() {
        boolean booleanValue;
        synchronized (this.c) {
            booleanValue = this.b.h() ? ((Boolean) this.b.c()).booleanValue() : b();
        }
        return booleanValue;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.c) {
            try {
                try {
                    z = true;
                    if (Settings.Global.getInt(this.d.a.getContentResolver(), "multi_cb") != 1) {
                        z = false;
                    }
                    this.b = ammv.j(Boolean.valueOf(z));
                } catch (Settings.SettingNotFoundException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
