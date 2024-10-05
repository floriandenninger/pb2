package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aswu extends aalb {
    public static final aswt d(String str) {
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = asww.a.createBuilder();
        createBuilder.copyOnWrite();
        asww aswwVar = (asww) createBuilder.instance;
        aswwVar.c |= 1;
        aswwVar.d = str;
        return new aswt(createBuilder);
    }

    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            asww aswwVar = (asww) aonm.parseFrom(asww.a, bArr, aomw.b());
            if ((aswwVar.c & 1) != 0) {
                return new aswt(aswwVar.toBuilder());
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
        return aswv.class;
    }
}
