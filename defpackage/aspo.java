package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aspo extends aonm implements aooz {
    public static final aspo a;
    private static volatile aopf h;
    public int b;
    public arfs d;
    public aqyg e;
    public aqyg f;
    private aqyg i;
    private byte j = 2;
    public String c = "";
    public aony g = emptyProtobufList();

    static {
        aspo aspoVar = new aspo();
        a = aspoVar;
        aonm.registerDefaultInstance(aspo.class, aspoVar);
    }

    private aspo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0005\u0001ဈ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006Л\u0007ᐉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", apmh.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aspo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aspo.class) {
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
