package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uvu extends aonm implements aooz {
    public static final uvu a;
    private static volatile aopf j;
    public int b;
    public String c = "";
    public aomf d = aomf.b;
    public String e = "";
    public aony f = emptyProtobufList();
    public aony g = aonm.emptyProtobufList();
    public boolean h;
    public long i;

    static {
        uvu uvuVar = new uvu();
        a = uvuVar;
        aonm.registerDefaultInstance(uvu.class, uvuVar);
    }

    private uvu() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", uvv.class, "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new uvu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (uvu.class) {
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
