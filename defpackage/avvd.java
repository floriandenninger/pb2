package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avvd extends aonm implements aooz {
    public static final avvd a;
    private static volatile aopf h;
    public int b;
    public boolean c;
    public aqyg d;
    public apxf e;
    public ashb f;
    private byte i = 2;
    public aony g = emptyProtobufList();

    static {
        avvd avvdVar = new avvd();
        a = avvdVar;
        aonm.registerDefaultInstance(avvd.class, avvdVar);
    }

    private avvd() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "g", avvc.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avvd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (avvd.class) {
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
