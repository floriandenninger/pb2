package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arht extends aonm implements aooz {
    public static final arht a;
    private static volatile aopf b;
    private int c;
    private apxf d;
    private apxf e;
    private arhs f;
    private byte g = 2;

    static {
        arht arhtVar = new arht();
        a = arhtVar;
        aonm.registerDefaultInstance(arht.class, arhtVar);
    }

    private arht() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\t\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0002\tᐉ\u0003", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new arht();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (arht.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
