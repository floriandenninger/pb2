package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoxk extends aalb {
    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            aoxn aoxnVar = (aoxn) aonm.parseFrom(aoxn.a, bArr, aomw.b());
            if ((aoxnVar.c & 1) != 0) {
                return new aoxl(aoxnVar.toBuilder());
            }
            String encodeToString = Base64.encodeToString(bArr, 10);
            StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 88);
            sb.append("Attempted to parse and wrap an entity protobuf without a valid key (field: key, bytes: ");
            sb.append(encodeToString);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        } catch (aoob e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.aalb
    public final Class c() {
        return aoxm.class;
    }
}
