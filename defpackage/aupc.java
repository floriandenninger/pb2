package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aupc extends aonm implements aooz {
    public static final aupc a;
    public static final aonk b;
    private static volatile aopf c;
    private int d;
    private apxf e;
    private byte f = 2;

    static {
        aupc aupcVar = new aupc();
        a = aupcVar;
        aonm.registerDefaultInstance(aupc.class, aupcVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, aupcVar, aupcVar, null, 141229392, aoqn.MESSAGE, aupc.class);
    }

    private aupc() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aupc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aupc.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
