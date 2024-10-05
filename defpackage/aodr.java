package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aodr extends aonm implements aooz {
    public static final aonv a = new uct(3);
    public static final aodr b;
    private static volatile aopf j;
    public int c;
    public int e;
    public aodl g;
    public aodj h;
    public aodv i;
    public String d = "";
    public aonu f = emptyIntList();

    static {
        aodr aodrVar = new aodr();
        b = aodrVar;
        aonm.registerDefaultInstance(aodr.class, aodrVar);
    }

    private aodr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\u001c\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u001e\u0005ဉ\u0002\nဉ\u0007\u001cဉ\u0018", new Object[]{"c", "d", "e", aokr.o, "f", aosw.a(), "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aodr();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aodr.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
