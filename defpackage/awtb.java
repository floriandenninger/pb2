package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awtb extends aonm implements aooz {
    public static final awtb a;
    private static volatile aopf f;
    public int b;
    public String c = "";
    public String d = "";
    public aony e = emptyProtobufList();

    static {
        awtb awtbVar = new awtb();
        a = awtbVar;
        aonm.registerDefaultInstance(awtb.class, awtbVar);
    }

    private awtb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", awtd.class});
            case NEW_MUTABLE_INSTANCE:
                return new awtb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awtb.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
