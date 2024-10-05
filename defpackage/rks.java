package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rks extends aonm implements aooz {
    public static final rks a;
    private static volatile aopf g;
    public int b;
    public int c;
    public boolean e;
    public String d = "";
    public aony f = aonm.emptyProtobufList();

    static {
        rks rksVar = new rks();
        a = rksVar;
        aonm.registerDefaultInstance(rks.class, rksVar);
    }

    private rks() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"b", "c", dvg.s, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new rks();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (rks.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
