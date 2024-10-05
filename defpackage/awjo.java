package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awjo extends aalb {
    public static final awjn d(String str) {
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = awjq.a.createBuilder();
        createBuilder.copyOnWrite();
        awjq awjqVar = (awjq) createBuilder.instance;
        awjqVar.c |= 1;
        awjqVar.d = str;
        return new awjn(createBuilder);
    }

    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            awjq awjqVar = (awjq) aonm.parseFrom(awjq.a, bArr, aomw.b());
            if ((awjqVar.c & 1) != 0) {
                return new awjn(awjqVar.toBuilder());
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
        return awjp.class;
    }
}
