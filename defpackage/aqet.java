package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqet extends aonm implements aooz {
    public static final aqet a;
    private static volatile aopf k;
    public int b;
    public aqyg c;
    public arfs d;
    public aqer e;
    public aqes g;
    public apxf h;
    public avfc i;
    public int j;
    private aota l;
    private byte m = 2;
    public aomf f = aomf.b;

    static {
        aqet aqetVar = new aqet();
        a = aqetVar;
        aonm.registerDefaultInstance(aqet.class, aqetVar);
    }

    private aqet() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\tဉ\u0007\u000bᐉ\t\fဉ\n\rဌ\u000b", new Object[]{"b", "c", "d", "e", "l", "f", "g", "h", "i", "j", apyu.k});
            case NEW_MUTABLE_INSTANCE:
                return new aqet();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (aqet.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
