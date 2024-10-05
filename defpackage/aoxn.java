package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoxn extends aonm implements aooz {
    public static final aoxn a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public String d = "";
    public String e = "";

    static {
        aoxn aoxnVar = new aoxn();
        a = aoxnVar;
        aonm.registerDefaultInstance(aoxn.class, aoxnVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, aoxnVar, aoxnVar, null, 179, aoqn.MESSAGE, aoxn.class);
    }

    private aoxn() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aoxn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aoxn.class) {
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
