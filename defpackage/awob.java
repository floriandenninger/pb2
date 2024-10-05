package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awob extends aonm implements aooz {
    public static final awob a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    public awpz d;
    public awog e;
    public awoc f;
    private byte h = 2;

    static {
        awob awobVar = new awob();
        a = awobVar;
        aonm.registerDefaultInstance(awob.class, awobVar);
        b = aonm.newSingularGeneratedExtension(awqd.a, awobVar, awobVar, null, 168777401, aoqn.MESSAGE, awob.class);
    }

    private awob() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0003\u0003ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new awob();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (awob.class) {
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
