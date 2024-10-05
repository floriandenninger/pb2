package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awqw extends aonm implements aooz {
    public static final awqw a;
    public static final aonk b;
    private static volatile aopf c;
    private int d;
    private awqk e;
    private byte f = 2;

    static {
        awqw awqwVar = new awqw();
        a = awqwVar;
        aonm.registerDefaultInstance(awqw.class, awqwVar);
        b = aonm.newSingularGeneratedExtension(awog.a, awqwVar, awqwVar, null, 238551640, aoqn.MESSAGE, awqw.class);
    }

    private awqw() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awqw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (awqw.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
