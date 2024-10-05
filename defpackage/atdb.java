package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atdb extends aonm implements aooz {
    public static final atdb a;
    private static volatile aopf k;
    public int b;
    public aqyg c;
    public arfs d;
    public apxf e;
    public atcz g;
    public boolean h;
    public int i;
    public arfs j;
    private aota l;
    private byte m = 2;
    public aomf f = aomf.b;

    static {
        atdb atdbVar = new atdb();
        a = atdbVar;
        aonm.registerDefaultInstance(atdb.class, atdbVar);
    }

    private atdb() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0007ဉ\u0005\bဇ\u0007\tဌ\b\u000bᐉ\n", new Object[]{"b", "c", "d", "e", "l", "f", "g", "h", "i", atbk.k, "j"});
            case NEW_MUTABLE_INSTANCE:
                return new atdb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (atdb.class) {
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
