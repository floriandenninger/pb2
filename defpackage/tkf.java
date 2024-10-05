package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tkf extends aonm implements aooz {
    public static final tkf a;
    private static volatile aopf h;
    public int b;
    public int e;
    public tkg f;
    public String c = "";
    public String d = "";
    public aony g = emptyProtobufList();

    static {
        tkf tkfVar = new tkf();
        a = tkfVar;
        aonm.registerDefaultInstance(tkf.class, tkfVar);
    }

    private tkf() {
        emptyProtobufList();
        aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\r\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0006ဈ\u0001\nင\u0002\rဉ\n", new Object[]{"b", "c", "g", tke.class, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new tkf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (tkf.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
