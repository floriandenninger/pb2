package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamf extends bamj {
    public bamf(bajj bajjVar, int i) {
        super(bajjVar, i, false, i);
    }

    @Override // defpackage.bami, defpackage.bams
    public final int c(bamv bamvVar, String str, int i) {
        int i2;
        char charAt;
        int c = super.c(bamvVar, str, i);
        if (c < 0 || c == (i2 = this.b + i)) {
            return c;
        }
        if (this.c && ((charAt = str.charAt(i)) == '-' || charAt == '+')) {
            i2++;
        }
        return c > i2 ? (i2 + 1) ^ (-1) : c < i2 ? c ^ (-1) : c;
    }
}
