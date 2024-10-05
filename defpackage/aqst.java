package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqst extends aonm implements aooz {
    public static final aqst a;
    private static volatile aopf h;
    public int b;
    public aqyg d;
    public aota f;
    private byte i = 2;
    public String c = "";
    public aony e = aonm.emptyProtobufList();
    public aomf g = aomf.b;

    static {
        aqst aqstVar = new aqst();
        a = aqstVar;
        aonm.registerDefaultInstance(aqst.class, aqstVar);
    }

    private aqst() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003\u001a\u0004ᐉ\u0002\u0005ည\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqst();
            case NEW_BUILDER:
                return new aone((boolean[][][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqst.class) {
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
