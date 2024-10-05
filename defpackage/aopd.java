package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aopd {
    public static final amkq a;
    public static final amkq b;

    static {
        amkq amkqVar;
        try {
            amkqVar = (amkq) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            amkqVar = null;
        }
        a = amkqVar;
        b = new amkq();
    }
}
