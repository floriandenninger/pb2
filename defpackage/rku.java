package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rku extends aonm implements aooz {
    public static final rku a;
    private static volatile aopf j;
    public int b;
    public long c;
    public boolean h;
    public String d = "";
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();
    public aony g = emptyProtobufList();
    public aony i = emptyProtobufList();

    static {
        rku rkuVar = new rku();
        a = rkuVar;
        aonm.registerDefaultInstance(rku.class, rkuVar);
    }

    private rku() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0004\u001b\u0005\u001b\u0006\u001b\bဇ\u0004\t\u001b", new Object[]{"b", "c", "d", "e", rkv.class, "f", rkt.class, "g", rkn.class, "h", "i", rlk.class});
            case NEW_MUTABLE_INSTANCE:
                return new rku();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (rku.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
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
