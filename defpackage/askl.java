package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class askl extends aonm implements aooz {
    public static final askl a;
    public static final aonk b;
    private static volatile aopf f;
    public aony c = emptyProtobufList();
    public aomf d = aomf.b;
    public String e = "";
    private int g;

    static {
        askl asklVar = new askl();
        a = asklVar;
        aonm.registerDefaultInstance(askl.class, asklVar);
        b = aonm.newSingularGeneratedExtension(aqro.a, asklVar, asklVar, null, 273577170, aoqn.MESSAGE, askl.class);
    }

    private askl() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ည\u0000\u0003ဈ\u0001", new Object[]{"g", "c", askk.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new askl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (askl.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
