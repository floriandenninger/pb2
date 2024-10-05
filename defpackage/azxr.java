package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azxr extends azzq implements azxe {
    public final String c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (azzt azztVar = (azzt) g(); !azul.c(azztVar, this); azztVar = azztVar.h()) {
            if (azztVar instanceof azxk) {
                azxk azxkVar = (azxk) azztVar;
                if (!z) {
                    sb.append(", ");
                }
                sb.append(azxkVar);
                z = false;
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        sb2.getClass();
        return sb2;
    }

    @Override // defpackage.azxe
    public final azxr sp() {
        return this;
    }

    @Override // defpackage.azxe
    public final boolean sq() {
        return true;
    }

    @Override // defpackage.azzt
    public final String toString() {
        return azwq.a ? c("Active") : super.toString();
    }
}
