package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asyq extends aalb {
    public static final asyp d(String str) {
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = asyt.a.createBuilder();
        createBuilder.copyOnWrite();
        asyt asytVar = (asyt) createBuilder.instance;
        asytVar.c |= 1;
        asytVar.d = str;
        return new asyp(createBuilder);
    }

    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            asyt asytVar = (asyt) aonm.parseFrom(asyt.a, bArr, aomw.b());
            if ((asytVar.c & 1) != 0) {
                return new asyp(asytVar.toBuilder());
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
        return asyr.class;
    }
}
