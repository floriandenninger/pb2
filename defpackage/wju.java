package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wju {
    private final axzf a;

    public wju(axzf axzfVar, byte[] bArr) {
        this.a = axzfVar;
    }

    public wju(axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = axzfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        Boolean bool;
        aqvj aqvjVar = this.a.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45353494L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45353494L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45353494L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        Boolean bool;
        aqvj aqvjVar = this.a.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45357365L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45357365L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45357365L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }
}
