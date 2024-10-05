package defpackage;

import android.graphics.drawable.ColorDrawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fza extends fxs {
    public final int b;
    public final int c;

    public fza(int i, int i2) {
        super(new ColorDrawable(i));
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.fxs
    public final boolean a(fxs fxsVar) {
        if (!(fxsVar instanceof fza)) {
            return false;
        }
        fza fzaVar = (fza) fxsVar;
        return b(fzaVar.b, fzaVar.c) || this.a == fxsVar.a;
    }

    public final boolean b(int i, int i2) {
        return (i != -1 && i == this.b) && (i2 != -1 && i2 == this.c);
    }

    @Override // defpackage.fxs
    public final String toString() {
        String hexString = Integer.toHexString(0);
        String hexString2 = Integer.toHexString(this.b);
        String hexString3 = Integer.toHexString(this.c);
        String valueOf = String.valueOf(this.a);
        int length = String.valueOf(hexString).length();
        int length2 = String.valueOf(hexString2).length();
        StringBuilder sb = new StringBuilder(length + 40 + length2 + String.valueOf(hexString3).length() + String.valueOf(valueOf).length());
        sb.append("resId 0x");
        sb.append(hexString);
        sb.append(" abColor 0x");
        sb.append(hexString2);
        sb.append(" sbColor 0x");
        sb.append(hexString3);
        sb.append(" drawable ");
        sb.append(valueOf);
        return sb.toString();
    }
}
