package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awpm extends aonm implements aooz {
    public static final awpm a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    public awnw d;
    public awnw e;
    public awnw f;
    public awnw g;
    private byte i = 2;

    static {
        awpm awpmVar = new awpm();
        a = awpmVar;
        aonm.registerDefaultInstance(awpm.class, awpmVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, awpmVar, awpmVar, null, 170382629, aoqn.MESSAGE, awpm.class);
    }

    private awpm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awpm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (awpm.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
