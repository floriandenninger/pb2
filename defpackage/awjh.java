package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awjh extends aalb {
    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            awjj awjjVar = (awjj) aonm.parseFrom(awjj.a, bArr, aomw.b());
            if ((awjjVar.c & 1) != 0) {
                return new awjg(awjjVar.toBuilder());
            }
            String encodeToString = Base64.encodeToString(bArr, 10);
            StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 87);
            sb.append("Attempted to parse and wrap an entity protobuf without a valid key (field: id, bytes: ");
            sb.append(encodeToString);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        } catch (aoob e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.aalb
    public final Class c() {
        return awji.class;
    }
}
