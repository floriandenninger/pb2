package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avhi extends aalb {
    public static final avhh d(String str) {
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = avhk.a.createBuilder();
        createBuilder.copyOnWrite();
        avhk avhkVar = (avhk) createBuilder.instance;
        avhkVar.b |= 1;
        avhkVar.c = str;
        return new avhh(createBuilder);
    }

    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            avhk avhkVar = (avhk) aonm.parseFrom(avhk.a, bArr, aomw.b());
            if ((avhkVar.b & 1) != 0) {
                return new avhh(avhkVar.toBuilder());
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
        return avhj.class;
    }
}
