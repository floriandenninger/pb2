package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajrc {
    public final aahd a;
    public boolean b = false;
    private final Context c;
    private final zim d;

    public ajrc(Context context, zim zimVar, aahd aahdVar) {
        this.c = context;
        this.d = zimVar;
        this.a = aahdVar;
    }

    public final void a(asmt asmtVar, ammv ammvVar, Object obj) {
        ammv b = ammvVar.b(aipq.q);
        new ajra(this.c, this.d, asmtVar, b, new ajrb(this, asmtVar, b, obj)).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(asmt asmtVar, ajra ajraVar, String str, aqpg aqpgVar, aqpg aqpgVar2, boolean z) {
        boolean z2 = !ammx.e(str);
        int i = asmtVar.b;
        boolean z3 = (i & 256) == 0 || aqpgVar != null;
        boolean z4 = (i & 512) == 0 || aqpgVar2 != null;
        if (this.b) {
            ajraVar.c.setActivated(!z2);
            ajraVar.e.setActivated(!z3);
            ajraVar.f.setActivated(!z4);
        }
        boolean z5 = z2 && z3 && z4;
        if (z5) {
            ajraVar.b.setImageResource(R.drawable.quantum_ic_send_googblue_24);
        } else {
            ajraVar.b.setImageResource(R.drawable.quantum_ic_send_grey600_24);
            if (z) {
                ajraVar.b.announceForAccessibility(ajraVar.a.e);
                return false;
            }
        }
        return z5;
    }
}
