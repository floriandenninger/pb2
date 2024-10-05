package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aaru extends aaqh {
    public aaru(String str, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(str, ajoyVar, afsw.a, null, null, null);
    }

    public abstract aoox a();

    public aaru(String str, ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(str, ajoyVar, afsxVar, 1, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    public aaru(String str, ajoy ajoyVar, afsx afsxVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(str, ajoyVar, afsxVar, i, false, null, null, null);
    }

    public aaru(String str, ajoy ajoyVar, afsx afsxVar, Optional optional, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(str, ajoyVar, afsxVar, 3, false, optional, null, null, null, null, null);
    }

    @Deprecated
    public aaru(String str, ajoy ajoyVar, afsx afsxVar, int i, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(str, ajoyVar, afsxVar, i, z, null, null, null, null, null);
    }

    @Deprecated
    public aaru(String str, ajoy ajoyVar, afsx afsxVar, int i, boolean z, String str2, Boolean bool, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(str, ajoyVar, afsxVar, i, z, Optional.empty(), str2, bool, null, null, null);
    }
}
