package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class jsn implements jtc {
    private final Class a;
    private final Class b;

    /* JADX INFO: Access modifiers changed from: protected */
    public jsn(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    @Override // defpackage.jtc
    public final Class c() {
        return this.a;
    }

    @Override // defpackage.jtc
    public final Class d() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Object e(amrz amrzVar, String str) {
        if (amrzVar == null) {
            StringBuilder sb = new StringBuilder(str.length() + 37);
            sb.append("Args not specified, `");
            sb.append(str);
            sb.append("` not available.");
            throw new IllegalStateException(sb.toString());
        }
        if (!amrzVar.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(str.length() + 17);
            sb2.append("`");
            sb2.append(str);
            sb2.append("` not specified.");
            throw new IllegalStateException(sb2.toString());
        }
        Object obj = amrzVar.get(str);
        obj.getClass();
        return obj;
    }
}
