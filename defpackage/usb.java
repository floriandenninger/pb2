package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class usb implements uoo {
    public final int a;
    public final usj b;
    public final boolean c;
    public final ammv d;
    private final int e;

    public usb() {
    }

    public usb(int i, int i2, usj usjVar, boolean z, ammv ammvVar) {
        this.e = i;
        this.a = i2;
        this.b = usjVar;
        this.c = z;
        this.d = ammvVar;
    }

    public static final usa c() {
        usa usaVar = new usa(null);
        usaVar.b = false;
        usaVar.b(50);
        usaVar.c = amlr.a;
        usaVar.d = 1;
        return usaVar;
    }

    @Override // defpackage.uoo
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return this.e == 3;
    }

    public final boolean equals(Object obj) {
        usj usjVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof usb)) {
            return false;
        }
        usb usbVar = (usb) obj;
        int i = this.e;
        int i2 = usbVar.e;
        if (i != 0) {
            return i == i2 && this.a == usbVar.a && ((usjVar = this.b) != null ? usjVar.equals(usbVar.b) : usbVar.b == null) && this.c == usbVar.c && this.d.equals(usbVar.d);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.e;
        uop.b(i);
        int i2 = (((i ^ 1000003) * 1000003) ^ this.a) * 1000003;
        usj usjVar = this.b;
        return ((((i2 ^ (usjVar == null ? 0 : usjVar.hashCode())) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String a = uop.a(this.e);
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        String valueOf2 = String.valueOf(this.d);
        int length = a.length();
        StringBuilder sb = new StringBuilder(length + 131 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("NetworkConfigurations{enablement=");
        sb.append(a);
        sb.append(", batchSize=");
        sb.append(i);
        sb.append(", urlSanitizer=");
        sb.append(valueOf);
        sb.append(", enableUrlAutoSanitization=");
        sb.append(z);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
