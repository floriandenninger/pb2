package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asgq extends aonm implements aooz {
    public static final asgq a;
    private static volatile aopf f;
    public int b;
    public awav d;
    public String c = "";
    public aony e = emptyProtobufList();

    static {
        asgq asgqVar = new asgq();
        a = asgqVar;
        aonm.registerDefaultInstance(asgq.class, asgqVar);
    }

    private asgq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", awav.class});
            case NEW_MUTABLE_INSTANCE:
                return new asgq();
            case NEW_BUILDER:
                return new aone((float[][][]) null, (byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (asgq.class) {
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
