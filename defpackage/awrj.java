package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awrj extends aonm implements aooz {
    public static final awrj a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public String d = "";

    static {
        awrj awrjVar = new awrj();
        a = awrjVar;
        aonm.registerDefaultInstance(awrj.class, awrjVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, awrjVar, awrjVar, null, 360463768, aoqn.MESSAGE, awrj.class);
    }

    private awrj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awrj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awrj.class) {
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
