package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqtn extends aonm implements aooz {
    public static final aqtn a;
    private static volatile aopf e;
    public int b;
    public int c;
    public String d = "";

    static {
        aqtn aqtnVar = new aqtn();
        a = aqtnVar;
        aonm.registerDefaultInstance(aqtn.class, aqtnVar);
    }

    private aqtn() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0001", new Object[]{"b", "c", aqtm.a(), "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqtn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqtn.class) {
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
