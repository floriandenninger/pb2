package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aorn extends aonm implements aooz {
    public static final aorn a;
    private static volatile aopf e;
    public int b;
    public int c;
    private byte f = 2;
    public aony d = emptyProtobufList();

    static {
        aorn aornVar = new aorn();
        a = aornVar;
        aonm.registerDefaultInstance(aorn.class, aornVar);
    }

    private aorn() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᔋ\u0000\u0002Л", new Object[]{"b", "c", "d", aorm.class});
            case NEW_MUTABLE_INSTANCE:
                return new aorn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aorn.class) {
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
