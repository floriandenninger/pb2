package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aotg extends aalb {
    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            aotf aotfVar = (aotf) aonm.parseFrom(aotf.a, bArr, aomw.b());
            if ((aotfVar.b & 1) != 0) {
                return new aoth(aotfVar.toBuilder());
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
        return aoti.class;
    }
}
