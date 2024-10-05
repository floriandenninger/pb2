package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avsb extends aonm implements aooz {
    public static final avsb a;
    public static final aonk b;
    private static volatile aopf d;
    public ascy c;
    private int e;
    private byte f = 2;

    static {
        avsb avsbVar = new avsb();
        a = avsbVar;
        aonm.registerDefaultInstance(avsb.class, avsbVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, avsbVar, avsbVar, null, 382524576, aoqn.MESSAGE, avsb.class);
    }

    private avsb() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new avsb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avsb.class) {
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
