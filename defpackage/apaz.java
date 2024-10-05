package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apaz extends aonm implements aooz {
    public static final apaz a;
    private static volatile aopf g;
    public int b;
    public String c = "";
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();

    static {
        apaz apazVar = new apaz();
        a = apazVar;
        aonm.registerDefaultInstance(apaz.class, apazVar);
    }

    private apaz() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"b", "c", "d", apbk.class, "e", apbk.class, "f", apbk.class});
            case NEW_MUTABLE_INSTANCE:
                return new apaz();
            case NEW_BUILDER:
                return new aone((float[][][]) null, (int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apaz.class) {
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
