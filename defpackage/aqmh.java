package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmh extends aalb {
    public static final aqmg d(String str) {
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = aqmj.a.createBuilder();
        createBuilder.copyOnWrite();
        aqmj aqmjVar = (aqmj) createBuilder.instance;
        aqmjVar.c |= 1;
        aqmjVar.d = str;
        return new aqmg(createBuilder);
    }

    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            aqmj aqmjVar = (aqmj) aonm.parseFrom(aqmj.a, bArr, aomw.b());
            if ((aqmjVar.c & 1) != 0) {
                return new aqmg(aqmjVar.toBuilder());
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
        return aqmi.class;
    }
}
