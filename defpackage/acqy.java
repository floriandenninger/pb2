package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqy {
    public final axzg a;

    public acqy(axzg axzgVar, byte[] bArr, byte[] bArr2) {
        this.a = axzgVar;
    }

    public acqy(axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = axzgVar;
    }

    public static final awog d(ajds ajdsVar) {
        try {
            awqd awqdVar = ((awos) aonm.parseFrom(awos.a, ajdsVar.b, aomw.b())).c;
            if (awqdVar == null) {
                awqdVar = awqd.a;
            }
            awog awogVar = ((awob) awqdVar.pX(awob.b)).e;
            return awogVar == null ? awog.a : awogVar;
        } catch (aoob unused) {
            return null;
        }
    }

    private static String e(String str, axzg axzgVar) {
        awas z = etx.z(str, axzgVar);
        return z == null ? "" : z.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        Boolean bool;
        aqvj aqvjVar = this.a.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45358057L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45358057L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45358057L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final String b(ajds ajdsVar) {
        awog d = d(ajdsVar);
        return (d == null || !d.pY(aqnu.b)) ? "" : e(((aqnu) d.pX(aqnu.b)).d, this.a);
    }

    public final String c(ajds ajdsVar) {
        awog d = d(ajdsVar);
        if (d == null) {
            return "";
        }
        if (d.pY(aqon.b)) {
            return e(((aqon) d.pX(aqon.b)).d, this.a);
        }
        return d.pY(aqnz.b) ? e(((aqnz) d.pX(aqnz.b)).d, this.a) : "";
    }
}
