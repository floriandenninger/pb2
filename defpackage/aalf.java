package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aalf implements aakt {
    private final String a;
    private final byte[] b;
    private final aale c;

    public aalf(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
        this.c = new aale(str);
    }

    public static aald b(String str, byte[] bArr) {
        aald aaldVar = new aald();
        aaldVar.b = str;
        aaldVar.a = bArr;
        return aaldVar;
    }

    @Override // defpackage.aakt
    public final /* synthetic */ amsx a() {
        return amvs.a;
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.b;
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.a;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        aald aaldVar = new aald();
        aaldVar.a = this.b;
        aaldVar.b = this.a;
        return aaldVar;
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        if (obj instanceof aalf) {
            aalf aalfVar = (aalf) obj;
            if (amkq.b(this.a, aalfVar.a) && Arrays.equals(this.b, aalfVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aakt
    public aale getType() {
        return this.c;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b))});
    }
}
