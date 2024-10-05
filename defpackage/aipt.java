package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aipt {
    public final azqv a = azqv.ap();
    public final azqv b = azqv.ap();
    public final ywr c;
    public final axzg d;

    public aipt(axzg axzgVar, ywr ywrVar, byte[] bArr, byte[] bArr2) {
        this.d = axzgVar;
        this.c = ywrVar;
    }

    public final aips a() {
        return new aips(this.c, this.a, this.b, this.d, null, null);
    }

    public final anhy b() {
        if (this.d.r().booleanValue()) {
            ammv ammvVar = (ammv) this.a.ar();
            boolean z = false;
            if (ammvVar != null && ammvVar.h() && ((Boolean) ammvVar.c()).booleanValue()) {
                z = true;
            }
            return anaf.O(Boolean.valueOf(z));
        }
        return anfq.h(this.c.a(), aidf.u, angq.a);
    }

    public final anhy c() {
        if (this.d.r().booleanValue()) {
            ammv ammvVar = (ammv) this.a.ar();
            boolean z = false;
            if (ammvVar != null && ammvVar.h()) {
                z = true;
            }
            return anaf.O(Boolean.valueOf(z));
        }
        return anfq.h(this.c.a(), aipq.a, angq.a);
    }
}
