package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozk extends aonm implements aooz {
    public static final aozk a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public String d = "";
    public String e = "";

    static {
        aozk aozkVar = new aozk();
        a = aozkVar;
        aonm.registerDefaultInstance(aozk.class, aozkVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, aozkVar, aozkVar, null, 370527389, aoqn.MESSAGE, aozk.class);
    }

    private aozk() {
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
                return new aozk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aozk.class) {
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
