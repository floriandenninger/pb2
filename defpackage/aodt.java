package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aodt extends aonm implements aooz {
    public static final aodt a;
    private static volatile aopf e;
    public int b;
    public boolean c;
    public aodq d;
    private aodu f;
    private byte g = 2;

    static {
        aodt aodtVar = new aodt();
        a = aodtVar;
        aonm.registerDefaultInstance(aodt.class, aodtVar);
    }

    private aodt() {
        emptyProtobufList();
        emptyLongList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u001e\u0003\u0000\u0000\u0001\u0003ဇ\u0002\u001cဉ\u0013\u001eᐉ\u0015", new Object[]{"b", "c", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aodt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aodt.class) {
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
