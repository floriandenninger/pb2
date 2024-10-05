package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arng extends aonm implements aooz {
    public static final arng a;
    private static volatile aopf f;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;

    static {
        arng arngVar = new arng();
        a = arngVar;
        aonm.registerDefaultInstance(arng.class, arngVar);
    }

    private arng() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u000f\u0003\u0000\u0000\u0000\u0003ဈ\u0003\u0007ဇ\u0005\u000fဇ\f", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new arng();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arng.class) {
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
