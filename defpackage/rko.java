package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rko extends aonm implements aooz {
    public static final rko a;
    private static volatile aopf j;
    public int b;
    public int c;
    public String d = "";
    public aony e = emptyProtobufList();
    public rkq f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        rko rkoVar = new rko();
        a = rkoVar;
        aonm.registerDefaultInstance(rko.class, rkoVar);
    }

    private rko() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"b", "c", "d", "e", rkp.class, "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new rko();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (rko.class) {
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
