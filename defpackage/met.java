package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class met {
    private final ajjz a;
    private final aahd b;
    private final acra c;
    private final wzq d;
    private final Context e;
    private final Map f = new HashMap();
    private View g;
    private final ajyw h;

    public met(ajjz ajjzVar, aahd aahdVar, acra acraVar, wzq wzqVar, Context context, ajyw ajywVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = ajjzVar;
        this.b = aahdVar;
        this.c = acraVar;
        this.d = wzqVar;
        this.e = context;
        this.h = ajywVar;
    }

    private final mes c(Object obj) {
        if (obj == null || !this.f.containsKey(obj.getClass())) {
            if (obj instanceof aqbn) {
                meq meqVar = new meq(this.a, this.b, this.c, this.d, this.e);
                this.f.put(obj.getClass(), meqVar);
                return meqVar;
            }
            if (obj instanceof auex) {
                mfc mfcVar = new mfc(this.a, this.b, this.c, this.d, this.e, this.h, null, null, null, null, null);
                this.f.put(obj.getClass(), mfcVar);
                return mfcVar;
            }
            String valueOf = String.valueOf(String.valueOf(obj));
            afsi.b(1, 1, valueOf.length() != 0 ? "Unsupported companion extension renderer: ".concat(valueOf) : new String("Unsupported companion extension renderer: "));
            return null;
        }
        return (mes) this.f.get(obj.getClass());
    }

    public final void a(View view, Object obj) {
        mes c = c(obj);
        if (view == null || c == null) {
            return;
        }
        View z = whu.z(view, R.id.companion_extension_stub, R.id.companion_extension);
        this.g = z;
        if (z != null) {
            z.setVisibility(0);
            c.a(this.g, obj);
        }
    }

    public final void b(Object obj) {
        View view = this.g;
        if (view != null) {
            view.setVisibility(8);
        }
        mes c = c(obj);
        if (c != null) {
            c.b();
        }
    }
}
