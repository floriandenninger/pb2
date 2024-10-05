package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axev extends aonm implements aooz {
    public static final axev a;
    private static volatile aopf f;
    public int b;
    private byte g = 2;
    public String c = "";
    public aony d = emptyProtobufList();
    public String e = "";

    static {
        axev axevVar = new axev();
        a = axevVar;
        aonm.registerDefaultInstance(axev.class, axevVar);
    }

    private axev() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л\u0003ဈ\u0001", new Object[]{"b", "c", "d", axet.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new axev();
            case NEW_BUILDER:
                return new aone((byte[]) null, (short[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (axev.class) {
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
