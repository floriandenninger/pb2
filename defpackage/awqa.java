package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awqa extends aonh implements aoni {
    public static final awqa a;
    public static final aonk b;
    private static volatile aopf e;
    public awqb d;
    private int f;
    private byte g = 2;
    public String c = "";

    static {
        awqa awqaVar = new awqa();
        a = awqaVar;
        aonm.registerDefaultInstance(awqa.class, awqaVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, awqaVar, awqaVar, null, 194114827, aoqn.MESSAGE, awqa.class);
    }

    private awqa() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"f", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awqa();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awqa.class) {
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
