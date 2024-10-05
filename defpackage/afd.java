package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afd {
    aff a;
    final /* synthetic */ afe b;

    public afd(afe afeVar) {
        this.b = afeVar;
    }

    public final String toString() {
        String str = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                String valueOf = String.valueOf(str);
                float f = this.a.i[i];
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                sb.append(valueOf);
                sb.append(f);
                sb.append(" ");
                str = sb.toString();
            }
        }
        String valueOf2 = String.valueOf(str);
        String valueOf3 = String.valueOf(this.a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 2 + String.valueOf(valueOf3).length());
        sb2.append(valueOf2);
        sb2.append("] ");
        sb2.append(valueOf3);
        return sb2.toString();
    }
}
