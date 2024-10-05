package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aruy extends aonm implements aooz {
    public static final aruy a;
    private static volatile aopf h;
    public int b;
    public arnd c;
    public apxf d;
    public arvr e;
    private aqyg i;
    private aqyg j;
    private apxf k;
    private aulq l;
    private aqzg m;
    private aota n;
    private byte o = 2;
    public aony f = emptyProtobufList();
    public aomf g = aomf.b;

    static {
        aruy aruyVar = new aruy();
        a = aruyVar;
        aonm.registerDefaultInstance(aruy.class, aruyVar);
    }

    private aruy() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001̉\u000b\u0000\u0001\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0006ᐉ\u0003\u0007ဉ\u0005\bᐉ\u0004\tᐉ\b\nည\t\u000bᐉ\u0006̉ᐉ\u0007", new Object[]{"b", "c", "i", "j", "f", arvs.class, "d", "e", "k", "n", "g", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aruy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aruy.class) {
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
