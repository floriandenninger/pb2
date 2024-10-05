package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chn extends chp {
    private final cja e;

    public chn(List list) {
        super(list);
        cja cjaVar = (cja) ((clt) list.get(0)).b;
        int a = cjaVar != null ? cjaVar.a() : 0;
        this.e = new cja(new float[a], new int[a]);
    }

    @Override // defpackage.chk
    public final /* bridge */ /* synthetic */ Object f(clt cltVar, float f) {
        cja cjaVar = this.e;
        cja cjaVar2 = (cja) cltVar.b;
        cja cjaVar3 = (cja) cltVar.c;
        int length = cjaVar2.b.length;
        int length2 = cjaVar3.b.length;
        if (length == length2) {
            for (int i = 0; i < cjaVar2.b.length; i++) {
                cjaVar.a[i] = cln.c(cjaVar2.a[i], cjaVar3.a[i], f);
                cjaVar.b[i] = abu.b(f, cjaVar2.b[i], cjaVar3.b[i]);
            }
            return this.e;
        }
        StringBuilder sb = new StringBuilder(79);
        sb.append("Cannot interpolate between gradients. Lengths vary (");
        sb.append(length);
        sb.append(" vs ");
        sb.append(length2);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
