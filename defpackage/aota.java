package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aota extends aonm implements aooz {
    public static final aota a;
    private static volatile aopf e;
    public int b;
    public int c;
    public int d;
    private anek f;
    private byte g = 2;

    static {
        aota aotaVar = new aota();
        a = aotaVar;
        aonm.registerDefaultInstance(aota.class, aotaVar);
    }

    private aota() {
        emptyIntList();
        this.d = -1;
        aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001«\u0003\u0000\u0000\u0001\u0001င\u0000\u0083င\u0005«ᐉ\u0006", new Object[]{"b", "c", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aota();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aota.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
