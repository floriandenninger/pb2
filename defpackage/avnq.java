package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avnq extends aonm implements aooz {
    public static final avnq a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private avrd g;
    private apxf h;
    private atdf i;
    private aota j;
    private aqyg k;
    private aqyg l;
    private byte m = 2;

    static {
        avnq avnqVar = new avnq();
        a = avnqVar;
        aonm.registerDefaultInstance(avnq.class, avnqVar);
    }

    private avnq() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u000f\t\u0000\u0000\t\u0002ᐉ\r\u0003ᐉ\u000e\u0006ᐉ\f\u0007ᐉ\u0001\bᐉ\u0002\tᐉ\u0003\fᐉ\t\rᐉ\u0006\u000fᐉ\n", new Object[]{"c", "k", "l", "j", "d", "e", "f", "h", "g", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new avnq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avnq.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
