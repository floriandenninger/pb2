package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awua extends aonm implements aooz {
    public static final awua a;
    public static final aonk b;
    private static volatile aopf e;
    public int c = 0;
    public Object d;

    static {
        awua awuaVar = new awua();
        a = awuaVar;
        aonm.registerDefaultInstance(awua.class, awuaVar);
        b = aonm.newSingularGeneratedExtension(awpu.a, awuaVar, awuaVar, null, 272531091, aoqn.MESSAGE, awua.class);
    }

    private awua() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001့\u0000\u0002ဴ\u0000", new Object[]{"d", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new awua();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awua.class) {
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
