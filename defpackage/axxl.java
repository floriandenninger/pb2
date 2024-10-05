package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axxl implements axxk {
    public static final uvr a;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.libraries.mdi.sync"));
        Uri uri = uvpVar.b;
        if (uri == null) {
            throw new IllegalStateException("Cannot set enableAutoSubpackage on SharedPrefs-backed flags");
        }
        a = new uvp(uri, uvpVar.c, uvpVar.d, uvpVar.e, uvpVar.f, true).e("45353688", false);
    }

    @Override // defpackage.axxk
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
