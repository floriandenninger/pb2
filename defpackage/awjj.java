package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awjj extends aonm implements aooz {
    public static final awjj a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    public String d = "";
    public String e;
    public String f;

    static {
        awjj awjjVar = new awjj();
        a = awjjVar;
        aonm.registerDefaultInstance(awjj.class, awjjVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, awjjVar, awjjVar, null, 153, aoqn.MESSAGE, awjj.class);
    }

    private awjj() {
        aomf aomfVar = aomf.b;
        this.e = "";
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new awjj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (awjj.class) {
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
