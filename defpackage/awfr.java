package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awfr extends aonm implements aooz {
    public static final awfr a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public boolean d;
    public asuh e;
    private byte g = 2;

    static {
        awfr awfrVar = new awfr();
        a = awfrVar;
        aonm.registerDefaultInstance(awfr.class, awfrVar);
        b = aonm.newSingularGeneratedExtension(awpl.a, awfrVar, awfrVar, null, 252911519, aoqn.MESSAGE, awfr.class);
    }

    private awfr() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003ϧ\u0002\u0000\u0000\u0001\u0003ဇ\u0000ϧᐉ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awfr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awfr.class) {
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
