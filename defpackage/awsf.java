package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awsf extends aonm implements aooz {
    public static final awsf a;
    private static volatile aopf f;
    public int b;
    public aony c = emptyProtobufList();
    public boolean d;
    public aoqa e;

    static {
        awsf awsfVar = new awsf();
        a = awsfVar;
        aonm.registerDefaultInstance(awsf.class, awsfVar);
    }

    private awsf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003ဇ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", awse.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awsf();
            case NEW_BUILDER:
                return new aone((char[]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awsf.class) {
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
