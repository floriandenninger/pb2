package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aomx {
    public static final aocz a = new aocz();
    private static final aocz b;

    static {
        aocz aoczVar;
        try {
            aoczVar = (aocz) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            aoczVar = null;
        }
        b = aoczVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aocz a() {
        aocz aoczVar = b;
        if (aoczVar != null) {
            return aoczVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
