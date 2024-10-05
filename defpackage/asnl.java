package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asnl extends aalb {
    public static final asnk d(String str) {
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = asnn.a.createBuilder();
        createBuilder.copyOnWrite();
        asnn asnnVar = (asnn) createBuilder.instance;
        asnnVar.b |= 1;
        asnnVar.c = str;
        return new asnk(createBuilder);
    }

    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            asnn asnnVar = (asnn) aonm.parseFrom(asnn.a, bArr, aomw.b());
            if ((asnnVar.b & 1) != 0) {
                return new asnk(asnnVar.toBuilder());
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
        return asnm.class;
    }
}
