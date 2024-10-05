package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avje extends aalb {
    public static final avjd d(String str) {
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = avjg.a.createBuilder();
        createBuilder.copyOnWrite();
        avjg avjgVar = (avjg) createBuilder.instance;
        avjgVar.b |= 1;
        avjgVar.c = str;
        return new avjd(createBuilder);
    }

    @Override // defpackage.aaks
    public final int a() {
        return 1;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        try {
            avjg avjgVar = (avjg) aonm.parseFrom(avjg.a, bArr, aomw.b());
            if ((avjgVar.b & 1) != 0) {
                return new avjd(avjgVar.toBuilder());
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
        return avjf.class;
    }
}
