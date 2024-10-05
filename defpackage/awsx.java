package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awsx extends aonm implements aooz {
    public static final awsx a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public awnw d;
    public awnw e;
    private byte g = 2;

    static {
        awsx awsxVar = new awsx();
        a = awsxVar;
        aonm.registerDefaultInstance(awsx.class, awsxVar);
        b = aonm.newSingularGeneratedExtension(awqd.a, awsxVar, awsxVar, null, 323854738, aoqn.MESSAGE, awsx.class);
    }

    private awsx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awsx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awsx.class) {
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
