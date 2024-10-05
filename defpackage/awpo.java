package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awpo extends aonm implements aooz {
    public static final awpo a;
    public static final aonk b;
    private static volatile aopf e;
    public awnw d;
    private int f;
    private byte g = 2;
    public String c = "";

    static {
        awpo awpoVar = new awpo();
        a = awpoVar;
        aonm.registerDefaultInstance(awpo.class, awpoVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, awpoVar, awpoVar, null, 325347951, aoqn.MESSAGE, awpo.class);
    }

    private awpo() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"f", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awpo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awpo.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
