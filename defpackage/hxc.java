package defpackage;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hxc {
    public final Context a;
    public final ajut b;
    public final aahd c;
    public final acqz d;
    public final Map e = new HashMap();
    public final axze f;

    public hxc(Context context, ajut ajutVar, aahd aahdVar, axze axzeVar, acqz acqzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = context;
        this.b = ajutVar;
        this.c = aahdVar;
        this.d = acqzVar;
        this.f = axzeVar;
    }

    public static void a(View view, boolean z) {
        view.setEnabled(z);
        view.setAlpha(true != z ? 0.33f : 1.0f);
    }
}
