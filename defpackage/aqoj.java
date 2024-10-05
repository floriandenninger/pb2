package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqoj extends aalb {
    public static final aqoi d(String str) {
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = aqol.a.createBuilder();
        createBuilder.copyOnWrite();
        aqol aqolVar = (aqol) createBuilder.instance;
        aqolVar.c |= 1;
        aqolVar.d = str;
        return new aqoi(createBuilder);
    }

    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            aqol aqolVar = (aqol) aonm.parseFrom(aqol.a, bArr, aomw.b());
            if ((aqolVar.c & 1) != 0) {
                return new aqoi(aqolVar.toBuilder());
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
        return aqok.class;
    }
}
