package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ugi extends ugf {
    public static final amml a = new ugi();

    @Override // defpackage.ugf
    public final void a(uki ukiVar, ugg uggVar) {
        int i = ukiVar.j;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1) {
            if (i2 != 2) {
                String z = uou.z(i);
                StringBuilder sb = new StringBuilder(z.length() + 20);
                sb.append("unknown enum value: ");
                sb.append(z);
                throw new IllegalArgumentException(sb.toString());
            }
            i3 = 3;
        }
        uggVar.j = i3;
    }
}
