package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sup implements ayrv {
    private final amrz a;
    private final /* synthetic */ int b;

    public sup(amrz amrzVar, int i) {
        this.b = i;
        this.a = amrzVar;
    }

    @Override // defpackage.ayrv
    public final /* synthetic */ Object a(Object obj) {
        int i = 0;
        if (this.b == 0) {
            Object[] objArr = (Object[]) obj;
            amrw h = amrz.h();
            int length = objArr.length;
            while (i < length) {
                Pair pair = (Pair) objArr[i];
                String str = (String) pair.first;
                ammv ammvVar = (ammv) pair.second;
                byte[] bArr = (byte[]) this.a.get(str);
                bArr.getClass();
                h.g(str, (byte[]) ammvVar.e(bArr));
                i++;
            }
            return h.c();
        }
        Object[] objArr2 = (Object[]) obj;
        amrw h2 = amrz.h();
        int length2 = objArr2.length;
        while (i < length2) {
            Pair pair2 = (Pair) objArr2[i];
            String str2 = (String) pair2.first;
            ammv ammvVar2 = (ammv) pair2.second;
            byte[] bArr2 = (byte[]) this.a.get(str2);
            bArr2.getClass();
            h2.g(str2, (byte[]) ammvVar2.e(bArr2));
            i++;
        }
        return h2.c();
    }
}
