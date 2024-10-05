package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aumu extends aalb {
    public static final aumt d(String str) {
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = aumw.a.createBuilder();
        createBuilder.copyOnWrite();
        aumw aumwVar = (aumw) createBuilder.instance;
        aumwVar.b |= 1;
        aumwVar.c = str;
        return new aumt(createBuilder);
    }

    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            aumw aumwVar = (aumw) aonm.parseFrom(aumw.a, bArr, aomw.b());
            if ((aumwVar.b & 1) != 0) {
                return new aumt(aumwVar.toBuilder());
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
        return aumv.class;
    }
}
