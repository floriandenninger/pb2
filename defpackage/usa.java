package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class usa {
    public usj a;
    public Boolean b;
    public ammv c;
    public int d;
    private Integer e;

    public usa() {
    }

    public usa(byte[] bArr) {
        this.c = amlr.a;
    }

    public final usb a() {
        Integer num;
        int i = this.d;
        if (i == 0 || (num = this.e) == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == 0) {
                sb.append(" enablement");
            }
            if (this.e == null) {
                sb.append(" batchSize");
            }
            if (this.b == null) {
                sb.append(" enableUrlAutoSanitization");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        usb usbVar = new usb(i, num.intValue(), this.a, this.b.booleanValue(), this.c);
        boolean z = true;
        if (usbVar.b != null && usbVar.c) {
            z = false;
        }
        amkq.F(z, "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
        return usbVar;
    }

    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void c(boolean z) {
        this.d = true != z ? 2 : 3;
    }
}
