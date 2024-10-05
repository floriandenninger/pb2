package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apds extends aonm implements aooz {
    public static final apds a;
    private static volatile aopf d;
    public String b = "";
    public aony c = aonm.emptyProtobufList();
    private int e;

    static {
        apds apdsVar = new apds();
        a = apdsVar;
        aonm.registerDefaultInstance(apds.class, apdsVar);
    }

    private apds() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new apds();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (apds.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
