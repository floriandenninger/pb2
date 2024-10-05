package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awpw extends aonm implements aooz {
    public static final awpw a;
    public static final aonk b;
    private static volatile aopf e;
    public String c = "";
    public aomf d = aomf.b;
    private int f;

    static {
        awpw awpwVar = new awpw();
        a = awpwVar;
        aonm.registerDefaultInstance(awpw.class, awpwVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, awpwVar, awpwVar, null, 170382720, aoqn.MESSAGE, awpw.class);
    }

    private awpw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"f", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awpw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awpw.class) {
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
