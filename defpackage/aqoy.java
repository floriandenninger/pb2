package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqoy extends aalb {
    public static final aqox d(String str) {
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = aqpc.a.createBuilder();
        createBuilder.copyOnWrite();
        aqpc aqpcVar = (aqpc) createBuilder.instance;
        aqpcVar.c |= 1;
        aqpcVar.d = str;
        return new aqox(createBuilder);
    }

    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            aqpc aqpcVar = (aqpc) aonm.parseFrom(aqpc.a, bArr, aomw.b());
            if ((aqpcVar.c & 1) != 0) {
                return new aqox(aqpcVar.toBuilder());
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
        return aqoz.class;
    }
}
