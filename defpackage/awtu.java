package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awtu extends aonm implements aooz {
    public static final awtu a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public awnw d;
    public awnw e;
    private awnw g;
    private byte h = 2;

    static {
        awtu awtuVar = new awtu();
        a = awtuVar;
        aonm.registerDefaultInstance(awtu.class, awtuVar);
        b = aonm.newSingularGeneratedExtension(awqd.a, awtuVar, awtuVar, null, 217374632, aoqn.MESSAGE, awtu.class);
    }

    private awtu() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002ᐉ\u0000\u0003ᐉ\u0001\u0005ᐉ\u0002", new Object[]{"c", "d", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awtu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awtu.class) {
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
