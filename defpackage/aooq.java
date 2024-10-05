package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aooq {
    private static final aoow b = new aooo(0);
    public final aoow a;

    public aooq() {
        aoow aoowVar;
        aoow[] aoowVarArr = new aoow[2];
        aoowVarArr[0] = aooo.a;
        try {
            aoowVar = (aoow) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            aoowVar = b;
        }
        aoowVarArr[1] = aoowVar;
        aoop aoopVar = new aoop(aoowVarArr);
        aonz.i(aoopVar, "messageInfoFactory");
        this.a = aoopVar;
    }

    public static boolean a(aoov aoovVar) {
        return aoovVar.b() == aoph.PROTO2;
    }
}
