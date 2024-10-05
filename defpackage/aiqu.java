package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiqu {
    public String a = "-";
    public String b = "-";
    private final zih c;

    public aiqu(zih zihVar) {
        this.c = zihVar;
    }

    public final void b(String str) {
        if (str == null) {
            str = "-";
        }
        this.a = str;
        aiqm aiqmVar = (aiqm) this.c.a();
        if (aiqmVar != null) {
            aiqmVar.t();
        }
    }

    public final void a(aoul aoulVar) {
        if (aoulVar != null) {
            this.b = Base64.encodeToString(aoulVar.toByteArray(), 11);
        } else {
            this.b = "-";
        }
        aiqm aiqmVar = (aiqm) this.c.a();
        if (aiqmVar != null) {
            aiqmVar.t();
        }
    }
}
