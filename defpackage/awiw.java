package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awiw extends aonm implements aooz {
    public static final awiw a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    public String d = "";
    public aony e;
    public String f;

    static {
        awiw awiwVar = new awiw();
        a = awiwVar;
        aonm.registerDefaultInstance(awiw.class, awiwVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, awiwVar, awiwVar, null, 164, aoqn.MESSAGE, awiw.class);
    }

    private awiw() {
        aomf aomfVar = aomf.b;
        this.e = emptyProtobufList();
        this.f = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001b\u0004ဈ\u0002", new Object[]{"c", "d", "e", awiv.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new awiw();
            case NEW_BUILDER:
                return new aone((boolean[][][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (awiw.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
