package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aras extends aonm implements aooz {
    public static final aras a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public avgg d;
    public apxf e;
    public aqyg f;
    public aqyg g;
    private aqyg i;
    private aqyg j;
    private aota k;
    private byte l = 2;

    static {
        aras arasVar = new aras();
        a = arasVar;
        aonm.registerDefaultInstance(aras.class, arasVar);
    }

    private aras() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\t\tᐉ\u0007\fᐉ\b", new Object[]{"b", "c", "d", "i", "e", "j", "k", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aras();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aras.class) {
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
