package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awrb extends aonm implements aooz {
    public static final awrb a;
    public static final aonk b;
    private static volatile aopf d;
    private int e;
    private byte f = 2;
    public String c = "";

    static {
        awrb awrbVar = new awrb();
        a = awrbVar;
        aonm.registerDefaultInstance(awrb.class, awrbVar);
        b = aonm.newSingularGeneratedExtension(awog.a, awrbVar, awrbVar, null, 361707526, aoqn.MESSAGE, awrb.class);
    }

    private awrb() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဈ\u0007", new Object[]{"e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new awrb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awrb.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
