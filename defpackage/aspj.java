package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aspj extends aonm implements aooz {
    public static final aspj a;
    private static volatile aopf h;
    public int b;
    public aulq d;
    public aqyg e;
    public aulq f;
    private aqyg i;
    private aulq j;
    private aulq k;
    private byte l = 2;
    public String c = "";
    public aony g = emptyProtobufList();

    static {
        aspj aspjVar = new aspj();
        a = aspjVar;
        aonm.registerDefaultInstance(aspj.class, aspjVar);
    }

    private aspj() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0007\u0001ဈ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bЛ\rᐉ\u0002", new Object[]{"b", "c", "d", "e", "f", "j", "k", "g", aulq.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aspj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aspj.class) {
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
