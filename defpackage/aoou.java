package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoou {
    public static final aocz a;
    public static final aocz b;

    static {
        aocz aoczVar;
        try {
            aoczVar = (aocz) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            aoczVar = null;
        }
        a = aoczVar;
        b = new aocz();
    }
}
