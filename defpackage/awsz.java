package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awsz extends aonm implements aooz {
    public static final awsz a;
    private static volatile aopf f;
    public int b;
    public aonp c;
    public aonp d;
    public int e;

    static {
        awsz awszVar = new awsz();
        a = awszVar;
        aonm.registerDefaultInstance(awsz.class, awszVar);
    }

    private awsz() {
        emptyDoubleList();
        this.c = emptyDoubleList();
        this.d = emptyDoubleList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002\u0012\u0003\u0012\u0004ဋ\u0000", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awsz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awsz.class) {
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
