package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atdk extends aonm implements aooz {
    public static final atdk a;
    private static volatile aopf k;
    public int b;
    public aqyg c;
    public arfs d;
    public apxf e;
    public aqyg f;
    public arfs g;
    public apxf h;
    public boolean i;
    private aqyg l;
    private aqyg m;
    private aota n;
    private byte o = 2;
    public aomf j = aomf.b;

    static {
        atdk atdkVar = new atdk();
        a = atdkVar;
        aonm.registerDefaultInstance(atdk.class, atdkVar);
    }

    private atdk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\n\bည\u000b\u000bဇ\b\fᐉ\u0001\rᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "n", "j", "i", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new atdk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (atdk.class) {
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
