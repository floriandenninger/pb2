package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aysf implements ayrv {
    final ayrt a;

    public aysf(ayrt ayrtVar) {
        this.a = ayrtVar;
    }

    @Override // defpackage.ayrv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length != 3) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Array of size 3 expected but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        return this.a.a(objArr[0], objArr[1], objArr[2]);
    }
}
